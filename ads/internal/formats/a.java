package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        VideoOptionsParcel videoOptionsParcel = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 1:
                    i = atzq.f(parcel, readInt);
                    break;
                case 2:
                    z = atzq.D(parcel, readInt);
                    break;
                case 3:
                    i2 = atzq.f(parcel, readInt);
                    break;
                case 4:
                    z2 = atzq.D(parcel, readInt);
                    break;
                case 5:
                    i3 = atzq.f(parcel, readInt);
                    break;
                case 6:
                    videoOptionsParcel = (VideoOptionsParcel) atzq.m(parcel, readInt, VideoOptionsParcel.CREATOR);
                    break;
                case 7:
                    z3 = atzq.D(parcel, readInt);
                    break;
                case 8:
                    i4 = atzq.f(parcel, readInt);
                    break;
                case 9:
                    i5 = atzq.f(parcel, readInt);
                    break;
                case 10:
                    z4 = atzq.D(parcel, readInt);
                    break;
                case 11:
                    i6 = atzq.f(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new NativeAdOptionsParcel(i, z, i2, z2, i3, videoOptionsParcel, z3, i4, i5, z4, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NativeAdOptionsParcel[i];
    }
}
