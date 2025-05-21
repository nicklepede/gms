package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;
import defpackage.fwac;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
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
            switch (arxb.d(readInt)) {
                case 1:
                    i = arxb.f(parcel, readInt);
                    break;
                case 2:
                    j = arxb.i(parcel, readInt);
                    break;
                case 3:
                    bundle = arxb.j(parcel, readInt);
                    break;
                case 4:
                    i2 = arxb.f(parcel, readInt);
                    break;
                case 5:
                    arrayList = arxb.x(parcel, readInt);
                    break;
                case 6:
                    z = arxb.D(parcel, readInt);
                    break;
                case 7:
                    i3 = arxb.f(parcel, readInt);
                    break;
                case 8:
                    z2 = arxb.D(parcel, readInt);
                    break;
                case 9:
                    str = arxb.s(parcel, readInt);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) arxb.m(parcel, readInt, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) arxb.m(parcel, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 13:
                    bundle2 = arxb.j(parcel, readInt);
                    break;
                case 14:
                    bundle3 = arxb.j(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = arxb.x(parcel, readInt);
                    break;
                case 16:
                    str3 = arxb.s(parcel, readInt);
                    break;
                case fwac.q /* 17 */:
                    str4 = arxb.s(parcel, readInt);
                    break;
                case 18:
                    z3 = arxb.D(parcel, readInt);
                    break;
                case 19:
                    adDataParcel = (AdDataParcel) arxb.m(parcel, readInt, AdDataParcel.CREATOR);
                    break;
                case fwac.t /* 20 */:
                    i4 = arxb.f(parcel, readInt);
                    break;
                case fwac.u /* 21 */:
                    str5 = arxb.s(parcel, readInt);
                    break;
                case fwac.v /* 22 */:
                    arrayList3 = arxb.x(parcel, readInt);
                    break;
                case fwac.w /* 23 */:
                    i5 = arxb.f(parcel, readInt);
                    break;
                case fwac.x /* 24 */:
                    str6 = arxb.s(parcel, readInt);
                    break;
                case fwac.y /* 25 */:
                    i6 = arxb.f(parcel, readInt);
                    break;
                case 26:
                    j2 = arxb.i(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new AdRequestParcel(i, j, bundle, i2, arrayList, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, adDataParcel, i4, str5, arrayList3, i5, str6, i6, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdRequestParcel[i];
    }
}
