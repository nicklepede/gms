package com.google.android.gms.apperrors.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.elqn;
import defpackage.fvch;
import defpackage.vrf;
import defpackage.vsc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppErrorApiChimeraService extends bzot {
    public AppErrorApiChimeraService() {
        super(334, "com.google.android.gms.apperrors.service.START_APP_ERROR", elpp.a, 0, 10, new elqn("com.android.vending"));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (fvch.c()) {
            bzozVar.c(new vsc(l(), new vrf(this)));
        } else {
            bzozVar.a(16, null);
        }
    }
}
