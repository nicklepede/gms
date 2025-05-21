package com.google.android.gms.cloudstorage.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.dvms;
import defpackage.fmje;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class SmuiModuleInitIntentOperation extends anya {
    static {
        asot.b("SmuiModuleInitIntentOperation", asej.UNKNOWN);
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        fvbo.f(intent, "intent");
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asng.K("com.google.android.gms.cloudstorage.smui.SmuiActivity", !fmje.a.a().b());
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        fvbo.f(intent, "intent");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        dvms.e(getApplicationContext());
    }
}
