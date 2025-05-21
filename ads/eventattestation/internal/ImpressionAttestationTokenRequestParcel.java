package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ImpressionAttestationTokenRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new q();
    public final String a;
    public final Integer b;
    public final String c;
    public final Parcel d;
    public final int e;
    public final int f;

    public ImpressionAttestationTokenRequestParcel(String str, Integer num, String str2, Parcel parcel, int i, int i2) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = parcel;
        this.e = i;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.F(parcel, 3, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.s(parcel, 5, this.d, false);
        arxc.o(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.c(parcel, a);
    }
}
