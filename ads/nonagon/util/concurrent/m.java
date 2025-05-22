package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.clearcut.k;
import com.google.android.gms.ads.nonagon.clearcut.l;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m {
    public final /* synthetic */ n a;
    private final Object b;
    private final eqgl c;
    private final List d;
    private final eqgl e;

    public m(n nVar, Object obj, eqgl eqglVar, List list, eqgl eqglVar2) {
        this.a = nVar;
        this.b = obj;
        this.c = eqglVar;
        this.d = list;
        this.e = eqglVar2;
    }

    public final g a() {
        Object obj = this.b;
        final g gVar = new g(obj, ((com.google.android.gms.ads.nonagon.util.event.a) obj).B, this.e);
        this.a.b.d(new com.google.android.gms.ads.nonagon.ad.event.b() { // from class: com.google.android.gms.ads.nonagon.util.event.d
            @Override // com.google.android.gms.ads.nonagon.ad.event.b
            public final void a(Object obj2) {
            }
        });
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.nonagon.util.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                final g gVar2 = gVar;
                m.this.a.b.d(new com.google.android.gms.ads.nonagon.ad.event.b() { // from class: com.google.android.gms.ads.nonagon.util.event.e
                    @Override // com.google.android.gms.ads.nonagon.ad.event.b
                    public final void a(Object obj2) {
                        l lVar = (l) obj2;
                        Map map = lVar.a;
                        Object obj3 = com.google.android.gms.ads.nonagon.util.concurrent.g.this.a;
                        if (map.containsKey(obj3)) {
                            lVar.b.b(((k) map.get(obj3)).a);
                        }
                    }
                });
            }
        };
        eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.d;
        this.c.hD(runnable, eqgoVar);
        eqgc.t(gVar, new l(this, gVar), eqgoVar);
        return gVar;
    }

    public final m b(final f fVar) {
        return c(new eqdv() { // from class: com.google.android.gms.ads.nonagon.util.concurrent.j
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return eqgc.i(f.this.a(obj));
            }
        });
    }

    public final m c(eqdv eqdvVar) {
        n nVar = this.a;
        return new m(nVar, this.b, this.c, this.d, eqdl.g(this.e, eqdvVar, nVar.a));
    }
}
