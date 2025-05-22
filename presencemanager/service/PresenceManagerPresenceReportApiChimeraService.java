package com.google.android.gms.presencemanager.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.czcw;
import defpackage.czcy;
import defpackage.czea;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceManagerPresenceReportApiChimeraService extends bzot {
    public PresenceManagerPresenceReportApiChimeraService() {
        super(293, "com.google.android.gms.presencemanager.service.PRESENCE_REPORT", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        czcw b = czcy.a().b();
        b.b(getServiceRequest.f);
        bzozVar.c(new czea(l(), b.a().a(), getServiceRequest.f, getServiceRequest.p));
    }
}
