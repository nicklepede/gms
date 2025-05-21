package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.clearcut.k;
import com.google.android.gms.ads.nonagon.clearcut.l;
import defpackage.enrv;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class l implements enrv {
    final /* synthetic */ g a;
    final /* synthetic */ m b;

    public l(m mVar, g gVar) {
        this.a = gVar;
        this.b = mVar;
    }

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        final g gVar = this.a;
        this.b.a.b.d(new com.google.android.gms.ads.nonagon.ad.event.b() { // from class: com.google.android.gms.ads.nonagon.util.event.b
            @Override // com.google.android.gms.ads.nonagon.ad.event.b
            public final void a(Object obj) {
                l lVar = (l) obj;
                Map map = lVar.a;
                Object obj2 = com.google.android.gms.ads.nonagon.util.concurrent.g.this.a;
                if (map.containsKey(obj2)) {
                    lVar.b.b(((k) map.get(obj2)).c);
                }
            }
        });
    }

    @Override // defpackage.enrv
    public final void b(Object obj) {
        final g gVar = this.a;
        this.b.a.b.d(new com.google.android.gms.ads.nonagon.ad.event.b() { // from class: com.google.android.gms.ads.nonagon.util.event.c
            @Override // com.google.android.gms.ads.nonagon.ad.event.b
            public final void a(Object obj2) {
                l lVar = (l) obj2;
                Map map = lVar.a;
                Object obj3 = com.google.android.gms.ads.nonagon.util.concurrent.g.this.a;
                if (map.containsKey(obj3)) {
                    lVar.b.b(((k) map.get(obj3)).b);
                }
            }
        });
    }
}
