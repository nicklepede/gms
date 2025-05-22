package com.google.android.gms.smartdevice.quickstart;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.auad;
import defpackage.dghl;
import defpackage.dghn;
import defpackage.dgyt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RemoteLockscreenValidationChimeraService extends Service {
    private static final auad b = new dgyt(new String[]{"RemoteLockscreenValidationChimeraService"});
    public dghn a;
    private dghl c;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        b.d("onBind", new Object[0]);
        return this.c.onBind(intent);
    }

    @Override // com.google.android.chimera.Service
    public final void onConfigurationChanged(Configuration configuration) {
        this.c.onConfigurationChanged(configuration);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.c = new dghl(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.c.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onLowMemory() {
        this.c.onLowMemory();
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        this.c.onRebind(intent);
    }

    @Override // com.google.android.chimera.Service
    public final void onStart(Intent intent, int i) {
        this.c.onStart(intent, i);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.c.onStartCommand(intent, i, i2);
    }

    @Override // com.google.android.chimera.Service
    public final void onTaskRemoved(Intent intent) {
        this.c.onTaskRemoved(intent);
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return this.c.onUnbind(intent);
    }
}
