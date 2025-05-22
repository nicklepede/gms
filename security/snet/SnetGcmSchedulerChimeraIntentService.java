package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catf;
import defpackage.catx;
import defpackage.dbbr;
import defpackage.dbhs;
import defpackage.fptq;
import defpackage.fpvd;
import defpackage.fuoj;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetGcmSchedulerChimeraIntentService extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = "SnetGcmSchedulerChimeraIntentService";

    static {
        ausn.b(b, auid.SECURITY);
    }

    public static void a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD"));
    }

    public static void b(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD"));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN".equals(action)) {
            Intent b2 = dbbr.b(this, SnetChimeraService.class);
            b2.setAction("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR");
            startService(b2);
            return;
        }
        if ("com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD".equals(action)) {
            dbhs dbhsVar = new dbhs(this);
            TimeUnit timeUnit = TimeUnit.HOURS;
            fuoj fuojVar = fuoj.a;
            long millis = timeUnit.toMillis(fuojVar.lK().c());
            dbhsVar.g("snet_saved_wake_interval_ms", millis);
            long j = millis / 1000;
            cate cateVar = new cate();
            cateVar.j = dbbr.c(SnetNormalTaskChimeraService.class);
            cateVar.t("event_log_collector_runner");
            cateVar.p = true;
            cateVar.v(1);
            cateVar.x(0, 1);
            cateVar.y(0, 1);
            if (fpvd.i()) {
                cateVar.e(j, (long) (fptq.b() * j), catx.a);
            } else {
                cateVar.a = j;
                cateVar.b = TimeUnit.MINUTES.toSeconds(fuojVar.lK().b());
            }
            casd a2 = casd.a(this);
            if (a2 != null) {
                a2.f(cateVar.b());
                return;
            }
            return;
        }
        if ("com.google.android.gms.security.snet.ACTION_IDLE_RUN".equals(action)) {
            Intent b3 = dbbr.b(this, SnetChimeraService.class);
            b3.setAction("com.google.android.gms.security.snet.ACTION_IDLE_MODE");
            startService(b3);
            return;
        }
        if ("com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD".equals(action)) {
            long millis2 = TimeUnit.HOURS.toMillis(fuoj.a.lK().d());
            new dbhs(this).g("snet_idle_mode_gcm_interval_ms", millis2);
            long j2 = millis2 / 1000;
            cate cateVar2 = new cate();
            cateVar2.j = dbbr.c(SnetIdleTaskChimeraService.class);
            cateVar2.t("snet_idle_runner");
            cateVar2.p = true;
            cateVar2.v(1);
            cateVar2.y(2, 2);
            cateVar2.x(1, 1);
            cateVar2.i(true);
            if (fpvd.i()) {
                cateVar2.j(cata.a(j2));
            } else {
                cateVar2.a = j2;
            }
            catf b4 = cateVar2.b();
            casd a3 = casd.a(this);
            if (a3 != null) {
                a3.f(b4);
            }
        }
    }
}
