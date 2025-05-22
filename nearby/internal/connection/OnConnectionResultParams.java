package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnConnectionResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkj();
    public String a;
    public int b;
    public byte[] c;
    public int d;
    public PresenceDevice e;
    public ConnectionsDevice f;
    public DctDevice g;

    public OnConnectionResultParams() {
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionResultParams) {
            OnConnectionResultParams onConnectionResultParams = (OnConnectionResultParams) obj;
            if (atyq.b(this.a, onConnectionResultParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onConnectionResultParams.b)) && Arrays.equals(this.c, onConnectionResultParams.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(onConnectionResultParams.d)) && atyq.b(this.e, onConnectionResultParams.e) && atyq.b(this.f, onConnectionResultParams.f) && atyq.b(this.g, onConnectionResultParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }

    public OnConnectionResultParams(String str, int i, byte[] bArr, int i2, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = i;
        this.c = bArr;
        this.d = i2;
        this.e = presenceDevice;
        this.f = connectionsDevice;
        this.g = dctDevice;
    }
}
