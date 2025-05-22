package com.google.android.gms.auth.api.phone.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abmj;
import defpackage.auad;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;
import defpackage.elqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SmsRetrieverApiChimeraService extends bzot {
    private static final auad a = new auad("SmsRetrieverApiChimeraService");
    private static final elhz b = new elqn("android.permission-group.SMS");

    public SmsRetrieverApiChimeraService() {
        super(126, "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START", b, 3, 10);
        a.d("constructor", new Object[0]);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        a.d("onGetService", new Object[0]);
        bzozVar.c(new abmj(this, getServiceRequest.f));
    }
}
