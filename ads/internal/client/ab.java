package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;
import defpackage.uxx;
import defpackage.uyo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ab extends qmq implements IInterface {
    private final uxx a;
    private final Object b;

    public ab(uxx uxxVar, Object obj) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.a = uxxVar;
        this.b = obj;
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        Object obj;
        if (i == 1) {
            uxx uxxVar = this.a;
            if (uxxVar != null && (obj = this.b) != null) {
                com.google.ads.mediation.b bVar = (com.google.ads.mediation.b) uxxVar;
                com.google.ads.mediation.d dVar = bVar.a;
                dVar.mInterstitialAd = (com.google.android.gms.ads.interstitial.b) obj;
                com.google.android.gms.ads.interstitial.b bVar2 = dVar.mInterstitialAd;
                com.google.android.gms.ads.mediation.h hVar = bVar.b;
                bVar2.b(new uyo(hVar));
                hVar.l();
            }
        } else {
            if (i != 2) {
                return false;
            }
            AdErrorParcel adErrorParcel = (AdErrorParcel) qmr.a(parcel, AdErrorParcel.CREATOR);
            fD(parcel);
            uxx uxxVar2 = this.a;
            if (uxxVar2 != null) {
                uxxVar2.a(adErrorParcel.b());
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public ab() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }
}
