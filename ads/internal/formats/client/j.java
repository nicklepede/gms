package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class j extends qmq implements k {
    public j() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    public static k asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new i(iBinder);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        bblp bblnVar;
        bblp bblnVar2;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        bblp bblpVar = null;
        if (readStrongBinder == null) {
            bblnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 == null) {
            bblnVar2 = null;
        } else {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar2 = queryLocalInterface2 instanceof bblp ? (bblp) queryLocalInterface2 : new bbln(readStrongBinder2);
        }
        IBinder readStrongBinder3 = parcel.readStrongBinder();
        if (readStrongBinder3 != null) {
            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblpVar = queryLocalInterface3 instanceof bblp ? (bblp) queryLocalInterface3 : new bbln(readStrongBinder3);
        }
        fD(parcel);
        IBinder newNativeAdViewHolderDelegate = newNativeAdViewHolderDelegate(bblnVar, bblnVar2, bblpVar);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newNativeAdViewHolderDelegate);
        return true;
    }
}
