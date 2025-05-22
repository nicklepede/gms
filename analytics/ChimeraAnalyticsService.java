package com.google.android.gms.analytics;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.dhbu;
import defpackage.vhb;
import defpackage.vhw;
import defpackage.vjy;
import defpackage.vke;
import defpackage.vkh;
import defpackage.vki;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ChimeraAnalyticsService extends Service implements vkh {
    private vki a;

    private final vki b() {
        if (this.a == null) {
            this.a = new vki(this);
        }
        return this.a;
    }

    @Override // defpackage.vkh
    public final boolean gn(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        b();
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        b().a();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        b().b();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        final vki b = b();
        try {
            synchronized (vke.a) {
                dhbu dhbuVar = vke.b;
                if (dhbuVar != null && dhbuVar.l()) {
                    dhbuVar.g();
                }
            }
        } catch (SecurityException unused) {
        }
        vhb e = vhb.e(b.b);
        final vjy h = e.h();
        if (intent == null) {
            h.B("AnalyticsService started with null intent");
            return 2;
        }
        vhw vhwVar = e.d;
        String action = intent.getAction();
        h.A("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            return 2;
        }
        b.c(new Runnable() { // from class: vkf
            @Override // java.lang.Runnable
            public final void run() {
                if (((vkh) vki.this.b).gn(i2)) {
                    h.y("Local AnalyticsService processed last dispatch request");
                }
            }
        });
        return 2;
    }
}
