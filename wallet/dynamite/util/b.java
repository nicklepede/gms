package com.google.android.gms.wallet.dynamite.util;

import android.util.Log;
import defpackage.eqfo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
final class b implements eqfo {
    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        Log.w(c.a, "Failed to register Phenotype, may lead to stale values", th);
    }

    @Override // defpackage.eqfo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.i(c.a, "Successfully registered with Phenotype.");
    }
}
