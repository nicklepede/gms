package com.google.android.gms.presencemanager.communal.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.czct;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SignInApiChimeraService extends bzot {
    public SignInApiChimeraService() {
        super(292, "com.google.android.gms.presencemanager.communal.service.signin.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new czct(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
