package com.google.android.gms.auth.aang.events.services;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejhf;
import defpackage.fkeu;
import defpackage.vis;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DemoAccountApiChimeraService extends bxgd {
    private final asot a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DemoAccountApiChimeraService() {
        /*
            r7 = this;
            r5 = 9
            ejck r3 = defpackage.ejck.a
            r1 = 426(0x1aa, float:5.97E-43)
            java.lang.String r2 = "com.google.android.gms.auth.account.demoaccount.service.START"
            r4 = 3
            r6 = r3
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "DemoAccountApiChimeraService"
            asot r1 = defpackage.vbb.a(r1)
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.aang.events.services.DemoAccountApiChimeraService.<init>():void");
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (!fkeu.a.a().j()) {
            ((ejhf) ((ejhf) this.a.j()).ah((char) 482)).x("API is disabled.");
            bxgjVar.a(16, new Bundle());
        } else {
            ((ejhf) ((ejhf) this.a.j()).ah((char) 481)).x("API is only available on Android S+");
            bxgjVar.a(16, new Bundle());
            String str = getServiceRequest.f;
            bxgjVar.c(new vis(l(), getServiceRequest.f, getServiceRequest.p));
        }
    }
}
