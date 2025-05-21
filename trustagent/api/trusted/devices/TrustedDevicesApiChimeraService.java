package com.google.android.gms.trustagent.api.trusted.devices;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dgod;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustedDevicesApiChimeraService extends bxgd {
    static {
        asot.b("TrustAgent", asej.TRUSTAGENT_TRUSTED_DEVICES);
    }

    public TrustedDevicesApiChimeraService() {
        super(72, "com.google.android.gms.trustagent.TrustedDevicesService.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dgod(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
