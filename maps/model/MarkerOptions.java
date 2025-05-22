package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.atzr;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.ceml;
import defpackage.cena;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cena();
    public LatLng a;
    public String b;
    public String c;
    public ceml d;
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        ceml cemlVar = this.d;
        atzr.D(parcel, 5, cemlVar == null ? null : cemlVar.a.asBinder());
        atzr.l(parcel, 6, this.e);
        atzr.l(parcel, 7, this.f);
        atzr.e(parcel, 8, this.g);
        atzr.e(parcel, 9, this.h);
        atzr.e(parcel, 10, this.i);
        atzr.l(parcel, 11, this.j);
        atzr.l(parcel, 12, this.k);
        atzr.l(parcel, 13, this.l);
        atzr.l(parcel, 14, this.m);
        atzr.l(parcel, 15, this.n);
        atzr.o(parcel, 17, this.o);
        atzr.D(parcel, 18, new ObjectWrapper(this.r));
        atzr.o(parcel, 19, this.p);
        atzr.v(parcel, 20, this.q, false);
        atzr.c(parcel, a);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3) {
        bblp bblnVar;
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
            this.d = new ceml(queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(iBinder));
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
            bblnVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface2 instanceof bblp ? (bblp) queryLocalInterface2 : new bbln(iBinder2);
        }
        this.r = bblnVar != null ? (View) ObjectWrapper.a(bblnVar) : null;
        this.q = str3;
    }
}
