package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.qmp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class y extends qmp implements aa {
    public y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.aa
    public final void a() {
        Parcel fE = fE();
        fE.writeInt(1);
        fG(2, fE);
    }
}
