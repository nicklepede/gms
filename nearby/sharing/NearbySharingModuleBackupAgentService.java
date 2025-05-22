package com.google.android.gms.nearby.sharing;

import android.content.Intent;
import android.os.IBinder;
import defpackage.cofh;
import defpackage.cofr;
import defpackage.cojh;
import defpackage.dzwm;
import defpackage.ftgf;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NearbySharingModuleBackupAgentService extends cofr {
    public cojh a;
    public dzwm b;

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        dzwm dzwmVar = null;
        if (!ftgf.x()) {
            return null;
        }
        cojh cojhVar = this.a;
        if (cojhVar == null) {
            fxxm.j("sharingClient");
            cojhVar = null;
        }
        dzwm dzwmVar2 = this.b;
        if (dzwmVar2 == null) {
            fxxm.j("deviceConfig");
        } else {
            dzwmVar = dzwmVar2;
        }
        return new cofh(cojhVar, dzwmVar);
    }
}
