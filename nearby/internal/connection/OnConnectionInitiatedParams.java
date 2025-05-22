package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnConnectionInitiatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkg();
    public String a;
    public String b;
    public String c;
    public boolean d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public boolean h;
    public int i;
    public PresenceDevice j;
    public ConnectionsDevice k;
    public DctDevice l;
    public int m;

    public OnConnectionInitiatedParams() {
        this.i = 0;
        this.m = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionInitiatedParams) {
            OnConnectionInitiatedParams onConnectionInitiatedParams = (OnConnectionInitiatedParams) obj;
            if (atyq.b(this.a, onConnectionInitiatedParams.a) && atyq.b(this.b, onConnectionInitiatedParams.b) && atyq.b(this.c, onConnectionInitiatedParams.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(onConnectionInitiatedParams.d)) && Arrays.equals(this.e, onConnectionInitiatedParams.e) && Arrays.equals(this.f, onConnectionInitiatedParams.f) && Arrays.equals(this.g, onConnectionInitiatedParams.g) && atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(onConnectionInitiatedParams.h)) && atyq.b(Integer.valueOf(this.i), Integer.valueOf(onConnectionInitiatedParams.i)) && atyq.b(this.j, onConnectionInitiatedParams.j) && atyq.b(this.k, onConnectionInitiatedParams.k) && atyq.b(this.l, onConnectionInitiatedParams.l) && atyq.b(Integer.valueOf(this.m), Integer.valueOf(onConnectionInitiatedParams.m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, this.l, Integer.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.i(parcel, 5, this.e, false);
        atzr.i(parcel, 6, this.f, false);
        atzr.i(parcel, 7, this.g, false);
        atzr.e(parcel, 8, this.h);
        atzr.o(parcel, 9, this.i);
        atzr.t(parcel, 10, this.j, i, false);
        atzr.t(parcel, 11, this.k, i, false);
        atzr.o(parcel, 12, this.m);
        atzr.t(parcel, 13, this.l, i, false);
        atzr.c(parcel, a);
    }

    public OnConnectionInitiatedParams(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bArr;
        this.f = bArr2;
        this.g = bArr3;
        this.h = z2;
        this.i = i;
        this.j = presenceDevice;
        this.k = connectionsDevice;
        this.l = dctDevice;
        this.m = i2;
    }
}
