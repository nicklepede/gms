package com.google.android.gms.thunderbird.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dfwn;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fsnb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdApiChimeraService extends bxgd {
    public ThunderbirdApiChimeraService() {
        super(226, "com.google.android.gms.thunderbird.service.START", ejck.a, 0, 10, eiuu.G(fsnb.a.a().x().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dfwn(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
