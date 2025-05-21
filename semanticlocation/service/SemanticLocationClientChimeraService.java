package com.google.android.gms.semanticlocation.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.czpz;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.frur;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationClientChimeraService extends bxgd {
    public SemanticLocationClientChimeraService() {
        super(173, "com.google.android.gms.semanticlocation.service.START_ODLH", ejck.a, 0, 10, eiuu.G(frur.c().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new czpz(l(), getServiceRequest.p, getServiceRequest.f));
    }
}
