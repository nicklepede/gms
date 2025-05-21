package com.google.android.gms.analytics.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.tkw;
import defpackage.tlb;
import defpackage.tns;
import defpackage.tny;
import defpackage.tod;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChimeraAnalyticsService extends Service {
    public tlb a;
    public tod b;

    public final tkw a() {
        return this.a.d();
    }

    public final tny b() {
        return this.a.h();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            b().u("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        b().z("onBind called. action", action);
        if ("com.google.android.gms.analytics.service.START".equals(action)) {
            return new tns(this);
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.b = tod.a(this);
        this.a = tlb.e(this);
        b().y("AnalyticsService created");
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        b().y("AnalyticsService destroyed");
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        if (intent == null) {
            b().u("onRebind called with null intent");
        } else {
            b().z("onRebind called. action", intent.getAction());
        }
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        if (intent == null) {
            b().u("onUnbind called with null intent");
            return true;
        }
        b().z("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
