package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        ApplicationInfo applicationInfo = null;
        String str = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 1:
                    applicationInfo = (ApplicationInfo) atzq.m(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    str = atzq.s(parcel, readInt);
                    break;
                case 3:
                    packageInfo = (PackageInfo) atzq.m(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 4:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 5:
                    i = atzq.f(parcel, readInt);
                    break;
                case 6:
                    str3 = atzq.s(parcel, readInt);
                    break;
                case 7:
                    arrayList = atzq.x(parcel, readInt);
                    break;
                case 8:
                    z = atzq.D(parcel, readInt);
                    break;
                case 9:
                    z2 = atzq.D(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new AdsServiceInputParcel(applicationInfo, str, packageInfo, str2, i, str3, arrayList, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdsServiceInputParcel[i];
    }
}
