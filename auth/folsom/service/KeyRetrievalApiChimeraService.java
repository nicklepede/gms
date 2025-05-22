package com.google.android.gms.auth.folsom.service;

import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.addt;
import defpackage.adkr;
import defpackage.adng;
import defpackage.auad;
import defpackage.auqz;
import defpackage.aura;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.fnqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class KeyRetrievalApiChimeraService extends bzot {
    private static final auad a = adng.a("KeyRetrievalApi");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KeyRetrievalApiChimeraService() {
        /*
            r7 = this;
            elpp r3 = defpackage.elpp.a
            elhx r0 = new elhx
            r0.<init>()
            fnpr r1 = defpackage.fnpr.a
            fnps r2 = r1.lK()
            fhbp r2 = r2.s()
            fgsa r2 = r2.b
            r0.k(r2)
            fnps r1 = r1.lK()
            fhbp r1 = r1.t()
            fgsa r1 = r1.b
            r0.k(r1)
            elhz r6 = r0.g()
            r4 = 0
            r5 = 10
            r1 = 172(0xac, float:2.41E-43)
            java.lang.String r2 = "com.google.android.gms.auth.key.retrieval.service.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.folsom.service.KeyRetrievalApiChimeraService.<init>():void");
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        Bundle bundle = getServiceRequest.i;
        String string = bundle.getString("SECURITY_DOMAIN");
        String string2 = bundle.getString("UTM_SOURCE");
        String string3 = bundle.getString("UTM_MEDIUM");
        String string4 = bundle.getString("UTM_CAMPAIGN");
        String string5 = bundle.getString("SESSION_ID");
        int i = bundle.getInt("CALLER_ID", 0);
        boolean z = bundle.getBoolean("OFFER_RESET");
        if (string == null) {
            a.d("Security domain is not set", new Object[0]);
            bzozVar.a(10, new Bundle());
            return;
        }
        if (adkr.u(string) && !string.isEmpty() && !adkr.u(string)) {
            a.d("KeyRetrievalApi is disabled by a flag.", new Object[0]);
            bzozVar.a(16, new Bundle());
            return;
        }
        bzpe l = l();
        boolean z2 = true;
        if (fnqn.n()) {
            auqz auqzVar = aura.a;
            if (!getServiceRequest.f.equals("com.google.android.gms.auth.diagnostic")) {
                z2 = aura.X(AppContextProvider.a());
            }
        }
        bzozVar.c(new addt(l, string, z2, string2, string3, string4, string5, i, z, getServiceRequest.f, getServiceRequest.p));
    }
}
