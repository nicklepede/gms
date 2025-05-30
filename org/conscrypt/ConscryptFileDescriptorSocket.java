package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.ExternalSession;
import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.SSLParametersImpl;
import com.google.android.gms.org.conscrypt.metrics.StatsLog;
import defpackage.a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
class ConscryptFileDescriptorSocket extends OpenSSLSocketImpl implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.PSKCallbacks, SSLParametersImpl.AliasChooser {
    private static final boolean DBG_STATE = false;
    private final ActiveSession activeSession;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession;
    private final Object guard;
    private long handshakeStartedMillis;
    private int handshakeTimeoutMilliseconds;
    private SSLInputStream is;
    private SSLOutputStream os;
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state;
    private int writeTimeoutMilliseconds;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class SSLInputStream extends InputStream implements InputStreamRetargetInterface {
        private final Object readLock = new Object();

        public SSLInputStream() {
        }

        @Override // java.io.InputStream
        public int available() {
            return ConscryptFileDescriptorSocket.this.ssl.getPendingReadableBytes();
        }

        public void awaitPendingOps() {
            synchronized (this.readLock) {
            }
        }

        @Override // java.io.InputStream
        public int read() {
            byte[] bArr = new byte[1];
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read;
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
            if (i2 == 0) {
                return 0;
            }
            synchronized (this.readLock) {
                synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                    if (ConscryptFileDescriptorSocket.this.state == 8) {
                        throw new SocketException("socket is closed");
                    }
                }
                read = ConscryptFileDescriptorSocket.this.ssl.read(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i, i2, ConscryptFileDescriptorSocket.this.getSoTimeout());
                if (read == -1) {
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                    read = -1;
                }
            }
            return read;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class SSLOutputStream extends OutputStream {
        private final Object writeLock = new Object();

        public SSLOutputStream() {
        }

        public void awaitPendingOps() {
            synchronized (this.writeLock) {
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            write(new byte[]{(byte) (i & 255)});
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
            if (i2 == 0) {
                return;
            }
            synchronized (this.writeLock) {
                synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                    if (ConscryptFileDescriptorSocket.this.state == 8) {
                        throw new SocketException("socket is closed");
                    }
                }
                ConscryptFileDescriptorSocket.this.ssl.write(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i, i2, ConscryptFileDescriptorSocket.this.writeTimeoutMilliseconds);
                synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                    if (ConscryptFileDescriptorSocket.this.state == 8) {
                        throw new SocketException("socket is closed");
                    }
                }
            }
        }
    }

    public ConscryptFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // com.google.android.gms.org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.handshakeStartedMillis = 0L;
        this.sslParameters = sSLParametersImpl;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.activeSession = new ActiveSession(newSsl, sSLParametersImpl.getSessionContext());
    }

    private void assertReadableOrWriteableState() {
        int i = this.state;
        if (i != 5 && i != 4) {
            throw new AssertionError(a.j(i, "Invalid state: "));
        }
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeUnderlyingSocket() {
        super.close();
    }

    private void free() {
        if (this.ssl.isClosed()) {
            return;
        }
        this.ssl.close();
        Platform.closeGuardClose(this.guard);
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        return NativeSsl.newInstance(sSLParametersImpl, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket);
    }

    private ConscryptSession provideAfterHandshakeSession() {
        return this.state < 2 ? SSLNullSession.getNullSession() : provideSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession nullSession;
        synchronized (this.ssl) {
            int i = this.state;
            nullSession = (i < 2 || i >= 5) ? SSLNullSession.getNullSession() : this.activeSession;
        }
        return nullSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.org.conscrypt.ConscryptSession provideSession() {
        /*
            r5 = this;
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r5.ssl
            monitor-enter(r0)
            int r1 = r5.state     // Catch: java.lang.Throwable -> L35
            r2 = 8
            if (r1 != r2) goto L13
            com.google.android.gms.org.conscrypt.SessionSnapshot r1 = r5.closedSession     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L11
            com.google.android.gms.org.conscrypt.ConscryptSession r1 = com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession()     // Catch: java.lang.Throwable -> L35
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r1
        L13:
            r2 = 5
            r3 = 1
            r4 = 0
            if (r1 < r2) goto L1a
            r1 = r3
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 != 0) goto L29
            boolean r2 = r5.isConnected()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L35
            if (r2 == 0) goto L29
            r5.waitForHandshake()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L35
            goto L2a
        L27:
            r3 = r4
            goto L2a
        L29:
            r3 = r1
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L32
            com.google.android.gms.org.conscrypt.ConscryptSession r0 = com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession()
            return r0
        L32:
            com.google.android.gms.org.conscrypt.ActiveSession r0 = r5.activeSession
            return r0
        L35:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.provideSession():com.google.android.gms.org.conscrypt.ConscryptSession");
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    private void shutdownAndFreeSslNative() {
        try {
            Platform.blockGuardOnNetwork();
            this.ssl.shutdown(Platform.getFileDescriptor(this.socket));
        } catch (IOException unused) {
        } catch (Throwable th) {
            free();
            closeUnderlyingSocket();
            throw th;
        }
        free();
        closeUnderlyingSocket();
    }

    private void transitionTo(int i) {
        int i2;
        if (this.state == i) {
            return;
        }
        if (i == 2) {
            this.handshakeStartedMillis = Platform.getMillisSinceBoot();
        } else if (i != 5) {
            if (i == 8) {
                if (this.handshakeStartedMillis != 0) {
                    StatsLog statsLog = Platform.getStatsLog();
                    if (statsLog != null) {
                        statsLog.countTlsHandshake(false, "TLS_PROTO_FAILED", "TLS_CIPHER_FAILED", Platform.getMillisSinceBoot() - this.handshakeStartedMillis);
                    }
                    this.handshakeStartedMillis = 0L;
                }
                if (!this.ssl.isClosed() && (i2 = this.state) >= 2 && i2 < 8) {
                    this.closedSession = new SessionSnapshot(this.activeSession);
                }
            }
        } else if (this.handshakeStartedMillis != 0) {
            StatsLog statsLog2 = Platform.getStatsLog();
            if (statsLog2 != null) {
                ActiveSession activeSession = this.activeSession;
                statsLog2.countTlsHandshake(true, activeSession.getProtocol(), activeSession.getCipherSuite(), Platform.getMillisSinceBoot() - this.handshakeStartedMillis);
            }
            this.handshakeStartedMillis = 0L;
        }
        this.state = i;
    }

    private void waitForHandshake() {
        startHandshake();
        synchronized (this.ssl) {
            while (true) {
                int i = this.state;
                if (i == 5 || i == 4) {
                    break;
                }
                if (i == 8) {
                    throw new SocketException("Socket is closed");
                }
                try {
                    this.ssl.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted waiting for handshake", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, this);
    }

    @Override // com.google.android.gms.org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, this);
    }

    @Override // com.google.android.gms.org.conscrypt.SSLParametersImpl.AliasChooser
    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager.chooseServerAlias(str, null, this);
    }

    @Override // com.google.android.gms.org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint(this);
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        NativeSsl nativeSsl = this.ssl;
        if (nativeSsl == null) {
            return;
        }
        synchronized (nativeSsl) {
            int i = this.state;
            if (i == 8) {
                return;
            }
            transitionTo(8);
            if (i == 0) {
                free();
                closeUnderlyingSocket();
                this.ssl.notifyAll();
                return;
            }
            if (i != 5 && i != 4) {
                this.ssl.interrupt();
                this.ssl.notifyAll();
                return;
            }
            this.ssl.notifyAll();
            SSLInputStream sSLInputStream = this.is;
            SSLOutputStream sSLOutputStream = this.os;
            if (sSLInputStream != null || sSLOutputStream != null) {
                this.ssl.interrupt();
            }
            if (sSLInputStream != null) {
                sSLInputStream.awaitPendingOps();
            }
            if (sSLOutputStream != null) {
                sSLOutputStream.awaitPendingOps();
            }
            shutdownAndFreeSslNative();
        }
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        synchronized (this.ssl) {
            int i2 = this.state;
            if (i2 >= 3 && i2 != 8) {
                return this.ssl.exportKeyingMaterial(str, bArr, i);
            }
            return null;
        }
    }

    protected final void finalize() {
        try {
            Object obj = this.guard;
            if (obj != null) {
                Platform.closeGuardWarnIfOpen(obj);
            }
            NativeSsl nativeSsl = this.ssl;
            if (nativeSsl != null) {
                synchronized (nativeSsl) {
                    transitionTo(8);
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final SSLSession getActiveSession() {
        return this.activeSession;
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getApplicationProtocol() {
        return provideAfterHandshakeSession().getApplicationProtocol();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final byte[] getChannelId() {
        if (getUseClientMode()) {
            throw new IllegalStateException("Client mode");
        }
        synchronized (this.ssl) {
            if (this.state != 5) {
                throw new IllegalStateException("Channel ID is only available after handshake completes");
            }
        }
        return this.ssl.getTlsChannelId();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final String getHandshakeApplicationProtocol() {
        String str;
        synchronized (this.ssl) {
            int i = this.state;
            str = null;
            if (i >= 2 && i < 5) {
                str = getApplicationProtocol();
            }
        }
        return str;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public final SSLSession getHandshakeSession() {
        synchronized (this.ssl) {
            int i = this.state;
            if (i < 2 || i >= 5) {
                return null;
            }
            return Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.2
                @Override // com.google.android.gms.org.conscrypt.ExternalSession.Provider
                public ConscryptSession provideSession() {
                    return ConscryptFileDescriptorSocket.this.provideHandshakeSession();
                }
            }));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final InputStream getInputStream() {
        SSLInputStream sSLInputStream;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state == 8) {
                throw new SocketException("Socket is closed.");
            }
            if (this.is == null) {
                this.is = new SSLInputStream();
            }
            sSLInputStream = this.is;
        }
        waitForHandshake();
        return sSLInputStream;
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public final OutputStream getOutputStream() {
        SSLOutputStream sSLOutputStream;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state == 8) {
                throw new SocketException("Socket is closed.");
            }
            if (this.os == null) {
                this.os = new SSLOutputStream();
            }
            sSLOutputStream = this.os;
        }
        waitForHandshake();
        return sSLOutputStream;
    }

    @Override // com.google.android.gms.org.conscrypt.SSLParametersImpl.PSKCallbacks
    public final SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, this);
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, this);
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        return this.externalSession;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final int getSoWriteTimeout() {
        return this.writeTimeoutMilliseconds;
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void onNewSessionEstablished(long j) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j), this.activeSession));
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void onSSLStateChange(int i, int i2) {
        if (i != 32) {
            return;
        }
        synchronized (this.ssl) {
            if (this.state == 8) {
                return;
            }
            transitionTo(5);
            notifyHandshakeCompletedListeners();
            synchronized (this.ssl) {
                this.ssl.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int selectApplicationProtocol(byte[] bArr) {
        ApplicationProtocolSelectorAdapter applicationProtocolSelector = this.sslParameters.getApplicationProtocolSelector();
        if (applicationProtocolSelector == null) {
            return 3;
        }
        return applicationProtocolSelector.selectApplicationProtocol(bArr);
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void serverCertificateRequested() {
        synchronized (this.ssl) {
            this.ssl.configureServerCertificate();
        }
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final long serverSessionRequested(byte[] bArr) {
        return 0L;
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setApplicationProtocols(String[] strArr) {
        this.sslParameters.setApplicationProtocols(strArr);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdEnabled(boolean z) {
        if (getUseClientMode()) {
            throw new IllegalStateException("Client mode");
        }
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
            }
        }
        this.sslParameters.channelIdEnabled = z;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (!getUseClientMode()) {
            throw new IllegalStateException("Server mode");
        }
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
            }
        }
        if (privateKey == null) {
            this.sslParameters.channelIdEnabled = false;
            this.channelIdPrivateKey = null;
            return;
        }
        this.sslParameters.channelIdEnabled = true;
        try {
            ECParameterSpec params = privateKey instanceof ECKey ? ((ECKey) privateKey).getParams() : null;
            if (params == null) {
                params = OpenSSLECGroupContext.getCurveByName("prime256v1").getECParameterSpec();
            }
            this.channelIdPrivateKey = OpenSSLKey.fromECPrivateKeyForTLSStackOnly(privateKey, params);
        } catch (InvalidKeyException unused) {
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z) {
        this.sslParameters.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setHandshakeTimeout(int i) {
        this.handshakeTimeoutMilliseconds = i;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        super.setHostname(str);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
        this.sslParameters.setNeedClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, this);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setSoWriteTimeout(int i) {
        this.writeTimeoutMilliseconds = i;
        Platform.setSocketWriteTimeout(this, i);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalArgumentException("Could not change the mode after the initial handshake has begun.");
            }
        }
        this.sslParameters.setUseClientMode(z);
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLSocketImpl, com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public final void setUseSessionTickets(boolean z) {
        this.sslParameters.setUseSessionTickets(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
        this.sslParameters.setWantClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        NativeSslSession cachedSession;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state == 0) {
                transitionTo(2);
                boolean z = true;
                try {
                    try {
                        Platform.closeGuardOpen(this.guard, "close");
                        this.ssl.initialize(getHostname(), this.channelIdPrivateKey);
                        if (getUseClientMode() && (cachedSession = clientSessionContext().getCachedSession(getHostnameOrIP(), getPort(), this.sslParameters)) != null) {
                            cachedSession.offerToResume(this.ssl);
                        }
                        int soTimeout = getSoTimeout();
                        int soWriteTimeout = getSoWriteTimeout();
                        int i = this.handshakeTimeoutMilliseconds;
                        if (i >= 0) {
                            setSoTimeout(i);
                            setSoWriteTimeout(this.handshakeTimeoutMilliseconds);
                        }
                        synchronized (this.ssl) {
                            if (this.state == 8) {
                                synchronized (this.ssl) {
                                    transitionTo(8);
                                    this.ssl.notifyAll();
                                }
                            } else {
                                try {
                                    this.ssl.doHandshake(Platform.getFileDescriptor(this.socket), getSoTimeout());
                                    this.activeSession.onPeerCertificateAvailable(getHostnameOrIP(), getPort());
                                    synchronized (this.ssl) {
                                        if (this.state != 8) {
                                            if (this.handshakeTimeoutMilliseconds >= 0) {
                                                setSoTimeout(soTimeout);
                                                setSoWriteTimeout(soWriteTimeout);
                                            }
                                            synchronized (this.ssl) {
                                                int i2 = this.state;
                                                if (i2 != 8) {
                                                    z = false;
                                                }
                                                if (i2 == 2) {
                                                    transitionTo(4);
                                                } else {
                                                    transitionTo(5);
                                                }
                                                if (!z) {
                                                    this.ssl.notifyAll();
                                                }
                                            }
                                            if (z) {
                                                synchronized (this.ssl) {
                                                    transitionTo(8);
                                                    this.ssl.notifyAll();
                                                }
                                                try {
                                                    shutdownAndFreeSslNative();
                                                    return;
                                                } catch (IOException unused) {
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        synchronized (this.ssl) {
                                            transitionTo(8);
                                            this.ssl.notifyAll();
                                        }
                                    }
                                } catch (CertificateException e) {
                                    SSLHandshakeException sSLHandshakeException = new SSLHandshakeException(e.getMessage());
                                    sSLHandshakeException.initCause(e);
                                    throw sSLHandshakeException;
                                } catch (SSLException e2) {
                                    synchronized (this.ssl) {
                                        if (this.state != 8) {
                                            throw e2;
                                        }
                                        synchronized (this.ssl) {
                                            transitionTo(8);
                                            this.ssl.notifyAll();
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            shutdownAndFreeSslNative();
                        } catch (IOException unused2) {
                        }
                    } catch (SSLProtocolException e3) {
                        throw ((SSLHandshakeException) new SSLHandshakeException("Handshake failed").initCause(e3));
                    }
                } catch (Throwable th) {
                    if (1 != 0) {
                        synchronized (this.ssl) {
                            transitionTo(8);
                            this.ssl.notifyAll();
                            try {
                                shutdownAndFreeSslNative();
                            } catch (IOException unused3) {
                            }
                        }
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public final void verifyCertificateChain(byte[][] bArr, String str) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] decodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager == null) {
                        throw new CertificateException("No X.509 TrustManager");
                    }
                    this.activeSession.onPeerCertificatesReceived(getHostnameOrIP(), getPort(), decodeX509CertificateChain);
                    if (getUseClientMode()) {
                        Platform.checkServerTrusted(x509TrustManager, decodeX509CertificateChain, str, this);
                        return;
                    } else {
                        Platform.checkClientTrusted(x509TrustManager, decodeX509CertificateChain, decodeX509CertificateChain[0].getPublicKey().getAlgorithm(), this);
                        return;
                    }
                }
            } catch (CertificateException e) {
                throw e;
            } catch (Exception e2) {
                throw new CertificateException(e2);
            }
        }
        throw new CertificateException("Peer sent no certificate");
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public ConscryptFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        super(str, i);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // com.google.android.gms.org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.handshakeStartedMillis = 0L;
        this.sslParameters = sSLParametersImpl;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.activeSession = new ActiveSession(newSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        super(str, i, inetAddress, i2);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // com.google.android.gms.org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.handshakeStartedMillis = 0L;
        this.sslParameters = sSLParametersImpl;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.activeSession = new ActiveSession(newSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // com.google.android.gms.org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.handshakeStartedMillis = 0L;
        this.sslParameters = sSLParametersImpl;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.activeSession = new ActiveSession(newSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i, inetAddress2, i2);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // com.google.android.gms.org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.handshakeStartedMillis = 0L;
        this.sslParameters = sSLParametersImpl;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.activeSession = new ActiveSession(newSsl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i, z);
        this.state = 0;
        this.guard = Platform.closeGuardGet();
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.1
            @Override // com.google.android.gms.org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptFileDescriptorSocket.this.provideSession();
            }
        }));
        this.writeTimeoutMilliseconds = 0;
        this.handshakeTimeoutMilliseconds = -1;
        this.handshakeStartedMillis = 0L;
        this.sslParameters = sSLParametersImpl;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.activeSession = new ActiveSession(newSsl, sSLParametersImpl.getSessionContext());
    }
}
