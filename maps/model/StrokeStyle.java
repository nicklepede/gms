package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cces;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cces();
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;
    public final StampStyle e;

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = stampStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 2, f);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.t(parcel, 6, this.e, i, false);
        arxc.c(parcel, a);
    }
}
