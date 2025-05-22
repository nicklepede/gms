package com.google.android.gms.ads.internal.cache;

import com.google.android.gms.common.ConnectionResult;
import defpackage.atvw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class n implements atvw {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;
    final /* synthetic */ o b;

    public n(o oVar, com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = iVar;
        this.b = oVar;
    }

    @Override // defpackage.atvw
    public final void ia(ConnectionResult connectionResult) {
        synchronized (this.b.d) {
            this.a.c(new RuntimeException("Connection failed."));
        }
    }
}
