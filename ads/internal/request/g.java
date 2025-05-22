package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class g extends qmq implements h {
    public g() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        i iVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(readStrongBinder);
            }
            fD(parcel);
            c(iVar);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof i) {
                }
            }
            fD(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                iVar = queryLocalInterface3 instanceof i ? (i) queryLocalInterface3 : new i(readStrongBinder3);
            }
            fD(parcel);
            a(iVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
