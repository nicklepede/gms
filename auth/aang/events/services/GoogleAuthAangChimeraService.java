package com.google.android.gms.auth.aang.events.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.van;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GoogleAuthAangChimeraService extends bxgd {
    public GoogleAuthAangChimeraService() {
        super(343, "com.google.android.gms.auth.aang.events.services.START", ejck.a, 1, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new van(l(), getServiceRequest.f, getApplicationContext(), bxgjVar.e()));
    }
}
