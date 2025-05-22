package com.google.android.gms.fitness.service.wearable;

import defpackage.atqk;
import defpackage.bjev;
import defpackage.dlvr;
import defpackage.dlvs;
import defpackage.dmmv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class WearableSyncConfigChimeraService extends dmmv {
    static {
        bjev.a();
    }

    @Override // defpackage.dmmv, defpackage.dlvp
    public final void gA(dlvs dlvsVar) {
        atqk atqkVar = new atqk(dlvsVar);
        while (atqkVar.hasNext()) {
            dlvr dlvrVar = (dlvr) atqkVar.next();
            if (dlvrVar.a() != 1) {
                dlvrVar.a();
            } else if (dlvrVar.b().a().getPath().equals("/fitness/WearableSync/sync_request")) {
                getApplicationContext();
            }
        }
    }
}
