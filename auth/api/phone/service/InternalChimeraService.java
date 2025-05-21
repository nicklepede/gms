package com.google.android.gms.auth.api.phone.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.zkc;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class InternalChimeraService extends bxgd {
    public InternalChimeraService() {
        super(197, "com.google.android.gms.auth.api.phone.service.InternalService.START", Collections.EMPTY_SET, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new zkc(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
