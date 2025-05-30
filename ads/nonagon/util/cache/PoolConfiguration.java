package com.google.android.gms.ads.nonagon.util.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PoolConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    private final int[] h;
    private final int[] i;
    private final int[] j;

    public PoolConfiguration(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        int[] iArr = {1, 2, 3};
        this.h = iArr;
        int[] iArr2 = {1, 2, 3};
        this.i = iArr2;
        int[] iArr3 = {1};
        this.j = iArr3;
        this.a = i;
        int i7 = iArr[i];
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = i5;
        int i8 = iArr2[i5];
        this.g = i6;
        int i9 = iArr3[i6];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
