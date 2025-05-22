package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cfpy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfpy();
    public final String A;
    public final int B;
    public final long C;
    public final String D;
    public final String E;
    public final long F;
    public final int G;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final Boolean q;
    public final long r;
    public final List s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final boolean x;
    public final long y;
    public final int z;

    public AppMetadata(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10, String str11, boolean z5, long j6, int i2, String str12, int i3, long j7, String str13, String str14, long j8, int i4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = str7;
        this.q = bool;
        this.r = j5;
        this.s = list;
        this.t = str8;
        this.u = str9;
        this.v = str10;
        this.w = str11;
        this.x = z5;
        this.y = j6;
        this.z = i2;
        this.A = str12;
        this.B = i3;
        this.C = j7;
        this.D = str13;
        this.E = str14;
        this.F = j8;
        this.G = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.q(parcel, 6, this.e);
        atzr.q(parcel, 7, this.f);
        atzr.v(parcel, 8, this.g, false);
        atzr.e(parcel, 9, this.h);
        atzr.e(parcel, 10, this.i);
        atzr.q(parcel, 11, this.j);
        atzr.v(parcel, 12, this.k, false);
        atzr.q(parcel, 14, this.l);
        atzr.o(parcel, 15, this.m);
        atzr.e(parcel, 16, this.n);
        atzr.e(parcel, 18, this.o);
        atzr.v(parcel, 19, this.p, false);
        atzr.z(parcel, 21, this.q);
        atzr.q(parcel, 22, this.r);
        atzr.x(parcel, 23, this.s, false);
        atzr.v(parcel, 24, this.t, false);
        atzr.v(parcel, 25, this.u, false);
        atzr.v(parcel, 26, this.v, false);
        atzr.v(parcel, 27, this.w, false);
        atzr.e(parcel, 28, this.x);
        atzr.q(parcel, 29, this.y);
        atzr.o(parcel, 30, this.z);
        atzr.v(parcel, 31, this.A, false);
        atzr.o(parcel, 32, this.B);
        atzr.q(parcel, 34, this.C);
        atzr.v(parcel, 35, this.D, false);
        atzr.v(parcel, 36, this.E, false);
        atzr.q(parcel, 37, this.F);
        atzr.o(parcel, 38, this.G);
        atzr.c(parcel, a);
    }

    public AppMetadata(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10, String str11, boolean z5, long j6, int i2, String str12, int i3, long j7, String str13, String str14, long j8, int i4) {
        atzb.q(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = str7;
        this.q = bool;
        this.r = j5;
        this.s = list;
        this.t = str8;
        this.u = str9;
        this.v = str10;
        this.w = str11;
        this.x = z5;
        this.y = j6;
        this.z = i2;
        this.A = str12;
        this.B = i3;
        this.C = j7;
        this.D = str13;
        this.E = str14;
        this.F = j8;
        this.G = i4;
    }
}
