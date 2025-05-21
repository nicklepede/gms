package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FastPairDeviceMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvd();
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
            if (arwb.b(this.a, fastPairDeviceMetadata.a) && arwb.b(this.b, fastPairDeviceMetadata.b) && arwb.b(this.c, fastPairDeviceMetadata.c) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(fastPairDeviceMetadata.d)) && arwb.b(this.e, fastPairDeviceMetadata.e) && arwb.b(this.f, fastPairDeviceMetadata.f) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(fastPairDeviceMetadata.g)) && arwb.b(this.h, fastPairDeviceMetadata.h) && arwb.b(Integer.valueOf(this.i), Integer.valueOf(fastPairDeviceMetadata.i)) && arwb.b(Boolean.valueOf(this.j), Boolean.valueOf(fastPairDeviceMetadata.j))) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.d);
        arxc.v(parcel, 4, this.e, false);
        arxc.v(parcel, 5, this.f, false);
        arxc.o(parcel, 6, this.g);
        arxc.v(parcel, 7, this.h, false);
        arxc.t(parcel, 8, this.c, i, false);
        arxc.o(parcel, 9, this.i);
        arxc.e(parcel, 10, this.j);
        arxc.c(parcel, a);
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
