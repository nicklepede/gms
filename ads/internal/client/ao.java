package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ao extends qmp implements aq {
    public ao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.ads.internal.client.aq
    public final IBinder newAdManager(bblp bblpVar, AdSizeParcel adSizeParcel, String str, com.google.android.gms.ads.internal.mediation.client.e eVar, int i) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        qmr.e(fE, adSizeParcel);
        fE.writeString(str);
        qmr.g(fE, eVar);
        fE.writeInt(i);
        Parcel fF = fF(1, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.ads.internal.client.aq
    public final IBinder newAdManagerByType(bblp bblpVar, AdSizeParcel adSizeParcel, String str, com.google.android.gms.ads.internal.mediation.client.e eVar, int i, int i2) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        qmr.e(fE, adSizeParcel);
        fE.writeString(str);
        qmr.g(fE, eVar);
        fE.writeInt(i);
        fE.writeInt(i2);
        Parcel fF = fF(2, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }
}
