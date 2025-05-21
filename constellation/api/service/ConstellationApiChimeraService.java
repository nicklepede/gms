package com.google.android.gms.constellation.api.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aswv;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fmmy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConstellationApiChimeraService extends bxgd {
    public ConstellationApiChimeraService() {
        super(155, "com.google.android.gms.constellation.service.START", ejck.a, 0, 10, eiuu.G(fmmy.a.a().b().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new aswv(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
