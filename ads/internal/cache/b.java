package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
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
        long j = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) atzq.m(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (d == 3) {
                z = atzq.D(parcel, readInt);
            } else if (d == 4) {
                z2 = atzq.D(parcel, readInt);
            } else if (d == 5) {
                j = atzq.i(parcel, readInt);
            } else if (d != 6) {
                atzq.C(parcel, readInt);
            } else {
                z3 = atzq.D(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new CacheEntryParcel(parcelFileDescriptor, z, z2, j, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CacheEntryParcel[i];
    }
}
