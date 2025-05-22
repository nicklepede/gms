package com.google.android.gms.ads.internal.purchase.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b extends qmp implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
    }

    @Override // com.google.android.gms.ads.internal.purchase.client.d
    public final IBinder newInAppPurchaseManager(bblp bblpVar) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        Parcel fF = fF(1, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }
}
