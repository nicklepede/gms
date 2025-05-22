package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnDisconnectedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkk();
    public String a;
    public int b;
    public PresenceDevice c;
    public ConnectionsDevice d;
    public DctDevice e;

    public OnDisconnectedParams() {
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDisconnectedParams) {
            OnDisconnectedParams onDisconnectedParams = (OnDisconnectedParams) obj;
            if (atyq.b(this.a, onDisconnectedParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onDisconnectedParams.b)) && atyq.b(this.c, onDisconnectedParams.c) && atyq.b(this.d, onDisconnectedParams.d) && atyq.b(this.e, onDisconnectedParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }

    public OnDisconnectedParams(String str, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = i;
        this.c = presenceDevice;
        this.d = connectionsDevice;
        this.e = dctDevice;
    }
}
