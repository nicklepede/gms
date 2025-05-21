package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                str = arxb.s(parcel, readInt);
            } else if (d == 2) {
                str2 = arxb.s(parcel, readInt);
            } else if (d != 3) {
                arxb.C(parcel, readInt);
            } else {
                bArr = arxb.E(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new PlayInstallReferrerAttestationTokenRequestParcel(str, str2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayInstallReferrerAttestationTokenRequestParcel[i];
    }
}
