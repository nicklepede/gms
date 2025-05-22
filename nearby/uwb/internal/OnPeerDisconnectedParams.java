package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctzo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnPeerDisconnectedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzo();
    public UwbDeviceParams a;
    public int b;

    private OnPeerDisconnectedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPeerDisconnectedParams) {
            OnPeerDisconnectedParams onPeerDisconnectedParams = (OnPeerDisconnectedParams) obj;
            if (atyq.b(this.a, onPeerDisconnectedParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onPeerDisconnectedParams.b))) {
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

    public OnPeerDisconnectedParams(UwbDeviceParams uwbDeviceParams, int i) {
        this.a = uwbDeviceParams;
        this.b = i;
    }
}
