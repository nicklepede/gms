package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdcp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class StopLocationReportingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdcp();
    public final LocationShare a;

    public StopLocationReportingRequest(LocationShare locationShare) {
        this.a = locationShare;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LocationShare locationShare = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, locationShare, i, false);
        atzr.c(parcel, a);
    }
}
