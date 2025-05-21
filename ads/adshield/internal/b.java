package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class b extends otn implements c {
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

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        azht azhrVar;
        azht azhtVar = null;
        if (i == 1) {
            String readString = parcel.readString();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                azhtVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
            }
            fq(parcel);
            IBinder newAdShieldClient = newAdShieldClient(readString, azhtVar);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdShieldClient);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                azhtVar = queryLocalInterface2 instanceof azht ? (azht) queryLocalInterface2 : new azhr(readStrongBinder2);
            }
            fq(parcel);
            IBinder newAdShieldClientWithoutAdvertisingId = newAdShieldClientWithoutAdvertisingId(readString2, azhtVar);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newAdShieldClientWithoutAdvertisingId);
        } else {
            if (i != 3) {
                return false;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 == null) {
                azhrVar = null;
            } else {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                azhrVar = queryLocalInterface3 instanceof azht ? (azht) queryLocalInterface3 : new azhr(readStrongBinder3);
            }
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                azhtVar = queryLocalInterface4 instanceof azht ? (azht) queryLocalInterface4 : new azhr(readStrongBinder4);
            }
            byte[] createByteArray = parcel.createByteArray();
            fq(parcel);
            IBinder newUnifiedAdShieldClient = newUnifiedAdShieldClient(azhrVar, azhtVar, createByteArray);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newUnifiedAdShieldClient);
        }
        return true;
    }
}
