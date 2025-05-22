package com.google.android.gms.mobilesubscription.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.chav;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.ftbv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MobileSubscriptionApiChimeraService extends bzot {
    private static final elhz a = elhz.K("android.permission-group.PHONE", "android.permission-group.STORAGE");
    private static final ausn b = ausn.b("MobileSubscription", auid.MOBILE_SUBSCRIPTION);

    public MobileSubscriptionApiChimeraService() {
        super(200, "com.google.android.gms.mobilesubscription.service.START", a, 0, 10, elhz.G(ftbv.a.lK().d().b));
        ((eluo) b.h()).x("Service is created.");
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        bzozVar.c(new chav(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
