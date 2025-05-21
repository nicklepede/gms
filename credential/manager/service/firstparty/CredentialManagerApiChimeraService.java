package com.google.android.gms.credential.manager.service.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auxj;
import defpackage.awrf;
import defpackage.awrg;
import defpackage.awri;
import defpackage.awrq;
import defpackage.bxgj;
import defpackage.bxgk;
import defpackage.bxhh;
import defpackage.cwod;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialManagerApiChimeraService extends awri {
    public awrg a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CredentialManagerApiChimeraService() {
        /*
            r7 = this;
            ejck r3 = defpackage.ejck.a
            fngm r0 = defpackage.fngm.a
            fngn r0 = r0.a()
            femw r0 = r0.d()
            fedh r0 = r0.b
            java.lang.String r1 = "getElementList(...)"
            defpackage.fvbo.e(r0, r1)
            eiuu r6 = defpackage.eitd.c(r0)
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

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        awrg awrgVar = this.a;
        if (awrgVar == null) {
            fvbo.j("apiStubFactory");
            awrgVar = null;
        }
        bxgk a = bxhh.a(this);
        String str = getServiceRequest.f;
        fvbo.e(str, "getCallingPackage(...)");
        String str2 = getServiceRequest.p;
        awrf awrfVar = awrgVar.a;
        bxgjVar.c(new auxj(str, str2, ((awrq) awrfVar.a).a(), ((cwod) awrfVar.b).a(), a));
    }
}
