package com.google.android.gms.asterism.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekwo;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fpbt;
import defpackage.wgd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AsterismApiChimeraService extends bzot {
    public AsterismApiChimeraService() {
        super(199, "com.google.android.gms.asterism.service.START", elpp.a, 0, 10, elhz.G(ekwo.e(',').n(fpbt.c())));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new wgd(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
