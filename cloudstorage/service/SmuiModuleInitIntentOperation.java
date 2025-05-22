package com.google.android.gms.cloudstorage.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.dxxt;
import defpackage.fpas;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SmuiModuleInitIntentOperation extends apzs {
    static {
        ausn.b("SmuiModuleInitIntentOperation", auid.UNKNOWN);
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        aura.K("com.google.android.gms.cloudstorage.smui.SmuiActivity", !fpas.a.lK().b());
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        dxxt.e(getApplicationContext());
    }
}
