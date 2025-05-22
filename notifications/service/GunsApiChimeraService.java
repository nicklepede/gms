package com.google.android.gms.notifications.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cukn;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GunsApiChimeraService extends bzot {
    public GunsApiChimeraService() {
        super(110, "com.google.android.gms.notifications.service.START", Collections.EMPTY_SET, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new cukn(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
