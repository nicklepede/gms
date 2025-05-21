package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class bo {
    public final List a;
    public final Set b;
    public final Bundle c;
    public final int d;
    public final Set e;
    public final Bundle f;
    public final Set g;
    public final boolean h;
    public long i = 0;

    public bo(bn bnVar) {
        this.a = bnVar.g;
        this.b = DesugarCollections.unmodifiableSet(bnVar.a);
        this.c = bnVar.b;
        DesugarCollections.unmodifiableMap(bnVar.c);
        this.d = bnVar.h;
        this.e = DesugarCollections.unmodifiableSet(bnVar.d);
        this.f = bnVar.e;
        this.g = DesugarCollections.unmodifiableSet(bnVar.f);
        this.h = bnVar.i;
    }
}
