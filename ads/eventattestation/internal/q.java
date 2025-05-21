package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                str = arxb.s(parcel, readInt);
            } else if (d == 3) {
                num = arxb.q(parcel, readInt);
            } else if (d == 4) {
                str2 = arxb.s(parcel, readInt);
            } else if (d == 5) {
                parcel2 = arxb.l(parcel, readInt);
            } else if (d == 6) {
                i = arxb.f(parcel, readInt);
            } else if (d != 7) {
                arxb.C(parcel, readInt);
            } else {
                i2 = arxb.f(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new ImpressionAttestationTokenRequestParcel(str, num, str2, parcel2, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ImpressionAttestationTokenRequestParcel[i];
    }
}
