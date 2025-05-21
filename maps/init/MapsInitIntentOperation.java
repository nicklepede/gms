package com.google.android.gms.maps.init;

import android.content.Intent;
import com.google.android.chimera.config.ModuleManager;
import defpackage.anya;
import defpackage.asot;
import defpackage.brby;
import defpackage.buzk;
import defpackage.cbzr;
import defpackage.ccag;
import defpackage.ccal;
import defpackage.ccdq;
import defpackage.ejhf;
import defpackage.elhu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class MapsInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        ccal ccalVar = new ccal(this);
        asot asotVar = ccdq.a;
        ((ejhf) asotVar.h()).x("Validating conditions for requesting maps_core feature.");
        ModuleManager moduleManager = ccalVar.a;
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion(cbzr.a.a);
        int checkFeaturesAreAvailable = moduleManager.checkFeaturesAreAvailable(featureCheck);
        if (checkFeaturesAreAvailable == 0) {
            ((ejhf) asotVar.h()).x("maps_core feature already installed.");
            return;
        }
        if (checkFeaturesAreAvailable != 1) {
            if (checkFeaturesAreAvailable != 2) {
                ((ejhf) asotVar.h()).x("Container not able to check for maps_core feature presence. Install will be requested.");
            } else {
                ((ejhf) asotVar.h()).x("maps_core feature installed, but update is required.");
            }
            asot asotVar2 = ccdq.a;
            ((ejhf) asotVar2.h()).x("Eligible to request maps_core feature.");
            ((ejhf) asotVar2.h()).x("Requesting maps_core feature using ModuleInstallApi.");
            ccalVar.a(1);
            return;
        }
        ((ejhf) asotVar.j()).x("maps_core feature is module is not recognized; Google Play Services may need to be  updated. Requesting a module install will fail.");
        elhu b = ccalVar.b(4003, 0, 10);
        ccalVar.c = buzk.v();
        if (!brby.b(ccalVar.c) || b == null) {
            return;
        }
        ccalVar.c.f(b);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccag.a(getApplicationContext());
    }
}
