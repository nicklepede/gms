package com.google.android.gms.inappreach.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqke;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.fryl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InAppReachApiChimeraService extends bzot {
    public static final ausn a = ausn.b(InAppReachApiChimeraService.class.getName(), auid.INAPP_REACH);
    private static final String b = "com.google.android.gms.inappreach.service.InAppReachApiChimeraService";

    public InAppReachApiChimeraService() {
        super(315, "com.google.android.gms.inappreach.service.START", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (!fryl.d()) {
            bzozVar.a(23, null);
        }
        bzozVar.c(new bqke(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
