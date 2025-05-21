package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ccem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccem();
    public final List a;
    public float b;
    public int c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Cap h;
    public Cap i;
    public int j;
    public List k;
    private List l;

    public PolylineOptions() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.l = new ArrayList();
        this.a = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, list, false);
        arxc.l(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.l(parcel, 5, this.d);
        arxc.e(parcel, 6, this.e);
        arxc.e(parcel, 7, this.f);
        arxc.e(parcel, 8, this.g);
        arxc.t(parcel, 9, this.h.a(), i, false);
        arxc.t(parcel, 10, this.i.a(), i, false);
        arxc.o(parcel, 11, this.j);
        arxc.y(parcel, 12, this.k, false);
        ArrayList arrayList = new ArrayList(this.l.size());
        for (StyleSpan styleSpan : this.l) {
            StrokeStyle strokeStyle = styleSpan.a;
            float f = strokeStyle.a;
            Pair pair = new Pair(Integer.valueOf(strokeStyle.b), Integer.valueOf(strokeStyle.c));
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            boolean z = strokeStyle.d;
            arrayList.add(new StyleSpan(new StrokeStyle(this.b, intValue, intValue2, this.e, strokeStyle.e), styleSpan.b));
        }
        arxc.y(parcel, 13, arrayList, false);
        arxc.c(parcel, a);
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.l = new ArrayList();
        this.a = list;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (cap != null) {
            this.h = cap;
        }
        if (cap2 != null) {
            this.i = cap2;
        }
        this.j = i2;
        this.k = list2;
        if (list3 != null) {
            this.l = list3;
        }
    }
}
