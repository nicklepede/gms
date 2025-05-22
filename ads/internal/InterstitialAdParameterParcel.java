package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.v(parcel, 4, this.c, false);
        atzr.e(parcel, 5, this.d);
        atzr.l(parcel, 6, this.e);
        atzr.o(parcel, 7, this.f);
        atzr.e(parcel, 8, this.g);
        atzr.e(parcel, 9, this.h);
        atzr.e(parcel, 10, this.i);
        atzr.c(parcel, a);
    }
}
