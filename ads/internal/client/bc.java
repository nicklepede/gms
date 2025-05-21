package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class bc extends otn implements bd {
    public bc() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public static bd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof bd ? (bd) queryLocalInterface : new bb(iBinder);
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        azht azhrVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
        }
        int readInt = parcel.readInt();
        fq(parcel);
        IBinder mobileAdsSettingManager = getMobileAdsSettingManager(azhrVar, readInt);
        parcel2.writeNoException();
        parcel2.writeStrongBinder(mobileAdsSettingManager);
        return true;
    }
}
