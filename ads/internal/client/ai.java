package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ai extends qmp implements ak {
    public ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.ads.internal.client.ak
    public final IBinder newAdLoaderBuilder(bblp bblpVar, String str, com.google.android.gms.ads.internal.mediation.client.e eVar, int i) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        fE.writeString(str);
        qmr.g(fE, eVar);
        fE.writeInt(i);
        Parcel fF = fF(1, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }
}
