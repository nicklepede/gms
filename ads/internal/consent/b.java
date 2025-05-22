package com.google.android.gms.ads.internal.consent;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bzps;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b extends qmq implements IInterface, bzps {
    public b() {
        super("com.google.android.gms.ads.internal.consent.IConsentSdkService");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        a aVar;
        if (i != 3) {
            return false;
        }
        parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.consent.IConsentCallback");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder);
        }
        fD(parcel);
        Parcel fE = aVar.fE();
        fE.writeInt(4);
        aVar.fH(3, fE);
        return true;
    }
}
