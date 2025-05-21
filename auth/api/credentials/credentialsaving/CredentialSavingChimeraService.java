package com.google.android.gms.auth.api.credentials.credentialsaving;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aozv;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.eiid;
import defpackage.ejck;
import defpackage.zej;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CredentialSavingChimeraService extends bxgd {
    public CredentialSavingChimeraService() {
        super(223, "com.google.android.gms.auth.api.identity.service.credentialsaving.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        eiid a = aozv.a(this, getServiceRequest.f);
        if (!a.h()) {
            bxgjVar.a(10, null);
            return;
        }
        bxgo l = l();
        bmgq a2 = bmgp.a(this, null);
        Object c = a.c();
        String str = getServiceRequest.f;
        Bundle bundle = getServiceRequest.i;
        bxgjVar.c(new zej(l, a2, (String) c, str, getServiceRequest.p));
    }
}
