package com.google.android.gms.mdm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.mdm.receivers.GoogleAccountsAddedChimeraReceiver;
import com.google.android.gms.mdm.receivers.LockscreenChimeraReceiver;
import com.google.android.gms.mdm.services.LockscreenMessageChimeraService;
import com.google.android.gms.mdm.services.QrlLoggerService;
import defpackage.apzs;
import defpackage.aswd;
import defpackage.aura;
import defpackage.aury;
import defpackage.ausn;
import defpackage.bgfk;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.cfcc;
import defpackage.cfcd;
import defpackage.cfcf;
import defpackage.cfcv;
import defpackage.cfcw;
import defpackage.cfdc;
import defpackage.cfde;
import defpackage.cfgo;
import defpackage.cfiv;
import defpackage.cxyy;
import defpackage.dpya;
import defpackage.fpuj;
import defpackage.funx;
import defpackage.fuos;
import defpackage.fuow;
import defpackage.thb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FmdModuleInitIntentOperation extends apzs {
    private final void e() {
        if (funx.l()) {
            cfcc.a(casd.a(this));
        } else if (funx.i() && funx.j()) {
            casd a = casd.a(this);
            ausn ausnVar = cfcc.a;
            if (fpuj.a.lK().A()) {
                catg catgVar = new catg();
                catgVar.w(LogFmdEnabledBoundService.class.getName());
                catgVar.q("log_fmd_settings_task");
                catgVar.a = catn.l;
                catgVar.v(2);
                catgVar.l(false);
                a.f(catgVar.b());
            } else {
                cate cateVar = new cate();
                cateVar.q("log_fmd_settings_task");
                cateVar.w(LogFmdEnabledBoundService.class.getName());
                cateVar.j(cata.EVERY_7_DAYS);
                cateVar.v(2);
                a.f(cateVar.b());
            }
        }
        if (!new cfgo(this).d()) {
            f(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity");
            f(this, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity");
            f(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
            return;
        }
        cfcc.b(aswd.a, new bgfk(this), this);
        g(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity");
        f(this, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity");
        if (cfgo.f(this)) {
            g(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
            int i = QrlLoggerService.a;
            catg catgVar2 = new catg();
            catgVar2.w(QrlLoggerService.class.getName());
            catgVar2.q("qrl_logging");
            catgVar2.a = catn.j;
            catgVar2.l(false);
            catgVar2.v(2);
            casd.a(this).f(catgVar2.b());
            if (fuow.k()) {
                cfcv cfcvVar = cfcw.n;
                if (fuow.k()) {
                    Boolean bool = (Boolean) cfcvVar.a.c();
                    boolean z = bool == null;
                    boolean q = z ? fuow.q() : bool.booleanValue();
                    if (fuow.s()) {
                        cxyy.c(this, "remote_lock_setting", q);
                    } else {
                        cxyy.b(this, "remote_lock_setting", q, z);
                    }
                }
            }
        } else {
            f(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
        }
        if (aury.c(this)) {
            return;
        }
        cfiv.c(this, true);
    }

    private static final void f(Context context, String str) {
        if (aura.a(context, str) != 2) {
            aura.H(context, str, false);
        }
    }

    private static final void g(Context context, String str) {
        if (aura.a(context, str) != 1) {
            aura.H(context, str, true);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if ((i & 4) != 0 || (i & 8) != 0) {
            cfcd.a(this);
            ausn ausnVar = cfcc.a;
            cfcw.k.e();
            int i2 = thb.a;
            GoogleAccountsAddedChimeraReceiver.b();
            e();
            return;
        }
        if ((i & 2) == 0) {
            if ((i & 1) != 0) {
                cfdc.a(this);
                return;
            }
            return;
        }
        if (dpya.j()) {
            LockscreenMessageChimeraService.b(this);
        } else {
            cfdc.a(this);
        }
        long longValue = ((Long) cfcw.j.c()).longValue();
        if (longValue > 0) {
            cfde.c(this, longValue);
        }
        cfcd.a(this);
        e();
        if (dpya.j() && fuos.i()) {
            LockscreenChimeraReceiver.b(this, cfcf.a());
        }
    }
}
