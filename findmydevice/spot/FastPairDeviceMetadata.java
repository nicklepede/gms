package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bewp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FastPairDeviceMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewp();
    public String a;
    public String b;
    public DeviceComponentImages c;
    public int d;
    public String e;
    public String f;
    public int g;
    public String h;
    public int i;
    public boolean j;

    public FastPairDeviceMetadata() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FastPairDeviceMetadata) {
            FastPairDeviceMetadata fastPairDeviceMetadata = (FastPairDeviceMetadata) obj;
            if (atyq.b(this.a, fastPairDeviceMetadata.a) && atyq.b(this.b, fastPairDeviceMetadata.b) && atyq.b(this.c, fastPairDeviceMetadata.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(fastPairDeviceMetadata.d)) && atyq.b(this.e, fastPairDeviceMetadata.e) && atyq.b(this.f, fastPairDeviceMetadata.f) && atyq.b(Integer.valueOf(this.g), Integer.valueOf(fastPairDeviceMetadata.g)) && atyq.b(this.h, fastPairDeviceMetadata.h) && atyq.b(Integer.valueOf(this.i), Integer.valueOf(fastPairDeviceMetadata.i)) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(fastPairDeviceMetadata.j))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), this.e, this.f, Integer.valueOf(this.g), this.h, Integer.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.d);
        atzr.v(parcel, 4, this.e, false);
        atzr.v(parcel, 5, this.f, false);
        atzr.o(parcel, 6, this.g);
        atzr.v(parcel, 7, this.h, false);
        atzr.t(parcel, 8, this.c, i, false);
        atzr.o(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.c(parcel, a);
    }

    public FastPairDeviceMetadata(String str, String str2, DeviceComponentImages deviceComponentImages, int i, String str3, String str4, int i2, String str5, int i3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = deviceComponentImages;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = str5;
        this.i = i3;
        this.j = z;
    }
}
