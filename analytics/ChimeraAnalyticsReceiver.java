package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.dhbu;
import defpackage.vhb;
import defpackage.vhw;
import defpackage.vjy;
import defpackage.vke;
import defpackage.vki;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ChimeraAnalyticsReceiver extends BroadcastReceiver {
    private vke b;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b == null) {
            this.b = new vke();
        }
        vhb e = vhb.e(context);
        vjy h = e.h();
        if (intent == null) {
            h.B("AnalyticsReceiver called with null intent");
            return;
        }
        vhw vhwVar = e.d;
        String action = intent.getAction();
        h.z("Device AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean d = vki.d(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (vke.a) {
                context.startService(intent2);
                if (d) {
                    try {
                        if (vke.b == null) {
                            vke.b = new dhbu(context, 1, "Analytics WakeLock");
                            vke.b.j(false);
                        }
                        vke.b.c(1000L);
                    } catch (SecurityException unused) {
                        h.B("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
