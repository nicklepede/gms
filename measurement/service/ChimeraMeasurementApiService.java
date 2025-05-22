package com.google.android.gms.measurement.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cfwm;
import defpackage.cgev;
import defpackage.cghs;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ChimeraMeasurementApiService extends bzot {
    public ChimeraMeasurementApiService() {
        super(93, "com.google.android.gms.measurement.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        cgev z = cgev.z(this);
        if (z.j.get()) {
            bzozVar.c(new cghs(new cfwm(z, getServiceRequest.f)));
        } else {
            z.aK().k.a("UploadController is not yet fully initialized");
            bzozVar.a(7777, null);
        }
    }
}
