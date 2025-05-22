package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public enum MetricsPadding {
    NO_PADDING(0),
    OAEP_SHA512(1),
    OAEP_SHA384(2),
    OAEP_SHA256(3),
    OAEP_SHA224(4),
    OAEP_SHA1(5),
    PKCS1(6),
    PKCS5(7),
    ISO10126(8);

    final int id;

    MetricsPadding(int i) {
        this.id = i;
    }

    public static MetricsPadding forName(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return NO_PADDING;
        }
    }

    public int getId() {
        return this.id;
    }
}
