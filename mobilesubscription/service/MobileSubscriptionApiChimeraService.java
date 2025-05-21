package com.google.android.gms.mobilesubscription.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cern;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.fqid;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MobileSubscriptionApiChimeraService extends bxgd {
    private static final eiuu a = eiuu.K("android.permission-group.PHONE", "android.permission-group.STORAGE");
    private static final asot b = asot.b("MobileSubscription", asej.MOBILE_SUBSCRIPTION);

    public MobileSubscriptionApiChimeraService() {
        super(200, "com.google.android.gms.mobilesubscription.service.START", a, 0, 10, eiuu.G(fqid.a.a().d().b));
        ((ejhf) b.h()).x("Service is created.");
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        bxgjVar.c(new cern(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
