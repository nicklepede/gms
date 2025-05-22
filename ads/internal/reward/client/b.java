package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.mediation.client.e;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class b extends qmq implements c {
    public b() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        bblp bblnVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        e eVar = null;
        if (readStrongBinder == null) {
            bblnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            eVar = queryLocalInterface2 instanceof e ? (e) queryLocalInterface2 : new com.google.android.gms.ads.internal.mediation.client.c(readStrongBinder2);
        }
        int readInt = parcel.readInt();
        fD(parcel);
        IBinder newRewardedVideoAd = newRewardedVideoAd(bblnVar, eVar, readInt);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newRewardedVideoAd);
        return true;
    }
}
