package com.google.android.gms.ads.internal.httpcache;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d extends qmp implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.ads.internal.httpcache.f
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel fE = fE();
        qmr.e(fE, parcelFileDescriptor);
        fH(1, fE);
    }
}
