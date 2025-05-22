package com.google.android.gms.semanticlocation.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dcmb;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationZeroPartyClientChimeraService extends bzot {
    public SemanticLocationZeroPartyClientChimeraService() {
        super(173, "com.google.android.gms.semanticlocation.zeroparty.service.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dcmb(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
