package com.google.android.gms.asterism.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eijj;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fmkc;
import defpackage.uke;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AsterismApiChimeraService extends bxgd {
    public AsterismApiChimeraService() {
        super(199, "com.google.android.gms.asterism.service.START", ejck.a, 0, 10, eiuu.G(eijj.e(',').n(fmkc.c())));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new uke(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
