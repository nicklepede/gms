package com.google.android.gms.scheduler;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dakt;
import defpackage.dpya;
import defpackage.elpp;
import defpackage.fpua;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SchedulerChimeraBoundService extends bzot {
    public SchedulerChimeraBoundService() {
        super(218, "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (fpua.c() || !dpya.h(this)) {
            bzozVar.c(new dakt(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bzozVar.a(16, null);
        }
    }
}
