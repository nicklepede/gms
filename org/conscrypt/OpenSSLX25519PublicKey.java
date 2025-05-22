package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSSLX25519PublicKey implements OpenSSLX25519Key, PublicKey {
    private static final byte[] X509_PREAMBLE = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    private static final long serialVersionUID = 453861992373478445L;
    private final byte[] uCoordinate;

    public OpenSSLX25519PublicKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (!"X.509".equals(encodedKeySpec.getFormat())) {
            if (!"raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
                throw new InvalidKeySpecException("Encoding must be in X.509 or raw format");
            }
            if (encoded.length != 32) {
                throw new InvalidKeySpecException("Invalid key size");
            }
            this.uCoordinate = encoded;
            return;
        }
        byte[] bArr = X509_PREAMBLE;
        if (!ArrayUtils.startsWith(encoded, bArr)) {
            throw new InvalidKeySpecException("Invalid format");
        }
        int length = bArr.length;
        int i = length + 32;
        if (encoded.length < i) {
            throw new InvalidKeySpecException("Invalid key size");
        }
        this.uCoordinate = Arrays.copyOfRange(encoded, length, i);
    }

    public boolean equals(Object obj) {
        byte[] bArr = this.uCoordinate;
        if (bArr == null) {
            throw new IllegalStateException("key is destroyed");
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSSLX25519PublicKey) {
            return Arrays.equals(bArr, ((OpenSSLX25519PublicKey) obj).uCoordinate);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XDH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            return ArrayUtils.concat(X509_PREAMBLE, bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLX25519Key
    public byte[] getU() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    public OpenSSLX25519PublicKey(byte[] bArr) {
        if (bArr.length == 32) {
            this.uCoordinate = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Invalid key size");
    }
}
