package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public enum MetricsMode {
    NO_MODE(0),
    CBC(1),
    CTR(2),
    ECB(3),
    CFB(4),
    CTS(5),
    GCM(6),
    GCM_SIV(7),
    OFB(8),
    POLY1305(9);

    final int id;

    MetricsMode(int i) {
        this.id = i;
    }

    public static MetricsMode forName(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return NO_MODE;
        }
    }

    public int getId() {
        return this.id;
    }
}
