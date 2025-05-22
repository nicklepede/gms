package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class bw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 2) {
                z = atzq.D(parcel, readInt);
            } else if (d == 3) {
                z2 = atzq.D(parcel, readInt);
            } else if (d != 4) {
                atzq.C(parcel, readInt);
            } else {
                z3 = atzq.D(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new VideoOptionsParcel(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VideoOptionsParcel[i];
    }
}
