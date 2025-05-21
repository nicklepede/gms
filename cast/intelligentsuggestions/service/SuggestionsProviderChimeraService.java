package com.google.android.gms.cast.intelligentsuggestions.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.amxa;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fvbo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class SuggestionsProviderChimeraService extends Service {
    public static final asot a = asot.b("device_suggestions", asej.CAST_INTELLIGENT_DEVICE_SUGGESTIONS);
    public final List b = new ArrayList();
    public final Map c = new LinkedHashMap();

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        getApplicationContext();
        this.c.clear();
        this.b.clear();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Context applicationContext = getApplicationContext();
        fvbo.e(applicationContext, "getApplicationContext(...)");
        amxa.a(applicationContext);
        ((ejhf) a.h()).x("Device suggestions unavailable, stopping service.");
        stopSelf(i2);
        return 2;
    }
}
