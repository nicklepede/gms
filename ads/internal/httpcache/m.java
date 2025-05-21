package com.google.android.gms.ads.internal.httpcache;

import com.google.android.gms.common.ConnectionResult;
import defpackage.arth;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class m implements arth {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;

    public m(com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.arth
    public final void hK(ConnectionResult connectionResult) {
        this.a.c(new RuntimeException("Connection failed."));
    }
}
