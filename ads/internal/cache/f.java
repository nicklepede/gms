package com.google.android.gms.ads.internal.cache;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f extends qmp implements h {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final long a(CacheOffering cacheOffering) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final CacheEntryParcel d(CacheOffering cacheOffering) {
        Parcel fE = fE();
        qmr.e(fE, cacheOffering);
        Parcel fF = fF(1, fE);
        CacheEntryParcel cacheEntryParcel = (CacheEntryParcel) qmr.a(fF, CacheEntryParcel.CREATOR);
        fF.recycle();
        return cacheEntryParcel;
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final CacheEntryParcel e(CacheOffering cacheOffering) {
        Parcel fE = fE();
        qmr.e(fE, cacheOffering);
        Parcel fF = fF(2, fE);
        CacheEntryParcel cacheEntryParcel = (CacheEntryParcel) qmr.a(fF, CacheEntryParcel.CREATOR);
        fF.recycle();
        return cacheEntryParcel;
    }
}
