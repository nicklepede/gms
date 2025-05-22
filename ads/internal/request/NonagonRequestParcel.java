package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class NonagonRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new p();
    public final Bundle a;
    public final VersionInfoParcel b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public final PoolConfiguration i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Bundle m;
    public final Bundle n;
    public final int o;

    public NonagonRequestParcel(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, PoolConfiguration poolConfiguration, String str4, boolean z, boolean z2, Bundle bundle2, Bundle bundle3, int i) {
        this.a = bundle;
        this.b = versionInfoParcel;
        this.d = str;
        this.c = applicationInfo;
        this.e = list;
        this.f = packageInfo;
        this.g = str2;
        this.h = str3;
        this.i = poolConfiguration;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = bundle2;
        this.n = bundle3;
        this.o = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = atzr.a(parcel);
        atzr.g(parcel, 1, bundle, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.x(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.v(parcel, 9, this.h, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.v(parcel, 11, this.j, false);
        atzr.e(parcel, 12, this.k);
        atzr.e(parcel, 13, this.l);
        atzr.g(parcel, 14, this.m, false);
        atzr.g(parcel, 15, this.n, false);
        atzr.o(parcel, 16, this.o);
        atzr.c(parcel, a);
    }
}
