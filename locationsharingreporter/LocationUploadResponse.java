package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdck;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationUploadResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdck();
    public final int a;
    public final LocationReportingStatus b;

    public LocationUploadResponse(int i, LocationReportingStatus locationReportingStatus) {
        this.a = i;
        this.b = locationReportingStatus;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
