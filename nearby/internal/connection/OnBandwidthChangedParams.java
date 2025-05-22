package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnBandwidthChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkf();
    public String a;
    public int b;
    public int c;
    public int d;
    public PresenceDevice e;
    public ConnectionsDevice f;
    public DctDevice g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public OnBandwidthChangedParams() {
        this.c = 0;
        this.d = 0;
        this.h = -1;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnBandwidthChangedParams) {
            OnBandwidthChangedParams onBandwidthChangedParams = (OnBandwidthChangedParams) obj;
            if (atyq.b(this.a, onBandwidthChangedParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onBandwidthChangedParams.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(onBandwidthChangedParams.c)) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(onBandwidthChangedParams.d)) && atyq.b(this.e, onBandwidthChangedParams.e) && atyq.b(this.f, onBandwidthChangedParams.f) && atyq.b(this.g, onBandwidthChangedParams.g) && atyq.b(Integer.valueOf(this.h), Integer.valueOf(onBandwidthChangedParams.h)) && atyq.b(Integer.valueOf(this.i), Integer.valueOf(onBandwidthChangedParams.i)) && atyq.b(Integer.valueOf(this.j), Integer.valueOf(onBandwidthChangedParams.j)) && atyq.b(Integer.valueOf(this.k), Integer.valueOf(onBandwidthChangedParams.k)) && atyq.b(Integer.valueOf(this.l), Integer.valueOf(onBandwidthChangedParams.l)) && atyq.b(Integer.valueOf(this.m), Integer.valueOf(onBandwidthChangedParams.m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.o(parcel, 7, this.h);
        atzr.o(parcel, 8, this.i);
        atzr.o(parcel, 9, this.j);
        atzr.o(parcel, 10, this.k);
        atzr.t(parcel, 11, this.g, i, false);
        atzr.o(parcel, 12, this.l);
        atzr.o(parcel, 13, this.m);
        atzr.c(parcel, a);
    }

    public OnBandwidthChangedParams(String str, int i, int i2, int i3, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = presenceDevice;
        this.f = connectionsDevice;
        this.g = dctDevice;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
    }
}
