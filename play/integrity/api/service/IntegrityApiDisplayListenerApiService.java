package com.google.android.gms.play.integrity.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.cwiu;
import defpackage.cwjb;
import defpackage.cwjf;
import defpackage.cwji;
import defpackage.cwjj;
import defpackage.cwjm;
import defpackage.fixm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class IntegrityApiDisplayListenerApiService extends cwjm {
    public cwjb a;
    public cwjj b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IntegrityApiDisplayListenerApiService() {
        /*
            r7 = this;
            ejck r3 = defpackage.ejck.a
            eius r0 = new eius
            r0.<init>()
            java.lang.String r1 = "com.android.vending"
            r0.c(r1)
            asnf r1 = defpackage.asng.a
            eiuu r6 = r0.g()
            r4 = 0
            r5 = 10
            r1 = 370(0x172, float:5.18E-43)
            java.lang.String r2 = "com.google.android.gms.play.integrity.api.service.IntegrityApiDisplayListenerApiService.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.play.integrity.api.service.IntegrityApiDisplayListenerApiService.<init>():void");
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        cwji cwjiVar = this.b.a;
        cwjb cwjbVar = this.a;
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        bxgo bxgoVar = (bxgo) cwjiVar.a.a();
        fixm fixmVar = cwjiVar.b;
        bxgjVar.c(new cwjf(bxgoVar, cwiu.b(), cwjbVar, str, str2));
    }
}
