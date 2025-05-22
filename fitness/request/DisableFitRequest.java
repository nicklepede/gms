package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.bipm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DisableFitRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipm();
    public final binm a;

    public DisableFitRequest(binm binmVar) {
        this.a = binmVar;
    }

    public final String toString() {
        return String.format("DisableFitRequest", new Object[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        binm binmVar = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, binmVar.asBinder());
        atzr.c(parcel, a);
    }

    public DisableFitRequest(IBinder iBinder) {
        binm binkVar;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.a = binkVar;
    }
}
