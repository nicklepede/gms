package com.google.android.gms.ads.nonagon.util.concurrent;

import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class n {
    public final eqgo a;
    public final com.google.android.gms.ads.nonagon.ad.event.c b;

    static {
        eqgc.i(null);
    }

    public n(eqgo eqgoVar, com.google.android.gms.ads.nonagon.ad.event.c cVar) {
        this.a = eqgoVar;
        this.b = cVar;
    }

    public final i a(Object obj, eqgl... eqglVarArr) {
        return new i(this, obj, Arrays.asList(eqglVarArr));
    }

    public final m b(Object obj, eqgl eqglVar) {
        return new m(this, obj, eqglVar, Collections.singletonList(eqglVar), eqglVar);
    }
}
