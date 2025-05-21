package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.catz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class StopLocationReportingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new catz();
    public final LocationShare a;

    public StopLocationReportingRequest(LocationShare locationShare) {
        this.a = locationShare;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LocationShare locationShare = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, locationShare, i, false);
        arxc.c(parcel, a);
    }
}
