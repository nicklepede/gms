package com.google.android.gms.ads.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class b extends otn implements c {
    public b() {
        super("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        azht azhrVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
        }
        fq(parcel);
        IBinder newGmpMeasurementReporter = newGmpMeasurementReporter(azhrVar);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newGmpMeasurementReporter);
        return true;
    }
}
