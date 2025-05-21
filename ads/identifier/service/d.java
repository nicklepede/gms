package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenParcel;
import com.google.android.gms.ads.eventattestation.internal.AdRequestAttestationTokenRequestParcel;
import com.google.android.gms.ads.identifier.settings.ab;
import com.google.android.gms.ads.identifier.settings.ac;
import com.google.android.gms.ads.identifier.settings.t;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import com.google.android.gms.common.api.Status;
import defpackage.bxgi;
import defpackage.enyi;
import defpackage.enyl;
import defpackage.enyp;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fjzz;
import defpackage.oto;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d extends bxgi {
    private final AdRequestAttestationTokenRequestParcel a;
    private final int b;
    private final com.google.android.gms.ads.eventattestation.internal.h c;

    public d(AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel, int i, com.google.android.gms.ads.eventattestation.internal.h hVar) {
        super(216, "FetchAdRequestAttestationToken");
        this.a = adRequestAttestationTokenRequestParcel;
        this.b = i;
        this.c = hVar;
    }

    @Override // defpackage.bxgi
    public final void f(Context context) {
        int i = this.b;
        ac a = ac.a(context);
        AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel = this.a;
        int a2 = com.google.android.gms.ads.eventattestation.internal.m.a(i, adRequestAttestationTokenRequestParcel.c);
        try {
            String str = adRequestAttestationTokenRequestParcel.a;
            final byte[] bArr = adRequestAttestationTokenRequestParcel.b;
            String b = a.b(adRequestAttestationTokenRequestParcel.d, a2);
            final fecj v = enyi.a.v();
            fecj f = a.f(b, a2);
            if (!v.b.L()) {
                v.U();
            }
            enyi enyiVar = (enyi) v.b;
            enyl enylVar = (enyl) f.Q();
            enylVar.getClass();
            enyiVar.d = enylVar;
            enyiVar.b |= 2;
            byte[] d = a.d(str, "adRequestAttestationToken", new ab() { // from class: com.google.android.gms.ads.identifier.settings.aa
                @Override // com.google.android.gms.ads.identifier.settings.ab
                public final void a(fecj fecjVar) {
                    byte[] bArr2 = bArr;
                    boolean c = ac.c(bArr2);
                    fecj fecjVar2 = v;
                    if (!c) {
                        feay w = feay.w(bArr2);
                        if (!fecjVar2.b.L()) {
                            fecjVar2.U();
                        }
                        enyi enyiVar2 = (enyi) fecjVar2.b;
                        enyi enyiVar3 = enyi.a;
                        enyiVar2.b |= 1;
                        enyiVar2.c = w;
                    }
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    enyp enypVar = (enyp) fecjVar.b;
                    enyi enyiVar4 = (enyi) fecjVar2.Q();
                    enyp enypVar2 = enyp.a;
                    enyiVar4.getClass();
                    enypVar.d = enyiVar4;
                    enypVar.c = 3;
                }
            }, a2);
            com.google.android.gms.ads.eventattestation.internal.h hVar = this.c;
            AdRequestAttestationTokenParcel adRequestAttestationTokenParcel = new AdRequestAttestationTokenParcel(d);
            Parcel fr = hVar.fr();
            oto.e(fr, adRequestAttestationTokenParcel);
            hVar.fu(2, fr);
        } catch (t e) {
            this.c.a(e.a, e.b);
        } catch (IOException e2) {
            e = e2;
            this.c.a(1, "");
            com.google.android.gms.ads.identifier.settings.d.c(AppContextProvider.a(), "request-attestation", e);
        } catch (RuntimeException e3) {
            if (!fjzz.l()) {
                throw e3;
            }
            com.google.android.gms.ads.identifier.settings.d.c(context, "getAdRequestAttestationToken", e3);
        } catch (GeneralSecurityException e4) {
            e = e4;
            this.c.a(1, "");
            com.google.android.gms.ads.identifier.settings.d.c(AppContextProvider.a(), "request-attestation", e);
        }
    }

    @Override // defpackage.bxgi
    public final void j(Status status) {
        this.c.a(1, status.j);
    }
}
