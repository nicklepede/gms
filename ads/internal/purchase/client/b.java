package com.google.android.gms.ads.internal.purchase.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b extends otm implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
    }

    @Override // com.google.android.gms.ads.internal.purchase.client.d
    public final IBinder newInAppPurchaseManager(azht azhtVar) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        Parcel fs = fs(1, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }
}
