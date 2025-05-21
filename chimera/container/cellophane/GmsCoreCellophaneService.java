package com.google.android.gms.chimera.container.cellophane;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.chimera.ModuleContext;
import defpackage.aocy;
import defpackage.bhib;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsCoreCellophaneService extends aocy {
    @Override // defpackage.psm, defpackage.psj, android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ModuleContext moduleContext = ModuleContext.getModuleContext(this);
        if (moduleContext != null) {
            setTracer(new bhib(moduleContext, getClass(), 7));
        }
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onLowMemory() {
        super.onLowMemory();
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // defpackage.aocy, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ void onTimeout(int i) {
        super.onTimeout(i);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service, android.content.ComponentCallbacks2
    public /* bridge */ /* synthetic */ void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj, android.app.Service
    public /* bridge */ /* synthetic */ boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // defpackage.aocy, defpackage.aodc, defpackage.psm, defpackage.psj
    public /* bridge */ /* synthetic */ void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
    }
}
