package com.google.android.gms.common.stats;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fpkw;
import defpackage.frbw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class StatsForTraceEmitterTask extends GmsTaskBoundService {
    public static final /* synthetic */ int b = 0;
    private static final ausn c = ausn.b("StatsEmitterTask", auid.CORE);
    static final String a = StatsForTraceEmitterTask.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fpkw.d()) {
            casd.a(this).c(a);
            ((eluo) c.h()).x("Unable to run daily task: stats for trace emitter flag is disabled.");
            return 0;
        }
        Log.i("TraceEmit", a.C(frbw.d(), "Mobile FCM heartbeat ms: "));
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter("fcm_mobile_heartbeat_interval", frbw.d());
        }
        return 0;
    }
}
