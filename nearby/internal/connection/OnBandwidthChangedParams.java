package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjca;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnBandwidthChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjca();
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
            if (arwb.b(this.a, onBandwidthChangedParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(onBandwidthChangedParams.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(onBandwidthChangedParams.c)) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(onBandwidthChangedParams.d)) && arwb.b(this.e, onBandwidthChangedParams.e) && arwb.b(this.f, onBandwidthChangedParams.f) && arwb.b(this.g, onBandwidthChangedParams.g) && arwb.b(Integer.valueOf(this.h), Integer.valueOf(onBandwidthChangedParams.h)) && arwb.b(Integer.valueOf(this.i), Integer.valueOf(onBandwidthChangedParams.i)) && arwb.b(Integer.valueOf(this.j), Integer.valueOf(onBandwidthChangedParams.j)) && arwb.b(Integer.valueOf(this.k), Integer.valueOf(onBandwidthChangedParams.k)) && arwb.b(Integer.valueOf(this.l), Integer.valueOf(onBandwidthChangedParams.l)) && arwb.b(Integer.valueOf(this.m), Integer.valueOf(onBandwidthChangedParams.m))) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.o(parcel, 7, this.h);
        arxc.o(parcel, 8, this.i);
        arxc.o(parcel, 9, this.j);
        arxc.o(parcel, 10, this.k);
        arxc.t(parcel, 11, this.g, i, false);
        arxc.o(parcel, 12, this.l);
        arxc.o(parcel, 13, this.m);
        arxc.c(parcel, a);
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
