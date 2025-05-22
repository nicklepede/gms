package com.google.android.gms.adsidentity.service;

import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.vbh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class AdsIdentityService extends bzot {
    private vbh a;

    public AdsIdentityService() {
        super(261, "com.google.android.gms.adsidentity.service.BIND", elpp.a, 0, 9);
    }

    public static AdsIdentityService provideInstance() {
        return new AdsIdentityService();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        vbh vbhVar = new vbh(AppContextProvider.a(), l(), getServiceRequest.f, getServiceRequest.p);
        this.a = vbhVar;
        bzozVar.c(vbhVar);
    }
}
