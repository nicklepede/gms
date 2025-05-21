package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.deqr;
import defpackage.tlb;
import defpackage.tlw;
import defpackage.tny;
import defpackage.toe;
import defpackage.toi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ChimeraAnalyticsReceiver extends BroadcastReceiver {
    private toe b;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b == null) {
            this.b = new toe();
        }
        tlb e = tlb.e(context);
        tny h = e.h();
        if (intent == null) {
            h.B("AnalyticsReceiver called with null intent");
            return;
        }
        tlw tlwVar = e.d;
        String action = intent.getAction();
        h.z("Device AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean d = toi.d(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (toe.a) {
                context.startService(intent2);
                if (d) {
                    try {
                        if (toe.b == null) {
                            toe.b = new deqr(context, 1, "Analytics WakeLock");
                            toe.b.j(false);
                        }
                        toe.b.c(1000L);
                    } catch (SecurityException unused) {
                        h.B("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
