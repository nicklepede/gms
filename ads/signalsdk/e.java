package com.google.android.gms.ads.signalsdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        String str = "";
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                str2 = arxb.s(parcel, readInt);
            } else if (d == 2) {
                i = arxb.f(parcel, readInt);
            } else if (d != 3) {
                arxb.C(parcel, readInt);
            } else {
                str = arxb.s(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new NetworkRequestOptions(str2, i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NetworkRequestOptions[i];
    }
}
