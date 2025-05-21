package com.google.android.gms.credential.manager.service.zeroparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.awzy;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PasswordCheckupApiChimeraService extends bxgd {
    public PasswordCheckupApiChimeraService() {
        super(196, "com.google.android.gms.credential.manager.service.zeroparty.checkup.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new awzy(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
