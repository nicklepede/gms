package com.google.android.gms.ads.internal.httpcache;

import defpackage.enqc;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class j implements enqc {
    final /* synthetic */ HttpRequestParcel a;

    public j(HttpRequestParcel httpRequestParcel) {
        this.a = httpRequestParcel;
    }

    @Override // defpackage.enqc
    public final /* bridge */ /* synthetic */ enss a(Object obj) {
        com.google.android.gms.ads.internal.util.future.i iVar = new com.google.android.gms.ads.internal.util.future.i();
        ((i) obj).a(this.a, new e(iVar));
        return iVar;
    }
}
