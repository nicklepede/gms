package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vom;
import defpackage.von;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SearchResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new von();
    public final String a;
    public final int[] b;
    public final byte[] c;
    final Bundle[] d;
    public final Bundle[] e;
    public final Bundle[] f;
    public final int g;
    public final int[] h;
    public final String[] i;
    final byte[] j;
    final double[] k;
    final Bundle l;
    public final int m;
    public final long[] n;
    public final long[] o;
    final Bundle[] p;
    final int[] q;
    final byte[] r;
    final boolean s;

    public SearchResults(String str, int[] iArr, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, int i, int[] iArr2, String[] strArr, byte[] bArr2, double[] dArr, Bundle bundle, int i2, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3, boolean z) {
        this.a = str;
        this.b = iArr;
        this.c = bArr;
        this.d = bundleArr;
        this.e = bundleArr2;
        this.f = bundleArr3;
        this.g = i;
        this.h = iArr2;
        this.i = strArr;
        this.j = bArr2;
        this.k = dArr;
        this.l = bundle;
        this.m = i2;
        this.n = jArr;
        this.o = jArr2;
        this.p = bundleArr4;
        this.q = iArr3;
        this.r = bArr3;
        this.s = z;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new vom(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.p(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.J(parcel, 4, this.d, i);
        atzr.J(parcel, 5, this.e, i);
        atzr.J(parcel, 6, this.f, i);
        atzr.o(parcel, 7, this.g);
        atzr.p(parcel, 8, this.h, false);
        atzr.w(parcel, 9, this.i, false);
        atzr.i(parcel, 10, this.j, false);
        atzr.k(parcel, 11, this.k, false);
        atzr.g(parcel, 12, this.l, false);
        atzr.o(parcel, 13, this.m);
        atzr.r(parcel, 14, this.n, false);
        atzr.r(parcel, 15, this.o, false);
        atzr.J(parcel, 16, this.p, i);
        atzr.p(parcel, 17, this.q, false);
        atzr.i(parcel, 18, this.r, false);
        atzr.e(parcel, 19, this.s);
        atzr.c(parcel, a);
    }

    public SearchResults(int i, int[] iArr, String[] strArr, int[] iArr2, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, byte[] bArr2, double[] dArr, Bundle bundle, int i2, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3, boolean z) {
        this(null, iArr2, bArr, bundleArr, bundleArr2, bundleArr3, i, iArr, strArr, bArr2, dArr, bundle, i2, jArr, jArr2, bundleArr4, iArr3, bArr3, z);
    }

    public SearchResults(String str) {
        this(str, null, null, null, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, false);
    }
}
