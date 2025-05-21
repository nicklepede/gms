package com.google.android.gms.wallet.dynamite.util;

import android.util.Log;
import defpackage.enrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
final class b implements enrv {
    @Override // defpackage.enrv
    public final void a(Throwable th) {
        Log.w(c.a, "Failed to register Phenotype, may lead to stale values", th);
    }

    @Override // defpackage.enrv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.i(c.a, "Successfully registered with Phenotype.");
    }
}
