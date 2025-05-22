package com.google.android.gms.org.conscrypt;

import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSslMlDsaPrivateKey implements PrivateKey {
    private byte[] seed;

    public OpenSslMlDsaPrivateKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (!"raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
            throw new InvalidKeySpecException("Encoding must be in raw format");
        }
        this.seed = encoded;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.seed;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.seed = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslMlDsaPrivateKey) {
            return Arrays.equals(this.seed, ((OpenSslMlDsaPrivateKey) obj).seed);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ML-DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        throw new UnsupportedOperationException("getEncoded() not yet supported");
    }

    @Override // java.security.Key
    public String getFormat() {
        throw new UnsupportedOperationException("getFormat() not yet supported");
    }

    public byte[] getSeed() {
        byte[] bArr = this.seed;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        return Arrays.hashCode(this.seed);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.seed == null;
    }

    public OpenSslMlDsaPrivateKey(byte[] bArr) {
        this.seed = (byte[]) bArr.clone();
    }
}
