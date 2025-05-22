package com.google.android.gms.instantapps.internal;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqmw;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AppInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqmw();
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final byte[] f;
    public final PackageInfo g;
    public final List h;
    public final byte[] i;

    public AppInfo(String str, String str2, List list, List list2, List list3, int i, byte[] bArr, PackageInfo packageInfo, byte[] bArr2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = bArr;
        this.g = packageInfo;
        this.h = list3;
        this.i = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.y(parcel, 5, this.c, false);
        atzr.y(parcel, 6, this.d, false);
        atzr.o(parcel, 7, this.e);
        atzr.i(parcel, 8, this.f, false);
        atzr.t(parcel, 9, this.g, i, false);
        atzr.y(parcel, 11, this.h, false);
        atzr.i(parcel, 12, this.i, false);
        atzr.c(parcel, a);
    }
}
