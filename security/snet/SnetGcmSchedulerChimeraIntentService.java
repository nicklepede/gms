package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.bykn;
import defpackage.bylf;
import defpackage.cyrt;
import defpackage.cyxu;
import defpackage.fnbr;
import defpackage.fnde;
import defpackage.frtq;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SnetGcmSchedulerChimeraIntentService extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = "SnetGcmSchedulerChimeraIntentService";

    static {
        asot.b(b, asej.SECURITY);
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
            Intent b2 = cyrt.b(this, SnetChimeraService.class);
            b2.setAction("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR");
            startService(b2);
            return;
        }
        if ("com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD".equals(action)) {
            cyxu cyxuVar = new cyxu(this);
            long millis = TimeUnit.HOURS.toMillis(frtq.a.a().c());
            cyxuVar.g("snet_saved_wake_interval_ms", millis);
            long j = millis / 1000;
            bykm bykmVar = new bykm();
            bykmVar.j = cyrt.c(SnetNormalTaskChimeraService.class);
            bykmVar.t("event_log_collector_runner");
            bykmVar.p = true;
            bykmVar.v(1);
            bykmVar.x(0, 1);
            bykmVar.y(0, 1);
            if (fnde.i()) {
                bykmVar.e(j, (long) (fnbr.b() * j), bylf.a);
            } else {
                bykmVar.a = j;
                bykmVar.b = TimeUnit.MINUTES.toSeconds(frtq.a.a().b());
            }
            byjl a2 = byjl.a(this);
            if (a2 != null) {
                a2.f(bykmVar.b());
                return;
            }
            return;
        }
        if ("com.google.android.gms.security.snet.ACTION_IDLE_RUN".equals(action)) {
            Intent b3 = cyrt.b(this, SnetChimeraService.class);
            b3.setAction("com.google.android.gms.security.snet.ACTION_IDLE_MODE");
            startService(b3);
            return;
        }
        if ("com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD".equals(action)) {
            long millis2 = TimeUnit.HOURS.toMillis(frtq.a.a().d());
            new cyxu(this).g("snet_idle_mode_gcm_interval_ms", millis2);
            long j2 = millis2 / 1000;
            bykm bykmVar2 = new bykm();
            bykmVar2.j = cyrt.c(SnetIdleTaskChimeraService.class);
            bykmVar2.t("snet_idle_runner");
            bykmVar2.p = true;
            bykmVar2.v(1);
            bykmVar2.y(2, 2);
            bykmVar2.x(1, 1);
            bykmVar2.i(true);
            if (fnde.i()) {
                bykmVar2.j(byki.a(j2));
            } else {
                bykmVar2.a = j2;
            }
            bykn b4 = bykmVar2.b();
            byjl a3 = byjl.a(this);
            if (a3 != null) {
                a3.f(b4);
            }
        }
    }
}
