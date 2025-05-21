package com.google.android.gms.auth.cryptauth.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aarx;
import defpackage.bxgd;
import defpackage.bxgj;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CryptauthChimeraService extends bxgd {
    public CryptauthChimeraService() {
        super(129, "com.google.android.gms.auth.cryptauth.cryptauthservice.START", Collections.EMPTY_SET, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new aarx(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
