package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;
import defpackage.tbx;
import defpackage.tco;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ab extends otn implements IInterface {
    private final tbx a;
    private final Object b;

    public ab(tbx tbxVar, Object obj) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.a = tbxVar;
        this.b = obj;
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        Object obj;
        if (i == 1) {
            tbx tbxVar = this.a;
            if (tbxVar != null && (obj = this.b) != null) {
                com.google.ads.mediation.b bVar = (com.google.ads.mediation.b) tbxVar;
                com.google.ads.mediation.d dVar = bVar.a;
                dVar.mInterstitialAd = (com.google.android.gms.ads.interstitial.b) obj;
                com.google.android.gms.ads.interstitial.b bVar2 = dVar.mInterstitialAd;
                com.google.android.gms.ads.mediation.h hVar = bVar.b;
                bVar2.b(new tco(hVar));
                hVar.l();
            }
        } else {
            if (i != 2) {
                return false;
            }
            AdErrorParcel adErrorParcel = (AdErrorParcel) oto.a(parcel, AdErrorParcel.CREATOR);
            fq(parcel);
            tbx tbxVar2 = this.a;
            if (tbxVar2 != null) {
                tbxVar2.a(adErrorParcel.b());
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public ab() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }
}
