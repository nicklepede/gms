package com.google.android.gms.ads.internal.httpcache;

import android.os.Bundle;
import android.os.DeadObjectException;
import defpackage.atvv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class l implements atvv {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;
    final /* synthetic */ n b;

    public l(n nVar, com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = iVar;
        this.b = nVar;
    }

    @Override // defpackage.atvv
    public final void a(Bundle bundle) {
        try {
            this.a.a(this.b.a.g());
        } catch (DeadObjectException e) {
            this.a.c(e);
        }
    }

    @Override // defpackage.atvv
    public final void b(int i) {
        this.a.c(new RuntimeException(defpackage.a.j(i, "onConnectionSuspended: ")));
    }
}
