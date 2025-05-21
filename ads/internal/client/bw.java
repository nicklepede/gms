package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class bw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 2) {
                z = arxb.D(parcel, readInt);
            } else if (d == 3) {
                z2 = arxb.D(parcel, readInt);
            } else if (d != 4) {
                arxb.C(parcel, readInt);
            } else {
                z3 = arxb.D(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new VideoOptionsParcel(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VideoOptionsParcel[i];
    }
}
