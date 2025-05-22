package com.google.android.gms.semanticlocation.gmm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.semanticlocation.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ausn;
import defpackage.bzbx;
import defpackage.cauf;
import defpackage.dbsp;
import defpackage.dbsx;
import defpackage.dbtc;
import defpackage.fupl;
import defpackage.fush;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SemanticLocationAvailabilityBroadcastJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocation.gmm.SemanticLocationAvailabilityBroadcastJob";

    public static boolean d() {
        return fupl.a.lK().p() && fush.P();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!d()) {
            ausn ausnVar = dbsp.a;
            return 0;
        }
        dbtc dbtcVar = new dbtc();
        dbtcVar.k("CSLAvailabilityBroadcastGmm", 3);
        Context a2 = AppContextProvider.a();
        if (!bzbx.q(a2)) {
            ausn ausnVar2 = dbsp.a;
            dbtcVar.k("CSLAvailabilityBroadcastGmm", 7);
            return 0;
        }
        if (!dbsx.e(a2.getPackageManager(), "com.google.android.apps.maps")) {
            ausn ausnVar3 = dbsp.a;
            dbtcVar.k("CSLAvailabilityBroadcastGmm", 12);
            return 0;
        }
        Intent intent = new Intent("com.google.android.gms.semanticlocation.AVAILABILITY");
        intent.setPackage("com.google.android.apps.maps");
        ausn ausnVar4 = dbsp.a;
        a2.sendBroadcast(intent);
        dbtcVar.k("CSLAvailabilityBroadcastGmm", 1);
        return 0;
    }
}
