package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 2) {
                str = arxb.s(parcel, readInt);
            } else if (d == 3) {
                i = arxb.f(parcel, readInt);
            } else if (d == 4) {
                i2 = arxb.f(parcel, readInt);
            } else if (d == 5) {
                z = arxb.D(parcel, readInt);
            } else if (d != 6) {
                arxb.C(parcel, readInt);
            } else {
                z2 = arxb.D(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new VersionInfoParcel(str, i, i2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VersionInfoParcel[i];
    }
}
