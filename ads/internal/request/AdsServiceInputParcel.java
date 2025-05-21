package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class AdsServiceInputParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final ApplicationInfo a;
    public final String b;
    public final PackageInfo c;
    public final String d;
    public final int e;
    public final String f;
    public final List g;
    public final boolean h;
    public final boolean i;

    public AdsServiceInputParcel(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i, String str3, List list, boolean z, boolean z2) {
        this.b = str;
        this.a = applicationInfo;
        this.c = packageInfo;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = list;
        this.h = z;
        this.i = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.x(parcel, 7, this.g, false);
        arxc.e(parcel, 8, this.h);
        arxc.e(parcel, 9, this.i);
        arxc.c(parcel, a);
    }
}
