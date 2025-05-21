package com.google.android.gms.org.conscrypt;

import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.Provider;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class Conscrypt {
    private static final Version VERSION;
    static boolean enableBytebufferOptimizations = true;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ProviderBuilder {
        private String defaultTlsProtocol;
        private boolean deprecatedTlsV1;
        private boolean enabledTlsV1;
        private String name;
        private boolean provideTrustManager;

        public Provider build() {
            return new OpenSSLProvider(this.name, this.provideTrustManager, this.defaultTlsProtocol, this.deprecatedTlsV1, this.enabledTlsV1);
        }

        public ProviderBuilder defaultTlsProtocol(String str) {
            this.defaultTlsProtocol = str;
            return this;
        }

        public ProviderBuilder isTlsV1Deprecated(boolean z) {
            this.deprecatedTlsV1 = z;
            return this;
        }

        public ProviderBuilder isTlsV1Enabled(boolean z) {
            this.enabledTlsV1 = z;
            return this;
        }

        public ProviderBuilder provideTrustManager(boolean z) {
            this.provideTrustManager = z;
            return this;
        }

        public ProviderBuilder setName(String str) {
            this.name = str;
            return this;
        }

        private ProviderBuilder() {
            this.name = Platform.getDefaultProviderName();
            this.provideTrustManager = false;
            this.defaultTlsProtocol = "TLSv1.3";
            this.deprecatedTlsV1 = Platform.isTlsV1Deprecated();
            this.enabledTlsV1 = Platform.isTlsV1Supported();
        }

        @Deprecated
        public ProviderBuilder provideTrustManager() {
            return provideTrustManager(true);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Version {
        private final int major;
        private final int minor;
        private final int patch;

        private Version(int i, int i2, int i3) {
            this.major = i;
            this.minor = i2;
            this.patch = i3;
        }

        public int major() {
            return this.major;
        }

        public int minor() {
            return this.minor;
        }

        public int patch() {
            return this.patch;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004c A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.String r0 = "-1"
            r1 = 0
            r2 = -1
            java.lang.Class<com.google.android.gms.org.conscrypt.Conscrypt> r3 = com.google.android.gms.org.conscrypt.Conscrypt.class
            java.lang.String r4 = "conscrypt.properties"
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L42
            if (r3 == 0) goto L3a
            java.util.Properties r4 = new java.util.Properties     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L43
            r4.load(r3)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L43
            java.lang.String r5 = "com.google.android.gms.org.conscrypt.version.major"
            java.lang.String r5 = r4.getProperty(r5, r0)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L43
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L43
            java.lang.String r6 = "com.google.android.gms.org.conscrypt.version.minor"
            java.lang.String r6 = r4.getProperty(r6, r0)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L37
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L37
            java.lang.String r7 = "com.google.android.gms.org.conscrypt.version.patch"
            java.lang.String r0 = r4.getProperty(r7, r0)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L45
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L45
            goto L45
        L35:
            r6 = r2
            goto L45
        L37:
            r0 = move-exception
            r1 = r3
            goto L3e
        L3a:
            r0 = r2
            r6 = r0
            goto L47
        L3d:
            r0 = move-exception
        L3e:
            com.google.android.gms.org.conscrypt.io.IoUtils.closeQuietly(r1)
            throw r0
        L42:
            r3 = r1
        L43:
            r5 = r2
            r6 = r5
        L45:
            r0 = r2
            r2 = r5
        L47:
            com.google.android.gms.org.conscrypt.io.IoUtils.closeQuietly(r3)
            if (r2 < 0) goto L58
            if (r6 < 0) goto L58
            if (r0 < 0) goto L58
            com.google.android.gms.org.conscrypt.Conscrypt$Version r3 = new com.google.android.gms.org.conscrypt.Conscrypt$Version
            r3.<init>(r2, r6, r0)
            com.google.android.gms.org.conscrypt.Conscrypt.VERSION = r3
            return
        L58:
            com.google.android.gms.org.conscrypt.Conscrypt.VERSION = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.Conscrypt.<clinit>():void");
    }

    private Conscrypt() {
    }

    public static void checkAvailability() {
        NativeCrypto.checkAvailability();
    }

    public static byte[] exportKeyingMaterial(SSLEngine sSLEngine, String str, byte[] bArr, int i) {
        return toConscrypt(sSLEngine).exportKeyingMaterial(str, bArr, i);
    }

    public static String getApplicationProtocol(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getApplicationProtocol();
    }

    public static String[] getApplicationProtocols(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getApplicationProtocols();
    }

    public static byte[] getChannelId(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getChannelId();
    }

    public static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier(TrustManager trustManager) {
        ConscryptHostnameVerifier defaultHostnameVerifier;
        synchronized (Conscrypt.class) {
            defaultHostnameVerifier = TrustManagerImpl.getDefaultHostnameVerifier();
        }
        return defaultHostnameVerifier;
    }

    public static X509TrustManager getDefaultX509TrustManager() {
        checkAvailability();
        return SSLParametersImpl.getDefaultX509TrustManager();
    }

    public static boolean getEnableBytebufferOptimizations() {
        return enableBytebufferOptimizations;
    }

    public static String getHostname(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getHostname();
    }

    public static String getHostnameOrIP(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getHostnameOrIP();
    }

    public static ConscryptHostnameVerifier getHostnameVerifier(TrustManager trustManager) {
        return toConscrypt(trustManager).getHostnameVerifier();
    }

    public static byte[] getTlsUnique(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getTlsUnique();
    }

    public static boolean isAvailable() {
        try {
            checkAvailability();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isBoringSslFIPSBuild() {
        try {
            return NativeCrypto.usesBoringSsl_FIPS_mode();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isConscrypt(Provider provider) {
        return provider instanceof OpenSSLProvider;
    }

    public static int maxEncryptedPacketLength() {
        return 16709;
    }

    public static int maxSealOverhead(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).maxSealOverhead();
    }

    public static SSLContextSpi newPreferredSSLContextSpi() {
        checkAvailability();
        return OpenSSLContextImpl.getPreferred();
    }

    public static Provider newProvider() {
        checkAvailability();
        return new OpenSSLProvider();
    }

    public static ProviderBuilder newProviderBuilder() {
        return new ProviderBuilder();
    }

    public static void setApplicationProtocolSelector(SSLEngine sSLEngine, ApplicationProtocolSelector applicationProtocolSelector) {
        toConscrypt(sSLEngine).setApplicationProtocolSelector(applicationProtocolSelector);
    }

    public static void setApplicationProtocols(SSLEngine sSLEngine, String[] strArr) {
        toConscrypt(sSLEngine).setApplicationProtocols(strArr);
    }

    public static void setBufferAllocator(SSLEngine sSLEngine, BufferAllocator bufferAllocator) {
        toConscrypt(sSLEngine).setBufferAllocator(bufferAllocator);
    }

    public static void setChannelIdEnabled(SSLEngine sSLEngine, boolean z) {
        toConscrypt(sSLEngine).setChannelIdEnabled(z);
    }

    public static void setChannelIdPrivateKey(SSLEngine sSLEngine, PrivateKey privateKey) {
        toConscrypt(sSLEngine).setChannelIdPrivateKey(privateKey);
    }

    public static void setClientSessionCache(SSLContext sSLContext, SSLClientSessionCache sSLClientSessionCache) {
        SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
        if (!(clientSessionContext instanceof ClientSessionContext)) {
            throw new IllegalArgumentException("Not a conscrypt client context: ".concat(String.valueOf(clientSessionContext.getClass().getName())));
        }
        ((ClientSessionContext) clientSessionContext).setPersistentCache(sSLClientSessionCache);
    }

    public static void setDefaultBufferAllocator(BufferAllocator bufferAllocator) {
        ConscryptEngine.setDefaultBufferAllocator(bufferAllocator);
    }

    public static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        synchronized (Conscrypt.class) {
            TrustManagerImpl.setDefaultHostnameVerifier(conscryptHostnameVerifier);
        }
    }

    public static synchronized void setEnableBytebufferOptimizations(boolean z) {
        synchronized (Conscrypt.class) {
            enableBytebufferOptimizations = z;
        }
    }

    public static void setHandshakeListener(SSLEngine sSLEngine, HandshakeListener handshakeListener) {
        toConscrypt(sSLEngine).setHandshakeListener(handshakeListener);
    }

    public static void setHostname(SSLEngine sSLEngine, String str) {
        toConscrypt(sSLEngine).setHostname(str);
    }

    public static void setHostnameVerifier(TrustManager trustManager, ConscryptHostnameVerifier conscryptHostnameVerifier) {
        toConscrypt(trustManager).setHostnameVerifier(conscryptHostnameVerifier);
    }

    public static void setServerSessionCache(SSLContext sSLContext, SSLServerSessionCache sSLServerSessionCache) {
        SSLSessionContext serverSessionContext = sSLContext.getServerSessionContext();
        if (!(serverSessionContext instanceof ServerSessionContext)) {
            throw new IllegalArgumentException("Not a conscrypt client context: ".concat(String.valueOf(serverSessionContext.getClass().getName())));
        }
        ((ServerSessionContext) serverSessionContext).setPersistentCache(sSLServerSessionCache);
    }

    public static void setUseEngineSocket(SSLServerSocketFactory sSLServerSocketFactory, boolean z) {
        toConscrypt(sSLServerSocketFactory).setUseEngineSocket(z);
    }

    public static void setUseEngineSocketByDefault(boolean z) {
        OpenSSLSocketFactoryImpl.setUseEngineSocketByDefault(z);
        OpenSSLServerSocketFactoryImpl.setUseEngineSocketByDefault(z);
    }

    public static void setUseSessionTickets(SSLEngine sSLEngine, boolean z) {
        toConscrypt(sSLEngine).setUseSessionTickets(z);
    }

    private static AbstractConscryptEngine toConscrypt(SSLEngine sSLEngine) {
        if (isConscrypt(sSLEngine)) {
            return (AbstractConscryptEngine) sSLEngine;
        }
        throw new IllegalArgumentException("Not a conscrypt engine: ".concat(String.valueOf(sSLEngine.getClass().getName())));
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) {
        return toConscrypt(sSLEngine).unwrap(byteBufferArr, i, i2, byteBufferArr2, i3, i4);
    }

    public static Version version() {
        return VERSION;
    }

    public static byte[] exportKeyingMaterial(SSLSocket sSLSocket, String str, byte[] bArr, int i) {
        return toConscrypt(sSLSocket).exportKeyingMaterial(str, bArr, i);
    }

    public static String getApplicationProtocol(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getApplicationProtocol();
    }

    public static String[] getApplicationProtocols(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getApplicationProtocols();
    }

    public static byte[] getChannelId(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getChannelId();
    }

    public static String getHostname(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getHostname();
    }

    public static byte[] getTlsUnique(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getTlsUnique();
    }

    public static boolean isConscrypt(SSLEngine sSLEngine) {
        return sSLEngine instanceof AbstractConscryptEngine;
    }

    public static void setApplicationProtocolSelector(SSLSocket sSLSocket, ApplicationProtocolSelector applicationProtocolSelector) {
        toConscrypt(sSLSocket).setApplicationProtocolSelector(applicationProtocolSelector);
    }

    public static void setApplicationProtocols(SSLSocket sSLSocket, String[] strArr) {
        toConscrypt(sSLSocket).setApplicationProtocols(strArr);
    }

    public static void setBufferAllocator(SSLSocket sSLSocket, BufferAllocator bufferAllocator) {
        AbstractConscryptSocket conscrypt = toConscrypt(sSLSocket);
        if (conscrypt instanceof ConscryptEngineSocket) {
            ((ConscryptEngineSocket) conscrypt).setBufferAllocator(bufferAllocator);
        }
    }

    public static void setChannelIdEnabled(SSLSocket sSLSocket, boolean z) {
        toConscrypt(sSLSocket).setChannelIdEnabled(z);
    }

    public static void setChannelIdPrivateKey(SSLSocket sSLSocket, PrivateKey privateKey) {
        toConscrypt(sSLSocket).setChannelIdPrivateKey(privateKey);
    }

    public static void setHostname(SSLSocket sSLSocket, String str) {
        toConscrypt(sSLSocket).setHostname(str);
    }

    public static void setUseEngineSocket(SSLSocketFactory sSLSocketFactory, boolean z) {
        toConscrypt(sSLSocketFactory).setUseEngineSocket(z);
    }

    public static void setUseSessionTickets(SSLSocket sSLSocket, boolean z) {
        toConscrypt(sSLSocket).setUseSessionTickets(z);
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        return toConscrypt(sSLEngine).unwrap(byteBufferArr, byteBufferArr2);
    }

    public static boolean isConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
        return sSLServerSocketFactory instanceof OpenSSLServerSocketFactoryImpl;
    }

    @Deprecated
    public static Provider newProvider(String str) {
        checkAvailability();
        ProviderBuilder newProviderBuilder = newProviderBuilder();
        newProviderBuilder.setName(str);
        return newProviderBuilder.build();
    }

    public static boolean isConscrypt(SSLSocket sSLSocket) {
        return sSLSocket instanceof AbstractConscryptSocket;
    }

    private static OpenSSLServerSocketFactoryImpl toConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
        if (isConscrypt(sSLServerSocketFactory)) {
            return (OpenSSLServerSocketFactoryImpl) sSLServerSocketFactory;
        }
        throw new IllegalArgumentException("Not a conscrypt server socket factory: ".concat(String.valueOf(sSLServerSocketFactory.getClass().getName())));
    }

    public static boolean isConscrypt(SSLSocketFactory sSLSocketFactory) {
        return sSLSocketFactory instanceof OpenSSLSocketFactoryImpl;
    }

    public static boolean isConscrypt(TrustManager trustManager) {
        return trustManager instanceof TrustManagerImpl;
    }

    public static boolean isConscrypt(SSLContext sSLContext) {
        return sSLContext.getProvider() instanceof OpenSSLProvider;
    }

    private static AbstractConscryptSocket toConscrypt(SSLSocket sSLSocket) {
        if (isConscrypt(sSLSocket)) {
            return (AbstractConscryptSocket) sSLSocket;
        }
        throw new IllegalArgumentException("Not a conscrypt socket: ".concat(String.valueOf(sSLSocket.getClass().getName())));
    }

    private static OpenSSLSocketFactoryImpl toConscrypt(SSLSocketFactory sSLSocketFactory) {
        if (isConscrypt(sSLSocketFactory)) {
            return (OpenSSLSocketFactoryImpl) sSLSocketFactory;
        }
        throw new IllegalArgumentException("Not a conscrypt socket factory: ".concat(String.valueOf(sSLSocketFactory.getClass().getName())));
    }

    private static TrustManagerImpl toConscrypt(TrustManager trustManager) {
        if (isConscrypt(trustManager)) {
            return (TrustManagerImpl) trustManager;
        }
        throw new IllegalArgumentException("Not a Conscrypt trust manager: ".concat(String.valueOf(trustManager.getClass().getName())));
    }
}
