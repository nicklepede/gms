package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class g extends qmq implements h {
    public g() {
        super("com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            CacheOffering cacheOffering = (CacheOffering) qmr.a(parcel, CacheOffering.CREATOR);
            fD(parcel);
            CacheEntryParcel d = d(cacheOffering);
            parcel2.writeNoException();
            qmr.f(parcel2, d);
        } else if (i == 2) {
            CacheOffering cacheOffering2 = (CacheOffering) qmr.a(parcel, CacheOffering.CREATOR);
            fD(parcel);
            CacheEntryParcel e = e(cacheOffering2);
            parcel2.writeNoException();
            qmr.f(parcel2, e);
        } else {
            if (i != 3) {
                return false;
            }
            CacheOffering cacheOffering3 = (CacheOffering) qmr.a(parcel, CacheOffering.CREATOR);
            fD(parcel);
            long a = a(cacheOffering3);
            parcel2.writeNoException();
            parcel2.writeLong(a);
        }
        return true;
    }
}
