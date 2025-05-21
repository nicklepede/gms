package com.google.android.gms.findmydevice.spot.e2ee;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.bdqi;
import defpackage.bdqn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SyncOwnerKeyStateMachineInternalChimeraService extends BoundService {
    private final bdqn a = new bdqi();

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
