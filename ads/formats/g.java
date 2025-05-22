package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        IBinder iBinder = null;
        boolean z = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 1) {
                z = atzq.D(parcel, readInt);
            } else if (d == 2) {
                iBinder = atzq.k(parcel, readInt);
            } else if (d != 3) {
                atzq.C(parcel, readInt);
            } else {
                iBinder2 = atzq.k(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
