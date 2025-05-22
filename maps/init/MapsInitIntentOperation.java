package com.google.android.gms.maps.init;

import android.content.Intent;
import com.google.android.chimera.config.ModuleManager;
import defpackage.apzs;
import defpackage.ausn;
import defpackage.btjp;
import defpackage.bxhm;
import defpackage.ceij;
import defpackage.ceja;
import defpackage.cejf;
import defpackage.cemk;
import defpackage.eluo;
import defpackage.envh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class MapsInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        cejf cejfVar = new cejf(this);
        ausn ausnVar = cemk.a;
        ((eluo) ausnVar.h()).x("Validating conditions for requesting maps_core feature.");
        ModuleManager moduleManager = cejfVar.a;
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion(ceij.a.a);
        int checkFeaturesAreAvailable = moduleManager.checkFeaturesAreAvailable(featureCheck);
        if (checkFeaturesAreAvailable == 0) {
            ((eluo) ausnVar.h()).x("maps_core feature already installed.");
            return;
        }
        if (checkFeaturesAreAvailable != 1) {
            if (checkFeaturesAreAvailable != 2) {
                ((eluo) ausnVar.h()).x("Container not able to check for maps_core feature presence. Install will be requested.");
            } else {
                ((eluo) ausnVar.h()).x("maps_core feature installed, but update is required.");
            }
            ((eluo) ausnVar.h()).x("Eligible to request maps_core feature.");
            ((eluo) ausnVar.h()).x("Requesting maps_core feature using ModuleInstallApi.");
            cejfVar.a(1);
            return;
        }
        ((eluo) ausnVar.j()).x("maps_core feature is module is not recognized; Google Play Services may need to be  updated. Requesting a module install will fail.");
        envh b = cejfVar.b(4003, 0, 10);
        cejfVar.c = bxhm.v();
        if (!btjp.b(cejfVar.c) || b == null) {
            return;
        }
        cejfVar.c.f(b);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ceja.a(getApplicationContext());
    }
}
