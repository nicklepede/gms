package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdbu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationReportingStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdbu();

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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
