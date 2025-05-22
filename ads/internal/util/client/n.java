package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 2) {
                str = atzq.s(parcel, readInt);
            } else if (d == 3) {
                i = atzq.f(parcel, readInt);
            } else if (d == 4) {
                i2 = atzq.f(parcel, readInt);
            } else if (d == 5) {
                z = atzq.D(parcel, readInt);
            } else if (d != 6) {
                atzq.C(parcel, readInt);
            } else {
                z2 = atzq.D(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new VersionInfoParcel(str, i, i2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VersionInfoParcel[i];
    }
}
