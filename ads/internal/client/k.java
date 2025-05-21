package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        long j = 0;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                i = arxb.f(parcel, readInt);
            } else if (d == 2) {
                i2 = arxb.f(parcel, readInt);
            } else if (d == 3) {
                str = arxb.s(parcel, readInt);
            } else if (d != 4) {
                arxb.C(parcel, readInt);
            } else {
                j = arxb.i(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new AdValueParcel(i, i2, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdValueParcel[i];
    }
}
