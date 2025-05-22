package com.google.android.gms.org.conscrypt;

import defpackage.cvkg;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSslSlhDsaKeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslSlhDsaPrivateKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Currently only EncodedKeySpec is supported; was ".concat(String.valueOf(keySpec.getClass().getName())));
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslSlhDsaPublicKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Currently only EncodedKeySpec is supported; was ".concat(String.valueOf(keySpec.getClass().getName())));
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        }
        if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        }
        if (key instanceof OpenSslSlhDsaPublicKey) {
            OpenSslSlhDsaPublicKey openSslSlhDsaPublicKey = (OpenSslSlhDsaPublicKey) key;
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                throw new UnsupportedOperationException("X509EncodedKeySpec is currently not supported");
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return KeySpecUtil.makeRawKeySpec(openSslSlhDsaPublicKey.getRaw(), cls);
            }
        } else if (key instanceof OpenSslSlhDsaPrivateKey) {
            OpenSslSlhDsaPrivateKey openSslSlhDsaPrivateKey = (OpenSslSlhDsaPrivateKey) key;
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                throw new UnsupportedOperationException("PKCS8EncodedKeySpec is currently not supported");
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return KeySpecUtil.makeRawKeySpec(openSslSlhDsaPrivateKey.getRaw(), cls);
            }
        }
        throw new InvalidKeySpecException(cvkg.a(cls, key));
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if ((key instanceof OpenSslSlhDsaPublicKey) || (key instanceof OpenSslSlhDsaPrivateKey)) {
            return key;
        }
        throw new InvalidKeyException("Key must be OpenSslSlhDsaPublicKey or OpenSslSlhDsaPrivateKey");
    }
}
