package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        String str = null;
        AdErrorParcel adErrorParcel = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 1:
                    str = atzq.s(parcel, readInt);
                    break;
                case 2:
                    j = atzq.i(parcel, readInt);
                    break;
                case 3:
                    adErrorParcel = (AdErrorParcel) atzq.m(parcel, readInt, AdErrorParcel.CREATOR);
                    break;
                case 4:
                    bundle = atzq.j(parcel, readInt);
                    break;
                case 5:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 6:
                    str3 = atzq.s(parcel, readInt);
                    break;
                case 7:
                    str4 = atzq.s(parcel, readInt);
                    break;
                case 8:
                    str5 = atzq.s(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new AdapterResponseInfoParcel(str, j, adErrorParcel, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdapterResponseInfoParcel[i];
    }
}
