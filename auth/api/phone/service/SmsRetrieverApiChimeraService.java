package com.google.android.gms.auth.api.phone.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arxo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;
import defpackage.ejdg;
import defpackage.zmj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SmsRetrieverApiChimeraService extends bxgd {
    private static final arxo a = new arxo("SmsRetrieverApiChimeraService");
    private static final eiuu b = new ejdg("android.permission-group.SMS");

    public SmsRetrieverApiChimeraService() {
        super(126, "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START", b, 3, 10);
        a.d("constructor", new Object[0]);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        a.d("onGetService", new Object[0]);
        bxgjVar.c(new zmj(this, getServiceRequest.f));
    }
}
