package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        String str = null;
        String str2 = null;
        AdErrorParcel adErrorParcel = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                i = arxb.f(parcel, readInt);
            } else if (d == 2) {
                str = arxb.s(parcel, readInt);
            } else if (d == 3) {
                str2 = arxb.s(parcel, readInt);
            } else if (d == 4) {
                adErrorParcel = (AdErrorParcel) arxb.m(parcel, readInt, AdErrorParcel.CREATOR);
            } else if (d != 5) {
                arxb.C(parcel, readInt);
            } else {
                iBinder = arxb.k(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new AdErrorParcel(i, str, str2, adErrorParcel, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdErrorParcel[i];
    }
}
