package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public enum MetricsCipher {
    UNKNOWN_CIPHER(0),
    AES(1),
    DES(2),
    DESEDE(3),
    DSA(4),
    BLOWFISH(5),
    CHACHA20(6),
    RSA(7),
    ARC4(8);

    final int id;

    MetricsCipher(int i) {
        this.id = i;
    }

    public static MetricsCipher forName(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return UNKNOWN_CIPHER;
        }
    }

    public int getId() {
        return this.id;
    }
}
