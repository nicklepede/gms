package com.google.android.gms.auth.api.credentials.assistedsignin;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abge;
import defpackage.bonh;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AssistedSignInChimeraService extends bzot {
    public AssistedSignInChimeraService() {
        super(212, "com.google.android.gms.auth.api.identity.service.signin.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new abge(l(), bonh.a(this, null), getServiceRequest.f, getServiceRequest.p));
    }
}
