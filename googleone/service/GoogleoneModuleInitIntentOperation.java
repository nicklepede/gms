package com.google.android.gms.googleone.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.dvms;
import defpackage.fouo;
import defpackage.fouv;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GoogleoneModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        fvbo.f(intent, "intent");
        fouv.c();
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asng.K("com.google.android.gms.googleone.smui.SmuiActivity", !fouo.a.a().b());
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        fvbo.f(intent, "intent");
        fouv.c();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        dvms.e(getApplicationContext());
    }
}
