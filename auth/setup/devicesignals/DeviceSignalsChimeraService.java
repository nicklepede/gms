package com.google.android.gms.auth.setup.devicesignals;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.abaf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceSignalsChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new abaf(this);
    }
}
