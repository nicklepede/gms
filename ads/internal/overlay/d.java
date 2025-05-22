package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.atzq;
import defpackage.fywe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) atzq.m(parcel, readInt, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = atzq.k(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = atzq.k(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = atzq.k(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = atzq.k(parcel, readInt);
                    break;
                case 7:
                    str = atzq.s(parcel, readInt);
                    break;
                case 8:
                    z = atzq.D(parcel, readInt);
                    break;
                case 9:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 10:
                    iBinder5 = atzq.k(parcel, readInt);
                    break;
                case 11:
                    i = atzq.f(parcel, readInt);
                    break;
                case 12:
                    i2 = atzq.f(parcel, readInt);
                    break;
                case 13:
                    str3 = atzq.s(parcel, readInt);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) atzq.m(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case fywe.t /* 20 */:
                case fywe.u /* 21 */:
                case fywe.v /* 22 */:
                case fywe.w /* 23 */:
                default:
                    atzq.C(parcel, readInt);
                    break;
                case 16:
                    str4 = atzq.s(parcel, readInt);
                    break;
                case fywe.q /* 17 */:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) atzq.m(parcel, readInt, InterstitialAdParameterParcel.CREATOR);
                    break;
                case 18:
                    iBinder6 = atzq.k(parcel, readInt);
                    break;
                case 19:
                    str5 = atzq.s(parcel, readInt);
                    break;
                case fywe.x /* 24 */:
                    str6 = atzq.s(parcel, readInt);
                    break;
                case fywe.y /* 25 */:
                    str7 = atzq.s(parcel, readInt);
                    break;
                case 26:
                    iBinder7 = atzq.k(parcel, readInt);
                    break;
                case fywe.A /* 27 */:
                    iBinder8 = atzq.k(parcel, readInt);
                    break;
                case fywe.B /* 28 */:
                    iBinder9 = atzq.k(parcel, readInt);
                    break;
                case fywe.C /* 29 */:
                    z2 = atzq.D(parcel, readInt);
                    break;
                case fywe.D /* 30 */:
                    j = atzq.i(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new AdOverlayInfoParcel(adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, versionInfoParcel, str4, interstitialAdParameterParcel, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
