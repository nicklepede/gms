package com.google.android.gms.notifications.capping.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgj;
import defpackage.bxgk;
import defpackage.bxhh;
import defpackage.csaa;
import defpackage.csae;
import defpackage.csap;
import defpackage.ejck;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NotificationsCappingApiService extends csaa {
    public csae a;

    public NotificationsCappingApiService() {
        super(387, "com.google.android.gms.notifications.capping.api.NotificationsCappingApiService.START", ejck.a, 1, 10);
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        bxgk a = bxhh.a(this);
        String str = getServiceRequest.f;
        fvbo.e(str, "getCallingPackage(...)");
        String str2 = getServiceRequest.p;
        csae csaeVar = this.a;
        if (csaeVar == null) {
            fvbo.j("notificationImpressionStorage");
            csaeVar = null;
        }
        bxgjVar.c(new csap(a, str, str2, csaeVar));
    }
}
