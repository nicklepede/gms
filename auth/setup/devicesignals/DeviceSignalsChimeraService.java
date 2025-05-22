package com.google.android.gms.auth.setup.devicesignals;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.adaf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceSignalsChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new adaf(this);
    }
}
