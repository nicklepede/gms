package com.google.android.gms.measurement.internal;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.cdob;
import defpackage.cdvv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class MeasurementModuleInitIntentOperation extends anya {
    private static final String[] a = {"com.google.android.gms.measurement.PackageMeasurementTaskService", "com.google.android.gms.measurement.PackageMeasurementReceiver"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 4) == 0 && (i & 8) == 0 && (i & 2) == 0) {
            return;
        }
        String[] strArr = a;
        for (int i2 = 0; i2 < 2; i2++) {
            asng.H(this, strArr[i2], true);
        }
        cdvv z = cdvv.z(this);
        z.aK().f(new cdob(z));
    }
}
