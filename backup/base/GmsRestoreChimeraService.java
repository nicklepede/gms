package com.google.android.gms.backup.base;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ahlz;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsRestoreChimeraService extends bxgd {
    public GmsRestoreChimeraService() {
        super(201, "com.google.android.gms.backup.GMS_MODULE_RESTORE", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new ahlz(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
