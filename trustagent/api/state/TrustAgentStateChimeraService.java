package com.google.android.gms.trustagent.api.state;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgnw;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustAgentStateChimeraService extends bxgd {
    private static final eiuu a;

    static {
        asot.b("TrustAgent", asej.TRUSTAGENT);
        a = ejck.a;
    }

    public TrustAgentStateChimeraService() {
        super(85, "com.google.android.gms.trustagent.StateApi.START", a, 0, 10, new ejdg("com.google.android.gms.test"));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        bxgjVar.c(new dgnw(null));
    }
}
