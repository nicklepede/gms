package com.google.android.gms.ads.nonagon.util.cache;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 1:
                    i = atzq.f(parcel, readInt);
                    break;
                case 2:
                    i2 = atzq.f(parcel, readInt);
                    break;
                case 3:
                    i3 = atzq.f(parcel, readInt);
                    break;
                case 4:
                    i4 = atzq.f(parcel, readInt);
                    break;
                case 5:
                    str = atzq.s(parcel, readInt);
                    break;
                case 6:
                    i5 = atzq.f(parcel, readInt);
                    break;
                case 7:
                    i6 = atzq.f(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new PoolConfiguration(i, i2, i3, i4, str, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PoolConfiguration[i];
    }
}
