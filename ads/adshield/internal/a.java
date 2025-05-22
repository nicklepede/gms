package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a extends qmp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    public final IBinder newAdShieldClient(String str, bblp bblpVar) {
        Parcel fE = fE();
        fE.writeString(str);
        qmr.g(fE, bblpVar);
        Parcel fF = fF(1, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    public final IBinder newAdShieldClientWithoutAdvertisingId(String str, bblp bblpVar) {
        Parcel fE = fE();
        fE.writeString(str);
        qmr.g(fE, bblpVar);
        Parcel fF = fF(2, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    public final IBinder newUnifiedAdShieldClient(bblp bblpVar, bblp bblpVar2, byte[] bArr) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        qmr.g(fE, bblpVar2);
        fE.writeByteArray(bArr);
        Parcel fF = fF(3, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        fF.recycle();
        return readStrongBinder;
    }
}
