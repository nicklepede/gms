package com.google.android.gms.ads.internal.httpcache;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
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
            switch (atzq.d(readInt)) {
                case 1:
                    z = atzq.D(parcel, readInt);
                    break;
                case 2:
                    str = atzq.s(parcel, readInt);
                    break;
                case 3:
                    i = atzq.f(parcel, readInt);
                    break;
                case 4:
                    bArr = atzq.E(parcel, readInt);
                    break;
                case 5:
                    strArr = atzq.K(parcel, readInt);
                    break;
                case 6:
                    strArr2 = atzq.K(parcel, readInt);
                    break;
                case 7:
                    z2 = atzq.D(parcel, readInt);
                    break;
                case 8:
                    j = atzq.i(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new HttpResponseParcel(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HttpResponseParcel[i];
    }
}
