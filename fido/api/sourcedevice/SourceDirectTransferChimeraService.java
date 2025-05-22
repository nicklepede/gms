package com.google.android.gms.fido.api.sourcedevice;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.beqa;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SourceDirectTransferChimeraService extends bzot {
    public SourceDirectTransferChimeraService() {
        super(262, "com.google.android.gms.fido.sourcedevice.service.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new beqa(l(), getServiceRequest.f));
    }
}
