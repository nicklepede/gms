package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = arxb.h(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (arxb.d(readInt)) {
                case 2:
                    str = arxb.s(parcel, readInt);
                    break;
                case 3:
                    str2 = arxb.s(parcel, readInt);
                    break;
                case 4:
                    str3 = arxb.s(parcel, readInt);
                    break;
                case 5:
                    str4 = arxb.s(parcel, readInt);
                    break;
                case 6:
                    str5 = arxb.s(parcel, readInt);
                    break;
                case 7:
                    str6 = arxb.s(parcel, readInt);
                    break;
                case 8:
                    str7 = arxb.s(parcel, readInt);
                    break;
                case 9:
                    intent = (Intent) arxb.m(parcel, readInt, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = arxb.k(parcel, readInt);
                    break;
                case 11:
                    z = arxb.D(parcel, readInt);
                    break;
                default:
                    arxb.C(parcel, readInt);
                    break;
            }
        }
        arxb.A(parcel, h);
        return new AdLauncherIntentInfoParcel(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdLauncherIntentInfoParcel[i];
    }
}
