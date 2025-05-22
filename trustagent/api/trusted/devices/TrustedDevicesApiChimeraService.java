package com.google.android.gms.trustagent.api.trusted.devices;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dizi;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustedDevicesApiChimeraService extends bzot {
    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT_TRUSTED_DEVICES);
    }

    public TrustedDevicesApiChimeraService() {
        super(72, "com.google.android.gms.trustagent.TrustedDevicesService.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dizi(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
