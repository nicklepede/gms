package com.google.android.gms.semanticlocationhistory.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dbol;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryZeroPartyClientChimeraService extends bxgd {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "API0");

    public SemanticLocationHistoryZeroPartyClientChimeraService() {
        super(314, "com.google.android.gms.semanticlocationhistory.zeroparty.service.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dbol(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
