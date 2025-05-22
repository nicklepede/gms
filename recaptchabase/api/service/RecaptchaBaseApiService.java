package com.google.android.gms.recaptchabase.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpa;
import defpackage.bzpx;
import defpackage.czml;
import defpackage.czmm;
import defpackage.czmo;
import defpackage.czmp;
import defpackage.czmt;
import defpackage.elpp;
import defpackage.fxqu;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RecaptchaBaseApiService extends bzot {
    public RecaptchaBaseApiService() {
        super(380, "com.google.android.gms.recaptchabase.service.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        bzpa a = bzpx.a(this);
        String str = getServiceRequest.f;
        fxxm.e(str, "getCallingPackage(...)");
        fxqu fxquVar = czmm.a;
        czmp czmpVar = new czmp(str, czml.a());
        String str2 = getServiceRequest.f;
        fxxm.e(str2, "getCallingPackage(...)");
        bzozVar.c(new czmt(a, czmpVar, new czmo(str2, czml.a())));
    }
}
