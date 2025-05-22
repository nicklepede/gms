package com.google.android.gms.ads.internal.util.promise;

import defpackage.eqfo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class d implements eqfo {
    final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        this.a.b.set(-1);
    }

    @Override // defpackage.eqfo
    public final void b(Object obj) {
        this.a.b.set(1);
    }
}
