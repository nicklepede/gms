package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ccet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccet();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, strokeStyle, i, false);
        arxc.j(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
