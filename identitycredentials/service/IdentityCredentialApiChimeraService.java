package com.google.android.gms.identitycredentials.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.identitycredentials.service.IdentityCredentialApiChimeraService;
import defpackage.bpbh;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpa;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class IdentityCredentialApiChimeraService extends bzot {
    private final fxqu a;

    public IdentityCredentialApiChimeraService() {
        super(352, "com.google.android.gms.identitycredentials.service.START", Collections.EMPTY_SET, 3, 9);
        this.a = new fxre(new fxwd() { // from class: bpay
            @Override // defpackage.fxwd
            public final Object a() {
                return bzpx.a(IdentityCredentialApiChimeraService.this);
            }
        });
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        bzpa bzpaVar = (bzpa) this.a.a();
        String str = getServiceRequest.f;
        fxxm.e(str, "getCallingPackage(...)");
        bzozVar.c(new bpbh(bzpaVar, this, str, getServiceRequest.p));
    }
}
