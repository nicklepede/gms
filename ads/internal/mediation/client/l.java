package com.google.android.gms.ads.internal.mediation.client;

import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class l implements com.google.android.gms.ads.mediation.b {
    private final Set a;
    private final boolean b;
    private final int c;
    private final boolean d;

    public l(Set set, boolean z, int i, boolean z2) {
        this.a = set;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final Set b() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.b
    @Deprecated
    public final boolean c() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final boolean d() {
        return this.b;
    }
}
