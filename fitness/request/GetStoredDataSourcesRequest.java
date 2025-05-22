package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bima;
import defpackage.bimc;
import defpackage.bipp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GetStoredDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipp();
    public final bimc a;

    public GetStoredDataSourcesRequest(IBinder iBinder) {
        bimc bimaVar;
        if (iBinder == null) {
            bimaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            bimaVar = queryLocalInterface instanceof bimc ? (bimc) queryLocalInterface : new bima(iBinder);
        }
        this.a = bimaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bimc bimcVar = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, bimcVar.asBinder());
        atzr.c(parcel, a);
    }
}
