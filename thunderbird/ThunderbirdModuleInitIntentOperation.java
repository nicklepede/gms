package com.google.android.gms.thunderbird;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.dikw;
import defpackage.dikz;
import defpackage.eluo;
import defpackage.fpuj;
import defpackage.fvik;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this, "com.google.android.gms.thunderbird.EmergencyPersistentService"));
        if (startService(intent2) == null) {
            ((eluo) ((eluo) dikw.a.j()).ai((char) 11250)).x("unable to start emergency persistent service");
        }
        int i2 = ThunderbirdSchedulerService.a;
        if (fpuj.a.lK().D()) {
            casd a = casd.a(this);
            catg catgVar = new catg();
            catgVar.w(ThunderbirdSchedulerService.class.getName());
            catgVar.t("PeriodicLogging");
            catgVar.l(false);
            catgVar.a = catn.j;
            catgVar.p = false;
            catgVar.v(2);
            a.f(catgVar.b());
        } else {
            casd a2 = casd.a(this);
            cate cateVar = new cate();
            cateVar.w(ThunderbirdSchedulerService.class.getName());
            cateVar.t("PeriodicLogging");
            cateVar.x(0, 1);
            cateVar.y(2, 0);
            cateVar.j(cata.EVERY_DAY);
            cateVar.p = false;
            a2.f(cateVar.b());
        }
        if (fvik.J()) {
            dikz.d().g(this, "ThunderbirdModuleInitIntentOperation#onInitRuntimeState");
        }
        aura.H(this, "com.google.android.gms.thunderbird.EmergencyLocationService", true);
        aura.H(this, "com.google.android.gms.thunderbird.config.EmergencyConfigContentProvider", true);
        aura.H(this, "com.google.android.gms.thunderbird.EmergencyPersistentService", true);
        ((eluo) ((eluo) dikw.a.h()).ai((char) 11259)).B("Refreshing ThunderbirdSettings state: %s", Boolean.valueOf(dikw.d(this)));
        aura.M("com.google.android.gms.thunderbird.settings.ThunderbirdSettingsActivity", true != dikw.d(this) ? 2 : 1);
        aura.M("com.google.android.gms.thunderbird.settings.ThunderbirdSettingInjectorService", true == dikw.d(this) ? 1 : 2);
    }
}
