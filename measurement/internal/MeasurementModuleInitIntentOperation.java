package com.google.android.gms.measurement.internal;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.cfwy;
import defpackage.cgev;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class MeasurementModuleInitIntentOperation extends apzs {
    private static final String[] a = {"com.google.android.gms.measurement.PackageMeasurementTaskService", "com.google.android.gms.measurement.PackageMeasurementReceiver"};

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if ((i & 4) == 0 && (i & 8) == 0 && (i & 2) == 0) {
            return;
        }
        String[] strArr = a;
        for (int i2 = 0; i2 < 2; i2++) {
            aura.H(this, strArr[i2], true);
        }
        cgev z = cgev.z(this);
        z.aL().f(new cfwy(z));
    }
}
