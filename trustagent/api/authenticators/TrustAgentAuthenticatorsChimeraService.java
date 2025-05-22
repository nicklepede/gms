package com.google.android.gms.trustagent.api.authenticators;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.diys;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustAgentAuthenticatorsChimeraService extends bzot {
    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT_AUTHENTICATORS);
    }

    public TrustAgentAuthenticatorsChimeraService() {
        super(307, "com.google.android.gms.trustagent.AuthenticatorsService.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new diys(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
