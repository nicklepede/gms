package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSslSlhDsaPublicKey implements PublicKey {
    static final int PUBLIC_KEY_SIZE_BYTES = 32;
    private final byte[] raw;

    public OpenSslSlhDsaPublicKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (!"raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
            throw new InvalidKeySpecException("Encoding must be in raw format");
        }
        if (encoded.length != 32) {
            throw new InvalidKeySpecException("Invalid key size");
        }
        this.raw = encoded;
    }

    public boolean equals(Object obj) {
        byte[] bArr = this.raw;
        if (bArr == null) {
            throw new IllegalStateException("key is destroyed");
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslSlhDsaPublicKey) {
            return Arrays.equals(bArr, ((OpenSslSlhDsaPublicKey) obj).raw);
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
        byte[] bArr = this.raw;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    public OpenSslSlhDsaPublicKey(byte[] bArr) {
        if (bArr.length == 32) {
            this.raw = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Invalid key size");
    }
}
