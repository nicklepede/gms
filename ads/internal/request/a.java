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
import defpackage.atzq;
import defpackage.fywe;
import defpackage.fywj;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    public static final AdRequestInfoParcel a(Parcel parcel) {
        int h = atzq.h(parcel);
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
            int e = atzq.e(parcel);
            switch (atzq.d(e)) {
                case 1:
                    i = atzq.f(parcel, e);
                    break;
                case 2:
                    bundle = atzq.j(parcel, e);
                    break;
                case 3:
                    adRequestParcel = (AdRequestParcel) atzq.m(parcel, e, AdRequestParcel.CREATOR);
                    break;
                case 4:
                    adSizeParcel = (AdSizeParcel) atzq.m(parcel, e, AdSizeParcel.CREATOR);
                    break;
                case 5:
                    str = atzq.s(parcel, e);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) atzq.m(parcel, e, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) atzq.m(parcel, e, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = atzq.s(parcel, e);
                    break;
                case 9:
                    str3 = atzq.s(parcel, e);
                    break;
                case 10:
                    str4 = atzq.s(parcel, e);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) atzq.m(parcel, e, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = atzq.j(parcel, e);
                    break;
                case 13:
                    i2 = atzq.f(parcel, e);
                    break;
                case 14:
                    arrayList = atzq.x(parcel, e);
                    break;
                case 15:
                    bundle3 = atzq.j(parcel, e);
                    break;
                case 16:
                    z = atzq.D(parcel, e);
                    break;
                case fywe.q /* 17 */:
                case fywe.v /* 22 */:
                case fywe.w /* 23 */:
                case fywe.x /* 24 */:
                case 32:
                case fywe.L /* 38 */:
                case 62:
                default:
                    atzq.C(parcel, e);
                    break;
                case 18:
                    i3 = atzq.f(parcel, e);
                    break;
                case 19:
                    i4 = atzq.f(parcel, e);
                    break;
                case fywe.t /* 20 */:
                    f = atzq.c(parcel, e);
                    break;
                case fywe.u /* 21 */:
                    str5 = atzq.s(parcel, e);
                    break;
                case fywe.y /* 25 */:
                    j = atzq.i(parcel, e);
                    break;
                case 26:
                    str6 = atzq.s(parcel, e);
                    break;
                case fywe.A /* 27 */:
                    arrayList2 = atzq.x(parcel, e);
                    break;
                case fywe.B /* 28 */:
                    str7 = atzq.s(parcel, e);
                    break;
                case fywe.C /* 29 */:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) atzq.m(parcel, e, NativeAdOptionsParcel.CREATOR);
                    break;
                case fywe.D /* 30 */:
                    arrayList3 = atzq.x(parcel, e);
                    break;
                case fywe.E /* 31 */:
                    j2 = atzq.i(parcel, e);
                    break;
                case fywe.G /* 33 */:
                    str8 = atzq.s(parcel, e);
                    break;
                case fywe.H /* 34 */:
                    f2 = atzq.c(parcel, e);
                    break;
                case fywe.I /* 35 */:
                    i5 = atzq.f(parcel, e);
                    break;
                case fywe.J /* 36 */:
                    i6 = atzq.f(parcel, e);
                    break;
                case fywe.K /* 37 */:
                    z3 = atzq.D(parcel, e);
                    break;
                case fywe.M /* 39 */:
                    str9 = atzq.s(parcel, e);
                    break;
                case 40:
                    z2 = atzq.D(parcel, e);
                    break;
                case 41:
                    str10 = atzq.s(parcel, e);
                    break;
                case 42:
                    z4 = atzq.D(parcel, e);
                    break;
                case 43:
                    i7 = atzq.f(parcel, e);
                    break;
                case 44:
                    bundle4 = atzq.j(parcel, e);
                    break;
                case 45:
                    str11 = atzq.s(parcel, e);
                    break;
                case 46:
                    iconAdOptionsParcel = (IconAdOptionsParcel) atzq.m(parcel, e, IconAdOptionsParcel.CREATOR);
                    break;
                case 47:
                    z5 = atzq.D(parcel, e);
                    break;
                case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_EMAIL_SUBJECT /* 48 */:
                    bundle5 = atzq.j(parcel, e);
                    break;
                case 49:
                    str12 = atzq.s(parcel, e);
                    break;
                case 50:
                    str13 = atzq.s(parcel, e);
                    break;
                case fywj.p /* 51 */:
                    str14 = atzq.s(parcel, e);
                    break;
                case 52:
                    z6 = atzq.D(parcel, e);
                    break;
                case 53:
                    arrayList4 = atzq.v(parcel, e);
                    break;
                case 54:
                    str15 = atzq.s(parcel, e);
                    break;
                case 55:
                    arrayList5 = atzq.x(parcel, e);
                    break;
                case 56:
                    i8 = atzq.f(parcel, e);
                    break;
                case 57:
                    z7 = atzq.D(parcel, e);
                    break;
                case 58:
                    z8 = atzq.D(parcel, e);
                    break;
                case 59:
                    z9 = atzq.D(parcel, e);
                    break;
                case 60:
                    arrayList6 = atzq.x(parcel, e);
                    break;
                case 61:
                    str16 = atzq.s(parcel, e);
                    break;
                case 63:
                    instreamAdConfigurationParcel = (InstreamAdConfigurationParcel) atzq.m(parcel, e, InstreamAdConfigurationParcel.CREATOR);
                    break;
                case 64:
                    str17 = atzq.s(parcel, e);
                    break;
                case 65:
                    bundle6 = atzq.j(parcel, e);
                    break;
            }
        }
        atzq.A(parcel, h);
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
