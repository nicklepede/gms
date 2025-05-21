package com.google.android.gms.significantplaces.init;

import android.content.Intent;
import com.google.android.gms.significantplaces.service.SettingsLoggingService;
import com.google.android.gms.significantplaces.service.StalePlacesCleaningService;
import defpackage.anya;
import defpackage.asng;
import defpackage.aspu;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.fspg;
import defpackage.fvbo;
import defpackage.ips;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignificantPlacesModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        fvbo.f(intent, "intent");
        int i2 = ips.a;
        boolean z = false;
        if (!aspu.a(this).k() && fspg.c()) {
            z = true;
        }
        asng.K("com.google.android.gms.significantplaces.settings.TrustedPlacesInjectorService", z);
        if (z) {
            byjl a = byjl.a(this);
            byko bykoVar = new byko();
            bykoVar.w(StalePlacesCleaningService.class.getName());
            bykoVar.t("StalePlacesCleaningTask");
            bykoVar.a = bykv.j;
            bykoVar.l(true);
            bykoVar.v(2);
            a.f(bykoVar.b());
            byko bykoVar2 = new byko();
            bykoVar2.w(SettingsLoggingService.class.getName());
            bykoVar2.t("SettingsLoggingTask");
            bykoVar2.a = bykv.j;
            bykoVar2.l(true);
            bykoVar2.v(2);
            a.f(bykoVar2.b());
        }
    }
}
