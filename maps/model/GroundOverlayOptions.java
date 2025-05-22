package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.ceml;
import defpackage.cemu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cemu();
    public LatLng a;
    public float b;
    public float c;
    public LatLngBounds d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    private ceml l;

    public GroundOverlayOptions() {
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
    }

    public final void a(ceml cemlVar) {
        atzb.t(cemlVar, "imageDescriptor must not be null");
        this.l = cemlVar;
    }

    public final void b() {
        atzb.c(true, "Transparency must be in the range [0..1]");
        this.h = 0.4f;
    }

    public final void c(LatLng latLng, float f, float f2) {
        atzb.m(this.d == null, "Position has already been set using positionFromBounds");
        atzb.c(latLng != null, "Location must be specified");
        atzb.c(f >= 0.0f, "Width must be non-negative");
        atzb.c(f2 >= 0.0f, "Height must be non-negative");
        this.a = latLng;
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 2, this.l.a.asBinder());
        atzr.t(parcel, 3, this.a, i, false);
        atzr.l(parcel, 4, this.b);
        atzr.l(parcel, 5, this.c);
        atzr.t(parcel, 6, this.d, i, false);
        atzr.l(parcel, 7, this.e);
        atzr.l(parcel, 8, this.f);
        atzr.e(parcel, 9, this.g);
        atzr.l(parcel, 10, this.h);
        atzr.l(parcel, 11, this.i);
        atzr.l(parcel, 12, this.j);
        atzr.e(parcel, 13, this.k);
        atzr.c(parcel, a);
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        bblp bblnVar;
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
        if (iBinder == null) {
            bblnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(iBinder);
        }
        this.l = new ceml(bblnVar);
        this.a = latLng;
        this.b = f;
        this.c = f2;
        this.d = latLngBounds;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = z2;
    }
}
