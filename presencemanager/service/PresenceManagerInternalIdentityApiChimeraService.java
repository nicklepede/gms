package com.google.android.gms.presencemanager.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cwsz;
import defpackage.cwtb;
import defpackage.cwua;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PresenceManagerInternalIdentityApiChimeraService extends bxgd {
    public PresenceManagerInternalIdentityApiChimeraService() {
        super(293, "com.google.android.gms.presencemanager.service.INTERNAL_IDENTITY", Collections.EMPTY_SET, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        cwsz b = cwtb.a().b();
        b.b(getServiceRequest.f);
        bxgjVar.c(new cwua(this, l(), b.a().a(), getServiceRequest.f, getServiceRequest.p));
    }
}
