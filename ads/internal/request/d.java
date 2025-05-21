package com.google.android.gms.ads.internal.request;

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
        String str = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (arxb.d(readInt)) {
                case 1:
                    str = arxb.s(parcel, readInt);
                    break;
                case 2:
                    i = arxb.f(parcel, readInt);
                    break;
                case 3:
                    bundle = arxb.j(parcel, readInt);
                    break;
                case 4:
                    bArr = arxb.E(parcel, readInt);
                    break;
                case 5:
                    z = arxb.D(parcel, readInt);
                    break;
                case 6:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 7:
                    str3 = arxb.s(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new HttpRequestParcel(str, i, bundle, bArr, z, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HttpRequestParcel[i];
    }
}
