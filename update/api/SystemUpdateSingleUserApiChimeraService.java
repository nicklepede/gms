package com.google.android.gms.update.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.djpl;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SystemUpdateSingleUserApiChimeraService extends bzot {
    public SystemUpdateSingleUserApiChimeraService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, "com.google.android.gms.update.START_SINGLE_USER_API_SERVICE", elpp.a, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new djpl(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
