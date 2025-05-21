package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.didc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WordBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didc();
    public final SymbolBoxParcel[] a;
    public final BoundingBoxParcel b;
    public final BoundingBoxParcel c;
    public final String d;
    public final float e;
    public final String f;
    public final boolean g;

    public WordBoxParcel(SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.a = symbolBoxParcelArr;
        this.b = boundingBoxParcel;
        this.c = boundingBoxParcel2;
        this.d = str;
        this.e = f;
        this.f = str2;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 2, this.a, i);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.l(parcel, 6, this.e);
        arxc.v(parcel, 7, this.f, false);
        arxc.e(parcel, 8, this.g);
        arxc.c(parcel, a);
    }
}
