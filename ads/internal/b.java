package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
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
            switch (arxb.d(readInt)) {
                case 2:
                    z = arxb.D(parcel, readInt);
                    break;
                case 3:
                    z2 = arxb.D(parcel, readInt);
                    break;
                case 4:
                    str = arxb.s(parcel, readInt);
                    break;
                case 5:
                    z3 = arxb.D(parcel, readInt);
                    break;
                case 6:
                    f = arxb.c(parcel, readInt);
                    break;
                case 7:
                    i = arxb.f(parcel, readInt);
                    break;
                case 8:
                    z4 = arxb.D(parcel, readInt);
                    break;
                case 9:
                    z5 = arxb.D(parcel, readInt);
                    break;
                case 10:
                    z6 = arxb.D(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new InterstitialAdParameterParcel(z, z2, str, z3, f, i, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InterstitialAdParameterParcel[i];
    }
}
