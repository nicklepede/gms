package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.catu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationUploadResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new catu();
    public final int a;
    public final LocationReportingStatus b;

    public LocationUploadResponse(int i, LocationReportingStatus locationReportingStatus) {
        this.a = i;
        this.b = locationReportingStatus;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
