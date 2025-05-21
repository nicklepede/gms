package com.google.android.gms.semanticlocation.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dabt;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationZeroPartyClientChimeraService extends bxgd {
    public SemanticLocationZeroPartyClientChimeraService() {
        super(173, "com.google.android.gms.semanticlocation.zeroparty.service.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dabt(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
