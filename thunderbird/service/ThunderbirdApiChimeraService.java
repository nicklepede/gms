package com.google.android.gms.thunderbird.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dihs;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fvik;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdApiChimeraService extends bzot {
    public ThunderbirdApiChimeraService() {
        super(226, "com.google.android.gms.thunderbird.service.START", elpp.a, 0, 10, elhz.G(fvik.a.lK().x().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dihs(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
