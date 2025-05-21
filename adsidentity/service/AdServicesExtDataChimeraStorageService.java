package com.google.android.gms.adsidentity.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.tdp;
import defpackage.tec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdServicesExtDataChimeraStorageService extends Service {
    tec a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return this.a.onBind(intent);
        } catch (RuntimeException e) {
            AppContextProvider.a();
            tdp.b(tdp.a(currentTimeMillis, System.currentTimeMillis(), 3, 4));
            throw e;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new tec();
    }
}
