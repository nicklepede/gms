package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.o(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.o(parcel, 11, this.k);
        atzr.c(parcel, a);
    }
}
