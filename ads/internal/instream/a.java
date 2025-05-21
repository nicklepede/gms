package com.google.android.gms.ads.internal.instream;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                i3 = arxb.f(parcel, readInt);
            } else if (d == 2) {
                str = arxb.s(parcel, readInt);
            } else if (d == 3) {
                i2 = arxb.f(parcel, readInt);
            } else if (d != 1000) {
                arxb.C(parcel, readInt);
            } else {
                i = arxb.f(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new InstreamAdConfigurationParcel(i, i3, str, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InstreamAdConfigurationParcel[i];
    }
}
