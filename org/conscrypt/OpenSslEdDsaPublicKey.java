package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OpenSslEdDsaPublicKey implements PublicKey {
    static final int ED25519_PUBLIC_KEY_SIZE_BYTES = 32;
    private static final byte[] X509_PREAMBLE = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private static final long serialVersionUID = 453861992373478445L;
    private final byte[] publicKeyBytes;

    public OpenSslEdDsaPublicKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (!encodedKeySpec.getFormat().equals("X.509")) {
            if (!encodedKeySpec.getFormat().equalsIgnoreCase("raw")) {
                throw new InvalidKeySpecException("Encoding must be in X.509 or raw format");
            }
            if (encoded.length != 32) {
                throw new InvalidKeySpecException("Invalid key size");
            }
            this.publicKeyBytes = encoded;
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
        this.publicKeyBytes = Arrays.copyOfRange(encoded, length, i);
    }

    public boolean equals(Object obj) {
        byte[] bArr = this.publicKeyBytes;
        if (bArr == null) {
            throw new IllegalStateException("key is destroyed");
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslEdDsaPublicKey) {
            return Arrays.equals(bArr, ((OpenSslEdDsaPublicKey) obj).publicKeyBytes);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "EdDSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr = this.publicKeyBytes;
        if (bArr != null) {
            return ArrayUtils.concat(X509_PREAMBLE, bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public byte[] getRaw() {
        byte[] bArr = this.publicKeyBytes;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        byte[] bArr = this.publicKeyBytes;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    public OpenSslEdDsaPublicKey(byte[] bArr) {
        if (bArr.length == 32) {
            this.publicKeyBytes = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Invalid key size");
    }
}
