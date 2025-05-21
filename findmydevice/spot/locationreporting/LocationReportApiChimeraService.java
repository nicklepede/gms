package com.google.android.gms.findmydevice.spot.locationreporting;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.becn;
import defpackage.bfdr;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eijj;
import defpackage.eipl;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejdg;
import defpackage.fobb;
import defpackage.fobx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LocationReportApiChimeraService extends bxgd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [eiuu] */
    public LocationReportApiChimeraService() {
        super(284, "com.google.android.gms.findmydevice.spot.service.locationreport.START", ejck.a, 0, 10, fobx.d().isEmpty() ? (eiuu) eijj.e(',').k(fobb.a.a().a()).collect(eipl.b) : new ejdg(fobx.d()));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (bfdr.a()) {
            bxgjVar.c(new becn(l()));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
