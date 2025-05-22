package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class b extends qmq implements c {
    public b() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        bblp bblnVar;
        bblp bblpVar = null;
        if (i == 1) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bblpVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
            }
            fD(parcel);
            IBinder newAdShieldClient = newAdShieldClient(readString, bblpVar);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdShieldClient);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bblpVar = queryLocalInterface2 instanceof bblp ? (bblp) queryLocalInterface2 : new bbln(readStrongBinder2);
            }
            fD(parcel);
            IBinder newAdShieldClientWithoutAdvertisingId = newAdShieldClientWithoutAdvertisingId(readString2, bblpVar);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdShieldClientWithoutAdvertisingId);
        } else {
            if (i != 3) {
                return false;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 == null) {
                bblnVar = null;
            } else {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bblnVar = queryLocalInterface3 instanceof bblp ? (bblp) queryLocalInterface3 : new bbln(readStrongBinder3);
            }
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bblpVar = queryLocalInterface4 instanceof bblp ? (bblp) queryLocalInterface4 : new bbln(readStrongBinder4);
            }
            byte[] createByteArray = parcel.createByteArray();
            fD(parcel);
            IBinder newUnifiedAdShieldClient = newUnifiedAdShieldClient(bblnVar, bblpVar, createByteArray);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newUnifiedAdShieldClient);
        }
        return true;
    }
}
