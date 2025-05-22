package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cemq;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cemq();
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public CircleOptions() {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    public final void a(LatLng latLng) {
        atzb.t(latLng, "center must not be null.");
        this.a = latLng;
    }

    public final void b() {
        this.e = 521827304;
    }

    public final void c() {
        this.d = -15043608;
    }

    public final void d() {
        this.c = 6.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.j(parcel, 3, this.b);
        atzr.l(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.l(parcel, 7, this.f);
        atzr.e(parcel, 8, this.g);
        atzr.e(parcel, 9, this.h);
        atzr.y(parcel, 10, this.i, false);
        atzr.c(parcel, a);
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.a = latLng;
        this.b = d;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = list;
    }
}
