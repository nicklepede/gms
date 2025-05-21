package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjcb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnConnectionInitiatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjcb();
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
            if (arwb.b(this.a, onConnectionInitiatedParams.a) && arwb.b(this.b, onConnectionInitiatedParams.b) && arwb.b(this.c, onConnectionInitiatedParams.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(onConnectionInitiatedParams.d)) && Arrays.equals(this.e, onConnectionInitiatedParams.e) && Arrays.equals(this.f, onConnectionInitiatedParams.f) && Arrays.equals(this.g, onConnectionInitiatedParams.g) && arwb.b(Boolean.valueOf(this.h), Boolean.valueOf(onConnectionInitiatedParams.h)) && arwb.b(Integer.valueOf(this.i), Integer.valueOf(onConnectionInitiatedParams.i)) && arwb.b(this.j, onConnectionInitiatedParams.j) && arwb.b(this.k, onConnectionInitiatedParams.k) && arwb.b(this.l, onConnectionInitiatedParams.l) && arwb.b(Integer.valueOf(this.m), Integer.valueOf(onConnectionInitiatedParams.m))) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.i(parcel, 5, this.e, false);
        arxc.i(parcel, 6, this.f, false);
        arxc.i(parcel, 7, this.g, false);
        arxc.e(parcel, 8, this.h);
        arxc.o(parcel, 9, this.i);
        arxc.t(parcel, 10, this.j, i, false);
        arxc.t(parcel, 11, this.k, i, false);
        arxc.o(parcel, 12, this.m);
        arxc.t(parcel, 13, this.l, i, false);
        arxc.c(parcel, a);
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
