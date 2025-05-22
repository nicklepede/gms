package com.google.android.gms.adid.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.ads.identifier.internal.c;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdvertisingIdChimeraService extends Service {
    private c a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        c cVar = this.a;
        cVar.asBinder();
        return cVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new c(null);
    }
}
