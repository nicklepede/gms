package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public enum Source {
    SOURCE_UNKNOWN(0),
    SOURCE_MAINLINE(1),
    SOURCE_GMS(2),
    SOURCE_UNBUNDLED(3);

    final int id;

    Source(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }
}
