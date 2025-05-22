package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbra;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticSegment extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbra();
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final Visit g;
    public final Activity h;
    public final int i;
    public final int j;

    public SemanticSegment(long j, long j2, int i, int i2, String str, int i3, Visit visit, Activity activity, int i4, int i5) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = i3;
        this.g = visit;
        this.h = activity;
        this.i = i4;
        this.j = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.e(parcel, 6, false);
        atzr.v(parcel, 7, this.e, false);
        atzr.o(parcel, 8, this.f);
        atzr.t(parcel, 9, this.g, i, false);
        atzr.t(parcel, 10, this.h, i, false);
        atzr.o(parcel, 11, this.i);
        atzr.o(parcel, 12, this.j);
        atzr.c(parcel, a);
    }
}
