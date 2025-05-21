package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cizr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DisconnectFromEndpointParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cizr();
    public String a;
    public int b;
    public PresenceDevice c;
    public ConnectionsDevice d;
    public DctDevice e;
    public final int f;

    public DisconnectFromEndpointParams() {
        this.b = 0;
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisconnectFromEndpointParams) {
            DisconnectFromEndpointParams disconnectFromEndpointParams = (DisconnectFromEndpointParams) obj;
            if (arwb.b(this.a, disconnectFromEndpointParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(disconnectFromEndpointParams.b)) && arwb.b(this.c, disconnectFromEndpointParams.c) && arwb.b(this.d, disconnectFromEndpointParams.d) && arwb.b(this.e, disconnectFromEndpointParams.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(disconnectFromEndpointParams.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public DisconnectFromEndpointParams(String str, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice, int i2) {
        this.a = str;
        this.b = i;
        this.c = presenceDevice;
        this.d = connectionsDevice;
        this.e = dctDevice;
        this.f = i2;
    }
}
