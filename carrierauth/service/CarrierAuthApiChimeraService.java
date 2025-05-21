package com.google.android.gms.carrierauth.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.alod;
import defpackage.alol;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eijj;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fmkl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarrierAuthApiChimeraService extends bxgd {
    public CarrierAuthApiChimeraService() {
        super(191, "com.google.android.gms.carrierauth.service.START", ejck.a, 0, 10, eiuu.G(eijj.e(',').n(fmkl.c())));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new alol(this, l(), new alod(), getServiceRequest.f, getServiceRequest.p));
    }
}
