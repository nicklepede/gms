package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctzq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnRangingResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzq();
    public UwbDeviceParams a;
    public RangingPositionParams b;

    private OnRangingResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnRangingResultParams) {
            OnRangingResultParams onRangingResultParams = (OnRangingResultParams) obj;
            if (atyq.b(this.a, onRangingResultParams.a) && atyq.b(this.b, onRangingResultParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public OnRangingResultParams(UwbDeviceParams uwbDeviceParams, RangingPositionParams rangingPositionParams) {
        this.a = uwbDeviceParams;
        this.b = rangingPositionParams;
    }
}
