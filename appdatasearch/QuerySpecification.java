package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vnw;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class QuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnw();
    public final boolean a;
    public final List b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final int[] j;
    public final byte[] k;
    public final STSortSpec l;
    public final String m;
    public final CacheSpec n;

    public QuerySpecification(boolean z, List list, List list2, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, int[] iArr, byte[] bArr, STSortSpec sTSortSpec, String str, CacheSpec cacheSpec) {
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = i3;
        this.i = z4;
        this.j = iArr;
        this.k = bArr;
        this.l = sTSortSpec;
        this.m = str;
        this.n = cacheSpec;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.x(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.p(parcel, 10, this.j, false);
        atzr.i(parcel, 11, this.k, false);
        atzr.t(parcel, 12, this.l, i, false);
        atzr.v(parcel, 13, this.m, false);
        atzr.t(parcel, 15, this.n, i, false);
        atzr.c(parcel, a);
    }
}
