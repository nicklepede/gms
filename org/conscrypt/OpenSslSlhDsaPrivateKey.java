package com.google.android.gms.org.conscrypt;

import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSslSlhDsaPrivateKey implements PrivateKey {
    static final int PRIVATE_KEY_SIZE_BYTES = 64;
    private byte[] raw;

    public OpenSslSlhDsaPrivateKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (!"raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
            throw new InvalidKeySpecException("Encoding must be in raw format");
        }
        if (encoded.length != 64) {
            throw new InvalidKeySpecException("Invalid key size");
        }
        this.raw = encoded;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.raw;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.raw = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslSlhDsaPrivateKey) {
            return Arrays.equals(this.raw, ((OpenSslSlhDsaPrivateKey) obj).raw);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "SLH-DSA-SHA2-128S";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        throw new UnsupportedOperationException("getEncoded() not yet supported");
    }

    @Override // java.security.Key
    public String getFormat() {
        throw new UnsupportedOperationException("getFormat() not yet supported");
    }

    public byte[] getRaw() {
        byte[] bArr = this.raw;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        return Arrays.hashCode(this.raw);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.raw == null;
    }

    public OpenSslSlhDsaPrivateKey(byte[] bArr) {
        if (bArr.length == 64) {
            this.raw = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Invalid key size");
    }
}
