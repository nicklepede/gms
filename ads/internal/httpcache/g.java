package com.google.android.gms.ads.internal.httpcache;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g extends qmp implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.ads.internal.httpcache.i
    public final void a(HttpRequestParcel httpRequestParcel, f fVar) {
        Parcel fE = fE();
        qmr.e(fE, httpRequestParcel);
        qmr.g(fE, fVar);
        fH(2, fE);
    }
}
