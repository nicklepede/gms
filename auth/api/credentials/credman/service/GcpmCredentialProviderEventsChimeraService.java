package com.google.android.gms.auth.api.credentials.credman.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.jcs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GcpmCredentialProviderEventsChimeraService extends Service {
    private final jcs a = new jcs();

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
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
