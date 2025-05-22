package com.google.android.gms.ads.signalsdk;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class c extends qmq implements d {
    public c() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        b bVar = null;
        a aVar = null;
        if (i == 1) {
            Bundle bundle = (Bundle) qmr.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
                bVar = queryLocalInterface instanceof b ? (b) queryLocalInterface : new b(readStrongBinder);
            }
            fD(parcel);
            c(bundle, bVar);
        } else {
            if (i != 2) {
                return false;
            }
            NetworkRequestOptions networkRequestOptions = (NetworkRequestOptions) qmr.a(parcel, NetworkRequestOptions.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
                aVar = queryLocalInterface2 instanceof a ? (a) queryLocalInterface2 : new a(readStrongBinder2);
            }
            fD(parcel);
            a(networkRequestOptions, aVar);
        }
        return true;
    }
}
