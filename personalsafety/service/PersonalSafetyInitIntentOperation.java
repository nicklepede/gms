package com.google.android.gms.personalsafety.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.cxyz;
import defpackage.cxze;
import defpackage.cyeb;
import defpackage.eluo;
import defpackage.fpro;
import defpackage.fpry;
import defpackage.fpuj;
import defpackage.fucy;
import defpackage.fudd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PersonalSafetyInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        ausn ausnVar = cxze.a;
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        boolean z = cxyz.a(this) && fpry.v();
        boolean x = fpry.x();
        if ((z || x) && cyeb.d(getApplicationContext())) {
            Context applicationContext = getApplicationContext();
            applicationContext.startService(SndService.a(applicationContext, "com.google.android.gms.personalsafety.ACTION_INIT"));
            ausn ausnVar = cxze.a;
        } else {
            ausn ausnVar2 = cxze.a;
        }
        boolean c = cyeb.c(getApplicationContext());
        if (fpro.ai() && c) {
            ausn ausnVar3 = cxze.a;
            ((eluo) ((eluo) ausnVar3.h()).ai((char) 8687)).x("onInitRuntimeState");
            Context applicationContext2 = getApplicationContext();
            int i2 = PersonalSafetyChimeraService.f;
            ((eluo) ((eluo) ausnVar3.h()).ai((char) 8676)).x("Attempt to start PersonalSafetyService");
            Intent intent2 = new Intent("com.google.android.gms.personalsafety.ACTION_INIT");
            intent2.setComponent(new ComponentName(applicationContext2, "com.google.android.gms.personalsafety.service.PersonalSafetyService"));
            applicationContext2.startService(intent2);
            Context applicationContext3 = getApplicationContext();
            int i3 = PersonalSafetyLoggerService.a;
            if (fpuj.a.lK().z()) {
                catg catgVar = new catg();
                catgVar.w(PersonalSafetyLoggerService.class.getName());
                catgVar.q("personal_safety_setting");
                catgVar.a = catn.j;
                catgVar.l(false);
                catgVar.v(2);
                casd.a(applicationContext3).f(catgVar.b());
            } else {
                casd a = casd.a(applicationContext3);
                cate cateVar = new cate();
                cateVar.w(PersonalSafetyLoggerService.class.getName());
                cateVar.t("personal_safety_setting");
                cateVar.x(0, 1);
                cateVar.f(0, 1);
                cateVar.y(2, 0);
                cateVar.j(cata.EVERY_DAY);
                a.f(cateVar.b());
            }
            if (fpro.S()) {
                if (fpro.ao()) {
                    aura.H(this, "com.google.android.personalsafety.settings.BleTagGoogleSettingDebugActivity", true);
                }
                aura.H(this, "com.google.android.personalsafety.settings.BleTagSettingsActivity", true);
            } else {
                ((eluo) ((eluo) ausnVar3.j()).ai((char) 8688)).B("BleSettingsChimeraActivity enabled in InitIntentOperation ui main flag %b ", Boolean.valueOf(fpro.S()));
            }
        } else if (c) {
            ((eluo) ((eluo) cxze.a.j()).ai((char) 8686)).x("Failed to initialize PersonalSafetyChimeraService, init off");
        } else {
            ((eluo) ((eluo) cxze.a.j()).ai((char) 8683)).x("Not initializing service, likely not primary account");
        }
        ((eluo) ((eluo) cxze.a.h()).ai(8684)).T("Entry under S&E status %b, %b, %b ", Boolean.valueOf(fpro.S()), Boolean.valueOf(fpro.ai()), Boolean.valueOf(fpro.R()));
        boolean d = fudd.a.lK().d();
        if (fpro.S() && fpro.ai()) {
            fpro.R();
        }
        if (d && !c) {
            aura.H(this, "com.google.android.personalsafety.settings.BleTagSettingsActivity", false);
            aura.H(this, "com.google.android.personalsafety.settings.BleTagGoogleSettingDebugActivity", false);
        }
        fucy.a.lK();
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        ausn ausnVar = cxze.a;
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        ausn ausnVar = cxze.a;
    }
}
