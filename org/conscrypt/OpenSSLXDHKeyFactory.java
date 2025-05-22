package com.google.android.gms.org.conscrypt;

import defpackage.cvkg;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSSLXDHKeyFactory extends KeyFactorySpi {
    private static final Class javaXecPublicKeySpec = getJavaXECPublicKeySpec();
    private static final Class javaXecPrivateKeySpec = getJavaXECPrivateKeySpec();
    private static final AlgorithmParameterSpec javaX25519AlgorithmSpec = getJavaX25519ParameterSpec();

    private KeySpec constructJavaPrivateKeySpec(OpenSSLX25519PrivateKey openSSLX25519PrivateKey) {
        Class cls = javaXecPrivateKeySpec;
        if (cls == null) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPrivateKeySpec");
        }
        try {
            return (KeySpec) cls.getConstructor(AlgorithmParameterSpec.class, byte[].class).newInstance(javaX25519AlgorithmSpec, openSSLX25519PrivateKey.getU());
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPrivateKeySpec", e);
        }
    }

    private KeySpec constructJavaXecPublicKeySpec(OpenSSLX25519PublicKey openSSLX25519PublicKey) {
        Class cls = javaXecPublicKeySpec;
        if (cls == null) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPublicKeySpec");
        }
        try {
            return (KeySpec) cls.getConstructor(AlgorithmParameterSpec.class, BigInteger.class).newInstance(javaX25519AlgorithmSpec, new BigInteger(1, ArrayUtils.reverse(openSSLX25519PublicKey.getU())));
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new InvalidKeySpecException("Could not find java.security.spec.XECPublicKeySpec", e);
        }
    }

    private static AlgorithmParameterSpec getJavaX25519ParameterSpec() {
        try {
            return (AlgorithmParameterSpec) Class.forName("java.security.spec.NamedParameterSpec").getDeclaredField("X25519").get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    private static Class getJavaXECPrivateKeySpec() {
        try {
            return Class.forName("java.security.spec.XECPrivateKeySpec");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Class getJavaXECPublicKeySpec() {
        try {
            return Class.forName("java.security.spec.XECPublicKeySpec");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSSLX25519PrivateKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use XECPrivateKeySpec, PKCS8EncodedKeySpec or Raw EncodedKeySpec; was ".concat(String.valueOf(keySpec.getClass().getName())));
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSSLX25519PublicKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use XECPublicKeySpec, X509EncodedKeySpec or Raw EncodedKeySpec; was ".concat(String.valueOf(keySpec.getClass().getName())));
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        }
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (!"XDH".equals(key.getAlgorithm()) && !"X25519".equals(key.getAlgorithm())) {
            throw new InvalidKeySpecException("Key must be an XDH or X25519 key");
        }
        if (key.getEncoded() == null) {
            throw new InvalidKeySpecException("Key is destroyed");
        }
        try {
            Key engineTranslateKey = engineTranslateKey(key);
            if (engineTranslateKey instanceof OpenSSLX25519PublicKey) {
                OpenSSLX25519PublicKey openSSLX25519PublicKey = (OpenSSLX25519PublicKey) engineTranslateKey;
                Class cls2 = javaXecPublicKeySpec;
                if (cls2 != null && cls2.isAssignableFrom(cls)) {
                    return constructJavaXecPublicKeySpec(openSSLX25519PublicKey);
                }
                if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new X509EncodedKeySpec(engineTranslateKey.getEncoded());
                }
                if (cls == XdhKeySpec.class) {
                    return new XdhKeySpec(openSSLX25519PublicKey.getU());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return KeySpecUtil.makeRawKeySpec(openSSLX25519PublicKey.getU(), cls);
                }
            } else if (engineTranslateKey instanceof OpenSSLX25519PrivateKey) {
                OpenSSLX25519PrivateKey openSSLX25519PrivateKey = (OpenSSLX25519PrivateKey) engineTranslateKey;
                Class cls3 = javaXecPrivateKeySpec;
                if (cls3 != null && cls3.isAssignableFrom(cls)) {
                    return constructJavaPrivateKeySpec(openSSLX25519PrivateKey);
                }
                if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new PKCS8EncodedKeySpec(engineTranslateKey.getEncoded());
                }
                if (cls == XdhKeySpec.class) {
                    return new XdhKeySpec(openSSLX25519PrivateKey.getU());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return KeySpecUtil.makeRawKeySpec(openSSLX25519PrivateKey.getU(), cls);
                }
            }
            throw new InvalidKeySpecException(cvkg.a(cls, engineTranslateKey));
        } catch (InvalidKeyException e) {
            throw new InvalidKeySpecException("Unsupported key class: ".concat(String.valueOf(String.valueOf(key.getClass()))), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if ((key instanceof OpenSSLX25519PublicKey) || (key instanceof OpenSSLX25519PrivateKey)) {
            return key;
        }
        if ((key instanceof PrivateKey) && "PKCS#8".equals(key.getFormat())) {
            byte[] encoded = key.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("Key does not support encoding");
            }
            try {
                return engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
            } catch (InvalidKeySpecException e) {
                throw new InvalidKeyException(e);
            }
        }
        if (!(key instanceof PublicKey) || !"X.509".equals(key.getFormat())) {
            throw new InvalidKeyException("Key must be XEC public or private key; was ".concat(String.valueOf(key.getClass().getName())));
        }
        byte[] encoded2 = key.getEncoded();
        if (encoded2 == null) {
            throw new InvalidKeyException("Key does not support encoding");
        }
        try {
            return engineGeneratePublic(new X509EncodedKeySpec(encoded2));
        } catch (InvalidKeySpecException e2) {
            throw new InvalidKeyException(e2);
        }
    }
}
