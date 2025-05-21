package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdRequestAttestationTokenRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final String a;
    public final byte[] b;
    public final Integer c;
    public final String d;

    public AdRequestAttestationTokenRequestParcel(String str, byte[] bArr, Integer num, String str2) {
        this.a = str;
        this.b = bArr;
        this.c = num;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.F(parcel, 4, this.c);
        arxc.v(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
