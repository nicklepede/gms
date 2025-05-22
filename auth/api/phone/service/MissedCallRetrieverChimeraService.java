package com.google.android.gms.auth.api.phone.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abmi;
import defpackage.auad;
import defpackage.bsxe;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.fxuv;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class MissedCallRetrieverChimeraService extends bzot {
    private static final auad a = new auad("MissedCallService", new String[0]);

    public MissedCallRetrieverChimeraService() {
        super(411, "com.google.android.gms.auth.api.phone.service.MissedCallRetrieverService.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        String str = getServiceRequest.f;
        a.h("MissedCallRetrieverChimeraService#onGetService invoked by ".concat(String.valueOf(str)), new Object[0]);
        fxxm.c(str);
        fxuv fxuvVar = bsxe.a;
        bzozVar.c(new abmi(this, str, bsxe.d));
    }
}
