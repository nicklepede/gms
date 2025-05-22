package com.google.android.gms.org.conscrypt;

import java.security.Provider;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSSLProvider extends Provider {
    private static final String PREFIX = String.valueOf(OpenSSLProvider.class.getPackage().getName()).concat(".");
    private static final String STANDARD_EC_PRIVATE_KEY_INTERFACE_CLASS_NAME = "java.security.interfaces.ECPrivateKey";
    private static final String STANDARD_RSA_PRIVATE_KEY_INTERFACE_CLASS_NAME = "java.security.interfaces.RSAPrivateKey";
    private static final String STANDARD_RSA_PUBLIC_KEY_INTERFACE_CLASS_NAME = "java.security.interfaces.RSAPublicKey";
    private static final String STANDARD_XEC_PRIVATE_KEY_INTERFACE_CLASS_NAME = "java.security.interfaces.XECPrivateKey";
    private static final long serialVersionUID = 2996752495318905136L;

    public OpenSSLProvider() {
        this(Platform.getDefaultProviderName());
    }

    private boolean classExists(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private void putECDHKeyAgreementImplClass(String str) {
        String str2 = PREFIX;
        putImplClassWithKeyConstraints("KeyAgreement.ECDH", String.valueOf(str2).concat(String.valueOf(str)), String.valueOf(str2).concat("OpenSSLKeyHolder|java.security.interfaces.ECPrivateKey"), "PKCS#8");
    }

    private void putImplClassWithKeyConstraints(String str, String str2, String str3, String str4) {
        put(str, str2);
        if (str3 != null) {
            put(String.valueOf(str).concat(" SupportedKeyClasses"), str3);
        }
        if (str4 != null) {
            put(String.valueOf(str).concat(" SupportedKeyFormats"), str4);
        }
    }

    private void putMacImplClass(String str, String str2) {
        String str3 = PREFIX;
        String valueOf = String.valueOf(str3);
        putImplClassWithKeyConstraints("Mac.".concat(String.valueOf(str)), String.valueOf(str3).concat(String.valueOf(str2)), valueOf.concat("OpenSSLKeyHolder"), "RAW");
    }

    private void putRAWRSASignatureImplClass(String str) {
        String str2 = PREFIX;
        putImplClassWithKeyConstraints("Signature.NONEwithRSA", String.valueOf(str2).concat(String.valueOf(str)), str2 + "OpenSSLRSAPrivateKey|java.security.interfaces.RSAPrivateKey|" + str2 + "OpenSSLRSAPublicKey|java.security.interfaces.RSAPublicKey", null);
    }

    private void putRSACipherImplClass(String str, String str2) {
        String str3 = PREFIX;
        putImplClassWithKeyConstraints("Cipher.".concat(String.valueOf(str)), String.valueOf(str3).concat(String.valueOf(str2)), str3 + "OpenSSLRSAPrivateKey|java.security.interfaces.RSAPrivateKey|" + str3 + "OpenSSLRSAPublicKey|java.security.interfaces.RSAPublicKey", null);
    }

    private void putSignatureImplClass(String str, String str2) {
        String str3 = PREFIX;
        String valueOf = String.valueOf(str3);
        putImplClassWithKeyConstraints("Signature.".concat(String.valueOf(str)), String.valueOf(str3).concat(String.valueOf(str2)), valueOf.concat("OpenSSLKeyHolder|java.security.interfaces.RSAPrivateKey|java.security.interfaces.ECPrivateKey|java.security.interfaces.RSAPublicKey"), "PKCS#8|X.509");
    }

    private void putSymmetricCipherImplClass(String str, String str2) {
        putImplClassWithKeyConstraints("Cipher.".concat(String.valueOf(str)), String.valueOf(PREFIX).concat(String.valueOf(str2)), null, "RAW");
    }

    private void putXDHKeyAgreementImplClass(String str) {
        String str2 = PREFIX;
        putImplClassWithKeyConstraints("KeyAgreement.XDH", String.valueOf(str2).concat(String.valueOf(str)), str2 + "OpenSSLKeyHolder|java.security.interfaces.XECPrivateKey|" + str2 + "OpenSSLX25519PrivateKey", "PKCS#8");
        put("Alg.Alias.KeyAgreement.X25519", "XDH");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenSSLProvider(String str) {
        this(str, false, "TLSv1.3", Platform.DEPRECATED_TLS_V1, Platform.ENABLED_TLS_V1);
        int i = Platform.a;
    }

    OpenSSLProvider(String str, boolean z, String str2) {
        this(str, z, str2, Platform.DEPRECATED_TLS_V1, Platform.ENABLED_TLS_V1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public OpenSSLProvider(String str, boolean z, String str2, boolean z2, boolean z3) {
        super(str, 1.0d, "Android's OpenSSL-backed security provider");
        char c;
        String str3;
        NativeCrypto.checkAvailability();
        if (!z2 && !z3) {
            throw new IllegalArgumentException("TLSv1 is not deprecated and cannot be disabled.");
        }
        Platform.setup(z2, z3);
        String str4 = PREFIX;
        String valueOf = String.valueOf(str4);
        switch (str2.hashCode()) {
            case -503070502:
                if (str2.equals("TLSv1.2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -503070501:
                if (str2.equals("TLSv1.3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            str3 = "$TLSv12";
        } else {
            if (c != 1) {
                throw new IllegalArgumentException("Choice of default protocol is unsupported: ".concat(String.valueOf(str2)));
            }
            str3 = "$TLSv13";
        }
        String concat = valueOf.concat("OpenSSLContextImpl");
        put("SSLContext.SSL", concat.concat(str3));
        put("SSLContext.TLS", concat.concat(str3));
        put("SSLContext.TLSv1", concat.concat("$TLSv1"));
        put("SSLContext.TLSv1.1", concat.concat("$TLSv11"));
        put("SSLContext.TLSv1.2", concat.concat("$TLSv12"));
        put("SSLContext.TLSv1.3", concat.concat("$TLSv13"));
        put("SSLContext.Default", str4 + "DefaultSSLContextImpl" + str3);
        if (z) {
            put("TrustManagerFactory.PKIX", TrustManagerFactoryImpl.class.getName());
            put("Alg.Alias.TrustManagerFactory.X509", "PKIX");
        }
        put("KeyManagerFactory.PKIX", KeyManagerFactoryImpl.class.getName());
        put("Alg.Alias.KeyManagerFactory.X509", "PKIX");
        put("AlgorithmParameters.AES", String.valueOf(str4).concat("IvParameters$AES"));
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.2", "AES");
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.22", "AES");
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.42", "AES");
        put("AlgorithmParameters.ChaCha20", String.valueOf(str4).concat("IvParameters$ChaCha20"));
        put("AlgorithmParameters.DESEDE", String.valueOf(str4).concat("IvParameters$DESEDE"));
        put("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113549.3.7", "DESEDE");
        put("AlgorithmParameters.GCM", String.valueOf(str4).concat("GCMParameters"));
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.6", "GCM");
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.26", "GCM");
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.1.46", "GCM");
        put("AlgorithmParameters.OAEP", String.valueOf(str4).concat("OAEPParameters"));
        put("AlgorithmParameters.PSS", String.valueOf(str4).concat("PSSParameters"));
        put("AlgorithmParameters.EC", String.valueOf(str4).concat("ECParameters"));
        put("MessageDigest.SHA-1", String.valueOf(str4).concat("OpenSSLMessageDigestJDK$SHA1"));
        put("Alg.Alias.MessageDigest.SHA1", "SHA-1");
        put("Alg.Alias.MessageDigest.SHA", "SHA-1");
        put("Alg.Alias.MessageDigest.1.3.14.3.2.26", "SHA-1");
        put("MessageDigest.SHA-224", String.valueOf(str4).concat("OpenSSLMessageDigestJDK$SHA224"));
        put("Alg.Alias.MessageDigest.SHA224", "SHA-224");
        put("Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.4", "SHA-224");
        put("MessageDigest.SHA-256", String.valueOf(str4).concat("OpenSSLMessageDigestJDK$SHA256"));
        put("Alg.Alias.MessageDigest.SHA256", "SHA-256");
        put("Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.1", "SHA-256");
        put("MessageDigest.SHA-384", String.valueOf(str4).concat("OpenSSLMessageDigestJDK$SHA384"));
        put("Alg.Alias.MessageDigest.SHA384", "SHA-384");
        put("Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.2", "SHA-384");
        put("MessageDigest.SHA-512", String.valueOf(str4).concat("OpenSSLMessageDigestJDK$SHA512"));
        put("Alg.Alias.MessageDigest.SHA512", "SHA-512");
        put("Alg.Alias.MessageDigest.2.16.840.1.101.3.4.2.3", "SHA-512");
        put("MessageDigest.MD5", String.valueOf(str4).concat("OpenSSLMessageDigestJDK$MD5"));
        put("Alg.Alias.MessageDigest.1.2.840.113549.2.5", "MD5");
        put("KeyGenerator.ARC4", String.valueOf(str4).concat("KeyGeneratorImpl$ARC4"));
        put("Alg.Alias.KeyGenerator.RC4", "ARC4");
        put("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
        put("KeyGenerator.AES", String.valueOf(str4).concat("KeyGeneratorImpl$AES"));
        put("KeyGenerator.ChaCha20", String.valueOf(str4).concat("KeyGeneratorImpl$ChaCha20"));
        put("KeyGenerator.DESEDE", String.valueOf(str4).concat("KeyGeneratorImpl$DESEDE"));
        put("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
        put("KeyGenerator.HmacMD5", String.valueOf(str4).concat("KeyGeneratorImpl$HmacMD5"));
        put("Alg.Alias.KeyGenerator.1.3.6.1.5.5.8.1.1", "HmacMD5");
        put("Alg.Alias.KeyGenerator.HMAC-MD5", "HmacMD5");
        put("Alg.Alias.KeyGenerator.HMAC/MD5", "HmacMD5");
        put("KeyGenerator.HmacSHA1", String.valueOf(str4).concat("KeyGeneratorImpl$HmacSHA1"));
        put("Alg.Alias.KeyGenerator.1.2.840.113549.2.7", "HmacSHA1");
        put("Alg.Alias.KeyGenerator.1.3.6.1.5.5.8.1.2", "HmacSHA1");
        put("Alg.Alias.KeyGenerator.HMAC-SHA1", "HmacSHA1");
        put("Alg.Alias.KeyGenerator.HMAC/SHA1", "HmacSHA1");
        put("KeyGenerator.HmacSHA224", String.valueOf(str4).concat("KeyGeneratorImpl$HmacSHA224"));
        put("Alg.Alias.KeyGenerator.1.2.840.113549.2.8", "HmacSHA224");
        put("Alg.Alias.KeyGenerator.HMAC-SHA224", "HmacSHA224");
        put("Alg.Alias.KeyGenerator.HMAC/SHA224", "HmacSHA224");
        put("KeyGenerator.HmacSHA256", String.valueOf(str4).concat("KeyGeneratorImpl$HmacSHA256"));
        put("Alg.Alias.KeyGenerator.1.2.840.113549.2.9", "HmacSHA256");
        put("Alg.Alias.KeyGenerator.2.16.840.1.101.3.4.2.1", "HmacSHA256");
        put("Alg.Alias.KeyGenerator.HMAC-SHA256", "HmacSHA256");
        put("Alg.Alias.KeyGenerator.HMAC/SHA256", "HmacSHA256");
        put("KeyGenerator.HmacSHA384", String.valueOf(str4).concat("KeyGeneratorImpl$HmacSHA384"));
        put("Alg.Alias.KeyGenerator.1.2.840.113549.2.10", "HmacSHA384");
        put("Alg.Alias.KeyGenerator.HMAC-SHA384", "HmacSHA384");
        put("Alg.Alias.KeyGenerator.HMAC/SHA384", "HmacSHA384");
        put("KeyGenerator.HmacSHA512", String.valueOf(str4).concat("KeyGeneratorImpl$HmacSHA512"));
        put("Alg.Alias.KeyGenerator.1.2.840.113549.2.11", "HmacSHA512");
        put("Alg.Alias.KeyGenerator.HMAC-SHA512", "HmacSHA512");
        put("Alg.Alias.KeyGenerator.HMAC/SHA512", "HmacSHA512");
        put("KeyPairGenerator.RSA", String.valueOf(str4).concat("OpenSSLRSAKeyPairGenerator"));
        put("Alg.Alias.KeyPairGenerator.1.2.840.113549.1.1.1", "RSA");
        put("Alg.Alias.KeyPairGenerator.1.2.840.113549.1.1.7", "RSA");
        put("Alg.Alias.KeyPairGenerator.2.5.8.1.1", "RSA");
        put("KeyPairGenerator.EC", String.valueOf(str4).concat("OpenSSLECKeyPairGenerator"));
        put("Alg.Alias.KeyPairGenerator.1.2.840.10045.2.1", "EC");
        put("Alg.Alias.KeyPairGenerator.1.3.133.16.840.63.0.2", "EC");
        put("KeyPairGenerator.XDH", String.valueOf(str4).concat("OpenSSLXDHKeyPairGenerator"));
        put("Alg.Alias.KeyPairGenerator.1.3.101.110", "XDH");
        put("Alg.Alias.KeyPairGenerator.X25519", "XDH");
        put("KeyPairGenerator.EdDSA", String.valueOf(str4).concat("OpenSslEdDsaKeyPairGenerator"));
        put("Alg.Alias.KeyPairGenerator.1.3.101.112", "EdDSA");
        put("Alg.Alias.KeyPairGenerator.Ed25519", "EdDSA");
        put("KeyPairGenerator.ML-DSA", String.valueOf(str4).concat("OpenSslMlDsaKeyPairGenerator"));
        put("Alg.Alias.KeyPairGenerator.ML-DSA-65", "ML-DSA");
        put("KeyPairGenerator.SLH-DSA-SHA2-128S", String.valueOf(str4).concat("OpenSslSlhDsaKeyPairGenerator"));
        put("KeyFactory.RSA", String.valueOf(str4).concat("OpenSSLRSAKeyFactory"));
        put("Alg.Alias.KeyFactory.1.2.840.113549.1.1.1", "RSA");
        put("Alg.Alias.KeyFactory.1.2.840.113549.1.1.7", "RSA");
        put("Alg.Alias.KeyFactory.2.5.8.1.1", "RSA");
        put("KeyFactory.EC", String.valueOf(str4).concat("OpenSSLECKeyFactory"));
        put("Alg.Alias.KeyFactory.1.2.840.10045.2.1", "EC");
        put("Alg.Alias.KeyFactory.1.3.133.16.840.63.0.2", "EC");
        put("KeyFactory.XDH", String.valueOf(str4).concat("OpenSSLXDHKeyFactory"));
        put("Alg.Alias.KeyFactory.1.3.101.110", "XDH");
        put("Alg.Alias.KeyFactory.X25519", "XDH");
        put("KeyFactory.EdDSA", String.valueOf(str4).concat("OpenSslEdDsaKeyFactory"));
        put("Alg.Alias.KeyFactory.1.3.101.112", "EdDSA");
        put("Alg.Alias.KeyFactory.Ed25519", "EdDSA");
        put("KeyFactory.ML-DSA", String.valueOf(str4).concat("OpenSslMlDsaKeyFactory"));
        put("Alg.Alias.KeyFactory.ML-DSA-65", "ML-DSA");
        put("KeyFactory.SLH-DSA-SHA2-128S", String.valueOf(str4).concat("OpenSslSlhDsaKeyFactory"));
        put("SecretKeyFactory.DESEDE", String.valueOf(str4).concat("DESEDESecretKeyFactory"));
        put("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
        put("SecretKeyFactory.SCRYPT", String.valueOf(str4).concat("ScryptSecretKeyFactory"));
        put("Alg.Alias.SecretKeyFactory.1.3.6.1.4.1.11591.4.11", "SCRYPT");
        put("Alg.Alias.SecretKeyFactory.OID.1.3.6.1.4.1.11591.4.11", "SCRYPT");
        putECDHKeyAgreementImplClass("OpenSSLECDHKeyAgreement");
        putXDHKeyAgreementImplClass("OpenSSLXDHKeyAgreement");
        putSignatureImplClass("MD5withRSA", "OpenSSLSignature$MD5RSA");
        put("Alg.Alias.Signature.MD5withRSAEncryption", "MD5withRSA");
        put("Alg.Alias.Signature.MD5/RSA", "MD5withRSA");
        put("Alg.Alias.Signature.1.2.840.113549.1.1.4", "MD5withRSA");
        put("Alg.Alias.Signature.OID.1.2.840.113549.1.1.4", "MD5withRSA");
        put("Alg.Alias.Signature.1.2.840.113549.2.5with1.2.840.113549.1.1.1", "MD5withRSA");
        putSignatureImplClass("SHA1withRSA", "OpenSSLSignature$SHA1RSA");
        put("Alg.Alias.Signature.SHA1withRSAEncryption", "SHA1withRSA");
        put("Alg.Alias.Signature.SHA1/RSA", "SHA1withRSA");
        put("Alg.Alias.Signature.SHA-1/RSA", "SHA1withRSA");
        put("Alg.Alias.Signature.1.2.840.113549.1.1.5", "SHA1withRSA");
        put("Alg.Alias.Signature.OID.1.2.840.113549.1.1.5", "SHA1withRSA");
        put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.1", "SHA1withRSA");
        put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.113549.1.1.5", "SHA1withRSA");
        put("Alg.Alias.Signature.1.3.14.3.2.29", "SHA1withRSA");
        put("Alg.Alias.Signature.OID.1.3.14.3.2.29", "SHA1withRSA");
        putSignatureImplClass("SHA224withRSA", "OpenSSLSignature$SHA224RSA");
        put("Alg.Alias.Signature.SHA224withRSAEncryption", "SHA224withRSA");
        put("Alg.Alias.Signature.SHA224/RSA", "SHA224withRSA");
        put("Alg.Alias.Signature.1.2.840.113549.1.1.14", "SHA224withRSA");
        put("Alg.Alias.Signature.OID.1.2.840.113549.1.1.14", "SHA224withRSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.4with1.2.840.113549.1.1.1", "SHA224withRSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.4with1.2.840.113549.1.1.14", "SHA224withRSA");
        putSignatureImplClass("SHA256withRSA", "OpenSSLSignature$SHA256RSA");
        put("Alg.Alias.Signature.SHA256withRSAEncryption", "SHA256withRSA");
        put("Alg.Alias.Signature.SHA256/RSA", "SHA256withRSA");
        put("Alg.Alias.Signature.1.2.840.113549.1.1.11", "SHA256withRSA");
        put("Alg.Alias.Signature.OID.1.2.840.113549.1.1.11", "SHA256withRSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.1with1.2.840.113549.1.1.1", "SHA256withRSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.1with1.2.840.113549.1.1.11", "SHA256withRSA");
        putSignatureImplClass("SHA384withRSA", "OpenSSLSignature$SHA384RSA");
        put("Alg.Alias.Signature.SHA384withRSAEncryption", "SHA384withRSA");
        put("Alg.Alias.Signature.SHA384/RSA", "SHA384withRSA");
        put("Alg.Alias.Signature.1.2.840.113549.1.1.12", "SHA384withRSA");
        put("Alg.Alias.Signature.OID.1.2.840.113549.1.1.12", "SHA384withRSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.2with1.2.840.113549.1.1.1", "SHA384withRSA");
        putSignatureImplClass("SHA512withRSA", "OpenSSLSignature$SHA512RSA");
        put("Alg.Alias.Signature.SHA512withRSAEncryption", "SHA512withRSA");
        put("Alg.Alias.Signature.SHA512/RSA", "SHA512withRSA");
        put("Alg.Alias.Signature.1.2.840.113549.1.1.13", "SHA512withRSA");
        put("Alg.Alias.Signature.OID.1.2.840.113549.1.1.13", "SHA512withRSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.3with1.2.840.113549.1.1.1", "SHA512withRSA");
        putRAWRSASignatureImplClass("OpenSSLSignatureRawRSA");
        putSignatureImplClass("NONEwithECDSA", "OpenSSLSignatureRawECDSA");
        putSignatureImplClass("SHA1withECDSA", "OpenSSLSignature$SHA1ECDSA");
        put("Alg.Alias.Signature.ECDSA", "SHA1withECDSA");
        put("Alg.Alias.Signature.ECDSAwithSHA1", "SHA1withECDSA");
        put("Alg.Alias.Signature.1.2.840.10045.4.1", "SHA1withECDSA");
        put("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10045.2.1", "SHA1withECDSA");
        putSignatureImplClass("SHA224withECDSA", "OpenSSLSignature$SHA224ECDSA");
        put("Alg.Alias.Signature.SHA224/ECDSA", "SHA224withECDSA");
        put("Alg.Alias.Signature.1.2.840.10045.4.3.1", "SHA224withECDSA");
        put("Alg.Alias.Signature.OID.1.2.840.10045.4.3.1", "SHA224withECDSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.4with1.2.840.10045.2.1", "SHA224withECDSA");
        putSignatureImplClass("SHA256withECDSA", "OpenSSLSignature$SHA256ECDSA");
        put("Alg.Alias.Signature.SHA256/ECDSA", "SHA256withECDSA");
        put("Alg.Alias.Signature.1.2.840.10045.4.3.2", "SHA256withECDSA");
        put("Alg.Alias.Signature.OID.1.2.840.10045.4.3.2", "SHA256withECDSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.1with1.2.840.10045.2.1", "SHA256withECDSA");
        putSignatureImplClass("SHA384withECDSA", "OpenSSLSignature$SHA384ECDSA");
        put("Alg.Alias.Signature.SHA384/ECDSA", "SHA384withECDSA");
        put("Alg.Alias.Signature.1.2.840.10045.4.3.3", "SHA384withECDSA");
        put("Alg.Alias.Signature.OID.1.2.840.10045.4.3.3", "SHA384withECDSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.2with1.2.840.10045.2.1", "SHA384withECDSA");
        putSignatureImplClass("SHA512withECDSA", "OpenSSLSignature$SHA512ECDSA");
        put("Alg.Alias.Signature.SHA512/ECDSA", "SHA512withECDSA");
        put("Alg.Alias.Signature.1.2.840.10045.4.3.4", "SHA512withECDSA");
        put("Alg.Alias.Signature.OID.1.2.840.10045.4.3.4", "SHA512withECDSA");
        put("Alg.Alias.Signature.2.16.840.1.101.3.4.2.3with1.2.840.10045.2.1", "SHA512withECDSA");
        putSignatureImplClass("SHA1withRSA/PSS", "OpenSSLSignature$SHA1RSAPSS");
        put("Alg.Alias.Signature.SHA1withRSAandMGF1", "SHA1withRSA/PSS");
        putSignatureImplClass("SHA224withRSA/PSS", "OpenSSLSignature$SHA224RSAPSS");
        put("Alg.Alias.Signature.SHA224withRSAandMGF1", "SHA224withRSA/PSS");
        putSignatureImplClass("SHA256withRSA/PSS", "OpenSSLSignature$SHA256RSAPSS");
        put("Alg.Alias.Signature.SHA256withRSAandMGF1", "SHA256withRSA/PSS");
        putSignatureImplClass("SHA384withRSA/PSS", "OpenSSLSignature$SHA384RSAPSS");
        put("Alg.Alias.Signature.SHA384withRSAandMGF1", "SHA384withRSA/PSS");
        putSignatureImplClass("SHA512withRSA/PSS", "OpenSSLSignature$SHA512RSAPSS");
        put("Alg.Alias.Signature.SHA512withRSAandMGF1", "SHA512withRSA/PSS");
        putSignatureImplClass("EdDSA", "OpenSslSignatureEdDsa");
        put("Alg.Alias.Signature.1.3.101.112", "EdDSA");
        put("Alg.Alias.Signature.Ed25519", "EdDSA");
        putSignatureImplClass("ML-DSA", "OpenSslSignatureMlDsa");
        put("Alg.Alias.Signature.ML-DSA-65", "ML-DSA");
        putSignatureImplClass("SLH-DSA-SHA2-128S", "OpenSslSignatureSlhDsa");
        put("SecureRandom.SHA1PRNG", String.valueOf(str4).concat("OpenSSLRandom"));
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        putRSACipherImplClass("RSA/ECB/NoPadding", "OpenSSLCipherRSA$Raw");
        put("Alg.Alias.Cipher.RSA/None/NoPadding", "RSA/ECB/NoPadding");
        putRSACipherImplClass("RSA/ECB/PKCS1Padding", "OpenSSLCipherRSA$PKCS1");
        put("Alg.Alias.Cipher.RSA/None/PKCS1Padding", "RSA/ECB/PKCS1Padding");
        putRSACipherImplClass("RSA/ECB/OAEPPadding", "OpenSSLCipherRSA$OAEP$SHA1");
        put("Alg.Alias.Cipher.RSA/None/OAEPPadding", "RSA/ECB/OAEPPadding");
        putRSACipherImplClass("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", "OpenSSLCipherRSA$OAEP$SHA1");
        put("Alg.Alias.Cipher.RSA/None/OAEPWithSHA-1AndMGF1Padding", "RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
        putRSACipherImplClass("RSA/ECB/OAEPWithSHA-224AndMGF1Padding", "OpenSSLCipherRSA$OAEP$SHA224");
        put("Alg.Alias.Cipher.RSA/None/OAEPWithSHA-224AndMGF1Padding", "RSA/ECB/OAEPWithSHA-224AndMGF1Padding");
        putRSACipherImplClass("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", "OpenSSLCipherRSA$OAEP$SHA256");
        put("Alg.Alias.Cipher.RSA/None/OAEPWithSHA-256AndMGF1Padding", "RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        putRSACipherImplClass("RSA/ECB/OAEPWithSHA-384AndMGF1Padding", "OpenSSLCipherRSA$OAEP$SHA384");
        put("Alg.Alias.Cipher.RSA/None/OAEPWithSHA-384AndMGF1Padding", "RSA/ECB/OAEPWithSHA-384AndMGF1Padding");
        putRSACipherImplClass("RSA/ECB/OAEPWithSHA-512AndMGF1Padding", "OpenSSLCipherRSA$OAEP$SHA512");
        put("Alg.Alias.Cipher.RSA/None/OAEPWithSHA-512AndMGF1Padding", "RSA/ECB/OAEPWithSHA-512AndMGF1Padding");
        putSymmetricCipherImplClass("AES/ECB/NoPadding", "OpenSSLEvpCipherAES$AES$ECB$NoPadding");
        putSymmetricCipherImplClass("AES/ECB/PKCS5Padding", "OpenSSLEvpCipherAES$AES$ECB$PKCS5Padding");
        put("Alg.Alias.Cipher.AES/ECB/PKCS7Padding", "AES/ECB/PKCS5Padding");
        putSymmetricCipherImplClass("AES/CBC/NoPadding", "OpenSSLEvpCipherAES$AES$CBC$NoPadding");
        putSymmetricCipherImplClass("AES/CBC/PKCS5Padding", "OpenSSLEvpCipherAES$AES$CBC$PKCS5Padding");
        put("Alg.Alias.Cipher.AES/CBC/PKCS7Padding", "AES/CBC/PKCS5Padding");
        putSymmetricCipherImplClass("AES/CTR/NoPadding", "OpenSSLEvpCipherAES$AES$CTR");
        putSymmetricCipherImplClass("AES_128/ECB/NoPadding", "OpenSSLEvpCipherAES$AES_128$ECB$NoPadding");
        putSymmetricCipherImplClass("AES_128/ECB/PKCS5Padding", "OpenSSLEvpCipherAES$AES_128$ECB$PKCS5Padding");
        put("Alg.Alias.Cipher.AES_128/ECB/PKCS7Padding", "AES_128/ECB/PKCS5Padding");
        putSymmetricCipherImplClass("AES_128/CBC/NoPadding", "OpenSSLEvpCipherAES$AES_128$CBC$NoPadding");
        putSymmetricCipherImplClass("AES_128/CBC/PKCS5Padding", "OpenSSLEvpCipherAES$AES_128$CBC$PKCS5Padding");
        put("Alg.Alias.Cipher.AES_128/CBC/PKCS7Padding", "AES_128/CBC/PKCS5Padding");
        put("Alg.Alias.Cipher.PBEWithHmacSHA1AndAES_128", "AES_128/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA224AndAES_128", "AES_128/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA256AndAES_128", "AES_128/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA384AndAES_128", "AES_128/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA512AndAES_128", "AES_128/CBC/PKCS5PADDING");
        putSymmetricCipherImplClass("AES_256/ECB/NoPadding", "OpenSSLEvpCipherAES$AES_256$ECB$NoPadding");
        putSymmetricCipherImplClass("AES_256/ECB/PKCS5Padding", "OpenSSLEvpCipherAES$AES_256$ECB$PKCS5Padding");
        put("Alg.Alias.Cipher.AES_256/ECB/PKCS7Padding", "AES_256/ECB/PKCS5Padding");
        putSymmetricCipherImplClass("AES_256/CBC/NoPadding", "OpenSSLEvpCipherAES$AES_256$CBC$NoPadding");
        putSymmetricCipherImplClass("AES_256/CBC/PKCS5Padding", "OpenSSLEvpCipherAES$AES_256$CBC$PKCS5Padding");
        put("Alg.Alias.Cipher.AES_256/CBC/PKCS7Padding", "AES_256/CBC/PKCS5Padding");
        put("Alg.Alias.Cipher.PBEWithHmacSHA1AndAES_256", "AES_256/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA224AndAES_256", "AES_256/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA256AndAES_256", "AES_256/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA384AndAES_256", "AES_256/CBC/PKCS5PADDING");
        put("Alg.Alias.Cipher.PBEWithHmacSHA512AndAES_256", "AES_256/CBC/PKCS5PADDING");
        putSymmetricCipherImplClass("DESEDE/CBC/NoPadding", "OpenSSLEvpCipherDESEDE$CBC$NoPadding");
        putSymmetricCipherImplClass("DESEDE/CBC/PKCS5Padding", "OpenSSLEvpCipherDESEDE$CBC$PKCS5Padding");
        put("Alg.Alias.Cipher.DESEDE/CBC/PKCS7Padding", "DESEDE/CBC/PKCS5Padding");
        putSymmetricCipherImplClass("ARC4", "OpenSSLEvpCipherARC4");
        put("Alg.Alias.Cipher.ARCFOUR", "ARC4");
        put("Alg.Alias.Cipher.RC4", "ARC4");
        put("Alg.Alias.Cipher.1.2.840.113549.3.4", "ARC4");
        put("Alg.Alias.Cipher.OID.1.2.840.113549.3.4", "ARC4");
        putSymmetricCipherImplClass("AES/GCM/NoPadding", "OpenSSLAeadCipherAES$GCM");
        put("Alg.Alias.Cipher.GCM", "AES/GCM/NoPadding");
        put("Alg.Alias.Cipher.2.16.840.1.101.3.4.1.6", "AES/GCM/NoPadding");
        put("Alg.Alias.Cipher.2.16.840.1.101.3.4.1.26", "AES/GCM/NoPadding");
        put("Alg.Alias.Cipher.2.16.840.1.101.3.4.1.46", "AES/GCM/NoPadding");
        putSymmetricCipherImplClass("AES_128/GCM/NoPadding", "OpenSSLAeadCipherAES$GCM$AES_128");
        putSymmetricCipherImplClass("AES_256/GCM/NoPadding", "OpenSSLAeadCipherAES$GCM$AES_256");
        putSymmetricCipherImplClass("AES/GCM-SIV/NoPadding", "OpenSSLAeadCipherAES$GCM_SIV");
        putSymmetricCipherImplClass("AES_128/GCM-SIV/NoPadding", "OpenSSLAeadCipherAES$GCM_SIV$AES_128");
        putSymmetricCipherImplClass("AES_256/GCM-SIV/NoPadding", "OpenSSLAeadCipherAES$GCM_SIV$AES_256");
        putSymmetricCipherImplClass("ChaCha20", "OpenSSLCipherChaCha20");
        putSymmetricCipherImplClass("ChaCha20/Poly1305/NoPadding", "OpenSSLAeadCipherChaCha20");
        put("Alg.Alias.Cipher.ChaCha20-Poly1305", "ChaCha20/Poly1305/NoPadding");
        putMacImplClass("HmacMD5", "OpenSSLMac$HmacMD5");
        put("Alg.Alias.Mac.1.3.6.1.5.5.8.1.1", "HmacMD5");
        put("Alg.Alias.Mac.HMAC-MD5", "HmacMD5");
        put("Alg.Alias.Mac.HMAC/MD5", "HmacMD5");
        putMacImplClass("HmacSHA1", "OpenSSLMac$HmacSHA1");
        put("Alg.Alias.Mac.1.2.840.113549.2.7", "HmacSHA1");
        put("Alg.Alias.Mac.1.3.6.1.5.5.8.1.2", "HmacSHA1");
        put("Alg.Alias.Mac.HMAC-SHA1", "HmacSHA1");
        put("Alg.Alias.Mac.HMAC/SHA1", "HmacSHA1");
        putMacImplClass("HmacSHA224", "OpenSSLMac$HmacSHA224");
        put("Alg.Alias.Mac.1.2.840.113549.2.8", "HmacSHA224");
        put("Alg.Alias.Mac.HMAC-SHA224", "HmacSHA224");
        put("Alg.Alias.Mac.HMAC/SHA224", "HmacSHA224");
        put("Alg.Alias.Mac.PBEWITHHMACSHA224", "HmacSHA224");
        putMacImplClass("HmacSHA256", "OpenSSLMac$HmacSHA256");
        put("Alg.Alias.Mac.1.2.840.113549.2.9", "HmacSHA256");
        put("Alg.Alias.Mac.2.16.840.1.101.3.4.2.1", "HmacSHA256");
        put("Alg.Alias.Mac.HMAC-SHA256", "HmacSHA256");
        put("Alg.Alias.Mac.HMAC/SHA256", "HmacSHA256");
        put("Alg.Alias.Mac.PBEWITHHMACSHA256", "HmacSHA256");
        putMacImplClass("HmacSHA384", "OpenSSLMac$HmacSHA384");
        put("Alg.Alias.Mac.1.2.840.113549.2.10", "HmacSHA384");
        put("Alg.Alias.Mac.HMAC-SHA384", "HmacSHA384");
        put("Alg.Alias.Mac.HMAC/SHA384", "HmacSHA384");
        put("Alg.Alias.Mac.PBEWITHHMACSHA384", "HmacSHA384");
        putMacImplClass("HmacSHA512", "OpenSSLMac$HmacSHA512");
        put("Alg.Alias.Mac.1.2.840.113549.2.11", "HmacSHA512");
        put("Alg.Alias.Mac.HMAC-SHA512", "HmacSHA512");
        put("Alg.Alias.Mac.HMAC/SHA512", "HmacSHA512");
        put("Alg.Alias.Mac.PBEWITHHMACSHA512", "HmacSHA512");
        putMacImplClass("AESCMAC", "OpenSSLMac$AesCmac");
        put("CertificateFactory.X509", String.valueOf(str4).concat("OpenSSLX509CertificateFactory"));
        put("Alg.Alias.CertificateFactory.X.509", "X509");
        String concat2 = String.valueOf(str4).concat("HpkeImpl");
        put("ConscryptHpke.DHKEM_X25519_HKDF_SHA256/HKDF_SHA256/AES_128_GCM", concat2.concat("$X25519_AES_128"));
        put("Alg.Alias.ConscryptHpke.DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", "DHKEM_X25519_HKDF_SHA256/HKDF_SHA256/AES_128_GCM");
        put("ConscryptHpke.DHKEM_X25519_HKDF_SHA256/HKDF_SHA256/AES_256_GCM", concat2.concat("$X25519_AES_256"));
        put("Alg.Alias.ConscryptHpke.DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", "DHKEM_X25519_HKDF_SHA256/HKDF_SHA256/AES_256_GCM");
        put("ConscryptHpke.DHKEM_X25519_HKDF_SHA256/HKDF_SHA256/CHACHA20POLY1305", concat2.concat("$X25519_CHACHA20"));
        put("Alg.Alias.ConscryptHpke.DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_GhpkeCHACHA20POLY1305", "DHKEM_X25519_HKDF_SHA256/HKDF_SHA256/CHACHA20POLY1305");
    }
}
