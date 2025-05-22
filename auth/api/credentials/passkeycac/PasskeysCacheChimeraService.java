package com.google.android.gms.auth.api.credentials.passkeycac;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abaa;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.yzy;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PasskeysCacheChimeraService extends bzot {
    public static final ausn a = zsi.a("PasskeysCacheChimeraService");

    public PasskeysCacheChimeraService() {
        super(404, "com.google.android.gms.auth.api.passkeys_cache.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (auub.e() && yzy.f()) {
            bzozVar.c(new abaa(getApplicationContext(), getServiceRequest.f));
        } else {
            bzozVar.a(503, null);
        }
    }
}
