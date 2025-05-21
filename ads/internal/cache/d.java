package com.google.android.gms.ads.internal.cache;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
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
            switch (arxb.d(readInt)) {
                case 2:
                    str = arxb.s(parcel, readInt);
                    break;
                case 3:
                    j = arxb.i(parcel, readInt);
                    break;
                case 4:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 5:
                    str3 = arxb.s(parcel, readInt);
                    break;
                case 6:
                    str4 = arxb.s(parcel, readInt);
                    break;
                case 7:
                    bundle = arxb.j(parcel, readInt);
                    break;
                case 8:
                    z = arxb.D(parcel, readInt);
                    break;
                case 9:
                    j2 = arxb.i(parcel, readInt);
                    break;
                case 10:
                    str5 = arxb.s(parcel, readInt);
                    break;
                case 11:
                    i = arxb.f(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new CacheOffering(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CacheOffering[i];
    }
}
