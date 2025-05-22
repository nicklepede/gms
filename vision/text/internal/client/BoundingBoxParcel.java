package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkog;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkog();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.l(parcel, 6, this.e);
        atzr.c(parcel, a);
    }
}
