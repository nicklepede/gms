package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ac extends qmp implements ae {
    public ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.ae
    public final void a(AdRequestParcel adRequestParcel) {
        Parcel fE = fE();
        qmr.e(fE, adRequestParcel);
        fG(1, fE);
    }
}
