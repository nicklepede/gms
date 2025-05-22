package com.google.android.gms.analytics.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.vgw;
import defpackage.vhb;
import defpackage.vjs;
import defpackage.vjy;
import defpackage.vkd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChimeraAnalyticsService extends Service {
    public vhb a;
    public vkd b;

    public final vgw a() {
        return this.a.d();
    }

    public final vjy b() {
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
            return new vjs(this);
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.b = vkd.a(this);
        this.a = vhb.e(this);
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
