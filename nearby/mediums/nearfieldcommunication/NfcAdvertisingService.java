package com.google.android.gms.nearby.mediums.nearfieldcommunication;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.apzo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NfcAdvertisingService extends apzo {
    @Override // defpackage.apzo, defpackage.rkk, android.app.Service
    public final IBinder onBind(Intent intent) {
        Service service = this.b;
        if (service == null) {
            return null;
        }
        i(intent);
        return service.onBind(intent);
    }
}
