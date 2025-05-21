package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.arxb;
import defpackage.fwac;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
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
            switch (arxb.d(readInt)) {
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) arxb.m(parcel, readInt, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = arxb.k(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = arxb.k(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = arxb.k(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = arxb.k(parcel, readInt);
                    break;
                case 7:
                    str = arxb.s(parcel, readInt);
                    break;
                case 8:
                    z = arxb.D(parcel, readInt);
                    break;
                case 9:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 10:
                    iBinder5 = arxb.k(parcel, readInt);
                    break;
                case 11:
                    i = arxb.f(parcel, readInt);
                    break;
                case 12:
                    i2 = arxb.f(parcel, readInt);
                    break;
                case 13:
                    str3 = arxb.s(parcel, readInt);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) arxb.m(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case fwac.t /* 20 */:
                case fwac.u /* 21 */:
                case fwac.v /* 22 */:
                case fwac.w /* 23 */:
                default:
                    arxb.C(parcel, readInt);
                    break;
                case 16:
                    str4 = arxb.s(parcel, readInt);
                    break;
                case fwac.q /* 17 */:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) arxb.m(parcel, readInt, InterstitialAdParameterParcel.CREATOR);
                    break;
                case 18:
                    iBinder6 = arxb.k(parcel, readInt);
                    break;
                case 19:
                    str5 = arxb.s(parcel, readInt);
                    break;
                case fwac.x /* 24 */:
                    str6 = arxb.s(parcel, readInt);
                    break;
                case fwac.y /* 25 */:
                    str7 = arxb.s(parcel, readInt);
                    break;
                case 26:
                    iBinder7 = arxb.k(parcel, readInt);
                    break;
                case fwac.A /* 27 */:
                    iBinder8 = arxb.k(parcel, readInt);
                    break;
                case fwac.B /* 28 */:
                    iBinder9 = arxb.k(parcel, readInt);
                    break;
                case fwac.C /* 29 */:
                    z2 = arxb.D(parcel, readInt);
                    break;
                case fwac.D /* 30 */:
                    j = arxb.i(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new AdOverlayInfoParcel(adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, versionInfoParcel, str4, interstitialAdParameterParcel, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
