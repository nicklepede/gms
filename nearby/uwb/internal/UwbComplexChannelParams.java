package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cuae;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class UwbComplexChannelParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cuae();
    public int a;
    public int b;
    public int c;

    public UwbComplexChannelParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbComplexChannelParams) {
            UwbComplexChannelParams uwbComplexChannelParams = (UwbComplexChannelParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(uwbComplexChannelParams.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(uwbComplexChannelParams.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(uwbComplexChannelParams.c))) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public UwbComplexChannelParams(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
