package com.google.android.gms.auth.managed.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.adsd;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WorkProfileChimeraService extends bzot {
    public WorkProfileChimeraService() {
        super(320, "com.google.android.gms.auth.managed.START_WORK_PROFILE_SERVICE", elpp.a, 1, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new adsd(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
