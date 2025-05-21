package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dicy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dicy();
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
        int a = arxc.a(parcel);
        arxc.J(parcel, 2, this.a, i);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.l(parcel, 7, this.f);
        arxc.v(parcel, 8, this.g, false);
        arxc.o(parcel, 9, this.h);
        arxc.e(parcel, 10, this.i);
        arxc.o(parcel, 11, this.j);
        arxc.o(parcel, 12, this.k);
        arxc.c(parcel, a);
    }
}
