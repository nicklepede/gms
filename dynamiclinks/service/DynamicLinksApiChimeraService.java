package com.google.android.gms.dynamiclinks.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eqtl;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DynamicLinksApiChimeraService extends bxgd {
    public DynamicLinksApiChimeraService() {
        super(131, "com.google.firebase.dynamiclinks.service.START", new HashSet(), 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new eqtl(this, l(), getServiceRequest.f, getServiceRequest.e));
    }
}
