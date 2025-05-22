package com.google.android.gms.ads.nonagon.util.concurrent;

import defpackage.eqft;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i {
    final /* synthetic */ n a;
    private final Object b;
    private final List c;

    public i(n nVar, Object obj, List list) {
        this.a = nVar;
        this.b = obj;
        this.c = list;
    }

    public final m a(Callable callable) {
        List list = this.c;
        eqft c = eqgc.c(list);
        eqgl a = c.a(new Callable() { // from class: com.google.android.gms.ads.nonagon.util.concurrent.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, com.google.android.gms.ads.internal.util.future.e.d);
        n nVar = this.a;
        return new m(nVar, this.b, a, list, c.a(callable, nVar.a));
    }
}
