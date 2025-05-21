package com.google.android.gms.auth.folsom.service;

import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abdt;
import defpackage.abkr;
import defpackage.abng;
import defpackage.arxo;
import defpackage.asnf;
import defpackage.asng;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.fkzg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class KeyRetrievalApiChimeraService extends bxgd {
    private static final arxo a = abng.a("KeyRetrievalApi");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KeyRetrievalApiChimeraService() {
        /*
            r7 = this;
            ejck r3 = defpackage.ejck.a
            eius r0 = new eius
            r0.<init>()
            fkyk r1 = defpackage.fkyk.a
            fkyl r1 = r1.a()
            femw r1 = r1.s()
            fedh r1 = r1.b
            r0.k(r1)
            fkyk r1 = defpackage.fkyk.a
            fkyl r1 = r1.a()
            femw r1 = r1.t()
            fedh r1 = r1.b
            r0.k(r1)
            eiuu r6 = r0.g()
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

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
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
            bxgjVar.a(10, new Bundle());
            return;
        }
        if (abkr.u(string) && !string.isEmpty() && !abkr.u(string)) {
            a.d("KeyRetrievalApi is disabled by a flag.", new Object[0]);
            bxgjVar.a(16, new Bundle());
            return;
        }
        bxgo l = l();
        boolean z2 = true;
        if (fkzg.o()) {
            asnf asnfVar = asng.a;
            if (!getServiceRequest.f.equals("com.google.android.gms.auth.diagnostic")) {
                z2 = asng.X(AppContextProvider.a());
            }
        }
        bxgjVar.c(new abdt(l, string, z2, string2, string3, string4, string5, i, z, getServiceRequest.f, getServiceRequest.p));
    }
}
