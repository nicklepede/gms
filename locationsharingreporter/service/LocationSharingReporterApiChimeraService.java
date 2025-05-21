package com.google.android.gms.locationsharingreporter.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cauc;
import defpackage.eiid;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fpxd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationSharingReporterApiChimeraService extends bxgd {
    public LocationSharingReporterApiChimeraService() {
        super(277, "com.google.android.gms.locationsharingreporter.service.START", ejck.a, 0, 10, eiuu.G(fpxd.a.a().a().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new cauc(this, l(), eiid.i(getServiceRequest.f), eiid.i(getServiceRequest.p)));
    }
}
