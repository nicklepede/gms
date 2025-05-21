package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OpenSSLX25519PrivateKey implements OpenSSLX25519Key, PrivateKey {
    private static final byte[] PKCS8_PREAMBLE = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final long serialVersionUID = -3136201500221850916L;
    private byte[] uCoordinate;

    public OpenSSLX25519PrivateKey(EncodedKeySpec encodedKeySpec) {
        byte[] encoded = encodedKeySpec.getEncoded();
        if ("PKCS#8".equals(encodedKeySpec.getFormat())) {
            try {
                this.uCoordinate = NativeCrypto.EVP_raw_X25519_private_key(encoded);
            } catch (OpenSSLX509CertificateFactory.ParsingException | InvalidKeyException e) {
                throw new InvalidKeySpecException(e);
            }
        } else {
            if (!"raw".equalsIgnoreCase(encodedKeySpec.getFormat())) {
                throw new InvalidKeySpecException("Encoding must be in PKCS#8 or raw format");
            }
            this.uCoordinate = encoded;
        }
        if (this.uCoordinate.length != 32) {
            throw new InvalidKeySpecException("Invalid key size");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        byte[] bArr = this.uCoordinate;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.uCoordinate = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenSSLX25519PrivateKey) {
            return Arrays.equals(this.uCoordinate, ((OpenSSLX25519PrivateKey) obj).uCoordinate);
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
            return ArrayUtils.concat(PKCS8_PREAMBLE, bArr);
        }
        throw new IllegalStateException("key is destroyed");
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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
        return Arrays.hashCode(this.uCoordinate);
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.uCoordinate == null;
    }

    public OpenSSLX25519PrivateKey(byte[] bArr) {
        if (bArr.length == 32) {
            this.uCoordinate = (byte[]) bArr.clone();
            return;
        }
        throw new IllegalArgumentException("Invalid key size");
    }
}
