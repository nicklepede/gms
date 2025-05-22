package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f extends qmp implements h {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.ads.internal.formats.client.h
    public final IBinder newNativeAdViewDelegate(bblp bblpVar, bblp bblpVar2, bblp bblpVar3, int i) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        qmr.g(fE, bblpVar2);
        qmr.g(fE, bblpVar3);
        fE.writeInt(i);
        Parcel fF = fF(1, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }
}
