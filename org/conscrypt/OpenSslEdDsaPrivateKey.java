package com.google.android.gms.org.conscrypt;

import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OpenSslEdDsaPrivateKey implements PrivateKey {
    static final int ED25519_PRIVATE_KEY_SIZE_BYTES = 32;
    private static final byte[] pkcs8Preamble = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};
    private static final long serialVersionUID = -3136201500221850916L;
    private byte[] privateKeyBytes;

    public OpenSslEdDsaPrivateKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if (encodedKeySpec.getFormat().equals("PKCS#8")) {
            byte[] bArr = pkcs8Preamble;
            if (!Arrays.equals(Arrays.copyOf(encoded, bArr.length), bArr)) {
                throw new InvalidKeySpecException("Invalid EdDSA PKCS8 key preamble");
            }
            this.privateKeyBytes = Arrays.copyOfRange(encoded, bArr.length, encoded.length);
        } else {
            if (!encodedKeySpec.getFormat().equalsIgnoreCase("raw")) {
                throw new InvalidKeySpecException("Encoding must be in PKCS#8 or raw format");
            }
            this.privateKeyBytes = encoded;
        }
        if (this.privateKeyBytes.length != 32) {
            throw new InvalidKeySpecException("Invalid key size");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.privateKeyBytes;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.privateKeyBytes = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSslEdDsaPrivateKey) {
            return Arrays.equals(this.privateKeyBytes, ((OpenSslEdDsaPrivateKey) obj).privateKeyBytes);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "EdDSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArr = this.privateKeyBytes;
        if (bArr != null) {
            return ArrayUtils.concat(pkcs8Preamble, bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public byte[] getRaw() {
        byte[] bArr = this.privateKeyBytes;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        throw new IllegalStateException("key is destroyed");
    }

    public int hashCode() {
        return Arrays.hashCode(this.privateKeyBytes);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.privateKeyBytes == null;
    }

    public OpenSslEdDsaPrivateKey(byte[] bArr) {
        if (bArr.length == 32) {
            this.privateKeyBytes = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Invalid key size");
    }
}
