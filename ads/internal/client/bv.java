package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class bv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (arxb.d(readInt) != 15) {
                arxb.C(parcel, readInt);
            } else {
                str = arxb.s(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new SearchAdRequestParcel(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchAdRequestParcel[i];
    }
}
