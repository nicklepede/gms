package com.google.android.gms.googleone.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.dxxt;
import defpackage.frni;
import defpackage.frnw;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GoogleoneModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
        frnw.c();
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        aura.K("com.google.android.gms.googleone.smui.SmuiActivity", !frni.a.lK().b());
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
        frnw.c();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        dxxt.e(getApplicationContext());
    }
}
