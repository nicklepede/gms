package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjce;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnConnectionResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjce();
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
            if (arwb.b(this.a, onConnectionResultParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(onConnectionResultParams.b)) && Arrays.equals(this.c, onConnectionResultParams.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(onConnectionResultParams.d)) && arwb.b(this.e, onConnectionResultParams.e) && arwb.b(this.f, onConnectionResultParams.f) && arwb.b(this.g, onConnectionResultParams.g)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.i(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
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
