package com.google.android.gms.inappreach.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bocq;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.fpfb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InAppReachApiChimeraService extends bxgd {
    public static final asot a = asot.b(InAppReachApiChimeraService.class.getName(), asej.INAPP_REACH);
    private static final String b = "com.google.android.gms.inappreach.service.InAppReachApiChimeraService";

    public InAppReachApiChimeraService() {
        super(315, "com.google.android.gms.inappreach.service.START", ejck.a, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (!fpfb.c()) {
            bxgjVar.a(23, null);
        }
        bxgjVar.c(new bocq(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
