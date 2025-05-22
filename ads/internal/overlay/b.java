package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = atzq.h(parcel);
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
            switch (atzq.d(readInt)) {
                case 2:
                    str = atzq.s(parcel, readInt);
                    break;
                case 3:
                    str2 = atzq.s(parcel, readInt);
                    break;
                case 4:
                    str3 = atzq.s(parcel, readInt);
                    break;
                case 5:
                    str4 = atzq.s(parcel, readInt);
                    break;
                case 6:
                    str5 = atzq.s(parcel, readInt);
                    break;
                case 7:
                    str6 = atzq.s(parcel, readInt);
                    break;
                case 8:
                    str7 = atzq.s(parcel, readInt);
                    break;
                case 9:
                    intent = (Intent) atzq.m(parcel, readInt, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = atzq.k(parcel, readInt);
                    break;
                case 11:
                    z = atzq.D(parcel, readInt);
                    break;
                default:
                    atzq.C(parcel, readInt);
                    break;
            }
        }
        atzq.A(parcel, h);
        return new AdLauncherIntentInfoParcel(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdLauncherIntentInfoParcel[i];
    }
}
