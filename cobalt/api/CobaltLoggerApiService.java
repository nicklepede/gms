package com.google.android.gms.cobalt.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asqc;
import defpackage.asqd;
import defpackage.asqf;
import defpackage.asrz;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CobaltLoggerApiService extends asqf {
    public static final ausn a = ausn.b("CobaltLoggerImpl", auid.COBALT);
    public asqd b;

    public CobaltLoggerApiService() {
        super(364, "com.google.android.gms.cobalt.api.CobaltLoggerApiService.START", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        asqc asqcVar = this.b.a;
        bzozVar.c(new asrz((bzpe) asqcVar.a.a(), asqcVar.b, getServiceRequest.f));
    }
}
