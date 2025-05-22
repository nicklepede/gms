package com.google.android.gms.ads.internal.httpcache;

import defpackage.eqdv;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class j implements eqdv {
    final /* synthetic */ HttpRequestParcel a;

    public j(HttpRequestParcel httpRequestParcel) {
        this.a = httpRequestParcel;
    }

    @Override // defpackage.eqdv
    public final /* bridge */ /* synthetic */ eqgl a(Object obj) {
        com.google.android.gms.ads.internal.util.future.i iVar = new com.google.android.gms.ads.internal.util.future.i();
        ((i) obj).a(this.a, new e(iVar));
        return iVar;
    }
}
