package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crqn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RangeDataNtfConfigParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqn();
    public int a;
    public int b;
    public int c;

    public RangeDataNtfConfigParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangeDataNtfConfigParams) {
            RangeDataNtfConfigParams rangeDataNtfConfigParams = (RangeDataNtfConfigParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(rangeDataNtfConfigParams.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(rangeDataNtfConfigParams.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(rangeDataNtfConfigParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public RangeDataNtfConfigParams(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
