package com.google.android.gms.auth.authzen.legacy.keyservice;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.zuq;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthZenSecretProviderChimeraService extends bxgd {
    public AuthZenSecretProviderChimeraService() {
        super(107, "com.google.android.gms.auth.otp.OTP_SECRET", Collections.EMPTY_SET, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new zuq(l()));
    }
}
