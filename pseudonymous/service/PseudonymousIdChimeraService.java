package com.google.android.gms.pseudonymous.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.czgw;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PseudonymousIdChimeraService extends bzot {
    public PseudonymousIdChimeraService() {
        super(38, "com.google.android.gms.pseudonymous.service.START", Collections.EMPTY_SET, 2, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new czgw(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
