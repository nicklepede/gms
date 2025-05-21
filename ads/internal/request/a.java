package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.IconAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arxb;
import defpackage.fwac;
import defpackage.fwah;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    public static final AdRequestInfoParcel a(Parcel parcel) {
        int h = arxb.h(parcel);
        Bundle bundle = null;
        AdRequestParcel adRequestParcel = null;
        AdSizeParcel adSizeParcel = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        IconAdOptionsParcel iconAdOptionsParcel = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str16 = null;
        InstreamAdConfigurationParcel instreamAdConfigurationParcel = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int e = arxb.e(parcel);
            switch (arxb.d(e)) {
                case 1:
                    i = arxb.f(parcel, e);
                    break;
                case 2:
                    bundle = arxb.j(parcel, e);
                    break;
                case 3:
                    adRequestParcel = (AdRequestParcel) arxb.m(parcel, e, AdRequestParcel.CREATOR);
                    break;
                case 4:
                    adSizeParcel = (AdSizeParcel) arxb.m(parcel, e, AdSizeParcel.CREATOR);
                    break;
                case 5:
                    str = arxb.s(parcel, e);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) arxb.m(parcel, e, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) arxb.m(parcel, e, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = arxb.s(parcel, e);
                    break;
                case 9:
                    str3 = arxb.s(parcel, e);
                    break;
                case 10:
                    str4 = arxb.s(parcel, e);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) arxb.m(parcel, e, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = arxb.j(parcel, e);
                    break;
                case 13:
                    i2 = arxb.f(parcel, e);
                    break;
                case 14:
                    arrayList = arxb.x(parcel, e);
                    break;
                case 15:
                    bundle3 = arxb.j(parcel, e);
                    break;
                case 16:
                    z = arxb.D(parcel, e);
                    break;
                case fwac.q /* 17 */:
                case fwac.v /* 22 */:
                case fwac.w /* 23 */:
                case fwac.x /* 24 */:
                case 32:
                case fwac.L /* 38 */:
                case 62:
                default:
                    arxb.C(parcel, e);
                    break;
                case 18:
                    i3 = arxb.f(parcel, e);
                    break;
                case 19:
                    i4 = arxb.f(parcel, e);
                    break;
                case fwac.t /* 20 */:
                    f = arxb.c(parcel, e);
                    break;
                case fwac.u /* 21 */:
                    str5 = arxb.s(parcel, e);
                    break;
                case fwac.y /* 25 */:
                    j = arxb.i(parcel, e);
                    break;
                case 26:
                    str6 = arxb.s(parcel, e);
                    break;
                case fwac.A /* 27 */:
                    arrayList2 = arxb.x(parcel, e);
                    break;
                case fwac.B /* 28 */:
                    str7 = arxb.s(parcel, e);
                    break;
                case fwac.C /* 29 */:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) arxb.m(parcel, e, NativeAdOptionsParcel.CREATOR);
                    break;
                case fwac.D /* 30 */:
                    arrayList3 = arxb.x(parcel, e);
                    break;
                case fwac.E /* 31 */:
                    j2 = arxb.i(parcel, e);
                    break;
                case fwac.G /* 33 */:
                    str8 = arxb.s(parcel, e);
                    break;
                case fwac.H /* 34 */:
                    f2 = arxb.c(parcel, e);
                    break;
                case fwac.I /* 35 */:
                    i5 = arxb.f(parcel, e);
                    break;
                case fwac.J /* 36 */:
                    i6 = arxb.f(parcel, e);
                    break;
                case fwac.K /* 37 */:
                    z3 = arxb.D(parcel, e);
                    break;
                case fwac.M /* 39 */:
                    str9 = arxb.s(parcel, e);
                    break;
                case 40:
                    z2 = arxb.D(parcel, e);
                    break;
                case 41:
                    str10 = arxb.s(parcel, e);
                    break;
                case 42:
                    z4 = arxb.D(parcel, e);
                    break;
                case 43:
                    i7 = arxb.f(parcel, e);
                    break;
                case 44:
                    bundle4 = arxb.j(parcel, e);
                    break;
                case 45:
                    str11 = arxb.s(parcel, e);
                    break;
                case 46:
                    iconAdOptionsParcel = (IconAdOptionsParcel) arxb.m(parcel, e, IconAdOptionsParcel.CREATOR);
                    break;
                case 47:
                    z5 = arxb.D(parcel, e);
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_EMAIL_SUBJECT /* 48 */:
                    bundle5 = arxb.j(parcel, e);
                    break;
                case 49:
                    str12 = arxb.s(parcel, e);
                    break;
                case 50:
                    str13 = arxb.s(parcel, e);
                    break;
                case fwah.p /* 51 */:
                    str14 = arxb.s(parcel, e);
                    break;
                case 52:
                    z6 = arxb.D(parcel, e);
                    break;
                case 53:
                    arrayList4 = arxb.v(parcel, e);
                    break;
                case 54:
                    str15 = arxb.s(parcel, e);
                    break;
                case 55:
                    arrayList5 = arxb.x(parcel, e);
                    break;
                case 56:
                    i8 = arxb.f(parcel, e);
                    break;
                case 57:
                    z7 = arxb.D(parcel, e);
                    break;
                case 58:
                    z8 = arxb.D(parcel, e);
                    break;
                case 59:
                    z9 = arxb.D(parcel, e);
                    break;
                case 60:
                    arrayList6 = arxb.x(parcel, e);
                    break;
                case 61:
                    str16 = arxb.s(parcel, e);
                    break;
                case 63:
                    instreamAdConfigurationParcel = (InstreamAdConfigurationParcel) arxb.m(parcel, e, InstreamAdConfigurationParcel.CREATOR);
                    break;
                case 64:
                    str17 = arxb.s(parcel, e);
                    break;
                case 65:
                    bundle6 = arxb.j(parcel, e);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new AdRequestInfoParcel(i, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, nativeAdOptionsParcel, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, iconAdOptionsParcel, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, instreamAdConfigurationParcel, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdRequestInfoParcel[i];
    }
}
