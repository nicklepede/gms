package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
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
            switch (arxb.d(readInt)) {
                case 1:
                    str = arxb.s(parcel, readInt);
                    break;
                case 2:
                    j = arxb.i(parcel, readInt);
                    break;
                case 3:
                    adErrorParcel = (AdErrorParcel) arxb.m(parcel, readInt, AdErrorParcel.CREATOR);
                    break;
                case 4:
                    bundle = arxb.j(parcel, readInt);
                    break;
                case 5:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 6:
                    str3 = arxb.s(parcel, readInt);
                    break;
                case 7:
                    str4 = arxb.s(parcel, readInt);
                    break;
                case 8:
                    str5 = arxb.s(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new AdapterResponseInfoParcel(str, j, adErrorParcel, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdapterResponseInfoParcel[i];
    }
}
