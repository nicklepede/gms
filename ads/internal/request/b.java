package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
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
            switch (arxb.d(readInt)) {
                case 1:
                    applicationInfo = (ApplicationInfo) arxb.m(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    str = arxb.s(parcel, readInt);
                    break;
                case 3:
                    packageInfo = (PackageInfo) arxb.m(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 4:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 5:
                    i = arxb.f(parcel, readInt);
                    break;
                case 6:
                    str3 = arxb.s(parcel, readInt);
                    break;
                case 7:
                    arrayList = arxb.x(parcel, readInt);
                    break;
                case 8:
                    z = arxb.D(parcel, readInt);
                    break;
                case 9:
                    z2 = arxb.D(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new AdsServiceInputParcel(applicationInfo, str, packageInfo, str2, i, str3, arrayList, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdsServiceInputParcel[i];
    }
}
