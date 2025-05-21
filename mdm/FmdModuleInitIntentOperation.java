package com.google.android.gms.mdm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.mdm.receivers.GoogleAccountsAddedChimeraReceiver;
import com.google.android.gms.mdm.receivers.LockscreenChimeraReceiver;
import com.google.android.gms.mdm.services.LockscreenMessageChimeraService;
import com.google.android.gms.mdm.services.QrlLoggerService;
import defpackage.anya;
import defpackage.aqto;
import defpackage.asng;
import defpackage.asoe;
import defpackage.asot;
import defpackage.bedy;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.ccti;
import defpackage.cctj;
import defpackage.cctl;
import defpackage.ccub;
import defpackage.ccuc;
import defpackage.ccui;
import defpackage.ccuk;
import defpackage.ccxq;
import defpackage.cczv;
import defpackage.cvpi;
import defpackage.dnnr;
import defpackage.fnck;
import defpackage.frte;
import defpackage.frty;
import defpackage.fruc;
import defpackage.rnx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FmdModuleInitIntentOperation extends anya {
    private final void e() {
        if (frte.l()) {
            ccti.a(byjl.a(this));
        } else if (frte.i() && frte.j()) {
            byjl a = byjl.a(this);
            asot asotVar = ccti.a;
            if (fnck.a.a().A()) {
                byko bykoVar = new byko();
                bykoVar.w(LogFmdEnabledBoundService.class.getName());
                bykoVar.q("log_fmd_settings_task");
                bykoVar.a = bykv.l;
                bykoVar.v(2);
                bykoVar.l(false);
                a.f(bykoVar.b());
            } else {
                bykm bykmVar = new bykm();
                bykmVar.q("log_fmd_settings_task");
                bykmVar.w(LogFmdEnabledBoundService.class.getName());
                bykmVar.j(byki.EVERY_7_DAYS);
                bykmVar.v(2);
                a.f(bykmVar.b());
            }
        }
        if (!new ccxq(this).d()) {
            f(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity");
            f(this, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity");
            f(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
            return;
        }
        ccti.b(aqto.a, new bedy(this), this);
        g(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity");
        f(this, "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity");
        if (ccxq.f(this)) {
            g(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
            int i = QrlLoggerService.a;
            byko bykoVar2 = new byko();
            bykoVar2.w(QrlLoggerService.class.getName());
            bykoVar2.q("qrl_logging");
            bykoVar2.a = bykv.j;
            bykoVar2.l(false);
            bykoVar2.v(2);
            byjl.a(this).f(bykoVar2.b());
            if (fruc.l()) {
                ccub ccubVar = ccuc.o;
                if (fruc.l()) {
                    Boolean bool = (Boolean) ccubVar.a.c();
                    boolean z = bool == null;
                    boolean s = z ? fruc.s() : bool.booleanValue();
                    if (fruc.u()) {
                        cvpi.c(this, "remote_lock_setting", s);
                    } else {
                        cvpi.b(this, "remote_lock_setting", s, z);
                    }
                }
            }
        } else {
            f(this, "com.google.android.gms.mdm.settings.QrlSettingsActivity");
        }
        if (asoe.c(this)) {
            return;
        }
        cczv.c(this, true);
    }

    private static final void f(Context context, String str) {
        if (asng.a(context, str) != 2) {
            asng.H(context, str, false);
        }
    }

    private static final void g(Context context, String str) {
        if (asng.a(context, str) != 1) {
            asng.H(context, str, true);
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 4) != 0 || (i & 8) != 0) {
            cctj.a(this);
            asot asotVar = ccti.a;
            ccuc.k.e();
            int i2 = rnx.a;
            GoogleAccountsAddedChimeraReceiver.b();
            e();
            return;
        }
        if ((i & 2) == 0) {
            if ((i & 1) != 0) {
                ccui.a(this);
                return;
            }
            return;
        }
        if (dnnr.j()) {
            LockscreenMessageChimeraService.b(this);
        } else {
            ccui.a(this);
        }
        long longValue = ((Long) ccuc.j.c()).longValue();
        if (longValue > 0) {
            ccuk.c(this, longValue);
        }
        cctj.a(this);
        e();
        if (dnnr.j() && frty.i()) {
            LockscreenChimeraReceiver.b(this, cctl.a());
        }
    }
}
