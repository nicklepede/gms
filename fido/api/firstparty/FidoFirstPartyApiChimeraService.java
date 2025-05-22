package com.google.android.gms.fido.api.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bdcr;
import defpackage.becc;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoFirstPartyApiChimeraService extends bzot {
    public FidoFirstPartyApiChimeraService() {
        super(347, "com.google.android.gms.fido.fido2.firstparty.START", elpp.a, 0, 9, bdcr.V);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new becc(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
