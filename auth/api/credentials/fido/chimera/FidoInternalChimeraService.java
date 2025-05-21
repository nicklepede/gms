package com.google.android.gms.auth.api.credentials.fido.chimera;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejck;
import defpackage.ejdg;
import defpackage.zbb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FidoInternalChimeraService extends bxgd {
    public FidoInternalChimeraService() {
        super(379, "com.google.android.gms.auth.api.fido.service.fido_internal.START", ejck.a, 0, 9, new ejdg("com.google.android.gms.auth.api.identity.onetaptestapp"));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        Bundle bundle = getServiceRequest.i;
        bxgjVar.c(new zbb(l, getServiceRequest.f, getServiceRequest.p));
    }
}
