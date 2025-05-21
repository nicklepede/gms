package com.google.android.gms.analytics;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.deqr;
import defpackage.tlb;
import defpackage.tlw;
import defpackage.tny;
import defpackage.toe;
import defpackage.toh;
import defpackage.toi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ChimeraAnalyticsService extends Service implements toh {
    private toi a;

    private final toi b() {
        if (this.a == null) {
            this.a = new toi(this);
        }
        return this.a;
    }

    @Override // defpackage.toh
    public final boolean fY(int i) {
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
        final toi b = b();
        try {
            synchronized (toe.a) {
                deqr deqrVar = toe.b;
                if (deqrVar != null && deqrVar.l()) {
                    deqrVar.g();
                }
            }
        } catch (SecurityException unused) {
        }
        tlb e = tlb.e(b.b);
        final tny h = e.h();
        if (intent == null) {
            h.B("AnalyticsService started with null intent");
            return 2;
        }
        tlw tlwVar = e.d;
        String action = intent.getAction();
        h.A("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            return 2;
        }
        b.c(new Runnable() { // from class: tof
            @Override // java.lang.Runnable
            public final void run() {
                if (((toh) toi.this.b).fY(i2)) {
                    h.y("Local AnalyticsService processed last dispatch request");
                }
            }
        });
        return 2;
    }
}
