package com.google.android.gms.auth.proximity.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aepx;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SecureChannelApiChimeraService extends bzot {
    public SecureChannelApiChimeraService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "com.google.android.gms.auth.proximity.securechannelservice.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new aepx(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
