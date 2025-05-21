package com.google.android.gms.ads.internal.cache;

import com.google.android.gms.common.ConnectionResult;
import defpackage.arth;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class n implements arth {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;
    final /* synthetic */ o b;

    public n(o oVar, com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = iVar;
        this.b = oVar;
    }

    @Override // defpackage.arth
    public final void hK(ConnectionResult connectionResult) {
        synchronized (this.b.d) {
            this.a.c(new RuntimeException("Connection failed."));
        }
    }
}
