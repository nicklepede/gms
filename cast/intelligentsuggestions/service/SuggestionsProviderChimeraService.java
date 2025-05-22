package com.google.android.gms.cast.intelligentsuggestions.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aoyl;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SuggestionsProviderChimeraService extends Service {
    public static final ausn a = ausn.b("device_suggestions", auid.CAST_INTELLIGENT_DEVICE_SUGGESTIONS);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Context applicationContext = getApplicationContext();
        fxxm.e(applicationContext, "getApplicationContext(...)");
        aoyl.a(applicationContext);
        ((eluo) a.h()).x("Device suggestions unavailable, stopping service.");
        stopSelf(i2);
        return 2;
    }
}
