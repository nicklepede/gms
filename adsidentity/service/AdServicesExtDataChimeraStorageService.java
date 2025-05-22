package com.google.android.gms.adsidentity.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.uzp;
import defpackage.vac;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdServicesExtDataChimeraStorageService extends Service {
    vac a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return this.a.onBind(intent);
        } catch (RuntimeException e) {
            AppContextProvider.a();
            uzp.b(uzp.a(currentTimeMillis, System.currentTimeMillis(), 3, 4));
            throw e;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new vac();
    }
}
