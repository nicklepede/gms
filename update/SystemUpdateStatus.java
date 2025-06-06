package com.google.android.gms.update;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.djph;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SystemUpdateStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djph();
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final ExpeditedUpdateStatus D;
    public final long E;
    public final long F;
    public final int G;
    public final long H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final Bundle L;
    public final UpdateInfo M;
    public final boolean N;
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final double f;
    public final DownloadOptions g;
    public final InstallationOptions h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final ActivityStatus r;
    public final long s;
    public final String t;
    public final boolean u;
    public final long v;
    public final String w;
    public final UpdateDescription x;
    public final boolean y;
    public final boolean z;

    public SystemUpdateStatus(String str, boolean z, int i, int i2, int i3, double d, DownloadOptions downloadOptions, InstallationOptions installationOptions, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, long j2, long j3, long j4, ActivityStatus activityStatus, long j5, String str2, boolean z7, long j6, String str3, UpdateDescription updateDescription, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ExpeditedUpdateStatus expeditedUpdateStatus, long j7, long j8, int i4, long j9, boolean z13, boolean z14, boolean z15, Bundle bundle, UpdateInfo updateInfo, boolean z16) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = d;
        this.g = downloadOptions;
        this.h = installationOptions;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = j;
        this.o = j2;
        this.p = j3;
        this.q = j4;
        this.r = activityStatus;
        this.s = j5;
        this.t = str2;
        this.u = z7;
        this.v = j6;
        this.w = str3;
        this.x = updateDescription;
        this.y = z8;
        this.z = z9;
        this.A = z10;
        this.B = z11;
        this.C = z12;
        this.D = expeditedUpdateStatus;
        this.E = j7;
        this.F = j8;
        this.G = i4;
        this.H = j9;
        this.I = z13;
        this.J = z14;
        this.K = z15;
        this.L = bundle;
        this.M = updateInfo;
        this.N = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.e(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.j(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.e(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.e(parcel, 12, this.l);
        atzr.e(parcel, 13, this.m);
        atzr.q(parcel, 14, this.n);
        atzr.q(parcel, 15, this.o);
        atzr.q(parcel, 16, this.p);
        atzr.q(parcel, 17, this.q);
        atzr.t(parcel, 18, this.r, i, false);
        atzr.q(parcel, 19, this.s);
        atzr.v(parcel, 20, this.t, false);
        atzr.e(parcel, 21, this.u);
        atzr.q(parcel, 22, this.v);
        atzr.v(parcel, 23, this.w, false);
        atzr.t(parcel, 24, this.x, i, false);
        atzr.e(parcel, 25, this.y);
        atzr.e(parcel, 26, this.z);
        atzr.e(parcel, 27, this.A);
        atzr.e(parcel, 28, this.B);
        atzr.e(parcel, 30, this.C);
        atzr.t(parcel, 31, this.D, i, false);
        atzr.q(parcel, 32, this.E);
        atzr.q(parcel, 33, this.F);
        atzr.o(parcel, 34, this.G);
        atzr.q(parcel, 35, this.H);
        atzr.e(parcel, 36, this.I);
        atzr.e(parcel, 37, this.J);
        atzr.e(parcel, 38, this.K);
        atzr.g(parcel, 39, this.L, false);
        atzr.t(parcel, 40, this.M, i, false);
        atzr.e(parcel, 41, this.N);
        atzr.c(parcel, a);
    }
}
