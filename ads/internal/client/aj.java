package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class aj extends otn implements ak {
    public aj() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public static ak asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof ak ? (ak) queryLocalInterface : new ai(iBinder);
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        azht azhrVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        com.google.android.gms.ads.internal.mediation.client.e eVar = null;
        if (readStrongBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
        }
        String readString = parcel.readString();
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            eVar = queryLocalInterface2 instanceof com.google.android.gms.ads.internal.mediation.client.e ? (com.google.android.gms.ads.internal.mediation.client.e) queryLocalInterface2 : new com.google.android.gms.ads.internal.mediation.client.c(readStrongBinder2);
        }
        int readInt = parcel.readInt();
        fq(parcel);
        IBinder newAdLoaderBuilder = newAdLoaderBuilder(azhrVar, readString, eVar, readInt);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newAdLoaderBuilder);
        return true;
    }
}
