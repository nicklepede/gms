package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crrt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UwbDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crrt();
    public UwbAddressParams a;

    public UwbDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbDeviceParams) {
            return arwb.b(this.a, ((UwbDeviceParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.c(parcel, a);
    }

    public UwbDeviceParams(UwbAddressParams uwbAddressParams) {
        this.a = uwbAddressParams;
    }
}
