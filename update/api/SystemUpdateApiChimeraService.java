package com.google.android.gms.update.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dhef;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SystemUpdateApiChimeraService extends bxgd {
    public SystemUpdateApiChimeraService() {
        super(157, "com.google.android.gms.update.START_API_SERVICE", ejck.a, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dhef(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
