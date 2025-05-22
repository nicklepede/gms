package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.ImpressionAttestationTokenResponseParcel;
import com.google.android.gms.ads.eventattestation.internal.o;
import com.google.android.gms.ads.identifier.settings.ab;
import com.google.android.gms.ads.identifier.settings.ac;
import com.google.android.gms.ads.identifier.settings.t;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import com.google.android.gms.common.api.Status;
import defpackage.bzoy;
import defpackage.eqme;
import defpackage.eqmi;
import defpackage.eqmj;
import defpackage.fgrc;
import defpackage.fmqe;
import defpackage.qmr;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h extends bzoy {
    private final ImpressionAttestationTokenRequestParcel a;
    private final int b;
    private final o c;

    public h(ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel, int i, o oVar) {
        super(216, "FetchImpressionAttestationToken");
        this.a = impressionAttestationTokenRequestParcel;
        this.b = i;
        this.c = oVar;
    }

    @Override // defpackage.bzoy
    public final void f(Context context) {
        byte[] d;
        int i = this.b;
        ac a = ac.a(context);
        ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel = this.a;
        int a2 = com.google.android.gms.ads.eventattestation.internal.m.a(i, impressionAttestationTokenRequestParcel.b);
        try {
            String str = impressionAttestationTokenRequestParcel.a;
            String str2 = impressionAttestationTokenRequestParcel.c;
            Parcel parcel = impressionAttestationTokenRequestParcel.d;
            int i2 = impressionAttestationTokenRequestParcel.e;
            int i3 = impressionAttestationTokenRequestParcel.f;
            if (fmqe.a.lK().K()) {
                String b = a.b(str2, a2);
                final fgrc v = eqmj.a.v();
                fgrc f = a.f(b, a2);
                if (!v.b.L()) {
                    v.U();
                }
                eqmj eqmjVar = (eqmj) v.b;
                eqme eqmeVar = (eqme) f.Q();
                eqmeVar.getClass();
                eqmjVar.c = eqmeVar;
                eqmjVar.b |= 1;
                d = a.d(str, "impressionAttestationToken", new ab() { // from class: com.google.android.gms.ads.identifier.settings.z
                    @Override // com.google.android.gms.ads.identifier.settings.ab
                    public final void a(fgrc fgrcVar) {
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fgrc fgrcVar2 = fgrc.this;
                        eqmi eqmiVar = (eqmi) fgrcVar.b;
                        eqmj eqmjVar2 = (eqmj) fgrcVar2.Q();
                        eqmi eqmiVar2 = eqmi.a;
                        eqmjVar2.getClass();
                        eqmiVar.d = eqmjVar2;
                        eqmiVar.c = 9;
                    }
                }, a2);
            } else {
                d = null;
            }
            o oVar = this.c;
            ImpressionAttestationTokenResponseParcel impressionAttestationTokenResponseParcel = new ImpressionAttestationTokenResponseParcel(d);
            Parcel fE = oVar.fE();
            qmr.e(fE, impressionAttestationTokenResponseParcel);
            oVar.fH(2, fE);
        } catch (t e) {
            this.c.a(e.a, e.b);
        } catch (IOException e2) {
            e = e2;
            this.c.a(1, "");
            com.google.android.gms.ads.identifier.settings.d.c(AppContextProvider.a(), "impression-attestation", e);
        } catch (GeneralSecurityException e3) {
            e = e3;
            this.c.a(1, "");
            com.google.android.gms.ads.identifier.settings.d.c(AppContextProvider.a(), "impression-attestation", e);
        }
    }

    @Override // defpackage.bzoy
    public final void j(Status status) {
        this.c.a(1, status.j);
    }
}
