package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cenn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cenn();
    public final StrokeStyle a;
    public final double b;

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.a = strokeStyle;
        this.b = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StrokeStyle strokeStyle = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, strokeStyle, i, false);
        atzr.j(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
