package com.google.android.gms.presencemanager.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.frpp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PresenceManagerModuleInitIntentOperation extends anya {
    static {
        asot.b("PresenceManagerModule", asej.PRESENCE_MANAGER);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (frpp.a.a().i() || (i & 14) == 0) {
            return;
        }
        int i2 = PresenceManagerChimeraService.a;
        startService(new Intent().setClassName(this, "com.google.android.gms.presencemanager.service.PresenceManagerPresenceReportService"));
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
    }
}
