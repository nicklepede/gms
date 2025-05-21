package com.google.android.gms.adsidentity.service;

import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.tfh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class AdsIdentityService extends bxgd {
    private tfh a;

    public AdsIdentityService() {
        super(261, "com.google.android.gms.adsidentity.service.BIND", ejck.a, 0, 9);
    }

    public static AdsIdentityService provideInstance() {
        return new AdsIdentityService();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        tfh tfhVar = new tfh(AppContextProvider.a(), l(), getServiceRequest.f, getServiceRequest.p);
        this.a = tfhVar;
        bxgjVar.c(tfhVar);
    }
}
