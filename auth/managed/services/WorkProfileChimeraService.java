package com.google.android.gms.auth.managed.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.absd;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WorkProfileChimeraService extends bxgd {
    public WorkProfileChimeraService() {
        super(320, "com.google.android.gms.auth.managed.START_WORK_PROFILE_SERVICE", ejck.a, 1, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new absd(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
