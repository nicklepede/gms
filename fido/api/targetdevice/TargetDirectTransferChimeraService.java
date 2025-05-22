package com.google.android.gms.fido.api.targetdevice;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.beqo;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class TargetDirectTransferChimeraService extends bzot {
    public TargetDirectTransferChimeraService() {
        super(269, "com.google.android.gms.fido.targetdevice.internal_service.START", elpp.a, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new beqo(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
