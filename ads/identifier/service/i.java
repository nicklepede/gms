package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.eventattestation.internal.PlayInstallReferrerAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.PlayInstallReferrerAttestationTokenResponseParcel;
import com.google.android.gms.ads.eventattestation.internal.p;
import com.google.android.gms.ads.identifier.settings.ab;
import com.google.android.gms.ads.identifier.settings.ac;
import com.google.android.gms.common.api.Status;
import defpackage.bzoy;
import defpackage.eqme;
import defpackage.eqmi;
import defpackage.eqmk;
import defpackage.fgou;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fmqe;
import defpackage.qmr;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i extends bzoy {
    private final PlayInstallReferrerAttestationTokenRequestParcel a;
    private final int b;
    private final p c;

    public i(PlayInstallReferrerAttestationTokenRequestParcel playInstallReferrerAttestationTokenRequestParcel, p pVar, int i) {
        super(216, "FetchPlayInstallReferrerAttestationToken");
        this.a = playInstallReferrerAttestationTokenRequestParcel;
        this.c = pVar;
        this.b = i;
    }

    @Override // defpackage.bzoy
    public final void f(Context context) {
        final ac a = ac.a(context);
        try {
            PlayInstallReferrerAttestationTokenRequestParcel playInstallReferrerAttestationTokenRequestParcel = this.a;
            String str = playInstallReferrerAttestationTokenRequestParcel.a;
            final String str2 = playInstallReferrerAttestationTokenRequestParcel.b;
            final byte[] bArr = playInstallReferrerAttestationTokenRequestParcel.c;
            final int i = this.b;
            byte[] d = !fmqe.a.lK().L() ? null : a.d(str, "playInstallReferrerAttestationToken", new ab() { // from class: com.google.android.gms.ads.identifier.settings.w
                @Override // com.google.android.gms.ads.identifier.settings.ab
                public final void a(fgrc fgrcVar) {
                    fgrc v = eqmk.a.v();
                    fgrc f = ac.this.f(str2, i);
                    if (!v.b.L()) {
                        v.U();
                    }
                    byte[] bArr2 = bArr;
                    eqmk eqmkVar = (eqmk) v.b;
                    eqme eqmeVar = (eqme) f.Q();
                    eqmeVar.getClass();
                    eqmkVar.c = eqmeVar;
                    eqmkVar.b |= 1;
                    fgou D = v.D(bArr2, fgqp.a());
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    eqmi eqmiVar = (eqmi) fgrcVar.b;
                    eqmk eqmkVar2 = (eqmk) ((fgrc) D).Q();
                    eqmi eqmiVar2 = eqmi.a;
                    eqmkVar2.getClass();
                    eqmiVar.d = eqmkVar2;
                    eqmiVar.c = 11;
                }
            }, i);
            p pVar = this.c;
            PlayInstallReferrerAttestationTokenResponseParcel playInstallReferrerAttestationTokenResponseParcel = new PlayInstallReferrerAttestationTokenResponseParcel(d);
            Parcel fE = pVar.fE();
            qmr.e(fE, playInstallReferrerAttestationTokenResponseParcel);
            pVar.fH(2, fE);
        } catch (IOException | GeneralSecurityException e) {
            this.c.a(e.getMessage());
        }
    }

    @Override // defpackage.bzoy
    public final void j(Status status) {
        this.c.a(status.j);
    }
}
