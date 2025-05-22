package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class ap extends qmq implements aq {
    public ap() {
        super("com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public static aq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof aq ? (aq) queryLocalInterface : new ao(iBinder);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        bblp bblnVar;
        bblp bblnVar2;
        com.google.android.gms.ads.internal.mediation.client.e eVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                bblnVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
            }
            AdSizeParcel adSizeParcel = (AdSizeParcel) qmr.a(parcel, AdSizeParcel.CREATOR);
            String readString = parcel.readString();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                eVar = queryLocalInterface2 instanceof com.google.android.gms.ads.internal.mediation.client.e ? (com.google.android.gms.ads.internal.mediation.client.e) queryLocalInterface2 : new com.google.android.gms.ads.internal.mediation.client.c(readStrongBinder2);
            }
            com.google.android.gms.ads.internal.mediation.client.e eVar2 = eVar;
            int readInt = parcel.readInt();
            fD(parcel);
            IBinder newAdManager = newAdManager(bblnVar, adSizeParcel, readString, eVar2, readInt);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdManager);
        } else {
            if (i != 2) {
                return false;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 == null) {
                bblnVar2 = null;
            } else {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bblnVar2 = queryLocalInterface3 instanceof bblp ? (bblp) queryLocalInterface3 : new bbln(readStrongBinder3);
            }
            AdSizeParcel adSizeParcel2 = (AdSizeParcel) qmr.a(parcel, AdSizeParcel.CREATOR);
            String readString2 = parcel.readString();
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                eVar = queryLocalInterface4 instanceof com.google.android.gms.ads.internal.mediation.client.e ? (com.google.android.gms.ads.internal.mediation.client.e) queryLocalInterface4 : new com.google.android.gms.ads.internal.mediation.client.c(readStrongBinder4);
            }
            com.google.android.gms.ads.internal.mediation.client.e eVar3 = eVar;
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            fD(parcel);
            IBinder newAdManagerByType = newAdManagerByType(bblnVar2, adSizeParcel2, readString2, eVar3, readInt2, readInt3);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdManagerByType);
        }
        return true;
    }
}
