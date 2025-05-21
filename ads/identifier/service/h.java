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
import defpackage.bxgi;
import defpackage.enyl;
import defpackage.enyp;
import defpackage.enyq;
import defpackage.fecj;
import defpackage.fjzz;
import defpackage.oto;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class h extends bxgi {
    private final ImpressionAttestationTokenRequestParcel a;
    private final int b;
    private final o c;

    public h(ImpressionAttestationTokenRequestParcel impressionAttestationTokenRequestParcel, int i, o oVar) {
        super(216, "FetchImpressionAttestationToken");
        this.a = impressionAttestationTokenRequestParcel;
        this.b = i;
        this.c = oVar;
    }

    @Override // defpackage.bxgi
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
            if (fjzz.a.a().K()) {
                String b = a.b(str2, a2);
                final fecj v = enyq.a.v();
                fecj f = a.f(b, a2);
                if (!v.b.L()) {
                    v.U();
                }
                enyq enyqVar = (enyq) v.b;
                enyl enylVar = (enyl) f.Q();
                enylVar.getClass();
                enyqVar.c = enylVar;
                enyqVar.b |= 1;
                d = a.d(str, "impressionAttestationToken", new ab() { // from class: com.google.android.gms.ads.identifier.settings.z
                    @Override // com.google.android.gms.ads.identifier.settings.ab
                    public final void a(fecj fecjVar) {
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        fecj fecjVar2 = fecj.this;
                        enyp enypVar = (enyp) fecjVar.b;
                        enyq enyqVar2 = (enyq) fecjVar2.Q();
                        enyp enypVar2 = enyp.a;
                        enyqVar2.getClass();
                        enypVar.d = enyqVar2;
                        enypVar.c = 9;
                    }
                }, a2);
            } else {
                d = null;
            }
            o oVar = this.c;
            ImpressionAttestationTokenResponseParcel impressionAttestationTokenResponseParcel = new ImpressionAttestationTokenResponseParcel(d);
            Parcel fr = oVar.fr();
            oto.e(fr, impressionAttestationTokenResponseParcel);
            oVar.fu(2, fr);
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

    @Override // defpackage.bxgi
    public final void j(Status status) {
        this.c.a(1, status.j);
    }
}
