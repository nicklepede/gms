package com.google.android.gms.semanticlocationhistory.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.czix;
import defpackage.dayl;
import defpackage.ejck;
import defpackage.frxn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryChimeraService extends bxgd {
    public SemanticLocationHistoryChimeraService() {
        super(314, "com.google.android.gms.semanticlocationhistory.service.START", ejck.a, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (czix.a() && frxn.Q()) {
            bxgjVar.c(new dayl(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
