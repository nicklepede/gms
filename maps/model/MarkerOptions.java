package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.arxc;
import defpackage.azhr;
import defpackage.azht;
import defpackage.ccdr;
import defpackage.cceg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cceg();
    public LatLng a;
    public String b;
    public String c;
    public ccdr d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public int p;
    public String q;
    private View r;

    public MarkerOptions() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = 0;
    }

    public final void a(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.a = latLng;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        ccdr ccdrVar = this.d;
        arxc.D(parcel, 5, ccdrVar == null ? null : ccdrVar.a.asBinder());
        arxc.l(parcel, 6, this.e);
        arxc.l(parcel, 7, this.f);
        arxc.e(parcel, 8, this.g);
        arxc.e(parcel, 9, this.h);
        arxc.e(parcel, 10, this.i);
        arxc.l(parcel, 11, this.j);
        arxc.l(parcel, 12, this.k);
        arxc.l(parcel, 13, this.l);
        arxc.l(parcel, 14, this.m);
        arxc.l(parcel, 15, this.n);
        arxc.o(parcel, 17, this.o);
        arxc.D(parcel, 18, new ObjectWrapper(this.r));
        arxc.o(parcel, 19, this.p);
        arxc.v(parcel, 20, this.q, false);
        arxc.c(parcel, a);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3) {
        azht azhrVar;
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            this.d = new ccdr(queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(iBinder));
        }
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
        this.p = i2;
        this.o = i;
        if (iBinder2 == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface2 instanceof azht ? (azht) queryLocalInterface2 : new azhr(iBinder2);
        }
        this.r = azhrVar != null ? (View) ObjectWrapper.a(azhrVar) : null;
        this.q = str3;
    }
}
