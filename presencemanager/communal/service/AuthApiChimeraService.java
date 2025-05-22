package com.google.android.gms.presencemanager.communal.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.czcq;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AuthApiChimeraService extends bzot {
    public AuthApiChimeraService() {
        super(292, "com.google.android.gms.presencemanager.communal.service.auth.START", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new czcq(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
