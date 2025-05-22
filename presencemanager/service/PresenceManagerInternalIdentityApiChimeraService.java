package com.google.android.gms.presencemanager.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.czcw;
import defpackage.czcy;
import defpackage.czdx;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceManagerInternalIdentityApiChimeraService extends bzot {
    public PresenceManagerInternalIdentityApiChimeraService() {
        super(293, "com.google.android.gms.presencemanager.service.INTERNAL_IDENTITY", Collections.EMPTY_SET, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        czcw b = czcy.a().b();
        b.b(getServiceRequest.f);
        bzozVar.c(new czdx(this, l(), b.a().a(), getServiceRequest.f, getServiceRequest.p));
    }
}
