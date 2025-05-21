package com.google.android.gms.ads.nonagon.util.concurrent;

import defpackage.ensa;
import defpackage.ensj;
import defpackage.enss;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        ensa c = ensj.c(list);
        enss a = c.a(new Callable() { // from class: com.google.android.gms.ads.nonagon.util.concurrent.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, com.google.android.gms.ads.internal.util.future.e.d);
        n nVar = this.a;
        return new m(nVar, this.b, a, list, c.a(callable, nVar.a));
    }
}
