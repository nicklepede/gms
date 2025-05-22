package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnEndpointLostParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkq();
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
            if (atyq.b(this.a, onEndpointLostParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onEndpointLostParams.b)) && atyq.b(this.c, onEndpointLostParams.c) && atyq.b(this.d, onEndpointLostParams.d)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public OnEndpointLostParams(String str, int i, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = i;
        this.c = connectionsDevice;
        this.d = dctDevice;
    }
}
