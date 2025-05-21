package com.google.android.gms.checkin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.anqk;
import defpackage.anrb;
import defpackage.ansb;
import defpackage.ansq;
import defpackage.antd;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asnf;
import defpackage.asng;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byiv;
import defpackage.byiw;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.bykn;
import defpackage.byll;
import defpackage.byln;
import defpackage.deqy;
import defpackage.dmnn;
import defpackage.eiif;
import defpackage.eijr;
import defpackage.fmdv;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CheckinChimeraService extends GmsTaskChimeraService {
    public static final arxo a = antd.a("CheckinChimeraService");
    private final Object b = new Object();
    private ansb c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ImposeReceiver extends deqy {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            CheckinChimeraService.a.j("launching from ImposeReceiver: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
            CheckinChimeraService.e(6, intent);
            eijr eijrVar = bqqe.a;
            bqqa.a(aseu.CHECKIN_INTENT_BROADCAST);
            asnf asnfVar = asng.a;
            CheckinIntentOperation.a(context, false, 10, false, true, intent);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class SecretCodeReceiver extends deqy {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            CheckinChimeraService.e(5, intent);
            eijr eijrVar = bqqe.a;
            bqqa.a(aseu.CHECKIN_INTENT_BROADCAST);
            CheckinIntentOperation.a(context, true, 8, false, true, intent);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class TriggerReceiver extends deqy {
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
        @Override // com.google.android.chimera.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onReceive(android.content.Context r14, android.content.Intent r15) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.checkin.CheckinChimeraService.TriggerReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    static void d(Context context) {
        byjl a2 = byjl.a(context);
        Bundle h = h();
        a2.f(g(h, false, context));
        a2.f(f(h));
    }

    public static void e(int i, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        anqk.j((i << 4) | 1 | ((action == null ? 1 : "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) ? 3 : "android.net.conn.CONNECTIVITY_CHANGE".equals(action) ? 4 : "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED".equals(action) ? 5 : "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action) ? 7 : "com.google.android.c2dm.intent.RECEIVE".equals(action) ? 6 : "android.app.action.DEVICE_OWNER_CHANGED".equals(action) ? 8 : "android.intent.action.SIM_STATE_CHANGED".equals(action) ? 9 : 2) << 8));
    }

    static byll f(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new byiv(Uri.parse("content://com.google.android.gsf.gservices"), 1));
        byiw byiwVar = new byiw();
        byiwVar.t("GServicesObserverTaskTag");
        byiwVar.v(1);
        byiwVar.j = "com.google.android.gms.checkin.CheckinService";
        byiwVar.p = false;
        byiwVar.y(0, 0);
        byiwVar.x(0, 0);
        byiwVar.i(false);
        byiwVar.d(arrayList);
        byiwVar.u = bundle;
        return byiwVar.b();
    }

    static bykn g(Bundle bundle, boolean z, Context context) {
        long c = dmnn.c(context.getContentResolver(), "checkin_interval", 43200L);
        long min = Math.min(dmnn.c(context.getContentResolver(), "checkin_interval_flex_sec", 10800L), c);
        SharedPreferences.Editor edit = anrb.c(context).edit();
        edit.putLong("CheckinInterval_IntervalSeconds", c);
        edit.putLong("CheckinInterval_FlexSec", min);
        edit.apply();
        bykm bykmVar = new bykm();
        bykmVar.t("PeriodicTaskTag");
        bykmVar.u(z);
        bykmVar.j = "com.google.android.gms.checkin.CheckinService";
        bykmVar.p = true;
        bykmVar.y(0, 0);
        bykmVar.x(0, 0);
        bykmVar.i(false);
        bykmVar.a = c;
        bykmVar.b = min;
        bykmVar.u = bundle;
        return bykmVar.b();
    }

    private static Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("CheckinService_onStart_showNotification", false);
        bundle.putInt("CheckinService_onStart_checkinReason", 8);
        return bundle;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        a.d("onRunTask with tag: ".concat(str), new Object[0]);
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("checkin_task_tag", str);
        if (!"GServicesObserverTaskTag".equals(str)) {
            Intent a2 = ansq.a(this, bundle);
            getApplicationContext();
            eijr eijrVar = bqqe.a;
            bqqa.a(aseu.CHECKIN_SCHEDULED_TASK);
            int i = deqy.c;
            WakefulBroadcastReceiver.startWakefulService(this, a2);
            return 0;
        }
        SharedPreferences c = anrb.c(this);
        long j = c.getLong("CheckinInterval_IntervalSeconds", 0L);
        long j2 = c.getLong("CheckinInterval_FlexSec", 0L);
        long c2 = dmnn.c(getContentResolver(), "checkin_interval", j);
        long c3 = dmnn.c(getContentResolver(), "checkin_interval_flex_sec", j2);
        if (j != c2 || j2 != c3) {
            byjl.a(this).f(g(null, true, this));
        }
        if (!fmdv.a.a().d()) {
            return 1;
        }
        byjl.a(this).f(f(h()));
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        a.d("onInitializeTasks", new Object[0]);
        d(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            a.j("onBind: ".concat(String.valueOf(intent.getAction())), new Object[0]);
            if (eiif.b(intent.getAction()).equals("com.google.android.gms.checkin.BIND_TO_SERVICE")) {
                ansb ansbVar = this.c;
                ansbVar.asBinder();
                return ansbVar;
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
        this.c = new ansb(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        synchronized (this.b) {
        }
        super.onDestroy();
    }
}
