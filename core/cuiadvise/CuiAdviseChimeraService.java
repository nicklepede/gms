package com.google.android.gms.core.cuiadvise;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.axlj;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxhh;
import defpackage.fmtj;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CuiAdviseChimeraService extends bxgd {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [eiuu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CuiAdviseChimeraService() {
        /*
            r7 = this;
            ejck r3 = defpackage.ejck.a
            boolean r0 = defpackage.fmtj.c()
            if (r0 == 0) goto L1f
            fmtj r0 = defpackage.fmtj.a
            fmtk r0 = r0.a()
            femw r0 = r0.a()
            fedh r0 = r0.b
            java.lang.String r1 = "getElementList(...)"
            defpackage.fvbo.e(r0, r1)
            eiuu r0 = defpackage.eitd.c(r0)
            r6 = r0
            goto L23
        L1f:
            defpackage.fvbo.c(r3)
            r6 = r3
        L23:
            r4 = 0
            r5 = 10
            r1 = 403(0x193, float:5.65E-43)
            java.lang.String r2 = "com.google.android.gms.core.cuiadvise.service.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.core.cuiadvise.CuiAdviseChimeraService.<init>():void");
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        if (fmtj.c()) {
            bxgjVar.c(new axlj(bxhh.a(this)));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
