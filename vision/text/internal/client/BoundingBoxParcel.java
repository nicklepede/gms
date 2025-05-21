package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dicv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dicv();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.o(parcel, 5, this.d);
        arxc.l(parcel, 6, this.e);
        arxc.c(parcel, a);
    }
}
