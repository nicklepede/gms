package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.SSLUtils;
import defpackage.a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
abstract class NativeSslSession {
    private static final Logger logger = Logger.getLogger(NativeSslSession.class.getName());

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    final class Impl extends NativeSslSession {
        private final String cipherSuite;
        private final AbstractSessionContext context;
        private final String host;
        private final X509Certificate[] peerCertificates;
        private final byte[] peerOcspStapledResponse;
        private final byte[] peerSignedCertificateTimestamp;
        private final int port;
        private final String protocol;
        private final NativeRef.SSL_SESSION ref;

        /* JADX INFO: Access modifiers changed from: private */
        public long getCreationTime() {
            return NativeCrypto.SSL_SESSION_get_time(this.ref.address);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public String getCipherSuite() {
            return this.cipherSuite;
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public byte[] getId() {
            return NativeCrypto.SSL_SESSION_session_id(this.ref.address);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public String getPeerHost() {
            return this.host;
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        byte[] getPeerOcspStapledResponse() {
            return this.peerOcspStapledResponse;
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public int getPeerPort() {
            return this.port;
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        byte[] getPeerSignedCertificateTimestamp() {
            return this.peerSignedCertificateTimestamp;
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public String getProtocol() {
            return this.protocol;
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public boolean isSingleUse() {
            return NativeCrypto.SSL_SESSION_should_be_single_use(this.ref.address);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public boolean isValid() {
            return System.currentTimeMillis() - (Math.max(0L, Math.min((long) this.context.getSessionTimeout(), NativeCrypto.SSL_SESSION_get_timeout(this.ref.address))) * 1000) < getCreationTime();
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public void offerToResume(NativeSsl nativeSsl) {
            nativeSsl.offerToResumeSession(this.ref.address);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public byte[] toBytes() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value);
                byte[] i2d_SSL_SESSION = NativeCrypto.i2d_SSL_SESSION(this.ref.address);
                dataOutputStream.writeInt(i2d_SSL_SESSION.length);
                dataOutputStream.write(i2d_SSL_SESSION);
                dataOutputStream.writeInt(this.peerCertificates.length);
                for (X509Certificate x509Certificate : this.peerCertificates) {
                    byte[] encoded = x509Certificate.getEncoded();
                    dataOutputStream.writeInt(encoded.length);
                    dataOutputStream.write(encoded);
                }
                if (this.peerOcspStapledResponse != null) {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeInt(this.peerOcspStapledResponse.length);
                    dataOutputStream.write(this.peerOcspStapledResponse);
                } else {
                    dataOutputStream.writeInt(0);
                }
                byte[] bArr = this.peerSignedCertificateTimestamp;
                if (bArr != null) {
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(this.peerSignedCertificateTimestamp);
                } else {
                    dataOutputStream.writeInt(0);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                NativeSslSession.logger.logp(Level.FINE, "com.google.android.gms.org.conscrypt.NativeSslSession$Impl", "toBytes", "Failed to convert saved SSL Session: ", (Throwable) e);
                return null;
            } catch (CertificateEncodingException e2) {
                NativeSslSession.log(e2);
                return null;
            }
        }

        @Override // com.google.android.gms.org.conscrypt.NativeSslSession
        public SSLSession toSSLSession() {
            return new SSLSession() { // from class: com.google.android.gms.org.conscrypt.NativeSslSession.Impl.1
                @Override // javax.net.ssl.SSLSession
                public int getApplicationBufferSize() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getCipherSuite() {
                    return Impl.this.getCipherSuite();
                }

                @Override // javax.net.ssl.SSLSession
                public long getCreationTime() {
                    return Impl.this.getCreationTime();
                }

                @Override // javax.net.ssl.SSLSession
                public byte[] getId() {
                    return Impl.this.getId();
                }

                @Override // javax.net.ssl.SSLSession
                public long getLastAccessedTime() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Certificate[] getLocalCertificates() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Principal getLocalPrincipal() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public int getPacketBufferSize() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public javax.security.cert.X509Certificate[] getPeerCertificateChain() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Certificate[] getPeerCertificates() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getPeerHost() {
                    return Impl.this.getPeerHost();
                }

                @Override // javax.net.ssl.SSLSession
                public int getPeerPort() {
                    return Impl.this.getPeerPort();
                }

                @Override // javax.net.ssl.SSLSession
                public Principal getPeerPrincipal() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String getProtocol() {
                    return Impl.this.getProtocol();
                }

                @Override // javax.net.ssl.SSLSession
                public SSLSessionContext getSessionContext() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public Object getValue(String str) {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public String[] getValueNames() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public void invalidate() {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public boolean isValid() {
                    return Impl.this.isValid();
                }

                @Override // javax.net.ssl.SSLSession
                public void putValue(String str, Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // javax.net.ssl.SSLSession
                public void removeValue(String str) {
                    throw new UnsupportedOperationException();
                }
            };
        }

        private Impl(AbstractSessionContext abstractSessionContext, NativeRef.SSL_SESSION ssl_session, String str, int i, X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2) {
            this.context = abstractSessionContext;
            this.host = str;
            this.port = i;
            this.peerCertificates = x509CertificateArr;
            this.peerOcspStapledResponse = bArr;
            this.peerSignedCertificateTimestamp = bArr2;
            this.protocol = NativeCrypto.SSL_SESSION_get_version(ssl_session.address);
            this.cipherSuite = NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_SESSION_cipher(ssl_session.address));
            this.ref = ssl_session;
        }
    }

    private static void checkRemaining(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IOException(a.j(i, "Length is negative: "));
        }
        if (i <= byteBuffer.remaining()) {
            return;
        }
        throw new IOException("Length of blob is longer than available: " + i + " > " + byteBuffer.remaining());
    }

    private static byte[] getOcspResponse(ConscryptSession conscryptSession) {
        List statusResponses = conscryptSession.getStatusResponses();
        if (statusResponses.size() > 0) {
            return (byte[]) statusResponses.get(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void log(Throwable th) {
        logger.logp(Level.FINE, "com.google.android.gms.org.conscrypt.NativeSslSession", "log", "Error inflating SSL session: {0}", th.getMessage() != null ? th.getMessage() : th.getClass().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[Catch: BufferUnderflowException -> 0x00c5, IOException | BufferUnderflowException -> 0x00c7, TryCatch #3 {IOException | BufferUnderflowException -> 0x00c7, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0027, B:9:0x0033, B:12:0x003c, B:13:0x0049, B:16:0x004a, B:18:0x0050, B:20:0x0059, B:22:0x0068, B:25:0x007d, B:27:0x0083, B:29:0x008c, B:30:0x0094, B:32:0x009a, B:34:0x00a5, B:38:0x00b9, B:39:0x00c4), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[Catch: BufferUnderflowException -> 0x00c5, IOException | BufferUnderflowException -> 0x00c7, TryCatch #3 {IOException | BufferUnderflowException -> 0x00c7, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0027, B:9:0x0033, B:12:0x003c, B:13:0x0049, B:16:0x004a, B:18:0x0050, B:20:0x0059, B:22:0x0068, B:25:0x007d, B:27:0x0083, B:29:0x008c, B:30:0x0094, B:32:0x009a, B:34:0x00a5, B:38:0x00b9, B:39:0x00c4), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[Catch: BufferUnderflowException -> 0x00c5, IOException | BufferUnderflowException -> 0x00c7, TryCatch #3 {IOException | BufferUnderflowException -> 0x00c7, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0027, B:9:0x0033, B:12:0x003c, B:13:0x0049, B:16:0x004a, B:18:0x0050, B:20:0x0059, B:22:0x0068, B:25:0x007d, B:27:0x0083, B:29:0x008c, B:30:0x0094, B:32:0x009a, B:34:0x00a5, B:38:0x00b9, B:39:0x00c4), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.org.conscrypt.NativeSslSession newInstance(com.google.android.gms.org.conscrypt.AbstractSessionContext r13, byte[] r14, java.lang.String r15, int r16) {
        /*
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r14)
            r1 = 0
            int r0 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            boolean r2 = com.google.android.gms.org.conscrypt.SSLUtils.SessionType.isSupportedType(r0)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            if (r2 == 0) goto Lb9
            int r2 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            checkRemaining(r14, r2)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            byte[] r2 = new byte[r2]     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r14.get(r2)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            int r3 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            checkRemaining(r14, r3)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            java.security.cert.X509Certificate[] r9 = new java.security.cert.X509Certificate[r3]     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r4 = 0
        L25:
            if (r4 >= r3) goto L4a
            int r5 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            checkRemaining(r14, r5)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            byte[] r5 = new byte[r5]     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r14.get(r5)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            com.google.android.gms.org.conscrypt.OpenSSLX509Certificate r5 = com.google.android.gms.org.conscrypt.OpenSSLX509Certificate.fromX509Der(r5)     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r9[r4] = r5     // Catch: java.lang.Exception -> L3c java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            int r4 = r4 + 1
            goto L25
        L3c:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            java.lang.String r14 = "Can not read certificate "
            java.lang.String r0 = "/"
            java.lang.String r14 = defpackage.a.t(r3, r4, r14, r0)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r13.<init>(r14)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            throw r13     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
        L4a:
            com.google.android.gms.org.conscrypt.SSLUtils$SessionType r3 = com.google.android.gms.org.conscrypt.SSLUtils.SessionType.OPEN_SSL_WITH_OCSP     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            int r3 = r3.value     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            if (r0 < r3) goto L7c
            int r3 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            checkRemaining(r14, r3)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            if (r3 <= 0) goto L7c
            int r4 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            checkRemaining(r14, r4)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            byte[] r4 = new byte[r4]     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r14.get(r4)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r5 = 1
        L66:
            if (r5 >= r3) goto L7a
            int r6 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            checkRemaining(r14, r6)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            int r7 = r14.position()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            int r7 = r7 + r6
            r14.position(r7)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            int r5 = r5 + 1
            goto L66
        L7a:
            r10 = r4
            goto L7d
        L7c:
            r10 = r1
        L7d:
            com.google.android.gms.org.conscrypt.SSLUtils$SessionType r3 = com.google.android.gms.org.conscrypt.SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            int r3 = r3.value     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            if (r0 != r3) goto L93
            int r0 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            checkRemaining(r14, r0)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            if (r0 <= 0) goto L93
            byte[] r0 = new byte[r0]     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r14.get(r0)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r11 = r0
            goto L94
        L93:
            r11 = r1
        L94:
            int r14 = r14.remaining()     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            if (r14 == 0) goto La5
            java.lang.AssertionError r13 = new java.lang.AssertionError     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            java.lang.String r14 = "Read entire session, but data still remains; rejecting"
            r13.<init>(r14)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            log(r13)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            return r1
        La5:
            com.google.android.gms.org.conscrypt.NativeRef$SSL_SESSION r6 = new com.google.android.gms.org.conscrypt.NativeRef$SSL_SESSION     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            long r2 = com.google.android.gms.org.conscrypt.NativeCrypto.d2i_SSL_SESSION(r2)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r6.<init>(r2)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            com.google.android.gms.org.conscrypt.NativeSslSession$Impl r4 = new com.google.android.gms.org.conscrypt.NativeSslSession$Impl     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r12 = 0
            r5 = r13
            r7 = r15
            r8 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            return r4
        Lb9:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            java.lang.String r14 = "Unexpected type ID: "
            java.lang.String r14 = defpackage.a.j(r0, r14)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            r13.<init>(r14)     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
            throw r13     // Catch: java.nio.BufferUnderflowException -> Lc5 java.io.IOException -> Lc7
        Lc5:
            r0 = move-exception
            goto Lc8
        Lc7:
            r0 = move-exception
        Lc8:
            r13 = r0
            log(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.NativeSslSession.newInstance(com.google.android.gms.org.conscrypt.AbstractSessionContext, byte[], java.lang.String, int):com.google.android.gms.org.conscrypt.NativeSslSession");
    }

    public abstract String getCipherSuite();

    public abstract byte[] getId();

    public abstract String getPeerHost();

    abstract byte[] getPeerOcspStapledResponse();

    public abstract int getPeerPort();

    abstract byte[] getPeerSignedCertificateTimestamp();

    public abstract String getProtocol();

    public abstract boolean isSingleUse();

    public abstract boolean isValid();

    public abstract void offerToResume(NativeSsl nativeSsl);

    public abstract byte[] toBytes();

    public abstract SSLSession toSSLSession();

    static NativeSslSession newInstance(NativeRef.SSL_SESSION ssl_session, ConscryptSession conscryptSession) {
        AbstractSessionContext abstractSessionContext = (AbstractSessionContext) conscryptSession.getSessionContext();
        if (abstractSessionContext instanceof ClientSessionContext) {
            return new Impl(abstractSessionContext, ssl_session, conscryptSession.getPeerHost(), conscryptSession.getPeerPort(), conscryptSession.getPeerCertificates(), getOcspResponse(conscryptSession), conscryptSession.getPeerSignedCertificateTimestamp());
        }
        return new Impl(abstractSessionContext, ssl_session, null, -1, null, null, null);
    }
}
