package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (atzq.d(readInt) != 1) {
                atzq.C(parcel, readInt);
            } else {
                str = atzq.s(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new DecagonRequestParcel(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DecagonRequestParcel[i];
    }
}
