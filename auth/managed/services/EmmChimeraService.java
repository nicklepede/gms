package com.google.android.gms.auth.managed.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.adrz;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;
import defpackage.elqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class EmmChimeraService extends bzot {
    private static final elhz a = new elqn("android.permission-group.PHONE");

    public EmmChimeraService() {
        super(136, "com.google.android.gms.auth.managed.START_EMM_SERVICE", a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if ("com.google.android.gms".equals(getServiceRequest.f)) {
            bzozVar.c(new adrz(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bzozVar.a(16, null);
        }
    }
}
