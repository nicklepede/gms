package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdValueParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new k();
    public final int a;
    public final int b;
    public final String c;
    public final long d;

    public AdValueParcel(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
