package com.google.android.gms.trustagent.api.state;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dizb;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.elqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustAgentStateChimeraService extends bzot {
    private static final elhz a;

    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT);
        a = elpp.a;
    }

    public TrustAgentStateChimeraService() {
        super(85, "com.google.android.gms.trustagent.StateApi.START", a, 0, 10, new elqn("com.google.android.gms.test"));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        bzozVar.c(new dizb(null));
    }
}
