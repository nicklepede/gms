package com.google.android.gms.auth.cryptauth.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.acrx;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class CryptauthChimeraService extends bzot {
    public CryptauthChimeraService() {
        super(129, "com.google.android.gms.auth.cryptauth.cryptauthservice.START", Collections.EMPTY_SET, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new acrx(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
