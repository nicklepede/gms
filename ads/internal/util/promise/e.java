package com.google.android.gms.ads.internal.util.promise;

import defpackage.enrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class e implements enrv {
    final /* synthetic */ c a;
    final /* synthetic */ a b;

    public e(c cVar, a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        this.b.a();
    }

    @Override // defpackage.enrv
    public final void b(Object obj) {
        this.a.a(obj);
    }
}
