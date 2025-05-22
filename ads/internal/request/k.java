package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class k extends qmp implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void a(String str, DecagonRequestParcel decagonRequestParcel) {
        Parcel fE = fE();
        fE.writeString(str);
        qmr.e(fE, decagonRequestParcel);
        fG(1, fE);
    }
}
