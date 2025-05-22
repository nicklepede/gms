package com.google.android.gms.auth.api.phone.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abkc;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class InternalChimeraService extends bzot {
    public InternalChimeraService() {
        super(197, "com.google.android.gms.auth.api.phone.service.InternalService.START", Collections.EMPTY_SET, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new abkc(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
