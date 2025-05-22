package com.google.android.gms.carsetup;

import android.content.Intent;
import defpackage.ancc;
import defpackage.ancq;
import defpackage.ancy;
import defpackage.anyb;
import defpackage.apzu;
import defpackage.eluq;
import defpackage.eokl;
import defpackage.eokt;
import defpackage.eoku;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarPackageIntentOperation extends apzu {
    private static final eluq a = ancy.a("CAR.SETUP");

    public CarPackageIntentOperation() {
        super(false);
    }

    @Override // defpackage.apzu
    protected final void a(String str, Intent intent) {
        if ("com.google.android.projection.gearhead".equals(str)) {
            a.h().ai(2614).x("Gearhead uninstalled");
            ancc a2 = ancc.a(this);
            eokl eoklVar = eokl.CAR_SERVICE;
            eoku eokuVar = eoku.PLAY_STORE;
            eokt eoktVar = eokt.UNINSTALL;
            ancq ancqVar = new ancq(null);
            ancqVar.d = 38;
            if (eoklVar == null) {
                throw new NullPointerException("Null domainIdType");
            }
            ancqVar.a = eoklVar;
            if (eokuVar == null) {
                throw new NullPointerException("Null context");
            }
            ancqVar.b = eokuVar;
            if (eoktVar == null) {
                throw new NullPointerException("Null action");
            }
            ancqVar.c = eoktVar;
            a2.c(ancqVar.c());
        }
    }

    @Override // defpackage.apzu
    protected final void b(String str) {
        if ("com.google.android.projection.gearhead".equals(str)) {
            new anyb(getApplicationContext()).a();
        }
    }

    @Override // defpackage.apzu
    protected final void c(String str) {
        if ("com.google.android.projection.gearhead".equals(str)) {
            new anyb(getApplicationContext()).a();
        }
    }
}
