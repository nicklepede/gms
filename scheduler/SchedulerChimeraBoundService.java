package com.google.android.gms.scheduler;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cyaw;
import defpackage.dnnr;
import defpackage.ejck;
import defpackage.fncb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SchedulerChimeraBoundService extends bxgd {
    public SchedulerChimeraBoundService() {
        super(218, "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (fncb.c() || !dnnr.h(this)) {
            bxgjVar.c(new cyaw(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
