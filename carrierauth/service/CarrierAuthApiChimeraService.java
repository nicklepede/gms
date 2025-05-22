package com.google.android.gms.carrierauth.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.anpo;
import defpackage.anpw;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekwo;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fpcc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarrierAuthApiChimeraService extends bzot {
    public CarrierAuthApiChimeraService() {
        super(191, "com.google.android.gms.carrierauth.service.START", elpp.a, 0, 10, elhz.G(ekwo.e(',').n(fpcc.c())));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new anpw(this, l(), new anpo(), getServiceRequest.f, getServiceRequest.p));
    }
}
