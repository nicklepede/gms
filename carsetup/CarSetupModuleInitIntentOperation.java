package com.google.android.gms.carsetup;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.anaa;
import defpackage.ancy;
import defpackage.anoq;
import defpackage.apzs;
import defpackage.auto;
import defpackage.auub;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarSetupModuleInitIntentOperation extends apzs {
    private static final eluq b = ancy.a("CAR.SETUP");
    static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.car.FirstActivity");

    private final void e() {
        if (auto.a(this).j()) {
            anoq.b(this, a.getClassName(), false);
        } else if (auub.g()) {
            b.h().ai(2617).x("For Android R, setting FirstActivity in GMS state to disabled.");
            anoq.b(this, a.getClassName(), false);
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        e();
        if (auub.g()) {
            return;
        }
        anoq.b(this, ((ComponentName) anaa.b.lK()).getClassName(), true);
        anoq.b(this, ((ComponentName) anaa.f.lK()).getClassName(), true);
        anoq.b(this, AaSettingsActivityImpl.j.getClassName(), true);
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        if (auub.g()) {
            e();
        }
    }
}
