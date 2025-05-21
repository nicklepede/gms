package com.google.android.gms.fido.api.credentialstore;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bbog;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CredentialStoreChimeraService extends bxgd {
    public CredentialStoreChimeraService() {
        super(214, "com.google.android.gms.fido.credentialstore.internal_service.START", ejck.a, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bbog(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
