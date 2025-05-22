package com.google.android.gms.presencemanager.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceManagerChimeraService extends Service {
    public static final /* synthetic */ int a = 0;

    static {
        ausn.b("PresenceManagerModule", auid.PRESENCE_MANAGER);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        Intent intent = new Intent("com.google.android.gms.presencemanager.NOTIFY_PRESENCE_MANAGER");
        intent.setPackage("com.google.android.apps.tv.launcherx");
        sendBroadcast(intent);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
