package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import defpackage.apza;
import defpackage.apzc;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AppStateIntentChimeraService extends apza {
    public static final ausn a = ausn.b("AppStateIntentService", auid.APP_STATE);
    public static final apzc b = new apzc();

    public AppStateIntentChimeraService() {
        super("AppStateIntentService", b);
    }

    @Override // defpackage.apza, defpackage.apze, android.os.Handler.Callback
    public final /* bridge */ /* synthetic */ boolean handleMessage(Message message) {
        super.handleMessage(message);
        return true;
    }

    @Override // defpackage.apza, defpackage.apze, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.apza, defpackage.apze, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
