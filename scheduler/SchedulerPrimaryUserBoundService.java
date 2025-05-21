package com.google.android.gms.scheduler;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cybo;
import defpackage.dnnr;
import defpackage.ejck;
import defpackage.fncb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SchedulerPrimaryUserBoundService extends bxgd {
    public SchedulerPrimaryUserBoundService() {
        super(218, "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE_SINGLE_USER", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (fncb.c() || !dnnr.h(this)) {
            bxgjVar.c(new cybo(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
