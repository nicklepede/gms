package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        String str = null;
        MotionEvent motionEvent = null;
        MotionEvent motionEvent2 = null;
        Integer num = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = atzq.d(readInt);
            if (d == 1) {
                str = atzq.s(parcel, readInt);
            } else if (d == 3) {
                motionEvent = (MotionEvent) atzq.m(parcel, readInt, MotionEvent.CREATOR);
            } else if (d == 4) {
                motionEvent2 = (MotionEvent) atzq.m(parcel, readInt, MotionEvent.CREATOR);
            } else if (d == 5) {
                num = atzq.q(parcel, readInt);
            } else if (d != 6) {
                atzq.C(parcel, readInt);
            } else {
                str2 = atzq.s(parcel, readInt);
            }
        }
        atzq.A(parcel, h);
        return new ClickAttestationTokenRequestParcel(str, motionEvent, motionEvent2, num, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClickAttestationTokenRequestParcel[i];
    }
}
