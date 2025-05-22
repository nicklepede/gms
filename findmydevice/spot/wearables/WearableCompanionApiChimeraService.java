package com.google.android.gms.findmydevice.spot.wearables;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bgei;
import defpackage.bhfh;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekwo;
import defpackage.elcq;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.elqn;
import defpackage.fqsv;
import defpackage.fqsy;
import defpackage.fqto;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class WearableCompanionApiChimeraService extends bzot {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [elhz] */
    public WearableCompanionApiChimeraService() {
        super(284, "com.google.android.gms.findmydevice.spot.service.wearables.START", elpp.a, 0, 9, fqto.d().isEmpty() ? (elhz) ekwo.e(',').k(fqsv.a.lK().c()).collect(elcq.b) : new elqn(fqto.d()));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (fqsy.a.lK().d() && bhfh.b()) {
            bzozVar.c(new bgei(l()));
        } else {
            bzozVar.a(16, null);
        }
    }
}
