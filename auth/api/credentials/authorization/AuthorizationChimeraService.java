package com.google.android.gms.auth.api.credentials.authorization;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abdq;
import defpackage.atzb;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthorizationChimeraService extends bzot {
    public AuthorizationChimeraService() {
        super(219, "com.google.android.gms.auth.api.identity.service.authorization.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzpe l = l();
        boni a = bonh.a(this, null);
        String str = getServiceRequest.f;
        String string = getServiceRequest.i.getString("session_id");
        if (string != null) {
            atzb.q(string);
        }
        bzozVar.c(new abdq(l, a, str, getServiceRequest.p));
    }
}
