package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.UwbRangingData;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjch;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnEndpointDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjch();
    public String a;
    public int b;
    public UwbRangingData c;
    public int d;
    public ConnectionsDevice e;
    public DctDevice f;

    public OnEndpointDistanceChangedParams() {
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointDistanceChangedParams) {
            OnEndpointDistanceChangedParams onEndpointDistanceChangedParams = (OnEndpointDistanceChangedParams) obj;
            if (arwb.b(this.a, onEndpointDistanceChangedParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(onEndpointDistanceChangedParams.b)) && arwb.b(this.c, onEndpointDistanceChangedParams.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(onEndpointDistanceChangedParams.d)) && arwb.b(this.e, onEndpointDistanceChangedParams.e) && arwb.b(this.f, onEndpointDistanceChangedParams.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.o(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public OnEndpointDistanceChangedParams(String str, int i, UwbRangingData uwbRangingData, int i2, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = i;
        this.c = uwbRangingData;
        this.d = i2;
        this.e = connectionsDevice;
        this.f = dctDevice;
    }
}
