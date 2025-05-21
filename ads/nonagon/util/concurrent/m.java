package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.clearcut.k;
import com.google.android.gms.ads.nonagon.clearcut.l;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.enss;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m {
    public final /* synthetic */ n a;
    private final Object b;
    private final enss c;
    private final List d;
    private final enss e;

    public m(n nVar, Object obj, enss enssVar, List list, enss enssVar2) {
        this.a = nVar;
        this.b = obj;
        this.c = enssVar;
        this.d = list;
        this.e = enssVar2;
    }

    public final g a() {
        Object obj = this.b;
        final g gVar = new g(obj, ((com.google.android.gms.ads.nonagon.util.event.a) obj).B, this.e);
        this.a.b.d(new com.google.android.gms.ads.nonagon.ad.event.b() { // from class: com.google.android.gms.ads.nonagon.util.event.d
            @Override // com.google.android.gms.ads.nonagon.ad.event.b
            public final void a(Object obj2) {
            }
        });
        this.c.hn(new Runnable() { // from class: com.google.android.gms.ads.nonagon.util.concurrent.k
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
        }, com.google.android.gms.ads.internal.util.future.e.d);
        ensj.t(gVar, new l(this, gVar), com.google.android.gms.ads.internal.util.future.e.d);
        return gVar;
    }

    public final m b(final f fVar) {
        return c(new enqc() { // from class: com.google.android.gms.ads.nonagon.util.concurrent.j
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return ensj.i(f.this.a(obj));
            }
        });
    }

    public final m c(enqc enqcVar) {
        n nVar = this.a;
        return new m(nVar, this.b, this.c, this.d, enps.g(this.e, enqcVar, nVar.a));
    }
}
