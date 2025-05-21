package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
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
            switch (arxb.d(readInt)) {
                case 1:
                    i = arxb.f(parcel, readInt);
                    break;
                case 2:
                    z = arxb.D(parcel, readInt);
                    break;
                case 3:
                    i2 = arxb.f(parcel, readInt);
                    break;
                case 4:
                    z2 = arxb.D(parcel, readInt);
                    break;
                case 5:
                    i3 = arxb.f(parcel, readInt);
                    break;
                case 6:
                    videoOptionsParcel = (VideoOptionsParcel) arxb.m(parcel, readInt, VideoOptionsParcel.CREATOR);
                    break;
                case 7:
                    z3 = arxb.D(parcel, readInt);
                    break;
                case 8:
                    i4 = arxb.f(parcel, readInt);
                    break;
                case 9:
                    i5 = arxb.f(parcel, readInt);
                    break;
                case 10:
                    z4 = arxb.D(parcel, readInt);
                    break;
                case 11:
                    i6 = arxb.f(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new NativeAdOptionsParcel(i, z, i2, z2, i3, videoOptionsParcel, z3, i4, i5, z4, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NativeAdOptionsParcel[i];
    }
}
