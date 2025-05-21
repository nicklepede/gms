package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import defpackage.arxb;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        PoolConfiguration poolConfiguration = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (arxb.d(readInt)) {
                case 1:
                    bundle = arxb.j(parcel, readInt);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) arxb.m(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) arxb.m(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = arxb.s(parcel, readInt);
                    break;
                case 5:
                    arrayList = arxb.x(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) arxb.m(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 8:
                default:
                    arxb.C(parcel, readInt);
                    break;
                case 9:
                    str3 = arxb.s(parcel, readInt);
                    break;
                case 10:
                    poolConfiguration = (PoolConfiguration) arxb.m(parcel, readInt, PoolConfiguration.CREATOR);
                    break;
                case 11:
                    str4 = arxb.s(parcel, readInt);
                    break;
                case 12:
                    z = arxb.D(parcel, readInt);
                    break;
                case 13:
                    z2 = arxb.D(parcel, readInt);
                    break;
                case 14:
                    bundle2 = arxb.j(parcel, readInt);
                    break;
                case 15:
                    bundle3 = arxb.j(parcel, readInt);
                    break;
                case 16:
                    i = arxb.f(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new NonagonRequestParcel(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, poolConfiguration, str4, z, z2, bundle2, bundle3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NonagonRequestParcel[i];
    }
}
