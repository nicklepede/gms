package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        AdSizeParcel[] adSizeParcelArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (arxb.d(readInt)) {
                case 2:
                    str = arxb.s(parcel, readInt);
                    break;
                case 3:
                    i = arxb.f(parcel, readInt);
                    break;
                case 4:
                    i2 = arxb.f(parcel, readInt);
                    break;
                case 5:
                    z = arxb.D(parcel, readInt);
                    break;
                case 6:
                    i3 = arxb.f(parcel, readInt);
                    break;
                case 7:
                    i4 = arxb.f(parcel, readInt);
                    break;
                case 8:
                    adSizeParcelArr = (AdSizeParcel[]) arxb.J(parcel, readInt, AdSizeParcel.CREATOR);
                    break;
                case 9:
                    z2 = arxb.D(parcel, readInt);
                    break;
                case 10:
                    z3 = arxb.D(parcel, readInt);
                    break;
                case 11:
                    z4 = arxb.D(parcel, readInt);
                    break;
                case 12:
                    z5 = arxb.D(parcel, readInt);
                    break;
                case 13:
                    z6 = arxb.D(parcel, readInt);
                    break;
                case 14:
                    z7 = arxb.D(parcel, readInt);
                    break;
                case 15:
                    z8 = arxb.D(parcel, readInt);
                    break;
                case 16:
                    z9 = arxb.D(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new AdSizeParcel(str, i, i2, z, i3, i4, adSizeParcelArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdSizeParcel[i];
    }
}
