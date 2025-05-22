package com.google.android.gms.findmydevice.spot.locationreporting;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bgdz;
import defpackage.bhfh;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekwo;
import defpackage.elcq;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.elqn;
import defpackage.fqsv;
import defpackage.fqto;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LocationReportApiChimeraService extends bzot {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [elhz] */
    public LocationReportApiChimeraService() {
        super(284, "com.google.android.gms.findmydevice.spot.service.locationreport.START", elpp.a, 0, 10, fqto.d().isEmpty() ? (elhz) ekwo.e(',').k(fqsv.a.lK().a()).collect(elcq.b) : new elqn(fqto.d()));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (bhfh.a()) {
            bzozVar.c(new bgdz(l()));
        } else {
            bzozVar.a(16, null);
        }
    }
}
