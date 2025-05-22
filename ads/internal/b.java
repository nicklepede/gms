package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        float f = 0.0f;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 2:
                    z = atzq.D(parcel, readInt);
                    break;
                case 3:
                    z2 = atzq.D(parcel, readInt);
                    break;
                case 4:
                    str = atzq.s(parcel, readInt);
                    break;
                case 5:
                    z3 = atzq.D(parcel, readInt);
                    break;
                case 6:
                    f = atzq.c(parcel, readInt);
                    break;
                case 7:
                    i = atzq.f(parcel, readInt);
                    break;
                case 8:
                    z4 = atzq.D(parcel, readInt);
                    break;
                case 9:
                    z5 = atzq.D(parcel, readInt);
                    break;
                case 10:
                    z6 = atzq.D(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new InterstitialAdParameterParcel(z, z2, str, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InterstitialAdParameterParcel[i];
    }
}
