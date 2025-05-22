package com.google.android.gms.backup.base;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ajmp;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsRestoreChimeraService extends bzot {
    public GmsRestoreChimeraService() {
        super(201, "com.google.android.gms.backup.GMS_MODULE_RESTORE", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new ajmp(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
