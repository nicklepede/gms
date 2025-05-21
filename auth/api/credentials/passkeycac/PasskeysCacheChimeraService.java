package com.google.android.gms.auth.api.credentials.passkeycac;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.xde;
import defpackage.xul;
import defpackage.zaj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PasskeysCacheChimeraService extends bxgd {
    public static final asot a = xul.a("PasskeysCacheChimeraService");

    public PasskeysCacheChimeraService() {
        super(404, "com.google.android.gms.auth.api.passkeys_cache.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (asqh.e() && xde.f()) {
            bxgjVar.c(new zaj(getApplicationContext(), getServiceRequest.f));
        } else {
            bxgjVar.a(503, null);
        }
    }
}
