package com.google.android.gms.play.integrity.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.cysr;
import defpackage.cysy;
import defpackage.cytc;
import defpackage.cytf;
import defpackage.cytg;
import defpackage.cytj;
import defpackage.flnj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class IntegrityApiDisplayListenerApiService extends cytj {
    public cysy a;
    public cytg b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IntegrityApiDisplayListenerApiService() {
        /*
            r7 = this;
            elpp r3 = defpackage.elpp.a
            elhx r0 = new elhx
            r0.<init>()
            java.lang.String r1 = "com.android.vending"
            r0.c(r1)
            auqz r1 = defpackage.aura.a
            elhz r6 = r0.g()
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

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        cytf cytfVar = this.b.a;
        cysy cysyVar = this.a;
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        bzpe bzpeVar = (bzpe) cytfVar.a.a();
        flnj flnjVar = cytfVar.b;
        bzozVar.c(new cytc(bzpeVar, cysr.b(), cysyVar, str, str2));
    }
}
