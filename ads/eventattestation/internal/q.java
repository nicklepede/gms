package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 1) {
                str = atzq.s(parcel, readInt);
            } else if (d == 3) {
                num = atzq.q(parcel, readInt);
            } else if (d == 4) {
                str2 = atzq.s(parcel, readInt);
            } else if (d == 5) {
                parcel2 = atzq.l(parcel, readInt);
            } else if (d == 6) {
                i = atzq.f(parcel, readInt);
            } else if (d != 7) {
                atzq.C(parcel, readInt);
            } else {
                i2 = atzq.f(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new ImpressionAttestationTokenRequestParcel(str, num, str2, parcel2, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ImpressionAttestationTokenRequestParcel[i];
    }
}
