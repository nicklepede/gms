package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        long j = 0;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 1) {
                i = atzq.f(parcel, readInt);
            } else if (d == 2) {
                i2 = atzq.f(parcel, readInt);
            } else if (d == 3) {
                str = atzq.s(parcel, readInt);
            } else if (d != 4) {
                atzq.C(parcel, readInt);
            } else {
                j = atzq.i(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new AdValueParcel(i, i2, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdValueParcel[i];
    }
}
