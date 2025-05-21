package com.google.android.gms.ads.internal.cache;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f extends otm implements h {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final long a(CacheOffering cacheOffering) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final CacheEntryParcel d(CacheOffering cacheOffering) {
        Parcel fr = fr();
        oto.e(fr, cacheOffering);
        Parcel fs = fs(1, fr);
        CacheEntryParcel cacheEntryParcel = (CacheEntryParcel) oto.a(fs, CacheEntryParcel.CREATOR);
        fs.recycle();
        return cacheEntryParcel;
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final CacheEntryParcel e(CacheOffering cacheOffering) {
        Parcel fr = fr();
        oto.e(fr, cacheOffering);
        Parcel fs = fs(2, fr);
        CacheEntryParcel cacheEntryParcel = (CacheEntryParcel) oto.a(fs, CacheEntryParcel.CREATOR);
        fs.recycle();
        return cacheEntryParcel;
    }
}
