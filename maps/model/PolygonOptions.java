package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ccek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccek();
    public final List a;
    public final List b;
    public float c;
    public int d;
    public int e;
    public final float f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public final List k;

    public PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.a = list;
        this.b = list2;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = i3;
        this.k = list3;
    }

    public final void a(Iterable iterable) {
        arwm.t(iterable, "points must not be null.");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.add((LatLng) it.next());
        }
    }

    public final void b() {
        this.i = false;
    }

    public final void c() {
        this.h = true;
    }

    public final void d() {
        this.j = 2;
    }

    public final void e() {
        this.c = 2.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, list, false);
        arxc.G(parcel, 3, this.b);
        arxc.l(parcel, 4, this.c);
        arxc.o(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.l(parcel, 7, this.f);
        arxc.e(parcel, 8, this.g);
        arxc.e(parcel, 9, this.h);
        arxc.e(parcel, 10, this.i);
        arxc.o(parcel, 11, this.j);
        arxc.y(parcel, 12, this.k, false);
        arxc.c(parcel, a);
    }

    public PolygonOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
}
