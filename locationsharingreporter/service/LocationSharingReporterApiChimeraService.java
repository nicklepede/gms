package com.google.android.gms.locationsharingreporter.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cdcs;
import defpackage.ekvi;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fsqx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationSharingReporterApiChimeraService extends bzot {
    public LocationSharingReporterApiChimeraService() {
        super(277, "com.google.android.gms.locationsharingreporter.service.START", elpp.a, 0, 10, elhz.G(fsqx.a.lK().a().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new cdcs(this, l(), ekvi.i(getServiceRequest.f), ekvi.i(getServiceRequest.p)));
    }
}
