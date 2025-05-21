package com.google.android.gms.trustagent.api.bridge;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgnq;
import defpackage.eiuu;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustAgentBridgeChimeraService extends bxgd {
    private static final eiuu a;

    static {
        asot.b("TrustAgent", asej.TRUSTAGENT);
        a = ejck.a;
    }

    public TrustAgentBridgeChimeraService() {
        super(89, "com.google.android.gms.trustagent.BridgeApi.START", a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dgnq(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
