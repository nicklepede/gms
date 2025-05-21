package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OpenSslMlDsaPublicKey implements PublicKey {
    private static final long serialVersionUID = 453861992373478445L;
    private final byte[] raw;

    public OpenSslMlDsaPublicKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (!"raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
            throw new InvalidKeySpecException("Encoding must be in raw format");
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
        if (obj instanceof OpenSslMlDsaPublicKey) {
            return Arrays.equals(bArr, ((OpenSslMlDsaPublicKey) obj).raw);
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

    public OpenSslMlDsaPublicKey(byte[] bArr) {
        this.raw = (byte[]) bArr.clone();
    }
}
