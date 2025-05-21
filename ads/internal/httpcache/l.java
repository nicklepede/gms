package com.google.android.gms.ads.internal.httpcache;

import android.os.Bundle;
import android.os.DeadObjectException;
import defpackage.artg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class l implements artg {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;
    final /* synthetic */ n b;

    public l(n nVar, com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = iVar;
        this.b = nVar;
    }

    @Override // defpackage.artg
    public final void a(Bundle bundle) {
        try {
            this.a.a(this.b.a.g());
        } catch (DeadObjectException e) {
            this.a.c(e);
        }
    }

    @Override // defpackage.artg
    public final void b(int i) {
        this.a.c(new RuntimeException(defpackage.a.j(i, "onConnectionSuspended: ")));
    }
}
