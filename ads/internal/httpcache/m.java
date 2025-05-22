package com.google.android.gms.ads.internal.httpcache;

import com.google.android.gms.common.ConnectionResult;
import defpackage.atvw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class m implements atvw {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;

    public m(com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.atvw
    public final void ia(ConnectionResult connectionResult) {
        this.a.c(new RuntimeException("Connection failed."));
    }
}
