package com.google.android.gms.thunderbird;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.dfzr;
import defpackage.dfzu;
import defpackage.ejhf;
import defpackage.fnck;
import defpackage.fsnb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this, "com.google.android.gms.thunderbird.EmergencyPersistentService"));
        if (startService(intent2) == null) {
            ((ejhf) ((ejhf) dfzr.a.j()).ah((char) 11247)).x("unable to start emergency persistent service");
        }
        int i2 = ThunderbirdSchedulerService.a;
        if (fnck.a.a().D()) {
            byjl a = byjl.a(this);
            byko bykoVar = new byko();
            bykoVar.w(ThunderbirdSchedulerService.class.getName());
            bykoVar.t("PeriodicLogging");
            bykoVar.l(false);
            bykoVar.a = bykv.j;
            bykoVar.p = false;
            bykoVar.v(2);
            a.f(bykoVar.b());
        } else {
            byjl a2 = byjl.a(this);
            bykm bykmVar = new bykm();
            bykmVar.w(ThunderbirdSchedulerService.class.getName());
            bykmVar.t("PeriodicLogging");
            bykmVar.x(0, 1);
            bykmVar.y(2, 0);
            bykmVar.j(byki.EVERY_DAY);
            bykmVar.p = false;
            a2.f(bykmVar.b());
        }
        if (fsnb.J()) {
            dfzu.d().g(this, "ThunderbirdModuleInitIntentOperation#onInitRuntimeState");
        }
        asng.H(this, "com.google.android.gms.thunderbird.EmergencyLocationService", true);
        asng.H(this, "com.google.android.gms.thunderbird.config.EmergencyConfigContentProvider", true);
        asng.H(this, "com.google.android.gms.thunderbird.EmergencyPersistentService", true);
        ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11256)).B("Refreshing ThunderbirdSettings state: %s", Boolean.valueOf(dfzr.d(this)));
        asng.M("com.google.android.gms.thunderbird.settings.ThunderbirdSettingsActivity", true != dfzr.d(this) ? 2 : 1);
        asng.M("com.google.android.gms.thunderbird.settings.ThunderbirdSettingInjectorService", true == dfzr.d(this) ? 1 : 2);
    }
}
