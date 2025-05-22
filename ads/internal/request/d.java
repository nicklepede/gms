package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 1:
                    str = atzq.s(parcel, readInt);
                    break;
                case 2:
                    i = atzq.f(parcel, readInt);
                    break;
                case 3:
                    bundle = atzq.j(parcel, readInt);
                    break;
                case 4:
                    bArr = atzq.E(parcel, readInt);
                    break;
                case 5:
                    z = atzq.D(parcel, readInt);
                    break;
                case 6:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 7:
                    str3 = atzq.s(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new HttpRequestParcel(str, i, bundle, bArr, z, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HttpRequestParcel[i];
    }
}
