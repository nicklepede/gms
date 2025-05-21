package com.google.android.gms.measurement.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cdnn;
import defpackage.cdnp;
import defpackage.cdvv;
import defpackage.cdyl;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ChimeraMeasurementApiService extends bxgd {
    public ChimeraMeasurementApiService() {
        super(93, "com.google.android.gms.measurement.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        cdvv z = cdvv.z(this);
        if (!((Boolean) cdnn.aZ.a()).booleanValue() || z.j.get()) {
            bxgjVar.c(new cdyl(new cdnp(z, getServiceRequest.f)));
        } else {
            z.aJ().k.a("UploadController is not yet fully initialized");
            bxgjVar.a(7777, null);
        }
    }
}
