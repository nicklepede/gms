package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auad;
import defpackage.auub;
import defpackage.carn;
import defpackage.caro;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.djpg;
import defpackage.djpt;
import defpackage.djqs;
import defpackage.djrb;
import defpackage.djrd;
import defpackage.djri;
import defpackage.djrk;
import defpackage.djrm;
import defpackage.djuy;
import defpackage.djuz;
import defpackage.encw;
import defpackage.ftmx;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ChimeraGcmTaskService extends GmsTaskChimeraService {
    public static final auad a = djuz.d("ChimeraGcmTaskService");

    public static void d(Context context) {
        casd.a(context).d("DeviceIdle", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    public static void e(Context context) {
        a.h("Scheduling task: AutomaticUpdateFlagChanged.", new Object[0]);
        caro caroVar = new caro();
        caroVar.t("AutomaticUpdateFlagChanged");
        caroVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        caroVar.v(1);
        caroVar.p = true;
        caroVar.y(2, 2);
        caroVar.c(new carn(Settings.Global.getUriFor("ota_disable_automatic_update"), 0));
        casd.a(context).f(caroVar.b());
    }

    public static void f(Context context) {
        a.h("Scheduling task: DeviceCharging.", new Object[0]);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        catbVar.t("DeviceCharging");
        catbVar.e(0L, TimeUnit.DAYS.toSeconds(365L));
        catbVar.p = false;
        catbVar.y(2, 2);
        catbVar.x(1, 1);
        catbVar.v(1);
        casd.a(context).f(catbVar.b());
    }

    public static void g(Context context) {
        a.h("Scheduling task: DeviceIdle.", new Object[0]);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        catbVar.t("DeviceIdle");
        catbVar.e(0L, TimeUnit.DAYS.toSeconds(365L));
        catbVar.p = false;
        catbVar.y(2, 2);
        catbVar.x(0, 0);
        catbVar.i(true);
        catbVar.v(1);
        casd.a(context).f(catbVar.b());
    }

    public static void h(Context context) {
        a.h("Scheduling task: WifiConnected.", new Object[0]);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        catbVar.t("WifiConnected");
        catbVar.e(0L, TimeUnit.DAYS.toSeconds(365L));
        catbVar.p = false;
        catbVar.y(1, 1);
        catbVar.x(0, 0);
        catbVar.v(1);
        casd.a(context).f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        boolean z;
        String str = caufVar.a;
        a.h("Task started with tag: %s.", str);
        if ("WifiNeededRetry".equals(str)) {
            djpg.a(this, new Intent());
        } else if ("DeviceIdle".equals(str)) {
            djrb djrbVar = (djrb) djrb.h.b();
            if (!((Boolean) djrbVar.j.b(djrb.b)).booleanValue()) {
                ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver = djrbVar.k;
                synchronized (activeStateTrackingBroadcastReceiver.a) {
                    z = activeStateTrackingBroadcastReceiver.b;
                }
                if (z) {
                }
            }
            g(djrbVar.i);
            if (!djpt.l()) {
                ((djrd) djrd.b.b()).a(5);
            }
        } else if ("DeviceCharging".equals(str)) {
            djqs djqsVar = (djqs) djqs.c.b();
            if (((Boolean) djqsVar.e.b(djqs.b)).booleanValue()) {
                f(djqsVar.d);
                ((djrd) djrd.b.b()).a(4);
            }
        } else if ("WifiConnected".equals(str)) {
            djrm djrmVar = (djrm) djrm.c.b();
            if (((Boolean) djrmVar.e.b(djrm.b)).booleanValue()) {
                h(djrmVar.d);
                ((djrd) djrd.b.b()).a(3);
            }
        } else if ("LogStatus".equals(str)) {
            djrk djrkVar = (djrk) djrk.a.b();
            djrkVar.a();
            djrkVar.d();
        } else if ("CheckConfigUpdate".equals(str)) {
            ((djri) djri.n.b()).f();
        } else if ("LogHeartBeat".equals(str)) {
            djrk djrkVar2 = (djrk) djrk.a.b();
            djuy djuyVar = djrkVar2.b;
            djuyVar.f((encw) djuyVar.g(9).Q());
            if (djrk.f()) {
                djrkVar2.c();
                djrkVar2.e(true);
            } else {
                djrkVar2.e(false);
            }
        } else if ("AutomaticUpdateFlagChanged".equals(str)) {
            djri djriVar = (djri) djri.n.b();
            if (ftmx.c() && auub.e()) {
                djriVar.q.a(110);
                e(djriVar.o);
            }
        }
        return 0;
    }
}
