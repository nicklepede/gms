package com.google.android.gms.apperrors.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.ejdg;
import defpackage.fshj;
import defpackage.tvf;
import defpackage.twc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppErrorApiChimeraService extends bxgd {
    public AppErrorApiChimeraService() {
        super(334, "com.google.android.gms.apperrors.service.START_APP_ERROR", ejck.a, 0, 10, new ejdg("com.android.vending"));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (fshj.d()) {
            bxgjVar.c(new twc(l(), new tvf(this)));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
