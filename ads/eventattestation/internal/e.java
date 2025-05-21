package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        String str = null;
        MotionEvent motionEvent = null;
        MotionEvent motionEvent2 = null;
        Integer num = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = arxb.d(readInt);
            if (d == 1) {
                str = arxb.s(parcel, readInt);
            } else if (d == 3) {
                motionEvent = (MotionEvent) arxb.m(parcel, readInt, MotionEvent.CREATOR);
            } else if (d == 4) {
                motionEvent2 = (MotionEvent) arxb.m(parcel, readInt, MotionEvent.CREATOR);
            } else if (d == 5) {
                num = arxb.q(parcel, readInt);
            } else if (d != 6) {
                arxb.C(parcel, readInt);
            } else {
                str2 = arxb.s(parcel, readInt);
            }
        }
        arxb.A(parcel, h);
        return new ClickAttestationTokenRequestParcel(str, motionEvent, motionEvent2, num, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClickAttestationTokenRequestParcel[i];
    }
}
