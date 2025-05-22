package com.google.android.gms.auth.api.credentials.fido.chimera;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abaq;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elpp;
import defpackage.elqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FidoFirstPartyChimeraService extends bzot {
    public FidoFirstPartyChimeraService() {
        super(427, "com.google.android.gms.auth.api.fido.service.fido_first_party.START", elpp.a, 1, 9, new elqn("com.google.android.gms.auth.api.identity.onetaptestapp"));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzpe l = l();
        Bundle bundle = getServiceRequest.i;
        bzozVar.c(new abaq(l, getServiceRequest.f, getServiceRequest.p));
    }
}
