package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class NativeAdOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final VideoOptionsParcel f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2, int i3, VideoOptionsParcel videoOptionsParcel, boolean z3, int i4, int i5, boolean z4, int i6) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = videoOptionsParcel;
        this.g = z3;
        this.h = i4;
        this.j = z4;
        this.i = i5;
        this.k = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.o(parcel, 9, this.i);
        arxc.e(parcel, 10, this.j);
        arxc.o(parcel, 11, this.k);
        arxc.c(parcel, a);
    }
}
