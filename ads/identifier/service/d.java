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
import defpackage.bzoy;
import defpackage.eqmb;
import defpackage.eqme;
import defpackage.eqmi;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fmqe;
import defpackage.qmr;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d extends bzoy {
    private final AdRequestAttestationTokenRequestParcel a;
    private final int b;
    private final com.google.android.gms.ads.eventattestation.internal.h c;

    public d(AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel, int i, com.google.android.gms.ads.eventattestation.internal.h hVar) {
        super(216, "FetchAdRequestAttestationToken");
        this.a = adRequestAttestationTokenRequestParcel;
        this.b = i;
        this.c = hVar;
    }

    @Override // defpackage.bzoy
    public final void f(Context context) {
        int i = this.b;
        ac a = ac.a(context);
        AdRequestAttestationTokenRequestParcel adRequestAttestationTokenRequestParcel = this.a;
        int a2 = com.google.android.gms.ads.eventattestation.internal.m.a(i, adRequestAttestationTokenRequestParcel.c);
        try {
            String str = adRequestAttestationTokenRequestParcel.a;
            final byte[] bArr = adRequestAttestationTokenRequestParcel.b;
            String b = a.b(adRequestAttestationTokenRequestParcel.d, a2);
            final fgrc v = eqmb.a.v();
            fgrc f = a.f(b, a2);
            if (!v.b.L()) {
                v.U();
            }
            eqmb eqmbVar = (eqmb) v.b;
            eqme eqmeVar = (eqme) f.Q();
            eqmeVar.getClass();
            eqmbVar.d = eqmeVar;
            eqmbVar.b |= 2;
            byte[] d = a.d(str, "adRequestAttestationToken", new ab() { // from class: com.google.android.gms.ads.identifier.settings.aa
                @Override // com.google.android.gms.ads.identifier.settings.ab
                public final void a(fgrc fgrcVar) {
                    byte[] bArr2 = bArr;
                    boolean c = ac.c(bArr2);
                    fgrc fgrcVar2 = v;
                    if (!c) {
                        fgpr w = fgpr.w(bArr2);
                        if (!fgrcVar2.b.L()) {
                            fgrcVar2.U();
                        }
                        eqmb eqmbVar2 = (eqmb) fgrcVar2.b;
                        eqmb eqmbVar3 = eqmb.a;
                        eqmbVar2.b |= 1;
                        eqmbVar2.c = w;
                    }
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    eqmi eqmiVar = (eqmi) fgrcVar.b;
                    eqmb eqmbVar4 = (eqmb) fgrcVar2.Q();
                    eqmi eqmiVar2 = eqmi.a;
                    eqmbVar4.getClass();
                    eqmiVar.d = eqmbVar4;
                    eqmiVar.c = 3;
                }
            }, a2);
            com.google.android.gms.ads.eventattestation.internal.h hVar = this.c;
            AdRequestAttestationTokenParcel adRequestAttestationTokenParcel = new AdRequestAttestationTokenParcel(d);
            Parcel fE = hVar.fE();
            qmr.e(fE, adRequestAttestationTokenParcel);
            hVar.fH(2, fE);
        } catch (t e) {
            this.c.a(e.a, e.b);
        } catch (IOException e2) {
            e = e2;
            this.c.a(1, "");
            com.google.android.gms.ads.identifier.settings.d.c(AppContextProvider.a(), "request-attestation", e);
        } catch (RuntimeException e3) {
            if (!fmqe.l()) {
                throw e3;
            }
            com.google.android.gms.ads.identifier.settings.d.c(context, "getAdRequestAttestationToken", e3);
        } catch (GeneralSecurityException e4) {
            e = e4;
            this.c.a(1, "");
            com.google.android.gms.ads.identifier.settings.d.c(AppContextProvider.a(), "request-attestation", e);
        }
    }

    @Override // defpackage.bzoy
    public final void j(Status status) {
        this.c.a(1, status.j);
    }
}
