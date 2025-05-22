package com.google.android.gms.appsearch.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wci;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SchemaMigrationStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wci();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;

    public SchemaMigrationStats(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, int i9, int i10, int i11) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = z;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10;
        this.n = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.o(parcel, 10, this.j);
        atzr.o(parcel, 11, this.k);
        atzr.o(parcel, 12, this.l);
        atzr.o(parcel, 13, this.m);
        atzr.o(parcel, 14, this.n);
        atzr.c(parcel, a);
    }
}
