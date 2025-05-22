package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class s extends qmq implements IInterface {
    private final com.google.ads.mediation.c a;

    public s() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        t tVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            tVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            tVar = queryLocalInterface instanceof t ? (t) queryLocalInterface : new t(readStrongBinder);
        }
        fD(parcel);
        com.google.ads.mediation.c cVar = this.a;
        cVar.b.a(cVar.a, new com.google.android.gms.ads.mediation.n(new u(tVar)));
        parcel2.writeNoException();
        return true;
    }

    public s(com.google.ads.mediation.c cVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.a = cVar;
    }
}
