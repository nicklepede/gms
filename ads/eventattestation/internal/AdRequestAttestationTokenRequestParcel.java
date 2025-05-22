package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.F(parcel, 4, this.c);
        atzr.v(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }
}
