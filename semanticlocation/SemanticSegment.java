package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czhc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticSegment extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czhc();
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
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.e(parcel, 6, false);
        arxc.v(parcel, 7, this.e, false);
        arxc.o(parcel, 8, this.f);
        arxc.t(parcel, 9, this.g, i, false);
        arxc.t(parcel, 10, this.h, i, false);
        arxc.o(parcel, 11, this.i);
        arxc.o(parcel, 12, this.j);
        arxc.c(parcel, a);
    }
}
