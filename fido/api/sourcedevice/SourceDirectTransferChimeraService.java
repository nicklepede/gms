package com.google.android.gms.fido.api.sourcedevice;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bcon;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SourceDirectTransferChimeraService extends bxgd {
    public SourceDirectTransferChimeraService() {
        super(262, "com.google.android.gms.fido.sourcedevice.service.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bcon(l(), getServiceRequest.f));
    }
}
