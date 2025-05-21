package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjcm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnInternetConnectionChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjcm();
    public int a;
    public String b;
    public String c;
    public DctDevice d;

    private OnInternetConnectionChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnInternetConnectionChangedParams) {
            OnInternetConnectionChangedParams onInternetConnectionChangedParams = (OnInternetConnectionChangedParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(onInternetConnectionChangedParams.a)) && arwb.b(this.b, onInternetConnectionChangedParams.b) && arwb.b(this.c, onInternetConnectionChangedParams.c) && arwb.b(this.d, onInternetConnectionChangedParams.d)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public OnInternetConnectionChangedParams(int i, String str, String str2, DctDevice dctDevice) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = dctDevice;
    }
}
