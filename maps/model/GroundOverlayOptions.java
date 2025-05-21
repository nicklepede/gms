package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.azhr;
import defpackage.azht;
import defpackage.ccdr;
import defpackage.ccea;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccea();
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
    private ccdr l;

    public GroundOverlayOptions() {
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
    }

    public final void a(ccdr ccdrVar) {
        arwm.t(ccdrVar, "imageDescriptor must not be null");
        this.l = ccdrVar;
    }

    public final void b() {
        arwm.c(true, "Transparency must be in the range [0..1]");
        this.h = 0.4f;
    }

    public final void c(LatLng latLng, float f, float f2) {
        arwm.m(this.d == null, "Position has already been set using positionFromBounds");
        arwm.c(latLng != null, "Location must be specified");
        arwm.c(f >= 0.0f, "Width must be non-negative");
        arwm.c(f2 >= 0.0f, "Height must be non-negative");
        this.a = latLng;
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 2, this.l.a.asBinder());
        arxc.t(parcel, 3, this.a, i, false);
        arxc.l(parcel, 4, this.b);
        arxc.l(parcel, 5, this.c);
        arxc.t(parcel, 6, this.d, i, false);
        arxc.l(parcel, 7, this.e);
        arxc.l(parcel, 8, this.f);
        arxc.e(parcel, 9, this.g);
        arxc.l(parcel, 10, this.h);
        arxc.l(parcel, 11, this.i);
        arxc.l(parcel, 12, this.j);
        arxc.e(parcel, 13, this.k);
        arxc.c(parcel, a);
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        azht azhrVar;
        this.g = true;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = false;
        if (iBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(iBinder);
        }
        this.l = new ccdr(azhrVar);
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
