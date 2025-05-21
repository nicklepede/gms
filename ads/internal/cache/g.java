package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class g extends otn implements h {
    public g() {
        super("com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            CacheOffering cacheOffering = (CacheOffering) oto.a(parcel, CacheOffering.CREATOR);
            fq(parcel);
            CacheEntryParcel d = d(cacheOffering);
            parcel2.writeNoException();
            oto.f(parcel2, d);
        } else if (i == 2) {
            CacheOffering cacheOffering2 = (CacheOffering) oto.a(parcel, CacheOffering.CREATOR);
            fq(parcel);
            CacheEntryParcel e = e(cacheOffering2);
            parcel2.writeNoException();
            oto.f(parcel2, e);
        } else {
            if (i != 3) {
                return false;
            }
            CacheOffering cacheOffering3 = (CacheOffering) oto.a(parcel, CacheOffering.CREATOR);
            fq(parcel);
            long a = a(cacheOffering3);
            parcel2.writeNoException();
            parcel2.writeLong(a);
        }
        return true;
    }
}
