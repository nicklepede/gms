package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class ap extends otn implements aq {
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

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        azht azhrVar;
        azht azhrVar2;
        com.google.android.gms.ads.internal.mediation.client.e eVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                azhrVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
            }
            AdSizeParcel adSizeParcel = (AdSizeParcel) oto.a(parcel, AdSizeParcel.CREATOR);
            String readString = parcel.readString();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                eVar = queryLocalInterface2 instanceof com.google.android.gms.ads.internal.mediation.client.e ? (com.google.android.gms.ads.internal.mediation.client.e) queryLocalInterface2 : new com.google.android.gms.ads.internal.mediation.client.c(readStrongBinder2);
            }
            com.google.android.gms.ads.internal.mediation.client.e eVar2 = eVar;
            int readInt = parcel.readInt();
            fq(parcel);
            IBinder newAdManager = newAdManager(azhrVar, adSizeParcel, readString, eVar2, readInt);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdManager);
        } else {
            if (i != 2) {
                return false;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 == null) {
                azhrVar2 = null;
            } else {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                azhrVar2 = queryLocalInterface3 instanceof azht ? (azht) queryLocalInterface3 : new azhr(readStrongBinder3);
            }
            AdSizeParcel adSizeParcel2 = (AdSizeParcel) oto.a(parcel, AdSizeParcel.CREATOR);
            String readString2 = parcel.readString();
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                eVar = queryLocalInterface4 instanceof com.google.android.gms.ads.internal.mediation.client.e ? (com.google.android.gms.ads.internal.mediation.client.e) queryLocalInterface4 : new com.google.android.gms.ads.internal.mediation.client.c(readStrongBinder4);
            }
            com.google.android.gms.ads.internal.mediation.client.e eVar3 = eVar;
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            fq(parcel);
            IBinder newAdManagerByType = newAdManagerByType(azhrVar2, adSizeParcel2, readString2, eVar3, readInt2, readInt3);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdManagerByType);
        }
        return true;
    }
}
