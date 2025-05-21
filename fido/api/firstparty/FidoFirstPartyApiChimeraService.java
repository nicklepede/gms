package com.google.android.gms.fido.api.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bayt;
import defpackage.bbyk;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoFirstPartyApiChimeraService extends bxgd {
    public FidoFirstPartyApiChimeraService() {
        super(347, "com.google.android.gms.fido.fido2.firstparty.START", ejck.a, 0, 9, bayt.V);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bbyk(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
