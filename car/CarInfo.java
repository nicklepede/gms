package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amrr;
import defpackage.atzr;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amrr();
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public int r;

    public CarInfo() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarInfo)) {
            return false;
        }
        CarInfo carInfo = (CarInfo) obj;
        return Objects.equals(this.a, carInfo.a) && Objects.equals(this.b, carInfo.b) && Objects.equals(this.c, carInfo.c) && Objects.equals(this.d, carInfo.d) && this.e == carInfo.e && this.f == carInfo.f && this.g == carInfo.g && this.h == carInfo.h && Objects.equals(this.i, carInfo.i) && Objects.equals(this.j, carInfo.j) && Objects.equals(this.k, carInfo.k) && Objects.equals(this.l, carInfo.l) && this.m == carInfo.m && this.n == carInfo.n && this.o == carInfo.o && Objects.equals(this.p, carInfo.p) && Objects.equals(this.q, carInfo.q) && this.r == carInfo.r;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f));
    }

    public final String toString() {
        return this.a + "," + this.b + "," + this.e + "." + this.f + "," + this.c + "," + this.i + "," + this.j + "," + this.k + "," + this.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.v(parcel, 11, this.k, false);
        atzr.v(parcel, 12, this.l, false);
        atzr.e(parcel, 13, this.m);
        atzr.e(parcel, 14, this.n);
        atzr.e(parcel, 15, this.o);
        atzr.v(parcel, 16, this.p, false);
        atzr.v(parcel, 17, this.q, false);
        atzr.o(parcel, 18, this.r);
        atzr.c(parcel, a);
    }

    public CarInfo(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, String str9, String str10, int i4) {
        int i5;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = str9;
        this.q = str10;
        if (i4 == 0) {
            i5 = 1;
            if (str2 != null && str2.toLowerCase(Locale.ENGLISH).endsWith("truck")) {
                i5 = 2;
            }
        } else {
            i5 = i4;
        }
        this.r = i5;
    }
}
