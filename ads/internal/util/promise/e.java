package com.google.android.gms.ads.internal.util.promise;

import defpackage.eqfo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class e implements eqfo {
    final /* synthetic */ c a;
    final /* synthetic */ a b;

    public e(c cVar, a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        this.b.a();
    }

    @Override // defpackage.eqfo
    public final void b(Object obj) {
        this.a.a(obj);
    }
}
