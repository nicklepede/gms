package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkee;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class Position extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkee();
    public final double a;
    public final double b;

    public Position(double d, double d2) {
        this.b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double d = this.a;
        int a = atzr.a(parcel);
        atzr.j(parcel, 1, d);
        atzr.j(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
