package com.google.android.gms.trustagent.api.bridge;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.diyv;
import defpackage.elhz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustAgentBridgeChimeraService extends bzot {
    private static final elhz a;

    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT);
        a = elpp.a;
    }

    public TrustAgentBridgeChimeraService() {
        super(89, "com.google.android.gms.trustagent.BridgeApi.START", a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new diyv(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
