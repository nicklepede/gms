package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import com.google.android.gms.org.conscrypt.metrics.MetricsCipher;
import com.google.android.gms.org.conscrypt.metrics.MetricsMode;
import com.google.android.gms.org.conscrypt.metrics.MetricsPadding;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OpenSSLEvpCipherARC4 extends OpenSSLEvpCipher {
    public OpenSSLEvpCipherARC4() {
        super(OpenSSLCipher.Mode.ECB, OpenSSLCipher.Padding.NOPADDING, MetricsCipher.ARC4.getId(), MetricsMode.ECB.getId(), MetricsPadding.NO_PADDING.getId());
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode != OpenSSLCipher.Mode.NONE && mode != OpenSSLCipher.Mode.ECB) {
            throw new NoSuchAlgorithmException("Unsupported mode ".concat(String.valueOf(mode.toString())));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Unsupported padding ".concat(String.valueOf(padding.toString())));
        }
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ARCFOUR";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLEvpCipher
    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        return "rc4";
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public boolean supportsVariableSizeKey() {
        return true;
    }

    @Override // com.google.android.gms.org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) {
    }
}
