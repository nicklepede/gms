package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.eqfo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class h implements eqfo {
    final /* synthetic */ k a;
    final /* synthetic */ b b;
    final /* synthetic */ boolean c;

    public h(k kVar, b bVar, boolean z) {
        this.a = kVar;
        this.b = bVar;
        this.c = z;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        b bVar = this.b;
        if (bVar.a()) {
            k kVar = this.a;
            bVar.j(th);
            bVar.i(false);
            kVar.b(bVar);
            if (this.c) {
                kVar.a();
            }
        }
    }

    @Override // defpackage.eqfo
    public final void b(Object obj) {
        b bVar = this.b;
        bVar.i(true);
        k kVar = this.a;
        kVar.b(bVar);
        if (this.c) {
            kVar.a();
        }
    }
}
