package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;
import defpackage.fywe;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        AdDataParcel adDataParcel = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (atzq.d(readInt)) {
                case 1:
                    i = atzq.f(parcel, readInt);
                    break;
                case 2:
                    j = atzq.i(parcel, readInt);
                    break;
                case 3:
                    bundle = atzq.j(parcel, readInt);
                    break;
                case 4:
                    i2 = atzq.f(parcel, readInt);
                    break;
                case 5:
                    arrayList = atzq.x(parcel, readInt);
                    break;
                case 6:
                    z = atzq.D(parcel, readInt);
                    break;
                case 7:
                    i3 = atzq.f(parcel, readInt);
                    break;
                case 8:
                    z2 = atzq.D(parcel, readInt);
                    break;
                case 9:
                    str = atzq.s(parcel, readInt);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) atzq.m(parcel, readInt, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) atzq.m(parcel, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 13:
                    bundle2 = atzq.j(parcel, readInt);
                    break;
                case 14:
                    bundle3 = atzq.j(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = atzq.x(parcel, readInt);
                    break;
                case 16:
                    str3 = atzq.s(parcel, readInt);
                    break;
                case fywe.q /* 17 */:
                    str4 = atzq.s(parcel, readInt);
                    break;
                case 18:
                    z3 = atzq.D(parcel, readInt);
                    break;
                case 19:
                    adDataParcel = (AdDataParcel) atzq.m(parcel, readInt, AdDataParcel.CREATOR);
                    break;
                case fywe.t /* 20 */:
                    i4 = atzq.f(parcel, readInt);
                    break;
                case fywe.u /* 21 */:
                    str5 = atzq.s(parcel, readInt);
                    break;
                case fywe.v /* 22 */:
                    arrayList3 = atzq.x(parcel, readInt);
                    break;
                case fywe.w /* 23 */:
                    i5 = atzq.f(parcel, readInt);
                    break;
                case fywe.x /* 24 */:
                    str6 = atzq.s(parcel, readInt);
                    break;
                case fywe.y /* 25 */:
                    i6 = atzq.f(parcel, readInt);
                    break;
                case 26:
                    j2 = atzq.i(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new AdRequestParcel(i, j, bundle, i2, arrayList, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, adDataParcel, i4, str5, arrayList3, i5, str6, i6, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdRequestParcel[i];
    }
}
