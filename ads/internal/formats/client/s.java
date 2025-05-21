package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class s extends otn implements IInterface {
    private final com.google.ads.mediation.c a;

    public s() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
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
        fq(parcel);
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
