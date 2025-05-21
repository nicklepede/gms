package com.google.android.gms.org.conscrypt;

import defpackage.a;
import defpackage.fwac;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
final class SSLUtils {
    private static final String KEY_TYPE_EC = "EC";
    private static final String KEY_TYPE_RSA = "RSA";
    private static final int MAX_ENCRYPTION_OVERHEAD_DIFF = 2147483561;
    private static final int MAX_ENCRYPTION_OVERHEAD_LENGTH = 86;
    private static final int MAX_PROTOCOL_LENGTH = 255;
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = Boolean.parseBoolean(System.getProperty("com.google.android.gms.org.conscrypt.useEngineSocketByDefault", "true"));

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EngineStates {
        static final int STATE_CLOSED = 8;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_MODE_SET = 1;
        static final int STATE_NEW = 0;
        static final int STATE_READY = 5;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;

        private EngineStates() {
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    enum SessionType {
        OPEN_SSL(1),
        OPEN_SSL_WITH_OCSP(2),
        OPEN_SSL_WITH_TLS_SCT(3);

        final int value;

        SessionType(int i) {
            this.value = i;
        }

        static boolean isSupportedType(int i) {
            return i == OPEN_SSL.value || i == OPEN_SSL_WITH_OCSP.value || i == OPEN_SSL_WITH_TLS_SCT.value;
        }
    }

    private SSLUtils() {
    }

    static int calculateOutNetBufSize(int i) {
        return Math.min(16709, Math.min(MAX_ENCRYPTION_OVERHEAD_DIFF, i) + MAX_ENCRYPTION_OVERHEAD_LENGTH);
    }

    static String[] concat(String[]... strArr) {
        int i = 0;
        for (String[] strArr2 : strArr) {
            i += strArr2.length;
        }
        String[] strArr3 = new String[i];
        int i2 = 0;
        for (String[] strArr4 : strArr) {
            int length = strArr4.length;
            System.arraycopy(strArr4, 0, strArr3, i2, length);
            i2 += length;
        }
        return strArr3;
    }

    static String[] decodeProtocols(byte[] bArr) {
        int length;
        byte b;
        if (bArr.length == 0) {
            return EmptyArray.STRING;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length) {
                String[] strArr = new String[i3];
                int i4 = 0;
                while (i < bArr.length) {
                    byte b2 = bArr[i];
                    int i5 = i4 + 1;
                    strArr[i4] = b2 > 0 ? new String(bArr, i + 1, b2, StandardCharsets.US_ASCII) : "";
                    i += b2 + 1;
                    i4 = i5;
                }
                return strArr;
            }
            b = bArr[i2];
            if (b < 0 || b > length - i2) {
                break;
            }
            i3++;
            i2 += b + 1;
        }
        throw new IllegalArgumentException("Protocol has invalid length (" + ((int) b) + " at position " + i2 + "): " + (length < 50 ? Arrays.toString(bArr) : a.W(length, " byte array")));
    }

    private static X509Certificate decodeX509Certificate(CertificateFactory certificateFactory, byte[] bArr) {
        return certificateFactory != null ? (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)) : OpenSSLX509Certificate.fromX509Der(bArr);
    }

    static X509Certificate[] decodeX509CertificateChain(byte[][] bArr) {
        CertificateFactory certificateFactory = getCertificateFactory();
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i = 0; i < length; i++) {
            x509CertificateArr[i] = decodeX509Certificate(certificateFactory, bArr[i]);
        }
        return x509CertificateArr;
    }

    static byte[] encodeProtocols(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("protocols array must be non-null");
        }
        if (strArr.length == 0) {
            return EmptyArray.BYTE;
        }
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (str == null) {
                throw new IllegalArgumentException(a.l(i2, "protocol[", "] is null"));
            }
            int length = str.length();
            if (length == 0 || length > MAX_PROTOCOL_LENGTH) {
                throw new IllegalArgumentException(a.t(length, i2, "protocol[", "] has invalid length: "));
            }
            i += length + 1;
        }
        byte[] bArr = new byte[i];
        int i3 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            bArr[i3] = (byte) length2;
            i3++;
            int i4 = 0;
            while (i4 < length2) {
                char charAt = str2.charAt(i4);
                if (charAt > 127) {
                    throw new IllegalArgumentException("Protocol contains invalid character: " + charAt + "(protocol=" + str2 + ")");
                }
                bArr[i3] = (byte) charAt;
                i4++;
                i3++;
            }
        }
        return bArr;
    }

    static byte[][] encodeSubjectX509Principals(X509Certificate[] x509CertificateArr) {
        byte[][] bArr = new byte[x509CertificateArr.length][];
        for (int i = 0; i < x509CertificateArr.length; i++) {
            bArr[i] = x509CertificateArr[i].getSubjectX500Principal().getEncoded();
        }
        return bArr;
    }

    private static CertificateFactory getCertificateFactory() {
        try {
            return CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused) {
            return null;
        }
    }

    static String getClientKeyType(byte b) {
        if (b == 1) {
            return KEY_TYPE_RSA;
        }
        if (b != 64) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    static String getClientKeyTypeFromSignatureAlg(int i) {
        int SSL_get_signature_algorithm_key_type = NativeCrypto.SSL_get_signature_algorithm_key_type(i);
        if (SSL_get_signature_algorithm_key_type == 6) {
            return KEY_TYPE_RSA;
        }
        if (SSL_get_signature_algorithm_key_type != 408) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
        int unsignedShort;
        int position = byteBuffer.position();
        switch (unsignedByte(byteBuffer.get(position))) {
            case fwac.t /* 20 */:
            case fwac.u /* 21 */:
            case fwac.v /* 22 */:
            case fwac.w /* 23 */:
                if (unsignedByte(byteBuffer.get(position + 1)) != 3 || (unsignedShort = unsignedShort(byteBuffer.getShort(position + 3)) + 5) <= 5) {
                    return -1;
                }
                return unsignedShort;
            default:
                return -1;
        }
    }

    static String getServerX509KeyType(long j) {
        String SSL_CIPHER_get_kx_name = NativeCrypto.SSL_CIPHER_get_kx_name(j);
        if (SSL_CIPHER_get_kx_name.equals(KEY_TYPE_RSA) || SSL_CIPHER_get_kx_name.equals("DHE_RSA") || SSL_CIPHER_get_kx_name.equals("ECDHE_RSA")) {
            return KEY_TYPE_RSA;
        }
        if (SSL_CIPHER_get_kx_name.equals("ECDHE_ECDSA")) {
            return KEY_TYPE_EC;
        }
        return null;
    }

    static Set getSupportedClientKeyTypes(byte[] bArr, int[] iArr) {
        HashSet hashSet = new HashSet(bArr.length);
        for (byte b : bArr) {
            String clientKeyType = getClientKeyType(b);
            if (clientKeyType != null) {
                hashSet.add(clientKeyType);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(iArr.length);
        for (int i : iArr) {
            String clientKeyTypeFromSignatureAlg = getClientKeyTypeFromSignatureAlg(i);
            if (clientKeyTypeFromSignatureAlg != null) {
                linkedHashSet.add(clientKeyTypeFromSignatureAlg);
            }
        }
        if (bArr.length <= 0 || iArr.length <= 0) {
            return iArr.length > 0 ? linkedHashSet : hashSet;
        }
        linkedHashSet.retainAll(hashSet);
        return linkedHashSet;
    }

    static javax.security.cert.X509Certificate[] toCertificateChain(X509Certificate[] x509CertificateArr) {
        try {
            javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
            for (int i = 0; i < x509CertificateArr.length; i++) {
                x509CertificateArr2[i] = javax.security.cert.X509Certificate.getInstance(x509CertificateArr[i].getEncoded());
            }
            return x509CertificateArr2;
        } catch (CertificateEncodingException | javax.security.cert.CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    static byte[] toProtocolBytes(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    static String toProtocolString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.US_ASCII);
    }

    static SSLException toSSLException(Throwable th) {
        return th instanceof SSLException ? (SSLException) th : new SSLException(th);
    }

    static SSLHandshakeException toSSLHandshakeException(Throwable th) {
        return th instanceof SSLHandshakeException ? (SSLHandshakeException) th : (SSLHandshakeException) new SSLHandshakeException(th.getMessage()).initCause(th);
    }

    private static short unsignedByte(byte b) {
        return (short) (b & 255);
    }

    private static int unsignedShort(short s) {
        return (char) s;
    }

    static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i) {
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while (true) {
            ByteBuffer byteBuffer2 = byteBufferArr[i];
            int position = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            if (byteBuffer2.remaining() > allocate.remaining()) {
                byteBuffer2.limit(allocate.remaining() + position);
            }
            try {
                allocate.put(byteBuffer2);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                if (!allocate.hasRemaining()) {
                    allocate.flip();
                    return getEncryptedPacketLength(allocate);
                }
                i++;
            } catch (Throwable th) {
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        }
    }
}
