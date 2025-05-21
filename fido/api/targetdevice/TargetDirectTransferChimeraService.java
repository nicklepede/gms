package com.google.android.gms.fido.api.targetdevice;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bcpb;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class TargetDirectTransferChimeraService extends bxgd {
    public TargetDirectTransferChimeraService() {
        super(269, "com.google.android.gms.fido.targetdevice.internal_service.START", ejck.a, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bcpb(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
