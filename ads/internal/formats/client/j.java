package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class j extends otn implements k {
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

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        azht azhrVar;
        azht azhrVar2;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        azht azhtVar = null;
        if (readStrongBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 == null) {
            azhrVar2 = null;
        } else {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar2 = queryLocalInterface2 instanceof azht ? (azht) queryLocalInterface2 : new azhr(readStrongBinder2);
        }
        IBinder readStrongBinder3 = parcel.readStrongBinder();
        if (readStrongBinder3 != null) {
            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhtVar = queryLocalInterface3 instanceof azht ? (azht) queryLocalInterface3 : new azhr(readStrongBinder3);
        }
        fq(parcel);
        IBinder newNativeAdViewHolderDelegate = newNativeAdViewHolderDelegate(azhrVar, azhrVar2, azhtVar);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(newNativeAdViewHolderDelegate);
        return true;
    }
}
