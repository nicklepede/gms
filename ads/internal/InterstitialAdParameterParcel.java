package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class InterstitialAdParameterParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final float e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public InterstitialAdParameterParcel(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = f;
        this.f = i;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.e(parcel, 5, this.d);
        arxc.l(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.e(parcel, 8, this.g);
        arxc.e(parcel, 9, this.h);
        arxc.e(parcel, 10, this.i);
        arxc.c(parcel, a);
    }
}
