package com.google.android.gms.semanticlocation.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dcaa;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fupl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationClientChimeraService extends bzot {
    public SemanticLocationClientChimeraService() {
        super(173, "com.google.android.gms.semanticlocation.service.START_ODLH", elpp.a, 0, 10, elhz.G(fupl.c().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dcaa(l(), getServiceRequest.p, getServiceRequest.f));
    }
}
