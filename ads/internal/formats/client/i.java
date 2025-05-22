package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i extends qmp implements k {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.ads.internal.formats.client.k
    public final IBinder newNativeAdViewHolderDelegate(bblp bblpVar, bblp bblpVar2, bblp bblpVar3) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        qmr.g(fE, bblpVar2);
        qmr.g(fE, bblpVar3);
        Parcel fF = fF(1, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }
}
