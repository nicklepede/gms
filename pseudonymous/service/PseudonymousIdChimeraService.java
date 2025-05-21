package com.google.android.gms.pseudonymous.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cwwy;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PseudonymousIdChimeraService extends bxgd {
    public PseudonymousIdChimeraService() {
        super(38, "com.google.android.gms.pseudonymous.service.START", Collections.EMPTY_SET, 2, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new cwwy(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
