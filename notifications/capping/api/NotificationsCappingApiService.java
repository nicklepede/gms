package com.google.android.gms.notifications.capping.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzoz;
import defpackage.bzpa;
import defpackage.bzpx;
import defpackage.cujf;
import defpackage.cujj;
import defpackage.cuju;
import defpackage.elpp;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NotificationsCappingApiService extends cujf {
    public cujj a;

    public NotificationsCappingApiService() {
        super(387, "com.google.android.gms.notifications.capping.api.NotificationsCappingApiService.START", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        bzpa a = bzpx.a(this);
        String str = getServiceRequest.f;
        fxxm.e(str, "getCallingPackage(...)");
        String str2 = getServiceRequest.p;
        cujj cujjVar = this.a;
        if (cujjVar == null) {
            fxxm.j("notificationImpressionStorage");
            cujjVar = null;
        }
        bzozVar.c(new cuju(a, str, str2, cujjVar));
    }
}
