package com.google.android.gms.ads.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a extends qmp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
    }

    @Override // com.google.android.gms.ads.measurement.internal.c
    public final IBinder newGmpMeasurementReporter(bblp bblpVar) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        Parcel fF = fF(1, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }
}
