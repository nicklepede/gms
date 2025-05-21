package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (arxb.d(readInt)) {
                case 1:
                    z = arxb.D(parcel, readInt);
                    break;
                case 2:
                    str = arxb.s(parcel, readInt);
                    break;
                case 3:
                    i = arxb.f(parcel, readInt);
                    break;
                case 4:
                    bArr = arxb.E(parcel, readInt);
                    break;
                case 5:
                    strArr = arxb.K(parcel, readInt);
                    break;
                case 6:
                    strArr2 = arxb.K(parcel, readInt);
                    break;
                case 7:
                    z2 = arxb.D(parcel, readInt);
                    break;
                case 8:
                    j = arxb.i(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new HttpResponseParcel(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HttpResponseParcel[i];
    }
}
