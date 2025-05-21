package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dhsw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class Position extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhsw();
    public final double a;
    public final double b;

    public Position(double d, double d2) {
        this.b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double d = this.a;
        int a = arxc.a(parcel);
        arxc.j(parcel, 1, d);
        arxc.j(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
