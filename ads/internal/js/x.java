package com.google.android.gms.ads.internal.js;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class x implements com.google.android.gms.ads.internal.util.promise.a {
    final /* synthetic */ ag a;
    final /* synthetic */ com.google.android.gms.ads.nonagon.util.logging.cui.b b;
    final /* synthetic */ ah c;

    public x(ah ahVar, ag agVar, com.google.android.gms.ads.nonagon.util.logging.cui.b bVar) {
        this.a = agVar;
        this.b = bVar;
        this.c = ahVar;
    }

    @Override // com.google.android.gms.ads.internal.util.promise.a
    public final void a() {
        com.google.android.gms.ads.nonagon.util.logging.cui.n nVar;
        ah ahVar = this.c;
        synchronized (ahVar.a) {
            ahVar.h = 1;
            this.a.b();
            if (((Boolean) com.google.android.gms.ads.internal.flag.h.d.d()).booleanValue() && (nVar = ahVar.e) != null) {
                com.google.android.gms.ads.nonagon.util.logging.cui.b bVar = this.b;
                bVar.h();
                bVar.i(false);
                nVar.b(bVar.c());
            }
        }
    }
}
