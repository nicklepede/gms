package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new g();
    public final int a;

    @Deprecated
    public final long b;
    public final Bundle c;

    @Deprecated
    public final int d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final SearchAdRequestParcel j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List o;
    public final String p;
    public final String q;

    @Deprecated
    public final boolean r;
    public final AdDataParcel s;
    public final int t;
    public final String u;
    public final List v;
    public final int w;
    public final String x;
    public final int y;
    public final long z;

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, AdDataParcel adDataParcel, int i4, String str5, List list3, int i5, String str6, int i6, long j2) {
        this.a = i;
        this.b = j;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = searchAdRequestParcel;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
        this.s = adDataParcel;
        this.t = i4;
        this.u = str5;
        this.v = list3 == null ? new ArrayList() : list3;
        this.w = i5;
        this.x = str6;
        this.y = i6;
        this.z = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.a == adRequestParcel.a && this.b == adRequestParcel.b && com.google.android.gms.ads.internal.util.client.i.a(this.c, adRequestParcel.c) && this.d == adRequestParcel.d && arwb.b(this.e, adRequestParcel.e) && this.f == adRequestParcel.f && this.g == adRequestParcel.g && this.h == adRequestParcel.h && arwb.b(this.i, adRequestParcel.i) && arwb.b(this.j, adRequestParcel.j) && arwb.b(this.k, adRequestParcel.k) && arwb.b(this.l, adRequestParcel.l) && com.google.android.gms.ads.internal.util.client.i.a(this.m, adRequestParcel.m) && com.google.android.gms.ads.internal.util.client.i.a(this.n, adRequestParcel.n) && arwb.b(this.o, adRequestParcel.o) && arwb.b(this.p, adRequestParcel.p) && arwb.b(this.q, adRequestParcel.q) && this.r == adRequestParcel.r && this.t == adRequestParcel.t && arwb.b(this.u, adRequestParcel.u) && arwb.b(this.v, adRequestParcel.v) && this.w == adRequestParcel.w && arwb.b(this.x, adRequestParcel.x) && this.y == adRequestParcel.y && this.z == adRequestParcel.z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u, this.v, Integer.valueOf(this.w), this.x, Integer.valueOf(this.y), Long.valueOf(this.z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.q(parcel, 2, this.b);
        arxc.g(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.x(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.o(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.t(parcel, 10, this.j, i, false);
        arxc.t(parcel, 11, this.k, i, false);
        arxc.v(parcel, 12, this.l, false);
        arxc.g(parcel, 13, this.m, false);
        arxc.g(parcel, 14, this.n, false);
        arxc.x(parcel, 15, this.o, false);
        arxc.v(parcel, 16, this.p, false);
        arxc.v(parcel, 17, this.q, false);
        arxc.e(parcel, 18, this.r);
        arxc.t(parcel, 19, this.s, i, false);
        arxc.o(parcel, 20, this.t);
        arxc.v(parcel, 21, this.u, false);
        arxc.x(parcel, 22, this.v, false);
        arxc.o(parcel, 23, this.w);
        arxc.v(parcel, 24, this.x, false);
        arxc.o(parcel, 25, this.y);
        arxc.q(parcel, 26, this.z);
        arxc.c(parcel, a);
    }
}
