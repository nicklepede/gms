package com.google.android.gms.presencemanager.communal.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cwst;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AuthApiChimeraService extends bxgd {
    public AuthApiChimeraService() {
        super(292, "com.google.android.gms.presencemanager.communal.service.auth.START", ejck.a, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new cwst(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
