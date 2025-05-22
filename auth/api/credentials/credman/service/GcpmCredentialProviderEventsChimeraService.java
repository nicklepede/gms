package com.google.android.gms.auth.api.credentials.credman.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.yun;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GcpmCredentialProviderEventsChimeraService extends Service {
    private final yun a = new yun();

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a.attachBaseContext(context);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.a.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        this.a.onRebind(intent);
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return this.a.onUnbind(intent);
    }
}
