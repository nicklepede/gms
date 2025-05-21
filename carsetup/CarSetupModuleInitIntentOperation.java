package com.google.android.gms.carsetup;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.akyp;
import defpackage.albn;
import defpackage.alnf;
import defpackage.anya;
import defpackage.aspu;
import defpackage.asqh;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarSetupModuleInitIntentOperation extends anya {
    private static final ejhh b = albn.a("CAR.SETUP");
    static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.car.FirstActivity");

    private final void e() {
        if (aspu.a(this).j()) {
            alnf.b(this, a.getClassName(), false);
        } else if (asqh.g()) {
            b.h().ah(2613).x("For Android R, setting FirstActivity in GMS state to disabled.");
            alnf.b(this, a.getClassName(), false);
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        e();
        if (asqh.g()) {
            return;
        }
        alnf.b(this, ((ComponentName) akyp.b.a()).getClassName(), true);
        alnf.b(this, ((ComponentName) akyp.f.a()).getClassName(), true);
        alnf.b(this, AaSettingsActivityImpl.j.getClassName(), true);
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        if (asqh.g()) {
            e();
        }
    }
}
