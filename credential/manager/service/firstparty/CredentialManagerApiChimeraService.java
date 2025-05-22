package com.google.android.gms.credential.manager.service.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.axbi;
import defpackage.ayvf;
import defpackage.ayvg;
import defpackage.ayvi;
import defpackage.ayvq;
import defpackage.bzoz;
import defpackage.bzpa;
import defpackage.bzpx;
import defpackage.cyya;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialManagerApiChimeraService extends ayvi {
    public ayvg a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CredentialManagerApiChimeraService() {
        /*
            r7 = this;
            elpp r3 = defpackage.elpp.a
            fpym r0 = defpackage.fpym.a
            fpyn r0 = r0.lK()
            fhbp r0 = r0.d()
            fgsa r0 = r0.b
            java.lang.String r1 = "getElementList(...)"
            defpackage.fxxm.e(r0, r1)
            elhz r6 = defpackage.elgi.c(r0)
            r4 = 0
            r5 = 10
            r1 = 196(0xc4, float:2.75E-43)
            java.lang.String r2 = "com.google.android.gms.credential.manager.service.firstparty.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.credential.manager.service.firstparty.CredentialManagerApiChimeraService.<init>():void");
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        ayvg ayvgVar = this.a;
        if (ayvgVar == null) {
            fxxm.j("apiStubFactory");
            ayvgVar = null;
        }
        bzpa a = bzpx.a(this);
        String str = getServiceRequest.f;
        fxxm.e(str, "getCallingPackage(...)");
        String str2 = getServiceRequest.p;
        ayvf ayvfVar = ayvgVar.a;
        bzozVar.c(new axbi(str, str2, ((ayvq) ayvfVar.a).a(), ((cyya) ayvfVar.b).a(), a));
    }
}
