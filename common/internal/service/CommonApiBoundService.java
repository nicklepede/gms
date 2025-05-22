package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atzy;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CommonApiBoundService extends bzot {
    public CommonApiBoundService() {
        super(39, "com.google.android.gms.common.service.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new atzy(getServiceRequest.f, l()));
    }
}
