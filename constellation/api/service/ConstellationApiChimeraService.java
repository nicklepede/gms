package com.google.android.gms.constellation.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.avax;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fpet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConstellationApiChimeraService extends bzot {
    public ConstellationApiChimeraService() {
        super(155, "com.google.android.gms.constellation.service.START", elpp.a, 0, 10, elhz.G(fpet.a.lK().c().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new avax(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
