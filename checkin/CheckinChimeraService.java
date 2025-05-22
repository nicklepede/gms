package com.google.android.gms.checkin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.apsc;
import defpackage.apst;
import defpackage.aptt;
import defpackage.apui;
import defpackage.apuv;
import defpackage.auad;
import defpackage.auio;
import defpackage.auqz;
import defpackage.aura;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.carn;
import defpackage.caro;
import defpackage.casd;
import defpackage.cate;
import defpackage.catf;
import defpackage.caud;
import defpackage.cauf;
import defpackage.dhcb;
import defpackage.dozb;
import defpackage.ekvk;
import defpackage.ekww;
import defpackage.fovh;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CheckinChimeraService extends GmsTaskChimeraService {
    public static final auad a = apuv.a("CheckinChimeraService");
    private final Object b = new Object();
    private aptt c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ImposeReceiver extends dhcb {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            CheckinChimeraService.a.j("launching from ImposeReceiver: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
            CheckinChimeraService.e(6, intent);
            ekww ekwwVar = bsxv.a;
            bsxr.a(auio.CHECKIN_INTENT_BROADCAST);
            auqz auqzVar = aura.a;
            CheckinIntentOperation.a(context, false, 10, false, true, intent);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SecretCodeReceiver extends dhcb {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            CheckinChimeraService.e(5, intent);
            ekww ekwwVar = bsxv.a;
            bsxr.a(auio.CHECKIN_INTENT_BROADCAST);
            CheckinIntentOperation.a(context, true, 8, false, true, intent);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class TriggerReceiver extends dhcb {
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
        @Override // com.google.android.chimera.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onReceive(android.content.Context r10, android.content.Intent r11) {
            /*
                Method dump skipped, instructions count: 256
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.checkin.CheckinChimeraService.TriggerReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    static void d(Context context) {
        casd a2 = casd.a(context);
        Bundle h = h();
        a2.f(g(h, false, context));
        a2.f(f(h));
    }

    public static void e(int i, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        apsc.j((i << 4) | 1 | ((action == null ? 1 : "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) ? 3 : "android.net.conn.CONNECTIVITY_CHANGE".equals(action) ? 4 : "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED".equals(action) ? 5 : "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action) ? 7 : "com.google.android.c2dm.intent.RECEIVE".equals(action) ? 6 : "android.app.action.DEVICE_OWNER_CHANGED".equals(action) ? 8 : "android.intent.action.SIM_STATE_CHANGED".equals(action) ? 9 : 2) << 8));
    }

    static caud f(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new carn(Uri.parse("content://com.google.android.gsf.gservices"), 1));
        caro caroVar = new caro();
        caroVar.t("GServicesObserverTaskTag");
        caroVar.v(1);
        caroVar.j = "com.google.android.gms.checkin.CheckinService";
        caroVar.p = false;
        caroVar.y(0, 0);
        caroVar.x(0, 0);
        caroVar.i(false);
        caroVar.d(arrayList);
        caroVar.u = bundle;
        return caroVar.b();
    }

    static catf g(Bundle bundle, boolean z, Context context) {
        long c = dozb.c(context.getContentResolver(), "checkin_interval", 43200L);
        long min = Math.min(dozb.c(context.getContentResolver(), "checkin_interval_flex_sec", 10800L), c);
        SharedPreferences.Editor edit = apst.c(context).edit();
        edit.putLong("CheckinInterval_IntervalSeconds", c);
        edit.putLong("CheckinInterval_FlexSec", min);
        edit.apply();
        cate cateVar = new cate();
        cateVar.t("PeriodicTaskTag");
        cateVar.u(z);
        cateVar.j = "com.google.android.gms.checkin.CheckinService";
        cateVar.p = true;
        cateVar.y(0, 0);
        cateVar.x(0, 0);
        cateVar.i(false);
        cateVar.a = c;
        cateVar.b = min;
        cateVar.u = bundle;
        return cateVar.b();
    }

    private static Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("CheckinService_onStart_showNotification", false);
        bundle.putInt("CheckinService_onStart_checkinReason", 8);
        return bundle;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        a.d("onRunTask with tag: ".concat(str), new Object[0]);
        Bundle bundle = caufVar.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("checkin_task_tag", str);
        if (!"GServicesObserverTaskTag".equals(str)) {
            Intent a2 = apui.a(this, bundle);
            getApplicationContext();
            ekww ekwwVar = bsxv.a;
            bsxr.a(auio.CHECKIN_SCHEDULED_TASK);
            int i = dhcb.c;
            WakefulBroadcastReceiver.startWakefulService(this, a2);
            return 0;
        }
        SharedPreferences c = apst.c(this);
        long j = c.getLong("CheckinInterval_IntervalSeconds", 0L);
        long j2 = c.getLong("CheckinInterval_FlexSec", 0L);
        long c2 = dozb.c(getContentResolver(), "checkin_interval", j);
        long c3 = dozb.c(getContentResolver(), "checkin_interval_flex_sec", j2);
        if (j != c2 || j2 != c3) {
            casd.a(this).f(g(null, true, this));
        }
        if (!fovh.a.lK().d()) {
            return 1;
        }
        casd.a(this).f(f(h()));
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        a.d("onInitializeTasks", new Object[0]);
        d(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            a.j("onBind: ".concat(String.valueOf(intent.getAction())), new Object[0]);
            if (ekvk.b(intent.getAction()).equals("com.google.android.gms.checkin.BIND_TO_SERVICE")) {
                aptt apttVar = this.c;
                apttVar.asBinder();
                return apttVar;
            }
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) || "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                return super.onBind(intent);
            }
        }
        a.m("onBind is called with an unexpected intent, returning null.", new Object[0]);
        return null;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = new aptt(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        synchronized (this.b) {
        }
        super.onDestroy();
    }
}
