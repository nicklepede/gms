package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnInternetConnectionChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkr();
    public int a;
    public String b;
    public String c;
    public DctDevice d;

    public OnInternetConnectionChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnInternetConnectionChangedParams) {
            OnInternetConnectionChangedParams onInternetConnectionChangedParams = (OnInternetConnectionChangedParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(onInternetConnectionChangedParams.a)) && atyq.b(this.b, onInternetConnectionChangedParams.b) && atyq.b(this.c, onInternetConnectionChangedParams.c) && atyq.b(this.d, onInternetConnectionChangedParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public OnInternetConnectionChangedParams(int i, String str, String str2, DctDevice dctDevice) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = dctDevice;
    }
}
