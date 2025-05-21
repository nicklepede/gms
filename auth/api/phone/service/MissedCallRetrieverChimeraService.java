package com.google.android.gms.auth.api.phone.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arxo;
import defpackage.bqpn;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.zmi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class MissedCallRetrieverChimeraService extends bxgd {
    private static final arxo a = new arxo("MissedCallService", new String[0]);

    public MissedCallRetrieverChimeraService() {
        super(411, "com.google.android.gms.auth.api.phone.service.MissedCallRetrieverService.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        String str = getServiceRequest.f;
        a.h("MissedCallRetrieverChimeraService#onGetService invoked by ".concat(String.valueOf(str)), new Object[0]);
        fvbo.c(str);
        fuyx fuyxVar = bqpn.a;
        bxgjVar.c(new zmi(this, str, bqpn.d));
    }
}
