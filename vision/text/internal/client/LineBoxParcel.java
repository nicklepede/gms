package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkoj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkoj();
    public final WordBoxParcel[] a;
    public final BoundingBoxParcel b;
    public final BoundingBoxParcel c;
    public final BoundingBoxParcel d;
    public final String e;
    public final float f;
    public final String g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;

    public LineBoxParcel(WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.a = wordBoxParcelArr;
        this.b = boundingBoxParcel;
        this.c = boundingBoxParcel2;
        this.d = boundingBoxParcel3;
        this.e = str;
        this.f = f;
        this.g = str2;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 2, this.a, i);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.l(parcel, 7, this.f);
        atzr.v(parcel, 8, this.g, false);
        atzr.o(parcel, 9, this.h);
        atzr.e(parcel, 10, this.i);
        atzr.o(parcel, 11, this.j);
        atzr.o(parcel, 12, this.k);
        atzr.c(parcel, a);
    }
}
