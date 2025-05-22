package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkon;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WordBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkon();
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
        int a = atzr.a(parcel);
        atzr.J(parcel, 2, this.a, i);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.l(parcel, 6, this.e);
        atzr.v(parcel, 7, this.f, false);
        atzr.e(parcel, 8, this.g);
        atzr.c(parcel, a);
    }
}
