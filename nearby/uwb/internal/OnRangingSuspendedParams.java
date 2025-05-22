package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnRangingSuspendedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzr();
    public UwbDeviceParams a;
    public int b;

    private OnRangingSuspendedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnRangingSuspendedParams) {
            OnRangingSuspendedParams onRangingSuspendedParams = (OnRangingSuspendedParams) obj;
            if (atyq.b(this.a, onRangingSuspendedParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onRangingSuspendedParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public OnRangingSuspendedParams(UwbDeviceParams uwbDeviceParams, int i) {
        this.a = uwbDeviceParams;
        this.b = i;
    }
}
