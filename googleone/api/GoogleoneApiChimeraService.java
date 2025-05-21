package com.google.android.gms.googleone.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bjim;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.fouv;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GoogleoneApiChimeraService extends bjim {
    public GoogleoneApiChimeraService() {
        super(425, "com.google.android.gms.googleone.api.GoogleoneApiChimeraService.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        if (fouv.c()) {
            return;
        }
        bxgjVar.a(23, null);
    }
}
