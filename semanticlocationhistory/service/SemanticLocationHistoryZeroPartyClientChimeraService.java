package com.google.android.gms.semanticlocationhistory.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ddyr;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryZeroPartyClientChimeraService extends bzot {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "API0");

    public SemanticLocationHistoryZeroPartyClientChimeraService() {
        super(314, "com.google.android.gms.semanticlocationhistory.zeroparty.service.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new ddyr(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
