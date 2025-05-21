package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crqo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RangeLimitsConfigParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqo();
    public int a;
    public int b;

    public RangeLimitsConfigParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangeLimitsConfigParams) {
            RangeLimitsConfigParams rangeLimitsConfigParams = (RangeLimitsConfigParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(rangeLimitsConfigParams.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(rangeLimitsConfigParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public RangeLimitsConfigParams(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
