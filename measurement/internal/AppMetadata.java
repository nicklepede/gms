package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cdgz;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdgz();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.q(parcel, 6, this.e);
        arxc.q(parcel, 7, this.f);
        arxc.v(parcel, 8, this.g, false);
        arxc.e(parcel, 9, this.h);
        arxc.e(parcel, 10, this.i);
        arxc.q(parcel, 11, this.j);
        arxc.v(parcel, 12, this.k, false);
        arxc.q(parcel, 14, this.l);
        arxc.o(parcel, 15, this.m);
        arxc.e(parcel, 16, this.n);
        arxc.e(parcel, 18, this.o);
        arxc.v(parcel, 19, this.p, false);
        arxc.z(parcel, 21, this.q);
        arxc.q(parcel, 22, this.r);
        arxc.x(parcel, 23, this.s, false);
        arxc.v(parcel, 24, this.t, false);
        arxc.v(parcel, 25, this.u, false);
        arxc.v(parcel, 26, this.v, false);
        arxc.v(parcel, 27, this.w, false);
        arxc.e(parcel, 28, this.x);
        arxc.q(parcel, 29, this.y);
        arxc.o(parcel, 30, this.z);
        arxc.v(parcel, 31, this.A, false);
        arxc.o(parcel, 32, this.B);
        arxc.q(parcel, 34, this.C);
        arxc.v(parcel, 35, this.D, false);
        arxc.v(parcel, 36, this.E, false);
        arxc.q(parcel, 37, this.F);
        arxc.o(parcel, 38, this.G);
        arxc.c(parcel, a);
    }

    public AppMetadata(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10, String str11, boolean z5, long j6, int i2, String str12, int i3, long j7, String str13, String str14, long j8, int i4) {
        arwm.q(str);
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
