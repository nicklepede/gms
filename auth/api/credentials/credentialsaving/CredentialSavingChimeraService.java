package com.google.android.gms.auth.api.credentials.credentialsaving;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abee;
import defpackage.arcm;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.ekvi;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CredentialSavingChimeraService extends bzot {
    public CredentialSavingChimeraService() {
        super(223, "com.google.android.gms.auth.api.identity.service.credentialsaving.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        ekvi a = arcm.a(this, getServiceRequest.f);
        if (!a.h()) {
            bzozVar.a(10, null);
            return;
        }
        bzpe l = l();
        boni a2 = bonh.a(this, null);
        Object c = a.c();
        String str = getServiceRequest.f;
        Bundle bundle = getServiceRequest.i;
        bzozVar.c(new abee(l, a2, (String) c, str, getServiceRequest.p));
    }
}
