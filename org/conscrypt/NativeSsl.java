package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.SSLParametersImpl;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.X509KeyManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class NativeSsl {
    private final SSLParametersImpl.AliasChooser aliasChooser;
    private final NativeCrypto.SSLHandshakeCallbacks handshakeCallbacks;
    private X509Certificate[] localCertificates;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final SSLParametersImpl parameters;
    private final SSLParametersImpl.PSKCallbacks pskCallbacks;
    private volatile long ssl;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    final class BioWrapper {
        private volatile long bio;

        public void close() {
            NativeSsl.this.lock.writeLock().lock();
            try {
                long j = this.bio;
                this.bio = 0L;
                if (j != 0) {
                    NativeCrypto.BIO_free_all(j);
                }
            } finally {
                NativeSsl.this.lock.writeLock().unlock();
            }
        }

        public int getPendingWrittenBytes() {
            NativeSsl.this.lock.readLock().lock();
            try {
                return this.bio == 0 ? 0 : NativeCrypto.SSL_pending_written_bytes_in_BIO(this.bio);
            } finally {
                NativeSsl.this.lock.readLock().unlock();
            }
        }

        public int readDirectByteBuffer(long j, int i) {
            NativeSsl.this.lock.readLock().lock();
            try {
                if (NativeSsl.this.isClosed()) {
                    throw new SSLException("Connection closed");
                }
                return NativeCrypto.ENGINE_SSL_read_BIO_direct(NativeSsl.this.ssl, NativeSsl.this, this.bio, j, i, NativeSsl.this.handshakeCallbacks);
            } finally {
                NativeSsl.this.lock.readLock().unlock();
            }
        }

        public int writeDirectByteBuffer(long j, int i) {
            NativeSsl.this.lock.readLock().lock();
            try {
                if (NativeSsl.this.isClosed()) {
                    throw new SSLException("Connection closed");
                }
                return NativeCrypto.ENGINE_SSL_write_BIO_direct(NativeSsl.this.ssl, NativeSsl.this, this.bio, j, i, NativeSsl.this.handshakeCallbacks);
            } finally {
                NativeSsl.this.lock.readLock().unlock();
            }
        }

        private BioWrapper() {
            this.bio = NativeCrypto.SSL_BIO_new(NativeSsl.this.ssl, NativeSsl.this);
        }
    }

    private NativeSsl(long j, SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser, SSLParametersImpl.PSKCallbacks pSKCallbacks) {
        this.ssl = j;
        this.parameters = sSLParametersImpl;
        this.handshakeCallbacks = sSLHandshakeCallbacks;
        this.aliasChooser = aliasChooser;
        this.pskCallbacks = pSKCallbacks;
    }

    private void enablePSKKeyManagerIfRequested() {
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager != null) {
            for (String str : this.parameters.enabledCipherSuites) {
                if (str != null && str.contains("PSK")) {
                    if (isClient()) {
                        NativeCrypto.set_SSL_psk_client_callback_enabled(this.ssl, this, true);
                        return;
                    }
                    NativeCrypto.set_SSL_psk_server_callback_enabled(this.ssl, this, true);
                    NativeCrypto.SSL_use_psk_identity_hint(this.ssl, this, this.pskCallbacks.chooseServerPSKIdentityHint(pSKKeyManager));
                    return;
                }
            }
        }
    }

    private Set getCipherKeyTypes() {
        HashSet hashSet = new HashSet();
        for (long j : NativeCrypto.SSL_get_ciphers(this.ssl, this)) {
            String serverX509KeyType = SSLUtils.getServerX509KeyType(j);
            if (serverX509KeyType != null) {
                hashSet.add(serverX509KeyType);
            }
        }
        return hashSet;
    }

    private boolean isClient() {
        return this.parameters.getUseClientMode();
    }

    static NativeSsl newInstance(SSLParametersImpl sSLParametersImpl, NativeCrypto.SSLHandshakeCallbacks sSLHandshakeCallbacks, SSLParametersImpl.AliasChooser aliasChooser, SSLParametersImpl.PSKCallbacks pSKCallbacks) {
        return new NativeSsl(sSLParametersImpl.getSessionContext().newSsl(), sSLParametersImpl, sSLHandshakeCallbacks, aliasChooser, pSKCallbacks);
    }

    private void setCertificate(String str) {
        X509KeyManager x509KeyManager;
        PrivateKey privateKey;
        if (str == null || (x509KeyManager = this.parameters.getX509KeyManager()) == null || (privateKey = x509KeyManager.getPrivateKey(str)) == null) {
            return;
        }
        X509Certificate[] certificateChain = x509KeyManager.getCertificateChain(str);
        this.localCertificates = certificateChain;
        if (certificateChain != null) {
            int length = certificateChain.length;
            PublicKey publicKey = length > 0 ? certificateChain[0].getPublicKey() : null;
            byte[][] bArr = new byte[length][];
            for (int i = 0; i < length; i++) {
                bArr[i] = this.localCertificates[i].getEncoded();
            }
            try {
                NativeCrypto.setLocalCertsAndPrivateKey(this.ssl, this, bArr, OpenSSLKey.fromPrivateKeyForTLSStackOnly(privateKey, publicKey).getNativeRef());
            } catch (InvalidKeyException e) {
                throw new SSLException(e);
            }
        }
    }

    private void setCertificateValidation() {
        if (isClient()) {
            return;
        }
        if (this.parameters.getNeedClientAuth()) {
            NativeCrypto.SSL_set_verify(this.ssl, this, 3);
        } else {
            if (!this.parameters.getWantClientAuth()) {
                NativeCrypto.SSL_set_verify(this.ssl, this, 0);
                return;
            }
            NativeCrypto.SSL_set_verify(this.ssl, this, 1);
        }
        X509Certificate[] acceptedIssuers = this.parameters.getX509TrustManager().getAcceptedIssuers();
        if (acceptedIssuers == null || acceptedIssuers.length == 0) {
            return;
        }
        try {
            NativeCrypto.SSL_set_client_CA_list(this.ssl, this, SSLUtils.encodeSubjectX509Principals(acceptedIssuers));
        } catch (CertificateEncodingException e) {
            throw new SSLException("Problem encoding principals", e);
        }
    }

    private void setTlsChannelId(OpenSSLKey openSSLKey) {
        SSLParametersImpl sSLParametersImpl = this.parameters;
        if (sSLParametersImpl.channelIdEnabled) {
            if (!sSLParametersImpl.getUseClientMode()) {
                NativeCrypto.SSL_enable_tls_channel_id(this.ssl, this);
            } else {
                if (openSSLKey == null) {
                    throw new SSLHandshakeException("Invalid TLS channel ID key specified");
                }
                NativeCrypto.SSL_set1_tls_channel_id(this.ssl, this, openSSLKey.getNativeRef());
            }
        }
    }

    private void verifyWithSniMatchers(String str) {
        if (AddressUtils.isValidSniHostname(str) && !Platform.serverNamePermitted(this.parameters, str)) {
            throw new SSLHandshakeException("SNI match failed: ".concat(String.valueOf(str)));
        }
    }

    public void chooseClientCertificate(byte[] bArr, int[] iArr, byte[][] bArr2) {
        X500Principal[] x500PrincipalArr;
        Set supportedClientKeyTypes = SSLUtils.getSupportedClientKeyTypes(bArr, iArr);
        String[] strArr = (String[]) supportedClientKeyTypes.toArray(new String[0]);
        if (bArr2 == null) {
            x500PrincipalArr = null;
        } else {
            x500PrincipalArr = new X500Principal[bArr2.length];
            for (int i = 0; i < bArr2.length; i++) {
                x500PrincipalArr[i] = new X500Principal(bArr2[i]);
            }
        }
        X509KeyManager x509KeyManager = this.parameters.getX509KeyManager();
        setCertificate(x509KeyManager != null ? this.aliasChooser.chooseClientAlias(x509KeyManager, x500PrincipalArr, strArr) : null);
    }

    public int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        String str2;
        byte[] bytes;
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager != null) {
            String chooseClientPSKIdentity = this.pskCallbacks.chooseClientPSKIdentity(pSKKeyManager, str);
            if (chooseClientPSKIdentity == null) {
                bytes = EmptyArray.BYTE;
                str2 = "";
            } else {
                str2 = chooseClientPSKIdentity;
                bytes = chooseClientPSKIdentity.isEmpty() ? EmptyArray.BYTE : chooseClientPSKIdentity.getBytes(StandardCharsets.UTF_8);
            }
            int length = bytes.length;
            if (length + 1 <= bArr.length) {
                if (length > 0) {
                    System.arraycopy(bytes, 0, bArr, 0, length);
                }
                bArr[length] = 0;
                byte[] encoded = this.pskCallbacks.getPSKKey(pSKKeyManager, str, str2).getEncoded();
                if (encoded != null) {
                    int length2 = bArr2.length;
                    int length3 = encoded.length;
                    if (length3 <= length2) {
                        System.arraycopy(encoded, 0, bArr2, 0, length3);
                        return length3;
                    }
                }
            }
        }
        return 0;
    }

    public void close() {
        this.lock.writeLock().lock();
        try {
            if (!isClosed()) {
                long j = this.ssl;
                this.ssl = 0L;
                NativeCrypto.SSL_free(j, this);
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void configureServerCertificate() {
        X509KeyManager x509KeyManager;
        verifyWithSniMatchers(getRequestedServerName());
        if (isClient() || (x509KeyManager = this.parameters.getX509KeyManager()) == null) {
            return;
        }
        Iterator it = getCipherKeyTypes().iterator();
        while (it.hasNext()) {
            try {
                setCertificate(this.aliasChooser.chooseServerAlias(x509KeyManager, (String) it.next()));
            } catch (CertificateEncodingException e) {
                throw new IOException(e);
            }
        }
    }

    public int doHandshake() {
        this.lock.readLock().lock();
        try {
            return NativeCrypto.ENGINE_SSL_do_handshake(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        if (str == null) {
            throw new NullPointerException("Label is null");
        }
        return NativeCrypto.SSL_export_keying_material(this.ssl, this, str.getBytes(StandardCharsets.US_ASCII), bArr, i);
    }

    protected void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public void forceRead() {
        this.lock.readLock().lock();
        try {
            NativeCrypto.ENGINE_SSL_force_read(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public byte[] getApplicationProtocol() {
        return NativeCrypto.getApplicationProtocol(this.ssl, this);
    }

    public String getCipherSuite() {
        return NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_get_current_cipher(this.ssl, this));
    }

    public int getError(int i) {
        return NativeCrypto.SSL_get_error(this.ssl, this, i);
    }

    public X509Certificate[] getLocalCertificates() {
        return this.localCertificates;
    }

    public int getMaxSealOverhead() {
        return NativeCrypto.SSL_max_seal_overhead(this.ssl, this);
    }

    public byte[] getPeerCertificateOcspData() {
        return NativeCrypto.SSL_get_ocsp_response(this.ssl, this);
    }

    public X509Certificate[] getPeerCertificates() {
        byte[][] SSL_get0_peer_certificates = NativeCrypto.SSL_get0_peer_certificates(this.ssl, this);
        if (SSL_get0_peer_certificates == null) {
            return null;
        }
        return SSLUtils.decodeX509CertificateChain(SSL_get0_peer_certificates);
    }

    public byte[] getPeerTlsSctData() {
        return NativeCrypto.SSL_get_signed_cert_timestamp_list(this.ssl, this);
    }

    public int getPendingReadableBytes() {
        this.lock.readLock().lock();
        try {
            return !isClosed() ? NativeCrypto.SSL_pending_readable_bytes(this.ssl, this) : 0;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public String getRequestedServerName() {
        return NativeCrypto.SSL_get_servername(this.ssl, this);
    }

    public byte[] getSessionId() {
        return NativeCrypto.SSL_session_id(this.ssl, this);
    }

    public long getTime() {
        return NativeCrypto.SSL_get_time(this.ssl, this);
    }

    public long getTimeout() {
        return NativeCrypto.SSL_get_timeout(this.ssl, this);
    }

    public byte[] getTlsChannelId() {
        return NativeCrypto.SSL_get_tls_channel_id(this.ssl, this);
    }

    public byte[] getTlsUnique() {
        return NativeCrypto.SSL_get_tls_unique(this.ssl, this);
    }

    public String getVersion() {
        return NativeCrypto.SSL_get_version(this.ssl, this);
    }

    public void initialize(String str, OpenSSLKey openSSLKey) {
        if (!this.parameters.getEnableSessionCreation()) {
            NativeCrypto.SSL_set_session_creation_enabled(this.ssl, this, false);
        }
        NativeCrypto.SSL_accept_renegotiations(this.ssl, this);
        if (isClient()) {
            NativeCrypto.SSL_set_connect_state(this.ssl, this);
            NativeCrypto.SSL_enable_ocsp_stapling(this.ssl, this);
            if (this.parameters.isCTVerificationEnabled(str)) {
                NativeCrypto.SSL_enable_signed_cert_timestamps(this.ssl, this);
            }
        } else {
            NativeCrypto.SSL_set_accept_state(this.ssl, this);
            if (this.parameters.getOCSPResponse() != null) {
                NativeCrypto.SSL_enable_ocsp_stapling(this.ssl, this);
            }
        }
        if (this.parameters.getEnabledProtocols().length == 0 && this.parameters.isEnabledProtocolsFiltered) {
            throw new SSLHandshakeException("No enabled protocols; SSLv3, TLSv1 and TLSv1.1 are no longer supported and were filtered from the list");
        }
        NativeCrypto.setEnabledProtocols(this.ssl, this, this.parameters.enabledProtocols);
        if (!this.parameters.isSpake()) {
            long j = this.ssl;
            SSLParametersImpl sSLParametersImpl = this.parameters;
            NativeCrypto.setEnabledCipherSuites(j, this, sSLParametersImpl.enabledCipherSuites, sSLParametersImpl.enabledProtocols);
        }
        if (this.parameters.applicationProtocols.length > 0) {
            NativeCrypto.setApplicationProtocols(this.ssl, this, isClient(), this.parameters.applicationProtocols);
        }
        if (!isClient() && this.parameters.applicationProtocolSelector != null) {
            NativeCrypto.setHasApplicationProtocolSelector(this.ssl, this, true);
        }
        if (!isClient()) {
            NativeCrypto.SSL_set_options(this.ssl, this, 4194304L);
            if (this.parameters.sctExtension != null) {
                NativeCrypto.SSL_set_signed_cert_timestamp_list(this.ssl, this, this.parameters.sctExtension);
            }
            if (this.parameters.ocspResponse != null) {
                NativeCrypto.SSL_set_ocsp_response(this.ssl, this, this.parameters.ocspResponse);
            }
        }
        enablePSKKeyManagerIfRequested();
        if (this.parameters.useSessionTickets) {
            NativeCrypto.SSL_clear_options(this.ssl, this, 16384L);
        } else {
            NativeCrypto.SSL_set_options(this.ssl, this, 16384 | NativeCrypto.SSL_get_options(this.ssl, this));
        }
        if (this.parameters.getUseSni() && AddressUtils.isValidSniHostname(str)) {
            NativeCrypto.SSL_set_tlsext_host_name(this.ssl, this, str);
        }
        NativeCrypto.SSL_set_mode(this.ssl, this, 256L);
        if (!this.parameters.isSpake()) {
            setCertificateValidation();
        }
        setTlsChannelId(openSSLKey);
    }

    public void interrupt() {
        NativeCrypto.SSL_interrupt(this.ssl, this);
    }

    public boolean isClosed() {
        return this.ssl == 0;
    }

    public BioWrapper newBio() {
        try {
            return new BioWrapper();
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    public void offerToResumeSession(long j) {
        NativeCrypto.SSL_set_session(this.ssl, this, j);
    }

    public int read(FileDescriptor fileDescriptor, byte[] bArr, int i, int i2, int i3) {
        this.lock.readLock().lock();
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (isClosed() || fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket is closed");
            }
            int SSL_read = NativeCrypto.SSL_read(this.ssl, this, fileDescriptor, this.handshakeCallbacks, bArr, i, i2, i3);
            this.lock.readLock().unlock();
            return SSL_read;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            this.lock.readLock().unlock();
            throw th3;
        }
    }

    public int readDirectByteBuffer(long j, int i) {
        NativeSsl nativeSsl;
        this.lock.readLock().lock();
        try {
            nativeSsl = this;
            try {
                int ENGINE_SSL_read_direct = NativeCrypto.ENGINE_SSL_read_direct(this.ssl, nativeSsl, j, i, this.handshakeCallbacks);
                nativeSsl.lock.readLock().unlock();
                return ENGINE_SSL_read_direct;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                nativeSsl.lock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            nativeSsl = this;
        }
    }

    public int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        byte[] encoded;
        PSKKeyManager pSKKeyManager = this.parameters.getPSKKeyManager();
        if (pSKKeyManager != null && (encoded = this.pskCallbacks.getPSKKey(pSKKeyManager, str, str2).getEncoded()) != null) {
            int length = bArr.length;
            int length2 = encoded.length;
            if (length2 <= length) {
                System.arraycopy(encoded, 0, bArr, 0, length2);
                return length2;
            }
        }
        return 0;
    }

    public void setTimeout(long j) {
        NativeCrypto.SSL_set_timeout(this.ssl, this, j);
    }

    public void shutdown() {
        this.lock.readLock().lock();
        try {
            NativeCrypto.ENGINE_SSL_shutdown(this.ssl, this, this.handshakeCallbacks);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean wasShutdownReceived() {
        this.lock.readLock().lock();
        try {
            return (NativeCrypto.SSL_get_shutdown(this.ssl, this) & 2) != 0;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean wasShutdownSent() {
        this.lock.readLock().lock();
        try {
            return 1 == (NativeCrypto.SSL_get_shutdown(this.ssl, this) & 1);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void write(FileDescriptor fileDescriptor, byte[] bArr, int i, int i2, int i3) {
        this.lock.readLock().lock();
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (isClosed() || fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket is closed");
            }
            NativeCrypto.SSL_write(this.ssl, this, fileDescriptor, this.handshakeCallbacks, bArr, i, i2, i3);
            this.lock.readLock().unlock();
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            this.lock.readLock().unlock();
            throw th3;
        }
    }

    public int writeDirectByteBuffer(long j, int i) {
        NativeSsl nativeSsl;
        this.lock.readLock().lock();
        try {
            nativeSsl = this;
            try {
                int ENGINE_SSL_write_direct = NativeCrypto.ENGINE_SSL_write_direct(this.ssl, nativeSsl, j, i, this.handshakeCallbacks);
                nativeSsl.lock.readLock().unlock();
                return ENGINE_SSL_write_direct;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                nativeSsl.lock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            nativeSsl = this;
        }
    }

    public void doHandshake(FileDescriptor fileDescriptor, int i) {
        this.lock.readLock().lock();
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!isClosed() && fileDescriptor != null && fileDescriptor.valid()) {
                NativeCrypto.SSL_do_handshake(this.ssl, this, fileDescriptor, this.handshakeCallbacks, i);
                this.lock.readLock().unlock();
                return;
            }
            throw new SocketException("Socket is closed");
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            this.lock.readLock().unlock();
            throw th3;
        }
    }

    public void shutdown(FileDescriptor fileDescriptor) {
        NativeCrypto.SSL_shutdown(this.ssl, this, fileDescriptor, this.handshakeCallbacks);
    }
}
