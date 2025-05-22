package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctzu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RangingMeasurementParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzu();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(rangingMeasurementParams.a)) && atyq.b(Float.valueOf(this.b), Float.valueOf(rangingMeasurementParams.b))) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.l(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public RangingMeasurementParams(int i, float f) {
        this.a = i;
        this.b = f;
    }
}
