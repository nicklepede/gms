package com.google.android.gms.auth.api.credentials.manager.gis;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abct;
import defpackage.abfp;
import defpackage.atzb;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elpp;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class IdentityGisInternalChimeraService extends bzot {
    public static final ausn a = zsi.a("IdentityGisInternalServiceImpl");

    public IdentityGisInternalChimeraService() {
        super(213, "com.google.android.gms.auth.api.identity.service.gis_internal.START", elpp.a, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzpe l = l();
        Bundle bundle = getServiceRequest.i;
        atzb.s(bundle);
        bzozVar.c(new abfp(this, l, new abct(bundle.getString("session_id")), getServiceRequest.f, getServiceRequest.p));
    }
}
