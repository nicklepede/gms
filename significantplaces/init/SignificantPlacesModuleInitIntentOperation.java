package com.google.android.gms.significantplaces.init;

import android.content.Intent;
import com.google.android.gms.significantplaces.service.SettingsLoggingService;
import com.google.android.gms.significantplaces.service.StalePlacesCleaningService;
import defpackage.apzs;
import defpackage.aura;
import defpackage.auto;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.fvku;
import defpackage.fxxm;
import defpackage.iri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignificantPlacesModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fxxm.f(intent, "intent");
        int i2 = iri.a;
        boolean z = false;
        if (!auto.a(this).k() && fvku.c()) {
            z = true;
        }
        aura.K("com.google.android.gms.significantplaces.settings.TrustedPlacesInjectorService", z);
        if (z) {
            casd a = casd.a(this);
            catg catgVar = new catg();
            catgVar.w(StalePlacesCleaningService.class.getName());
            catgVar.t("StalePlacesCleaningTask");
            catn catnVar = catn.j;
            catgVar.a = catnVar;
            catgVar.l(true);
            catgVar.v(2);
            a.f(catgVar.b());
            catg catgVar2 = new catg();
            catgVar2.w(SettingsLoggingService.class.getName());
            catgVar2.t("SettingsLoggingTask");
            catgVar2.a = catnVar;
            catgVar2.l(true);
            catgVar2.v(2);
            a.f(catgVar2.b());
        }
    }
}
