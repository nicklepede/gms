package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import com.google.android.gms.org.conscrypt.metrics.MetricsCipher;
import com.google.android.gms.org.conscrypt.metrics.MetricsMode;
import com.google.android.gms.org.conscrypt.metrics.MetricsPadding;
import defpackage.a;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSSLAeadCipherChaCha20 extends OpenSSLAeadCipher {
    public OpenSSLAeadCipherChaCha20() {
        super(OpenSSLCipher.Mode.POLY1305, MetricsCipher.CHACHA20.getId(), MetricsMode.POLY1305.getId(), MetricsPadding.NO_PADDING.getId());
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) {
        if (i != 32) {
            throw new InvalidKeyException(a.l(i, "Unsupported key size: ", " bytes (must be 32)"));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode != OpenSSLCipher.Mode.POLY1305) {
            throw new NoSuchAlgorithmException("Mode must be Poly1305");
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLAeadCipher
    public long getEVP_AEAD(int i) {
        if (i == 32) {
            return NativeCrypto.EVP_aead_chacha20_poly1305();
        }
        throw new RuntimeException(a.j(i, "Unexpected key length: "));
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i) {
        return isEncrypting() ? this.bufCount + i + 16 : Math.max(0, (this.bufCount + i) - 16);
    }
}
