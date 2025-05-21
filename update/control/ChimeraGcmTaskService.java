package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arxo;
import defpackage.asqh;
import defpackage.byiv;
import defpackage.byiw;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.dhea;
import defpackage.dhen;
import defpackage.dhfm;
import defpackage.dhfv;
import defpackage.dhfx;
import defpackage.dhgc;
import defpackage.dhge;
import defpackage.dhgg;
import defpackage.dhjs;
import defpackage.dhjt;
import defpackage.ekpk;
import defpackage.fqsy;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChimeraGcmTaskService extends GmsTaskChimeraService {
    public static final arxo a = dhjt.d("ChimeraGcmTaskService");

    public static void d(Context context) {
        byjl.a(context).d("DeviceIdle", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    public static void e(Context context) {
        a.h("Scheduling task: AutomaticUpdateFlagChanged.", new Object[0]);
        byiw byiwVar = new byiw();
        byiwVar.t("AutomaticUpdateFlagChanged");
        byiwVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        byiwVar.v(1);
        byiwVar.p = true;
        byiwVar.y(2, 2);
        byiwVar.c(new byiv(Settings.Global.getUriFor("ota_disable_automatic_update"), 0));
        byjl.a(context).f(byiwVar.b());
    }

    public static void f(Context context) {
        a.h("Scheduling task: DeviceCharging.", new Object[0]);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        bykjVar.t("DeviceCharging");
        bykjVar.e(0L, TimeUnit.DAYS.toSeconds(365L));
        bykjVar.p = false;
        bykjVar.y(2, 2);
        bykjVar.x(1, 1);
        bykjVar.v(1);
        byjl.a(context).f(bykjVar.b());
    }

    public static void g(Context context) {
        a.h("Scheduling task: DeviceIdle.", new Object[0]);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        bykjVar.t("DeviceIdle");
        bykjVar.e(0L, TimeUnit.DAYS.toSeconds(365L));
        bykjVar.p = false;
        bykjVar.y(2, 2);
        bykjVar.x(0, 0);
        bykjVar.i(true);
        bykjVar.v(1);
        byjl.a(context).f(bykjVar.b());
    }

    public static void h(Context context) {
        a.h("Scheduling task: WifiConnected.", new Object[0]);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        bykjVar.t("WifiConnected");
        bykjVar.e(0L, TimeUnit.DAYS.toSeconds(365L));
        bykjVar.p = false;
        bykjVar.y(1, 1);
        bykjVar.x(0, 0);
        bykjVar.v(1);
        byjl.a(context).f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        boolean z;
        String str = bylnVar.a;
        a.h("Task started with tag: %s.", str);
        if ("WifiNeededRetry".equals(str)) {
            dhea.a(this, new Intent());
        } else if ("DeviceIdle".equals(str)) {
            dhfv dhfvVar = (dhfv) dhfv.h.b();
            if (!((Boolean) dhfvVar.j.b(dhfv.b)).booleanValue()) {
                ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver = dhfvVar.k;
                synchronized (activeStateTrackingBroadcastReceiver.a) {
                    z = activeStateTrackingBroadcastReceiver.b;
                }
                if (z) {
                }
            }
            g(dhfvVar.i);
            if (!dhen.l()) {
                ((dhfx) dhfx.b.b()).a(5);
            }
        } else if ("DeviceCharging".equals(str)) {
            dhfm dhfmVar = (dhfm) dhfm.c.b();
            if (((Boolean) dhfmVar.e.b(dhfm.b)).booleanValue()) {
                f(dhfmVar.d);
                ((dhfx) dhfx.b.b()).a(4);
            }
        } else if ("WifiConnected".equals(str)) {
            dhgg dhggVar = (dhgg) dhgg.c.b();
            if (((Boolean) dhggVar.e.b(dhgg.b)).booleanValue()) {
                h(dhggVar.d);
                ((dhfx) dhfx.b.b()).a(3);
            }
        } else if ("LogStatus".equals(str)) {
            dhge dhgeVar = (dhge) dhge.a.b();
            dhgeVar.a();
            dhgeVar.d();
        } else if ("CheckConfigUpdate".equals(str)) {
            ((dhgc) dhgc.n.b()).f();
        } else if ("LogHeartBeat".equals(str)) {
            dhge dhgeVar2 = (dhge) dhge.a.b();
            dhjs dhjsVar = dhgeVar2.b;
            dhjsVar.f((ekpk) dhjsVar.g(9).Q());
            if (dhge.f()) {
                dhgeVar2.c();
                dhgeVar2.e(true);
            } else {
                dhgeVar2.e(false);
            }
        } else if ("AutomaticUpdateFlagChanged".equals(str)) {
            dhgc dhgcVar = (dhgc) dhgc.n.b();
            if (fqsy.c() && asqh.e()) {
                dhgcVar.q.a(110);
                e(dhgcVar.o);
            }
        }
        return 0;
    }
}
