package com.google.android.gms.auth.aang.events.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.wwn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GoogleAuthAangChimeraService extends bzot {
    public GoogleAuthAangChimeraService() {
        super(343, "com.google.android.gms.auth.aang.events.services.START", elpp.a, 1, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new wwn(l(), getServiceRequest.f, getApplicationContext(), bzozVar.e()));
    }
}
