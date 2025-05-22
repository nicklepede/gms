package com.google.android.gms.chimera.container.cellophane;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.chimera.ModuleContext;
import defpackage.aqeq;
import defpackage.bjmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsCoreCellophaneService extends aqeq {
    @Override // defpackage.rlq, defpackage.rln, android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ModuleContext moduleContext = ModuleContext.getModuleContext(this);
        if (moduleContext != null) {
            setTracer(new bjmq(moduleContext, getClass(), 7));
        }
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onLowMemory() {
        super.onLowMemory();
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // defpackage.aqeq, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ void onTimeout(int i) {
        super.onTimeout(i);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service, android.content.ComponentCallbacks2
    public /* bridge */ /* synthetic */ void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln, android.app.Service
    public /* bridge */ /* synthetic */ boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // defpackage.aqeq, defpackage.aqeu, defpackage.rlq, defpackage.rln
    public /* bridge */ /* synthetic */ void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
    }
}
