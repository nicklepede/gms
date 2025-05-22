package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.util.ExceptionParcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i extends qmp implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    public final void a(ExceptionParcel exceptionParcel) {
        Parcel fE = fE();
        qmr.e(fE, exceptionParcel);
        fG(2, fE);
    }
}
