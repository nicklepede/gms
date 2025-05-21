package com.google.android.gms.ads.internal.util.promise;

import defpackage.enrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class d implements enrv {
    final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        this.a.b.set(-1);
    }

    @Override // defpackage.enrv
    public final void b(Object obj) {
        this.a.b.set(1);
    }
}
