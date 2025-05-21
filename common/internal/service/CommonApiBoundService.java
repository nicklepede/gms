package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arxj;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CommonApiBoundService extends bxgd {
    public CommonApiBoundService() {
        super(39, "com.google.android.gms.common.service.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new arxj(getServiceRequest.f, l()));
    }
}
