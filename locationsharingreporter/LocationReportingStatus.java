package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationReportingStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cate();

    @Deprecated
    public final int a;
    public final int b;
    public final boolean c;
    public final IneligibilityRationale d;

    public LocationReportingStatus(int i, int i2, boolean z, IneligibilityRationale ineligibilityRationale) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = ineligibilityRationale;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
