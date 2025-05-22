package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.whj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DsssEncoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new whj();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public DsssEncoding(int i, boolean z, boolean z2, int i2, int i3, float f, int i4, float f2, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = f;
        this.g = i4;
        this.h = f2;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DsssEncoding)) {
            return false;
        }
        DsssEncoding dsssEncoding = (DsssEncoding) obj;
        return this.a == dsssEncoding.a && this.b == dsssEncoding.b && this.c == dsssEncoding.c && this.d == dsssEncoding.d && this.e == dsssEncoding.e && this.f == dsssEncoding.f && this.g == dsssEncoding.g && this.h == dsssEncoding.h && this.i == dsssEncoding.i && this.j == dsssEncoding.j && this.k == dsssEncoding.k && this.l == dsssEncoding.l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.e(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.l(parcel, 7, this.f);
        atzr.o(parcel, 8, this.g);
        atzr.l(parcel, 9, this.h);
        atzr.o(parcel, 10, this.i);
        atzr.o(parcel, 11, this.j);
        atzr.o(parcel, 12, this.k);
        atzr.o(parcel, 13, this.l);
        atzr.c(parcel, a);
    }
}
