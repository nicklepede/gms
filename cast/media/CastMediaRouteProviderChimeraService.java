package com.google.android.gms.cast.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.apbo;
import defpackage.appp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CastMediaRouteProviderChimeraService extends Service {
    private final appp a = new appp("CastMRPService");
    private final apbo b = new apbo();

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.b.attachBaseContext(context);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        this.a.n("onBind %s", intent);
        return this.b.onBind(intent);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a.m("onCreate");
        this.b.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.a.m("onDestroy");
        this.b.onDestroy();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.b.onStartCommand(intent, i, i2);
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        this.a.n("onUnbind %s", intent);
        return this.b.onUnbind(intent);
    }
}
