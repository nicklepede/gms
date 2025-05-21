package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bghk;
import defpackage.bghm;
import defpackage.bgkz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GetStoredDataSourcesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkz();
    public final bghm a;

    public GetStoredDataSourcesRequest(IBinder iBinder) {
        bghm bghkVar;
        if (iBinder == null) {
            bghkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            bghkVar = queryLocalInterface instanceof bghm ? (bghm) queryLocalInterface : new bghk(iBinder);
        }
        this.a = bghkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bghm bghmVar = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, bghmVar.asBinder());
        arxc.c(parcel, a);
    }
}
