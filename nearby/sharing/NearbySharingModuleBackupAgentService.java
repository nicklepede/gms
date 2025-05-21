package com.google.android.gms.nearby.sharing;

import android.content.Intent;
import android.os.IBinder;
import defpackage.clwz;
import defpackage.clxj;
import defpackage.cmaz;
import defpackage.dxkm;
import defpackage.fqmk;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NearbySharingModuleBackupAgentService extends clxj {
    public cmaz a;
    public dxkm b;

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        dxkm dxkmVar = null;
        if (!fqmk.x()) {
            return null;
        }
        cmaz cmazVar = this.a;
        if (cmazVar == null) {
            fvbo.j("sharingClient");
            cmazVar = null;
        }
        dxkm dxkmVar2 = this.b;
        if (dxkmVar2 == null) {
            fvbo.j("deviceConfig");
        } else {
            dxkmVar = dxkmVar2;
        }
        return new clwz(cmazVar, dxkmVar);
    }
}
