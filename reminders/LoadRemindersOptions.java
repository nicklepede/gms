package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.czmw;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LoadRemindersOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czmw();
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
        int a = atzr.a(parcel);
        atzr.x(parcel, 3, list, false);
        atzr.E(parcel, 4, this.b);
        atzr.I(parcel, 5, this.c);
        atzr.I(parcel, 6, this.d);
        atzr.I(parcel, 7, this.e);
        atzr.I(parcel, 8, this.f);
        atzr.e(parcel, 9, this.g);
        atzr.o(parcel, 10, this.h);
        atzr.e(parcel, 11, this.i);
        atzr.e(parcel, 12, this.j);
        atzr.o(parcel, 13, this.k);
        atzr.o(parcel, 14, this.l);
        atzr.x(parcel, 15, this.m, false);
        atzr.I(parcel, 16, this.n);
        atzr.I(parcel, 17, this.o);
        atzr.c(parcel, a);
    }
}
