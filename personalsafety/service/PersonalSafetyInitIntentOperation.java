package com.google.android.gms.personalsafety.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.cvpj;
import defpackage.cvpo;
import defpackage.cvue;
import defpackage.ejhf;
import defpackage.fmzp;
import defpackage.fmzz;
import defpackage.fnck;
import defpackage.frjb;
import defpackage.frjg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PersonalSafetyInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        asot asotVar = cvpo.a;
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        boolean z = cvpj.a(this) && fmzz.x();
        boolean z2 = fmzz.z();
        if ((z || z2) && cvue.d(getApplicationContext())) {
            Context applicationContext = getApplicationContext();
            applicationContext.startService(SndService.a(applicationContext, "com.google.android.gms.personalsafety.ACTION_INIT"));
            asot asotVar = cvpo.a;
        } else {
            asot asotVar2 = cvpo.a;
        }
        boolean c = cvue.c(getApplicationContext());
        if (fmzp.af() && c) {
            asot asotVar3 = cvpo.a;
            ((ejhf) ((ejhf) asotVar3.h()).ah((char) 8689)).x("onInitRuntimeState");
            Context applicationContext2 = getApplicationContext();
            int i2 = PersonalSafetyChimeraService.f;
            ((ejhf) ((ejhf) asotVar3.h()).ah((char) 8678)).x("Attempt to start PersonalSafetyService");
            Intent intent2 = new Intent("com.google.android.gms.personalsafety.ACTION_INIT");
            intent2.setComponent(new ComponentName(applicationContext2, "com.google.android.gms.personalsafety.service.PersonalSafetyService"));
            applicationContext2.startService(intent2);
            Context applicationContext3 = getApplicationContext();
            int i3 = PersonalSafetyLoggerService.a;
            if (fnck.a.a().z()) {
                byko bykoVar = new byko();
                bykoVar.w(PersonalSafetyLoggerService.class.getName());
                bykoVar.q("personal_safety_setting");
                bykoVar.a = bykv.j;
                bykoVar.l(false);
                bykoVar.v(2);
                byjl.a(applicationContext3).f(bykoVar.b());
            } else {
                byjl a = byjl.a(applicationContext3);
                bykm bykmVar = new bykm();
                bykmVar.w(PersonalSafetyLoggerService.class.getName());
                bykmVar.t("personal_safety_setting");
                bykmVar.x(0, 1);
                bykmVar.f(0, 1);
                bykmVar.y(2, 0);
                bykmVar.j(byki.EVERY_DAY);
                a.f(bykmVar.b());
            }
            if (fmzp.Q()) {
                if (fmzp.am()) {
                    asng.H(this, "com.google.android.personalsafety.settings.BleTagGoogleSettingDebugActivity", true);
                }
                asng.H(this, "com.google.android.personalsafety.settings.BleTagSettingsActivity", true);
            } else {
                ((ejhf) ((ejhf) asotVar3.j()).ah((char) 8690)).B("BleSettingsChimeraActivity enabled in InitIntentOperation ui main flag %b ", Boolean.valueOf(fmzp.Q()));
            }
        } else if (c) {
            ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8688)).x("Failed to initialize PersonalSafetyChimeraService, init off");
        } else {
            ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8685)).x("Not initializing service, likely not primary account");
        }
        ((ejhf) ((ejhf) cvpo.a.h()).ah(8686)).T("Entry under S&E status %b, %b, %b ", Boolean.valueOf(fmzp.Q()), Boolean.valueOf(fmzp.af()), Boolean.valueOf(fmzp.P()));
        boolean c2 = frjg.a.a().c();
        if (fmzp.Q() && fmzp.af()) {
            fmzp.P();
        }
        if (c2 && !c) {
            asng.H(this, "com.google.android.personalsafety.settings.BleTagSettingsActivity", false);
            asng.H(this, "com.google.android.personalsafety.settings.BleTagGoogleSettingDebugActivity", false);
        }
        frjb.a.a();
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        asot asotVar = cvpo.a;
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        asot asotVar = cvpo.a;
    }
}
