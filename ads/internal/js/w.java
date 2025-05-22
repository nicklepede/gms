package com.google.android.gms.ads.internal.js;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class w implements com.google.android.gms.ads.internal.util.promise.c {
    final /* synthetic */ ag a;
    final /* synthetic */ com.google.android.gms.ads.nonagon.util.logging.cui.b b;
    final /* synthetic */ ah c;

    public w(ah ahVar, ag agVar, com.google.android.gms.ads.nonagon.util.logging.cui.b bVar) {
        this.a = agVar;
        this.b = bVar;
        this.c = ahVar;
    }

    @Override // com.google.android.gms.ads.internal.util.promise.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        com.google.android.gms.ads.nonagon.util.logging.cui.n nVar;
        ah ahVar = this.c;
        synchronized (ahVar.a) {
            ahVar.h = 0;
            ag agVar = ahVar.g;
            if (agVar != null && this.a != agVar) {
                agVar.b();
            }
            ahVar.g = this.a;
            if (((Boolean) com.google.android.gms.ads.internal.flag.h.d.d()).booleanValue() && (nVar = ahVar.e) != null) {
                com.google.android.gms.ads.nonagon.util.logging.cui.b bVar = this.b;
                bVar.i(true);
                nVar.b(bVar.c());
            }
        }
    }
}
