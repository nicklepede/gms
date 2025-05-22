package com.google.android.gms.ads.internal.cache;

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
        boolean z = false;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 2:
                    str = atzq.s(parcel, readInt);
                    break;
                case 3:
                    j = atzq.i(parcel, readInt);
                    break;
                case 4:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 5:
                    str3 = atzq.s(parcel, readInt);
                    break;
                case 6:
                    str4 = atzq.s(parcel, readInt);
                    break;
                case 7:
                    bundle = atzq.j(parcel, readInt);
                    break;
                case 8:
                    z = atzq.D(parcel, readInt);
                    break;
                case 9:
                    j2 = atzq.i(parcel, readInt);
                    break;
                case 10:
                    str5 = atzq.s(parcel, readInt);
                    break;
                case 11:
                    i = atzq.f(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new CacheOffering(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CacheOffering[i];
    }
}
