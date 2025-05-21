package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (arxb.d(readInt) != 1) {
                arxb.C(parcel, readInt);
            } else {
                bArr = arxb.E(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new PlayInstallReferrerAttestationTokenResponseParcel(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayInstallReferrerAttestationTokenResponseParcel[i];
    }
}
