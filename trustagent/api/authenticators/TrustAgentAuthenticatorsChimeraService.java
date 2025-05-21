package com.google.android.gms.trustagent.api.authenticators;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgnn;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustAgentAuthenticatorsChimeraService extends bxgd {
    static {
        asot.b("TrustAgent", asej.TRUSTAGENT_AUTHENTICATORS);
    }

    public TrustAgentAuthenticatorsChimeraService() {
        super(307, "com.google.android.gms.trustagent.AuthenticatorsService.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dgnn(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
