package com.google.android.gms.auth.proximity.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.acpx;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SecureChannelApiChimeraService extends bxgd {
    public SecureChannelApiChimeraService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "com.google.android.gms.auth.proximity.securechannelservice.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new acpx(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
