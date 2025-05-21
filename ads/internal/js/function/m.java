package com.google.android.gms.ads.internal.js.function;

import com.google.android.gms.ads.internal.js.ab;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class m implements com.google.android.gms.ads.internal.util.promise.a {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;
    final /* synthetic */ ab b;

    public m(com.google.android.gms.ads.internal.util.future.i iVar, ab abVar) {
        this.a = iVar;
        this.b = abVar;
    }

    @Override // com.google.android.gms.ads.internal.util.promise.a
    public final void a() {
        this.a.c(new a("Unable to obtain a JavascriptEngine."));
        this.b.a();
    }
}
