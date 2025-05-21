package com.google.android.gms.nearby.mediums.nearfieldcommunication;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.anxw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NfcAdvertisingService extends anxw {
    @Override // defpackage.anxw, defpackage.prg, android.app.Service
    public final IBinder onBind(Intent intent) {
        Service service = this.b;
        if (service == null) {
            return null;
        }
        i(intent);
        return service.onBind(intent);
    }
}
