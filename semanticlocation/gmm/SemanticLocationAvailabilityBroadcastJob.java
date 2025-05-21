package com.google.android.gms.semanticlocation.gmm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.semanticlocation.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asot;
import defpackage.bwth;
import defpackage.byln;
import defpackage.czir;
import defpackage.cziz;
import defpackage.czje;
import defpackage.frur;
import defpackage.frxn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SemanticLocationAvailabilityBroadcastJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocation.gmm.SemanticLocationAvailabilityBroadcastJob";

    public static boolean d() {
        return frur.a.a().p() && frxn.P();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!d()) {
            asot asotVar = czir.a;
            return 0;
        }
        czje czjeVar = new czje();
        czjeVar.k("CSLAvailabilityBroadcastGmm", 3);
        Context a2 = AppContextProvider.a();
        if (!bwth.q(a2)) {
            asot asotVar2 = czir.a;
            czjeVar.k("CSLAvailabilityBroadcastGmm", 7);
            return 0;
        }
        if (!cziz.e(a2.getPackageManager(), "com.google.android.apps.maps")) {
            asot asotVar3 = czir.a;
            czjeVar.k("CSLAvailabilityBroadcastGmm", 12);
            return 0;
        }
        Intent intent = new Intent("com.google.android.gms.semanticlocation.AVAILABILITY");
        intent.setPackage("com.google.android.apps.maps");
        asot asotVar4 = czir.a;
        a2.sendBroadcast(intent);
        czjeVar.k("CSLAvailabilityBroadcastGmm", 1);
        return 0;
    }
}
