package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.eventattestation.internal.PlayInstallReferrerAttestationTokenRequestParcel;
import com.google.android.gms.ads.eventattestation.internal.PlayInstallReferrerAttestationTokenResponseParcel;
import com.google.android.gms.ads.eventattestation.internal.p;
import com.google.android.gms.ads.identifier.settings.ab;
import com.google.android.gms.ads.identifier.settings.ac;
import com.google.android.gms.common.api.Status;
import defpackage.bxgi;
import defpackage.enyl;
import defpackage.enyp;
import defpackage.enyr;
import defpackage.feab;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fjzz;
import defpackage.oto;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i extends bxgi {
    private final PlayInstallReferrerAttestationTokenRequestParcel a;
    private final int b;
    private final p c;

    public i(PlayInstallReferrerAttestationTokenRequestParcel playInstallReferrerAttestationTokenRequestParcel, p pVar, int i) {
        super(216, "FetchPlayInstallReferrerAttestationToken");
        this.a = playInstallReferrerAttestationTokenRequestParcel;
        this.c = pVar;
        this.b = i;
    }

    @Override // defpackage.bxgi
    public final void f(Context context) {
        final ac a = ac.a(context);
        try {
            PlayInstallReferrerAttestationTokenRequestParcel playInstallReferrerAttestationTokenRequestParcel = this.a;
            String str = playInstallReferrerAttestationTokenRequestParcel.a;
            final String str2 = playInstallReferrerAttestationTokenRequestParcel.b;
            final byte[] bArr = playInstallReferrerAttestationTokenRequestParcel.c;
            final int i = this.b;
            byte[] d = !fjzz.a.a().L() ? null : a.d(str, "playInstallReferrerAttestationToken", new ab() { // from class: com.google.android.gms.ads.identifier.settings.w
                @Override // com.google.android.gms.ads.identifier.settings.ab
                public final void a(fecj fecjVar) {
                    fecj v = enyr.a.v();
                    fecj f = ac.this.f(str2, i);
                    if (!v.b.L()) {
                        v.U();
                    }
                    byte[] bArr2 = bArr;
                    enyr enyrVar = (enyr) v.b;
                    enyl enylVar = (enyl) f.Q();
                    enylVar.getClass();
                    enyrVar.c = enylVar;
                    enyrVar.b |= 1;
                    feab D = v.D(bArr2, febw.a());
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    enyp enypVar = (enyp) fecjVar.b;
                    enyr enyrVar2 = (enyr) ((fecj) D).Q();
                    enyp enypVar2 = enyp.a;
                    enyrVar2.getClass();
                    enypVar.d = enyrVar2;
                    enypVar.c = 11;
                }
            }, i);
            p pVar = this.c;
            PlayInstallReferrerAttestationTokenResponseParcel playInstallReferrerAttestationTokenResponseParcel = new PlayInstallReferrerAttestationTokenResponseParcel(d);
            Parcel fr = pVar.fr();
            oto.e(fr, playInstallReferrerAttestationTokenResponseParcel);
            pVar.fu(2, fr);
        } catch (IOException | GeneralSecurityException e) {
            this.c.a(e.getMessage());
        }
    }

    @Override // defpackage.bxgi
    public final void j(Status status) {
        this.c.a(status.j);
    }
}
