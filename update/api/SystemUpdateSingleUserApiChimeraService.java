package com.google.android.gms.update.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dhef;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SystemUpdateSingleUserApiChimeraService extends bxgd {
    public SystemUpdateSingleUserApiChimeraService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, "com.google.android.gms.update.START_SINGLE_USER_API_SERVICE", ejck.a, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dhef(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
