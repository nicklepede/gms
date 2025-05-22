package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import defpackage.atzq;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
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
            switch (atzq.d(readInt)) {
                case 1:
                    bundle = atzq.j(parcel, readInt);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) atzq.m(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) atzq.m(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = atzq.s(parcel, readInt);
                    break;
                case 5:
                    arrayList = atzq.x(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) atzq.m(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 8:
                default:
                    atzq.C(parcel, readInt);
                    break;
                case 9:
                    str3 = atzq.s(parcel, readInt);
                    break;
                case 10:
                    poolConfiguration = (PoolConfiguration) atzq.m(parcel, readInt, PoolConfiguration.CREATOR);
                    break;
                case 11:
                    str4 = atzq.s(parcel, readInt);
                    break;
                case 12:
                    z = atzq.D(parcel, readInt);
                    break;
                case 13:
                    z2 = atzq.D(parcel, readInt);
                    break;
                case 14:
                    bundle2 = atzq.j(parcel, readInt);
                    break;
                case 15:
                    bundle3 = atzq.j(parcel, readInt);
                    break;
                case 16:
                    i = atzq.f(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new NonagonRequestParcel(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, poolConfiguration, str4, z, z2, bundle2, bundle3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NonagonRequestParcel[i];
    }
}
