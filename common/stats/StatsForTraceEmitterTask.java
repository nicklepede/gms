package com.google.android.gms.common.stats;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fmsy;
import defpackage.fojf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class StatsForTraceEmitterTask extends GmsTaskBoundService {
    public static final /* synthetic */ int b = 0;
    private static final asot c = asot.b("StatsEmitterTask", asej.CORE);
    static final String a = StatsForTraceEmitterTask.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fmsy.d()) {
            byjl.a(this).c(a);
            ((ejhf) c.h()).x("Unable to run daily task: stats for trace emitter flag is disabled.");
            return 0;
        }
        Log.i("TraceEmit", a.D(fojf.d(), "Mobile FCM heartbeat ms: "));
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter("fcm_mobile_heartbeat_interval", fojf.d());
        }
        return 0;
    }
}
