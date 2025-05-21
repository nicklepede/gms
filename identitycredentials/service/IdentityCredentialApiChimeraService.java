package com.google.android.gms.identitycredentials.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.identitycredentials.service.IdentityCredentialApiChimeraService;
import defpackage.bmua;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgk;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class IdentityCredentialApiChimeraService extends bxgd {
    private final fuuw a;

    public IdentityCredentialApiChimeraService() {
        super(352, "com.google.android.gms.identitycredentials.service.START", Collections.EMPTY_SET, 3, 9);
        this.a = new fuvg(new fvaf() { // from class: bmtr
            @Override // defpackage.fvaf
            public final Object a() {
                return bxhh.a(IdentityCredentialApiChimeraService.this);
            }
        });
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        bxgk bxgkVar = (bxgk) this.a.a();
        String str = getServiceRequest.f;
        fvbo.e(str, "getCallingPackage(...)");
        bxgjVar.c(new bmua(bxgkVar, this, str, getServiceRequest.p));
    }
}
