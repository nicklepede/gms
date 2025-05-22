package com.google.android.gms.credential.manager.service.zeroparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.azdy;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PasswordCheckupApiChimeraService extends bzot {
    public PasswordCheckupApiChimeraService() {
        super(196, "com.google.android.gms.credential.manager.service.zeroparty.checkup.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new azdy(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
