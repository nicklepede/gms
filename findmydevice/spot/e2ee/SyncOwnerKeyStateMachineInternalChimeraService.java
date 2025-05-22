package com.google.android.gms.findmydevice.spot.e2ee;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.bfru;
import defpackage.bfrz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SyncOwnerKeyStateMachineInternalChimeraService extends BoundService {
    private final bfrz a = new bfru();

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
