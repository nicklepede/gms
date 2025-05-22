package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.bips;
import defpackage.biqi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class StopBleScanRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqi();
    public final binm a;
    public final bips b;

    public StopBleScanRequest(bips bipsVar, binm binmVar) {
        this.b = bipsVar;
        this.a = binmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.b.a);
        binm binmVar = this.a;
        atzr.D(parcel, 2, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }

    public StopBleScanRequest(IBinder iBinder, IBinder iBinder2) {
        bips bipsVar;
        binm binmVar = null;
        if (iBinder == null) {
            bipsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            bipsVar = queryLocalInterface instanceof bips ? (bips) queryLocalInterface : new bips(iBinder);
        }
        this.b = bipsVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binmVar = queryLocalInterface2 instanceof binm ? (binm) queryLocalInterface2 : new bink(iBinder2);
        }
        this.a = binmVar;
    }
}
