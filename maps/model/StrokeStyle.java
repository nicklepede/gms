package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cenm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cenm();
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
        int a = atzr.a(parcel);
        atzr.l(parcel, 2, f);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.e(parcel, 5, this.d);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.c(parcel, a);
    }
}
