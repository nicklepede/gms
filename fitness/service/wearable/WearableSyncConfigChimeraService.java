package com.google.android.gms.fitness.service.wearable;

import defpackage.arnv;
import defpackage.bhaf;
import defpackage.djjy;
import defpackage.djjz;
import defpackage.dkbc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class WearableSyncConfigChimeraService extends dkbc {
    static {
        bhaf.a();
    }

    @Override // defpackage.dkbc, defpackage.djjw
    public final void gl(djjz djjzVar) {
        arnv arnvVar = new arnv(djjzVar);
        while (arnvVar.hasNext()) {
            djjy djjyVar = (djjy) arnvVar.next();
            if (djjyVar.a() != 1) {
                djjyVar.a();
            } else if (djjyVar.b().a().getPath().equals("/fitness/WearableSync/sync_request")) {
                getApplicationContext();
            }
        }
    }
}
