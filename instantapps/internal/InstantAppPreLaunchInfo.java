package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bqni;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InstantAppPreLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqni();
    public final int a;
    public final String b;
    public final boolean c;
    public final Intent d;
    public final Intent e;
    public final AppInfo f;
    public final Route g;
    public final boolean h;
    public final byte[] i;
    public final String j;
    public final int k;
    public final int l;
    public final String m;
    public final byte[] n;
    public final Bundle o;

    public InstantAppPreLaunchInfo(int i, String str, boolean z, Intent intent, Intent intent2, AppInfo appInfo, Route route, boolean z2, byte[] bArr, String str2, int i2, int i3, String str3, byte[] bArr2, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = intent;
        this.e = intent2;
        this.f = appInfo;
        this.g = route;
        this.h = z2;
        this.i = bArr;
        this.j = str2;
        this.k = i2;
        this.m = str3;
        this.l = i3;
        this.n = bArr2;
        this.o = bundle;
    }

    public static InstantAppPreLaunchInfo a(Intent intent, boolean z, byte[] bArr) {
        atzb.s(intent);
        return new InstantAppPreLaunchInfo(0, null, z, null, intent, null, null, false, bArr, null, 0, 0, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.v(parcel, 3, this.b, false);
        atzr.e(parcel, 4, this.c);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.t(parcel, 8, this.f, i, false);
        atzr.t(parcel, 9, this.g, i, false);
        atzr.e(parcel, 10, this.h);
        atzr.i(parcel, 11, this.i, false);
        atzr.v(parcel, 12, this.j, false);
        atzr.o(parcel, 13, this.k);
        atzr.v(parcel, 14, this.m, false);
        atzr.g(parcel, 15, this.o, false);
        atzr.o(parcel, 16, this.l);
        atzr.i(parcel, 17, this.n, false);
        atzr.c(parcel, a);
    }
}
