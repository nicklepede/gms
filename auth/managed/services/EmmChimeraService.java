package com.google.android.gms.auth.managed.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abrz;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;
import defpackage.ejdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EmmChimeraService extends bxgd {
    private static final eiuu a = new ejdg("android.permission-group.PHONE");

    public EmmChimeraService() {
        super(136, "com.google.android.gms.auth.managed.START_EMM_SERVICE", a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if ("com.google.android.gms".equals(getServiceRequest.f)) {
            bxgjVar.c(new abrz(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
