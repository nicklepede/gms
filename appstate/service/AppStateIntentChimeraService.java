package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import defpackage.anxi;
import defpackage.anxk;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AppStateIntentChimeraService extends anxi {
    public static final asot a = asot.b("AppStateIntentService", asej.APP_STATE);
    public static final anxk b = new anxk();

    public AppStateIntentChimeraService() {
        super("AppStateIntentService", b);
    }

    @Override // defpackage.anxi, defpackage.anxm, android.os.Handler.Callback
    public final /* bridge */ /* synthetic */ boolean handleMessage(Message message) {
        super.handleMessage(message);
        return true;
    }

    @Override // defpackage.anxi, defpackage.anxm, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.anxi, defpackage.anxm, com.google.android.chimera.Service
    public final /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
