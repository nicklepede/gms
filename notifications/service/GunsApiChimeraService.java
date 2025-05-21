package com.google.android.gms.notifications.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.csbi;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GunsApiChimeraService extends bxgd {
    public GunsApiChimeraService() {
        super(110, "com.google.android.gms.notifications.service.START", Collections.EMPTY_SET, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new csbi(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
