package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.x(parcel, 7, this.g, false);
        atzr.e(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.c(parcel, a);
    }
}
