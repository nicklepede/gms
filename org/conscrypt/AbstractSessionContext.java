package com.google.android.gms.org.conscrypt;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
abstract class AbstractSessionContext implements SSLSessionContext {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 28800;
    private volatile int maximumSize;
    private volatile int timeout = DEFAULT_SESSION_TIMEOUT_SECONDS;
    private volatile long sslCtxNativePointer = NativeCrypto.SSL_CTX_new();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Map sessions = new LinkedHashMap() { // from class: com.google.android.gms.org.conscrypt.AbstractSessionContext.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (AbstractSessionContext.this.maximumSize <= 0 || size() <= AbstractSessionContext.this.maximumSize) {
                return false;
            }
            AbstractSessionContext.this.onBeforeRemoveSession((NativeSslSession) entry.getValue());
            return true;
        }
    };

    public AbstractSessionContext(int i) {
        this.maximumSize = i;
    }

    private void freeNative() {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                long j = this.sslCtxNativePointer;
                this.sslCtxNativePointer = 0L;
                NativeCrypto.SSL_CTX_free(j, this);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    private boolean isValid() {
        return this.sslCtxNativePointer != 0;
    }

    private void setTimeout(int i) {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                NativeCrypto.SSL_CTX_set_timeout(this.sslCtxNativePointer, this, i);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    private void trimToSize() {
        synchronized (this.sessions) {
            int size = this.sessions.size();
            if (size > this.maximumSize) {
                Iterator it = this.sessions.values().iterator();
                for (int i = size - this.maximumSize; i > 0; i--) {
                    onBeforeRemoveSession((NativeSslSession) it.next());
                    it.remove();
                }
            }
        }
    }

    final void cacheSession(NativeSslSession nativeSslSession) {
        byte[] id = nativeSslSession.getId();
        if (id == null || id.length == 0) {
            return;
        }
        synchronized (this.sessions) {
            ByteArray byteArray = new ByteArray(id);
            if (this.sessions.containsKey(byteArray)) {
                removeSession((NativeSslSession) this.sessions.get(byteArray));
            }
            onBeforeAddSession(nativeSslSession);
            this.sessions.put(byteArray, nativeSslSession);
        }
    }

    protected void finalize() {
        try {
            freeNative();
        } finally {
            super.finalize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final Enumeration getIds() {
        final Iterator it;
        synchronized (this.sessions) {
            it = Arrays.asList((NativeSslSession[]) this.sessions.values().toArray(new NativeSslSession[0])).iterator();
        }
        return new Enumeration(this) { // from class: com.google.android.gms.org.conscrypt.AbstractSessionContext.2
            private NativeSslSession next;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                if (this.next != null) {
                    return true;
                }
                while (it.hasNext()) {
                    NativeSslSession nativeSslSession = (NativeSslSession) it.next();
                    if (nativeSslSession.isValid()) {
                        this.next = nativeSslSession;
                        return true;
                    }
                }
                this.next = null;
                return false;
            }

            @Override // java.util.Enumeration
            public byte[] nextElement() {
                if (!hasMoreElements()) {
                    throw new NoSuchElementException();
                }
                byte[] id = this.next.getId();
                this.next = null;
                return id;
            }
        };
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final SSLSession getSession(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            throw new NullPointerException("sessionId");
        }
        ByteArray byteArray = new ByteArray(bArr);
        synchronized (this.sessions) {
            nativeSslSession = (NativeSslSession) this.sessions.get(byteArray);
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return null;
        }
        return nativeSslSession.toSSLSession();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionCacheSize() {
        return this.maximumSize;
    }

    final NativeSslSession getSessionFromCache(byte[] bArr) {
        NativeSslSession nativeSslSession;
        if (bArr == null) {
            return null;
        }
        synchronized (this.sessions) {
            nativeSslSession = (NativeSslSession) this.sessions.get(new ByteArray(bArr));
        }
        if (nativeSslSession == null || !nativeSslSession.isValid()) {
            return getSessionFromPersistentCache(bArr);
        }
        if (nativeSslSession.isSingleUse()) {
            removeSession(nativeSslSession);
        }
        return nativeSslSession;
    }

    public abstract NativeSslSession getSessionFromPersistentCache(byte[] bArr);

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionTimeout() {
        return this.timeout;
    }

    public void initSpake(SSLParametersImpl sSLParametersImpl) {
        AbstractSessionContext abstractSessionContext;
        Spake2PlusKeyManager spake2PlusKeyManager = sSLParametersImpl.getSpake2PlusKeyManager();
        byte[] context = spake2PlusKeyManager.getContext();
        byte[] idProver = spake2PlusKeyManager.getIdProver();
        byte[] idVerifier = spake2PlusKeyManager.getIdVerifier();
        byte[] password = spake2PlusKeyManager.getPassword();
        boolean isClient = spake2PlusKeyManager.isClient();
        int handshakeLimit = spake2PlusKeyManager.getHandshakeLimit();
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                abstractSessionContext = this;
                try {
                    NativeCrypto.SSL_CTX_set_spake_credential(context, password, idProver, idVerifier, isClient, handshakeLimit, this.sslCtxNativePointer, abstractSessionContext);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    abstractSessionContext.lock.writeLock().unlock();
                    throw th2;
                }
            } else {
                abstractSessionContext = this;
            }
            abstractSessionContext.lock.writeLock().unlock();
        } catch (Throwable th3) {
            th = th3;
            abstractSessionContext = this;
        }
    }

    public long newSsl() {
        this.lock.readLock().lock();
        try {
            if (isValid()) {
                return NativeCrypto.SSL_new(this.sslCtxNativePointer, this);
            }
            throw new SSLException("Invalid session context");
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public abstract void onBeforeAddSession(NativeSslSession nativeSslSession);

    public abstract void onBeforeRemoveSession(NativeSslSession nativeSslSession);

    final void removeSession(NativeSslSession nativeSslSession) {
        byte[] id = nativeSslSession.getId();
        if (id == null || id.length == 0) {
            return;
        }
        onBeforeRemoveSession(nativeSslSession);
        ByteArray byteArray = new ByteArray(id);
        synchronized (this.sessions) {
            this.sessions.remove(byteArray);
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionCacheSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        int i2 = this.maximumSize;
        this.maximumSize = i;
        if (i < i2) {
            trimToSize();
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("seconds < 0");
        }
        synchronized (this.sessions) {
            this.timeout = i;
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            setTimeout(i);
            Iterator it = this.sessions.values().iterator();
            while (it.hasNext()) {
                NativeSslSession nativeSslSession = (NativeSslSession) it.next();
                if (!nativeSslSession.isValid()) {
                    onBeforeRemoveSession(nativeSslSession);
                    it.remove();
                }
            }
        }
    }

    protected void setSesssionIdContext(byte[] bArr) {
        this.lock.writeLock().lock();
        try {
            if (isValid()) {
                NativeCrypto.SSL_CTX_set_session_id_context(this.sslCtxNativePointer, this, bArr);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }
}
