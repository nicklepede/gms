package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.eqfo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i implements eqfo {
    final /* synthetic */ k a;
    final /* synthetic */ b b;

    public i(k kVar, b bVar) {
        this.a = kVar;
        this.b = bVar;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        b bVar = this.b;
        bVar.j(th);
        bVar.i(false);
        this.a.b(bVar);
    }

    @Override // defpackage.eqfo
    public final void b(Object obj) {
    }
}
