package com.google.android.gms.location.network;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.auio;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ccij;
import defpackage.ekww;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NlpService extends bzot {
    public NlpService() {
        super(385, "com.google.android.gms.location.network.service.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.LOCATION_NLP_SERVICE_API);
        ClientIdentity e = ClientIdentity.e(bzozVar.b, getServiceRequest, Binder.getCallingUid(), Binder.getCallingPid());
        if (bzozVar.g()) {
            bzozVar.c(new ccij(this, l(), e));
        } else {
            bzozVar.a(10, null);
        }
    }
}
