package com.google.android.gms.semanticlocationhistory.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dbsv;
import defpackage.ddit;
import defpackage.elpp;
import defpackage.fush;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryChimeraService extends bzot {
    public SemanticLocationHistoryChimeraService() {
        super(314, "com.google.android.gms.semanticlocationhistory.service.START", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (dbsv.a() && fush.Q()) {
            bzozVar.c(new ddit(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bzozVar.a(16, null);
        }
    }
}
