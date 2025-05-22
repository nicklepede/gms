package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        return this.a == adRequestParcel.a && this.b == adRequestParcel.b && com.google.android.gms.ads.internal.util.client.i.a(this.c, adRequestParcel.c) && this.d == adRequestParcel.d && atyq.b(this.e, adRequestParcel.e) && this.f == adRequestParcel.f && this.g == adRequestParcel.g && this.h == adRequestParcel.h && atyq.b(this.i, adRequestParcel.i) && atyq.b(this.j, adRequestParcel.j) && atyq.b(this.k, adRequestParcel.k) && atyq.b(this.l, adRequestParcel.l) && com.google.android.gms.ads.internal.util.client.i.a(this.m, adRequestParcel.m) && com.google.android.gms.ads.internal.util.client.i.a(this.n, adRequestParcel.n) && atyq.b(this.o, adRequestParcel.o) && atyq.b(this.p, adRequestParcel.p) && atyq.b(this.q, adRequestParcel.q) && this.r == adRequestParcel.r && this.t == adRequestParcel.t && atyq.b(this.u, adRequestParcel.u) && atyq.b(this.v, adRequestParcel.v) && this.w == adRequestParcel.w && atyq.b(this.x, adRequestParcel.x) && this.y == adRequestParcel.y && this.z == adRequestParcel.z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u, this.v, Integer.valueOf(this.w), this.x, Integer.valueOf(this.y), Long.valueOf(this.z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.q(parcel, 2, this.b);
        atzr.g(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.x(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.t(parcel, 10, this.j, i, false);
        atzr.t(parcel, 11, this.k, i, false);
        atzr.v(parcel, 12, this.l, false);
        atzr.g(parcel, 13, this.m, false);
        atzr.g(parcel, 14, this.n, false);
        atzr.x(parcel, 15, this.o, false);
        atzr.v(parcel, 16, this.p, false);
        atzr.v(parcel, 17, this.q, false);
        atzr.e(parcel, 18, this.r);
        atzr.t(parcel, 19, this.s, i, false);
        atzr.o(parcel, 20, this.t);
        atzr.v(parcel, 21, this.u, false);
        atzr.x(parcel, 22, this.v, false);
        atzr.o(parcel, 23, this.w);
        atzr.v(parcel, 24, this.x, false);
        atzr.o(parcel, 25, this.y);
        atzr.q(parcel, 26, this.z);
        atzr.c(parcel, a);
    }
}
