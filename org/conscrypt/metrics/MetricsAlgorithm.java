package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public enum MetricsAlgorithm {
    UNKNOWN_ALGORITHM(0),
    CIPHER(1),
    SIGNATURE(2);

    final int id;

    MetricsAlgorithm(int i) {
        this.id = i;
    }

    public static MetricsAlgorithm forName(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return UNKNOWN_ALGORITHM;
        }
    }

    public int getId() {
        return this.id;
    }
}
