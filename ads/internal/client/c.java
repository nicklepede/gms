package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        String str = null;
        String str2 = null;
        AdErrorParcel adErrorParcel = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 1) {
                i = atzq.f(parcel, readInt);
            } else if (d == 2) {
                str = atzq.s(parcel, readInt);
            } else if (d == 3) {
                str2 = atzq.s(parcel, readInt);
            } else if (d == 4) {
                adErrorParcel = (AdErrorParcel) atzq.m(parcel, readInt, AdErrorParcel.CREATOR);
            } else if (d != 5) {
                atzq.C(parcel, readInt);
            } else {
                iBinder = atzq.k(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new AdErrorParcel(i, str, str2, adErrorParcel, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdErrorParcel[i];
    }
}
