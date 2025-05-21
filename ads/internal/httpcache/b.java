package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                str = arxb.s(parcel, readInt);
            } else if (d == 2) {
                strArr = arxb.K(parcel, readInt);
            } else if (d != 3) {
                arxb.C(parcel, readInt);
            } else {
                strArr2 = arxb.K(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new HttpRequestParcel(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HttpRequestParcel[i];
    }
}
