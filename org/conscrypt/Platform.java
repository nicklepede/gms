package com.google.android.gms.org.conscrypt;

import android.os.Binder;
import android.os.Build;
import android.os.SystemClock;
import android.system.Os;
import android.util.Log;
import com.google.android.gms.org.conscrypt.ct.CertificateTransparency;
import com.google.android.gms.org.conscrypt.metrics.CertificateTransparencyVerificationReason;
import com.google.android.gms.org.conscrypt.metrics.NoopStatsLog;
import com.google.android.gms.org.conscrypt.metrics.Source;
import com.google.android.gms.org.conscrypt.metrics.StatsLog;
import com.google.android.gms.org.conscrypt.metrics.StatsLogImpl;
import dalvik.system.BlockGuard;
import dalvik.system.CloseGuard;
import defpackage.a;
import defpackage.cbsl$$ExternalSyntheticApiModelOutline2;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;
import java.security.AlgorithmParameters;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class Platform {
    static boolean DEPRECATED_TLS_V1 = false;
    static boolean ENABLED_TLS_V1 = true;
    private static boolean FILTERED_TLS_V1 = false;
    private static final String TAG = "Conscrypt";
    public static final /* synthetic */ int a = 0;
    private static Method m_getCurveName;

    static {
        NativeCrypto.setTlsV1DeprecationStatus(false, true);
        try {
            Method declaredMethod = ECParameterSpec.class.getDeclaredMethod("getCurveName", null);
            m_getCurveName = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception unused) {
        }
    }

    private Platform() {
    }

    public static void blockGuardOnNetwork() {
        BlockGuard.getThreadPolicy().onNetwork();
    }

    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) {
        if (checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket) || checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkClientTrusted(x509CertificateArr, str);
    }

    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) {
        if (checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket) || checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean checkTrusted(String str, X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str2, Class cls, Object obj) {
        try {
            x509TrustManager.getClass().getMethod(str, X509Certificate[].class, String.class, cls).invoke(x509TrustManager, x509CertificateArr, str2, obj);
            return true;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return false;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof CertificateException) {
                throw ((CertificateException) e.getCause());
            }
            throw new RuntimeException(e.getCause());
        }
    }

    public static void closeGuardClose(Object obj) {
        ((CloseGuard) obj).close();
    }

    public static CloseGuard closeGuardGet() {
        return CloseGuard.get();
    }

    public static void closeGuardOpen(Object obj, String str) {
        ((CloseGuard) obj).open(str);
    }

    public static void closeGuardWarnIfOpen(Object obj) {
        ((CloseGuard) obj).warnIfOpen();
    }

    static ConscryptEngineSocket createEngineSocket(SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8EngineSocket(sSLParametersImpl) : new ConscryptEngineSocket(sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8FileDescriptorSocket(sSLParametersImpl) : new ConscryptFileDescriptorSocket(sSLParametersImpl);
    }

    public static GCMParameters fromGCMParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || !cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
            return null;
        }
        try {
            return new GCMParameters(((Integer) cls.getMethod("getTLen", null).invoke(algorithmParameterSpec, null)).intValue(), (byte[]) cls.getMethod("getIV", null).invoke(algorithmParameterSpec, null));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Could not fetch GCM parameters", e3.getTargetException());
        }
    }

    static AlgorithmParameterSpec fromGCMParameters(AlgorithmParameters algorithmParameters) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return algorithmParameters.getParameterSpec(cls);
            } catch (InvalidParameterSpecException unused2) {
            }
        }
        return null;
    }

    private static Class getClass(String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            try {
                return Class.forName(strArr[i]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String getCurveName(ECParameterSpec eCParameterSpec) {
        Method method = m_getCurveName;
        if (method != null) {
            try {
                return (String) method.invoke(eCParameterSpec, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    static KeyStore getDefaultCertKeyStore() {
        KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
        try {
            keyStore.load(null, null);
            return keyStore;
        } catch (IOException e) {
            throw new KeyStoreException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new KeyStoreException(e2);
        } catch (CertificateException e3) {
            throw new KeyStoreException(e3);
        }
    }

    public static String getDefaultProviderName() {
        return TAG;
    }

    public static String getEndpointIdentificationAlgorithm(SSLParameters sSLParameters) {
        return null;
    }

    public static FileDescriptor getFileDescriptor(Socket socket) {
        try {
            Field declaredField = Socket.class.getDeclaredField("impl");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(socket);
            Field declaredField2 = SocketImpl.class.getDeclaredField("fd");
            declaredField2.setAccessible(true);
            return (FileDescriptor) declaredField2.get(obj);
        } catch (Exception e) {
            throw new RuntimeException("Can't get FileDescriptor from socket", e);
        }
    }

    public static FileDescriptor getFileDescriptorFromSSLSocket(AbstractConscryptSocket abstractConscryptSocket) {
        return getFileDescriptor(abstractConscryptSocket);
    }

    public static String getHostStringFromInetSocketAddress(InetSocketAddress inetSocketAddress) {
        if (Build.VERSION.SDK_INT > 23) {
            try {
                return (String) InetSocketAddress.class.getDeclaredMethod("getHostString", null).invoke(inetSocketAddress, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    static long getMillisSinceBoot() {
        return SystemClock.elapsedRealtime();
    }

    public static String getOriginalHostNameFromInetAddress(InetAddress inetAddress) {
        if (Build.VERSION.SDK_INT > 27) {
            try {
                Method declaredMethod = InetAddress.class.getDeclaredMethod("holder", null);
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Class.forName("java.net.InetAddress$InetAddressHolder").getDeclaredMethod("getOriginalHostName", null);
                declaredMethod2.setAccessible(true);
                String str = (String) declaredMethod2.invoke(declaredMethod.invoke(inetAddress, null), null);
                return str == null ? inetAddress.getHostAddress() : str;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to get originalHostName", e);
            }
        }
        return inetAddress.getHostAddress();
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT >= 24) {
                setParametersSniHostname(sSLParameters, sSLParametersImpl, abstractConscryptSocket);
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    private static void getSSLParametersFromImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParameters.getClass().getMethod("setEndpointIdentificationAlgorithm", String.class).invoke(sSLParameters, sSLParametersImpl.getEndpointIdentificationAlgorithm());
        sSLParameters.getClass().getMethod("setUseCipherSuitesOrder", Boolean.TYPE).invoke(sSLParameters, Boolean.valueOf(sSLParametersImpl.getUseCipherSuitesOrder()));
    }

    private static String getSniHostnameFromParams(SSLParameters sSLParameters) {
        int type;
        String asciiName;
        List list = (List) sSLParameters.getClass().getMethod("getServerNames", null).invoke(sSLParameters, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SNIServerName m192m = cbsl$$ExternalSyntheticApiModelOutline2.m192m(it.next());
                type = m192m.getType();
                if (type == 0) {
                    asciiName = cbsl$$ExternalSyntheticApiModelOutline2.m190m((Object) m192m).getAsciiName();
                    return asciiName;
                }
            }
        }
        return null;
    }

    public static StatsLog getStatsLog() {
        return Build.VERSION.SDK_INT >= 30 ? StatsLogImpl.getInstance() : NoopStatsLog.getInstance();
    }

    public static Source getStatsSource() {
        return Source.SOURCE_GMS;
    }

    public static int[] getUids() {
        return new int[]{Os.getuid(), Binder.getCallingUid()};
    }

    public static boolean isCTVerificationRequired(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        String property = Security.getProperty("conscrypt.ct.enable");
        if (property != null && Boolean.parseBoolean(property)) {
            List<String> asList = Arrays.asList(str.split("\\."));
            Collections.reverse(asList);
            String str2 = "conscrypt.ct.enforce";
            for (String str3 : asList) {
                String property2 = Security.getProperty(str2.concat(".*"));
                if (property2 != null) {
                    z = Boolean.parseBoolean(property2);
                }
                str2 = a.p(str3, str2, ".");
            }
            String property3 = Security.getProperty(str2);
            if (property3 != null) {
                return Boolean.parseBoolean(property3);
            }
        }
        return z;
    }

    public static boolean isJavaxCertificateSupported() {
        return true;
    }

    public static boolean isPakeSupported() {
        return false;
    }

    public static boolean isSdkGreater(int i) {
        return Build.VERSION.SDK_INT > i;
    }

    public static boolean isTlsV1Deprecated() {
        return DEPRECATED_TLS_V1;
    }

    public static boolean isTlsV1Filtered() {
        return FILTERED_TLS_V1;
    }

    public static boolean isTlsV1Supported() {
        return ENABLED_TLS_V1;
    }

    private static void logStackTraceSnippet(String str, Throwable th) {
        Log.w(TAG, str);
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (int i = 0; i < 2 && i < stackTrace.length; i++) {
            Log.w(TAG, "\tat ".concat(String.valueOf(stackTrace[i].toString())));
        }
    }

    static CertBlocklist newDefaultBlocklist() {
        return null;
    }

    static ConscryptCertStore newDefaultCertStore() {
        return null;
    }

    static CertificateTransparency newDefaultCertificateTransparency() {
        return null;
    }

    public static String oidToAlgorithmName(String str) {
        try {
            try {
                Method declaredMethod = Class.forName("org.apache.harmony.security.utils.AlgNameMapper").getDeclaredMethod("map2AlgName", String.class);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, str);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(e);
            } catch (Exception unused) {
                Class<?> cls = Class.forName("sun.security.x509.AlgorithmId");
                Method declaredMethod2 = cls.getDeclaredMethod("get", String.class);
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("getName", null);
                declaredMethod3.setAccessible(true);
                return (String) declaredMethod3.invoke(declaredMethod2.invoke(null, str), null);
            }
        } catch (InvocationTargetException e2) {
            Throwable cause2 = e2.getCause();
            if (cause2 instanceof RuntimeException) {
                throw ((RuntimeException) cause2);
            }
            if (cause2 instanceof Error) {
                throw ((Error) cause2);
            }
            throw new RuntimeException(e2);
        } catch (Exception unused2) {
            return str;
        }
    }

    static boolean provideTrustManagerByDefault() {
        return false;
    }

    public static CertificateTransparencyVerificationReason reasonCTVerificationRequired(String str) {
        return CertificateTransparencyVerificationReason.UNKNOWN;
    }

    static boolean serverNamePermitted(SSLParametersImpl sSLParametersImpl, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return serverNamePermittedInternal(sSLParametersImpl, str);
        }
        return true;
    }

    private static boolean serverNamePermittedInternal(SSLParametersImpl sSLParametersImpl, String str) {
        boolean matches;
        Collection sNIMatchers = sSLParametersImpl.getSNIMatchers();
        if (sNIMatchers == null || sNIMatchers.isEmpty()) {
            return true;
        }
        Iterator it = sNIMatchers.iterator();
        while (it.hasNext()) {
            matches = cbsl$$ExternalSyntheticApiModelOutline2.m191m(it.next()).matches(new SNIHostName(str));
            if (matches) {
                return true;
            }
        }
        return false;
    }

    public static void setCurveName(ECParameterSpec eCParameterSpec, String str) {
        try {
            eCParameterSpec.getClass().getDeclaredMethod("setCurveName", String.class).invoke(eCParameterSpec, str);
        } catch (Exception unused) {
        }
    }

    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(abstractConscryptSocket.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", List.class).invoke(sSLParameters, Collections.singletonList(new SNIHostName(abstractConscryptSocket.getHostname())));
        }
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        String sniHostnameFromParams;
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT < 24 || (sniHostnameFromParams = getSniHostnameFromParams(sSLParameters)) == null) {
                return;
            }
            abstractConscryptSocket.setHostname(sniHostnameFromParams);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    private static void setSSLParametersOnImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParametersImpl.setEndpointIdentificationAlgorithm((String) sSLParameters.getClass().getMethod("getEndpointIdentificationAlgorithm", null).invoke(sSLParameters, null));
        sSLParametersImpl.setUseCipherSuitesOrder(((Boolean) sSLParameters.getClass().getMethod("getUseCipherSuitesOrder", null).invoke(sSLParameters, null)).booleanValue());
    }

    public static void setSocketWriteTimeout(Socket socket, long j) {
        try {
            FileDescriptor fileDescriptor = getFileDescriptor(socket);
            if (fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket closed");
            }
            Class<?> cls = getClass("android.system.StructTimeval", "libcore.io.StructTimeval");
            if (cls == null) {
                Log.w(TAG, "StructTimeval == null; not setting socket write timeout");
                return;
            }
            Method declaredMethod = cls.getDeclaredMethod("fromMillis", Long.TYPE);
            if (declaredMethod == null) {
                Log.w(TAG, "fromMillis == null; not setting socket write timeout");
                return;
            }
            Object invoke = declaredMethod.invoke(null, Long.valueOf(j));
            Class<?> cls2 = Class.forName("libcore.io.Libcore");
            if (cls2 == null) {
                Log.w(TAG, "Libcore == null; not setting socket write timeout");
                return;
            }
            Field field = cls2.getField("os");
            if (field == null) {
                Log.w(TAG, "os == null; not setting socket write timeout");
                return;
            }
            Object obj = field.get(null);
            if (obj == null) {
                Log.w(TAG, "instance_os == null; not setting socket write timeout");
                return;
            }
            Class cls3 = getClass("android.system.OsConstants", "libcore.io.OsConstants");
            if (cls3 == null) {
                Log.w(TAG, "OsConstants == null; not setting socket write timeout");
                return;
            }
            Field field2 = cls3.getField("SOL_SOCKET");
            if (field2 == null) {
                Log.w(TAG, "SOL_SOCKET == null; not setting socket write timeout");
                return;
            }
            Field field3 = cls3.getField("SO_SNDTIMEO");
            if (field3 == null) {
                Log.w(TAG, "SO_SNDTIMEO == null; not setting socket write timeout");
                return;
            }
            Class<?> cls4 = obj.getClass();
            Class<?> cls5 = Integer.TYPE;
            Method method = cls4.getMethod("setsockoptTimeval", FileDescriptor.class, cls5, cls5, cls);
            if (method == null) {
                Log.w(TAG, "setsockoptTimeval == null; not setting socket write timeout");
            } else {
                method.invoke(obj, fileDescriptor, field2.get(null), field3.get(null), invoke);
            }
        } catch (Exception e) {
            logStackTraceSnippet("Could not set socket write timeout: ".concat(e.toString()), e);
            for (Throwable cause = e.getCause(); cause != null; cause = cause.getCause()) {
                logStackTraceSnippet("Caused by: ".concat(cause.toString()), cause);
            }
        }
    }

    public static void setup(boolean z, boolean z2) {
        DEPRECATED_TLS_V1 = z;
        ENABLED_TLS_V1 = z2;
        FILTERED_TLS_V1 = !z2;
        NativeCrypto.setTlsV1DeprecationStatus(z, z2);
    }

    static boolean supportsConscryptCertStore() {
        return false;
    }

    static boolean supportsX509ExtendedTrustManager() {
        return Build.VERSION.SDK_INT > 23;
    }

    public static AlgorithmParameterSpec toGCMParameterSpec(int i, byte[] bArr) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AlgorithmParameterSpec) cls.getConstructor(Integer.TYPE, byte[].class).newInstance(Integer.valueOf(i), bArr);
            } catch (IllegalAccessException e) {
                e = e;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (InvocationTargetException e5) {
                logStackTraceSnippet("Can't find GCMParameterSpec class", e5.getCause());
            }
        }
        return null;
    }

    public static SSLSession wrapSSLSession(ExternalSession externalSession) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8ExtendedSSLSession(externalSession) : externalSession;
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8EngineSocket(str, i, sSLParametersImpl) : new ConscryptEngineSocket(str, i, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8FileDescriptorSocket(str, i, sSLParametersImpl) : new ConscryptFileDescriptorSocket(str, i, sSLParametersImpl);
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT >= 24) {
                setParametersSniHostname(sSLParameters, sSLParametersImpl, conscryptEngine);
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) {
        if (checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine) || checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkClientTrusted(x509CertificateArr, str);
    }

    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) {
        if (checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine) || checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8EngineSocket(str, i, inetAddress, i2, sSLParametersImpl) : new ConscryptEngineSocket(str, i, inetAddress, i2, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8FileDescriptorSocket(str, i, inetAddress, i2, sSLParametersImpl) : new ConscryptFileDescriptorSocket(str, i, inetAddress, i2, sSLParametersImpl);
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        String sniHostnameFromParams;
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            if (Build.VERSION.SDK_INT < 24 || (sniHostnameFromParams = getSniHostnameFromParams(sSLParameters)) == null) {
                return;
            }
            conscryptEngine.setHostname(sniHostnameFromParams);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8EngineSocket(inetAddress, i, sSLParametersImpl) : new ConscryptEngineSocket(inetAddress, i, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8FileDescriptorSocket(inetAddress, i, sSLParametersImpl) : new ConscryptFileDescriptorSocket(inetAddress, i, sSLParametersImpl);
    }

    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(conscryptEngine.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", List.class).invoke(sSLParameters, Collections.singletonList(new SNIHostName(conscryptEngine.getHostname())));
        }
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8EngineSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl) : new ConscryptEngineSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8FileDescriptorSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl) : new ConscryptFileDescriptorSocket(inetAddress, i, inetAddress2, i2, sSLParametersImpl);
    }

    static ConscryptEngineSocket createEngineSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8EngineSocket(socket, str, i, z, sSLParametersImpl) : new ConscryptEngineSocket(socket, str, i, z, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        return Build.VERSION.SDK_INT >= 24 ? new Java8FileDescriptorSocket(socket, str, i, z, sSLParametersImpl) : new ConscryptFileDescriptorSocket(socket, str, i, z, sSLParametersImpl);
    }

    static SSLEngine unwrapEngine(SSLEngine sSLEngine) {
        return sSLEngine;
    }

    static SSLEngine wrapEngine(ConscryptEngine conscryptEngine) {
        return conscryptEngine;
    }

    public static SSLSocketFactory wrapSocketFactoryIfNeeded(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        return openSSLSocketFactoryImpl;
    }

    public static void setEndpointIdentificationAlgorithm(SSLParameters sSLParameters, String str) {
    }
}
