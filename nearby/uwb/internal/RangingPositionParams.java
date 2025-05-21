package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crqr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RangingPositionParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqr();
    public RangingMeasurementParams a;
    public RangingMeasurementParams b;
    public RangingMeasurementParams c;
    public long d;
    public final int e;
    public DlTdoaMeasurementParams f;

    private RangingPositionParams() {
        this.e = -128;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingPositionParams) {
            RangingPositionParams rangingPositionParams = (RangingPositionParams) obj;
            if (arwb.b(this.a, rangingPositionParams.a) && arwb.b(this.b, rangingPositionParams.b) && arwb.b(this.c, rangingPositionParams.c) && arwb.b(Long.valueOf(this.d), Long.valueOf(rangingPositionParams.d)) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(rangingPositionParams.e)) && arwb.b(this.f, rangingPositionParams.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public RangingPositionParams(RangingMeasurementParams rangingMeasurementParams, RangingMeasurementParams rangingMeasurementParams2, RangingMeasurementParams rangingMeasurementParams3, long j, int i, DlTdoaMeasurementParams dlTdoaMeasurementParams) {
        this.a = rangingMeasurementParams;
        this.b = rangingMeasurementParams2;
        this.c = rangingMeasurementParams3;
        this.d = j;
        this.e = i;
        this.f = dlTdoaMeasurementParams;
    }
}
