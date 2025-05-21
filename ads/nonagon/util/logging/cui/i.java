package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.enrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i implements enrv {
    final /* synthetic */ k a;
    final /* synthetic */ b b;

    public i(k kVar, b bVar) {
        this.a = kVar;
        this.b = bVar;
    }

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        b bVar = this.b;
        bVar.j(th);
        bVar.i(false);
        this.a.b(bVar);
    }

    @Override // defpackage.enrv
    public final void b(Object obj) {
    }
}
