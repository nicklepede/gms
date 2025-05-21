package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crqp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RangingMeasurementParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqp();
    public int a;
    public float b;

    private RangingMeasurementParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingMeasurementParams) {
            RangingMeasurementParams rangingMeasurementParams = (RangingMeasurementParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(rangingMeasurementParams.a)) && arwb.b(Float.valueOf(this.b), Float.valueOf(rangingMeasurementParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Float.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.l(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public RangingMeasurementParams(int i, float f) {
        this.a = i;
        this.b = f;
    }
}
