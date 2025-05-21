package com.google.android.gms.auth.api.credentials.fido.chimera;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejck;
import defpackage.ejdg;
import defpackage.zaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FidoFirstPartyChimeraService extends bxgd {
    public FidoFirstPartyChimeraService() {
        super(427, "com.google.android.gms.auth.api.fido.service.fido_first_party.START", ejck.a, 1, 9, new ejdg("com.google.android.gms.auth.api.identity.onetaptestapp"));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        Bundle bundle = getServiceRequest.i;
        bxgjVar.c(new zaz(l, getServiceRequest.f, getServiceRequest.p));
    }
}
