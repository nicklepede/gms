package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        String str = null;
        byte[] bArr = null;
        Integer num = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 1) {
                str = atzq.s(parcel, readInt);
            } else if (d == 2) {
                bArr = atzq.E(parcel, readInt);
            } else if (d == 4) {
                num = atzq.q(parcel, readInt);
            } else if (d != 5) {
                atzq.C(parcel, readInt);
            } else {
                str2 = atzq.s(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new AdRequestAttestationTokenRequestParcel(str, bArr, num, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdRequestAttestationTokenRequestParcel[i];
    }
}
