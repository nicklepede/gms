package com.google.android.gms.recaptchabase.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgk;
import defpackage.bxhh;
import defpackage.cxcp;
import defpackage.cxcq;
import defpackage.cxcs;
import defpackage.cxct;
import defpackage.cxcx;
import defpackage.ejck;
import defpackage.fuuw;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RecaptchaBaseApiService extends bxgd {
    public RecaptchaBaseApiService() {
        super(380, "com.google.android.gms.recaptchabase.service.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        bxgk a = bxhh.a(this);
        String str = getServiceRequest.f;
        fvbo.e(str, "getCallingPackage(...)");
        fuuw fuuwVar = cxcq.a;
        cxct cxctVar = new cxct(str, cxcp.a());
        String str2 = getServiceRequest.f;
        fvbo.e(str2, "getCallingPackage(...)");
        bxgjVar.c(new cxcx(a, cxctVar, new cxcs(str2, cxcp.a())));
    }
}
