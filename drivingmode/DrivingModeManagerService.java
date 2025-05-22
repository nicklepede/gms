package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.azts;
import defpackage.azul;
import defpackage.azus;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DrivingModeManagerService extends BoundService {
    private azts a;

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        azts aztsVar = new azts(getApplicationContext());
        this.a = aztsVar;
        if (!aztsVar.b) {
            aztsVar.b = true;
            aztsVar.a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(aztsVar);
        }
        azul azulVar = new azul(getApplicationContext());
        return azulVar.getInterfaceDescriptor() == null ? azulVar : new azus(azulVar);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        azts aztsVar = this.a;
        if (aztsVar.b) {
            aztsVar.b = false;
            Thread.setDefaultUncaughtExceptionHandler(aztsVar.a);
        }
        return false;
    }
}
