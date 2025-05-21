package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjcl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnEndpointLostParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjcl();
    public String a;
    public int b;
    public ConnectionsDevice c;
    public DctDevice d;

    public OnEndpointLostParams() {
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointLostParams) {
            OnEndpointLostParams onEndpointLostParams = (OnEndpointLostParams) obj;
            if (arwb.b(this.a, onEndpointLostParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(onEndpointLostParams.b)) && arwb.b(this.c, onEndpointLostParams.c) && arwb.b(this.d, onEndpointLostParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public OnEndpointLostParams(String str, int i, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = i;
        this.c = connectionsDevice;
        this.d = dctDevice;
    }
}
