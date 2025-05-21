package com.google.android.gms.ads.nonagon.util.concurrent;

import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class n {
    public final ensv a;
    public final com.google.android.gms.ads.nonagon.ad.event.c b;

    static {
        ensj.i(null);
    }

    public n(ensv ensvVar, com.google.android.gms.ads.nonagon.ad.event.c cVar) {
        this.a = ensvVar;
        this.b = cVar;
    }

    public final i a(Object obj, enss... enssVarArr) {
        return new i(this, obj, Arrays.asList(enssVarArr));
    }

    public final m b(Object obj, enss enssVar) {
        return new m(this, obj, enssVar, Collections.singletonList(enssVar), enssVar);
    }
}
