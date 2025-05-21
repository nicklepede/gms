package com.google.android.gms.org.conscrypt;

import defpackage.ctbc;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OpenSslEdDsaKeyFactory extends KeyFactorySpi {
    private KeySpec makeRawKeySpec(byte[] bArr, Class cls) {
        try {
            KeySpec keySpec = (KeySpec) cls.getConstructor(byte[].class).newInstance(bArr);
            if (((EncodedKeySpec) keySpec).getFormat().equalsIgnoreCase("raw")) {
                return keySpec;
            }
            throw new InvalidKeySpecException("EncodedKeySpec class must be raw format");
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new InvalidKeySpecException("Can't process KeySpec class ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslEdDsaPrivateKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use PKCS8EncodedKeySpec or Raw EncodedKeySpec; was ".concat(String.valueOf(keySpec.getClass().getName())));
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslEdDsaPublicKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Must use X509EncodedKeySpec or Raw EncodedKeySpec; was ".concat(String.valueOf(keySpec.getClass().getName())));
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        }
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (!key.getAlgorithm().equals("EdDSA") && !key.getAlgorithm().equals("Ed25519")) {
            throw new InvalidKeySpecException("Key must be an EdDSA or Ed25519 key");
        }
        if (key.getEncoded() == null) {
            throw new InvalidKeySpecException("Key is destroyed");
        }
        try {
            Key engineTranslateKey = engineTranslateKey(key);
            if (engineTranslateKey instanceof OpenSslEdDsaPublicKey) {
                OpenSslEdDsaPublicKey openSslEdDsaPublicKey = (OpenSslEdDsaPublicKey) engineTranslateKey;
                if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new X509EncodedKeySpec(engineTranslateKey.getEncoded());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return makeRawKeySpec(openSslEdDsaPublicKey.getRaw(), cls);
                }
            } else if (engineTranslateKey instanceof OpenSslEdDsaPrivateKey) {
                OpenSslEdDsaPrivateKey openSslEdDsaPrivateKey = (OpenSslEdDsaPrivateKey) engineTranslateKey;
                if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new PKCS8EncodedKeySpec(engineTranslateKey.getEncoded());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return makeRawKeySpec(openSslEdDsaPrivateKey.getRaw(), cls);
                }
            }
            throw new InvalidKeySpecException(ctbc.a(cls, engineTranslateKey));
        } catch (InvalidKeyException e) {
            throw new InvalidKeySpecException("Unsupported key class: ".concat(String.valueOf(String.valueOf(key.getClass()))), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if ((key instanceof OpenSslEdDsaPublicKey) || (key instanceof OpenSslEdDsaPrivateKey)) {
            return key;
        }
        if ((key instanceof PrivateKey) && key.getFormat().equals("PKCS#8")) {
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
        if (!(key instanceof PublicKey) || !key.getFormat().equals("X.509")) {
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
