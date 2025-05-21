package com.google.android.gms.carsetup;

import android.content.Intent;
import defpackage.alar;
import defpackage.albf;
import defpackage.albn;
import defpackage.alwq;
import defpackage.anyc;
import defpackage.ejhh;
import defpackage.elwx;
import defpackage.elxf;
import defpackage.elxg;
import defpackage.flsb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarPackageIntentOperation extends anyc {
    private static final ejhh a = albn.a("CAR.SETUP");

    public CarPackageIntentOperation() {
        super(false);
    }

    @Override // defpackage.anyc
    protected final void a(String str, Intent intent) {
        if ("com.google.android.projection.gearhead".equals(str)) {
            a.h().ah(2610).x("Gearhead uninstalled");
            alar a2 = alar.a(this);
            elwx elwxVar = elwx.CAR_SERVICE;
            elxg elxgVar = elxg.PLAY_STORE;
            elxf elxfVar = elxf.UNINSTALL;
            albf albfVar = new albf(null);
            albfVar.d = 38;
            if (elwxVar == null) {
                throw new NullPointerException("Null domainIdType");
            }
            albfVar.a = elwxVar;
            if (elxgVar == null) {
                throw new NullPointerException("Null context");
            }
            albfVar.b = elxgVar;
            if (elxfVar == null) {
                throw new NullPointerException("Null action");
            }
            albfVar.c = elxfVar;
            a2.c(albfVar.c());
        }
    }

    @Override // defpackage.anyc
    protected final void b(String str) {
        if (flsb.c() && "com.google.android.projection.gearhead".equals(str)) {
            new alwq(getApplicationContext()).a();
        }
    }

    @Override // defpackage.anyc
    protected final void c(String str) {
        if (flsb.c() && "com.google.android.projection.gearhead".equals(str)) {
            new alwq(getApplicationContext()).a();
        }
    }
}
