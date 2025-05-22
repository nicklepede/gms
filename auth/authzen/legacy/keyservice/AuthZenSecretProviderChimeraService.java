package com.google.android.gms.auth.authzen.legacy.keyservice;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abuq;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthZenSecretProviderChimeraService extends bzot {
    public AuthZenSecretProviderChimeraService() {
        super(107, "com.google.android.gms.auth.otp.OTP_SECRET", Collections.EMPTY_SET, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new abuq(l()));
    }
}
