package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxda;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LoadRemindersOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxda();
    public final List a;
    public final List b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final List m;
    public final Long n;
    public final Long o;

    public LoadRemindersOptions(List list, List list2, Long l, Long l2, Long l3, Long l4, boolean z, int i, boolean z2, boolean z3, int i2, int i3, List list3, Long l5, Long l6) {
        this.a = list;
        this.b = list2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = z;
        this.h = i;
        this.i = z2;
        this.j = z3;
        this.k = i2;
        this.l = i3;
        this.m = list3;
        this.n = l5;
        this.o = l6;
    }

    public final boolean a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 3, list, false);
        arxc.E(parcel, 4, this.b);
        arxc.I(parcel, 5, this.c);
        arxc.I(parcel, 6, this.d);
        arxc.I(parcel, 7, this.e);
        arxc.I(parcel, 8, this.f);
        arxc.e(parcel, 9, this.g);
        arxc.o(parcel, 10, this.h);
        arxc.e(parcel, 11, this.i);
        arxc.e(parcel, 12, this.j);
        arxc.o(parcel, 13, this.k);
        arxc.o(parcel, 14, this.l);
        arxc.x(parcel, 15, this.m, false);
        arxc.I(parcel, 16, this.n);
        arxc.I(parcel, 17, this.o);
        arxc.c(parcel, a);
    }
}
