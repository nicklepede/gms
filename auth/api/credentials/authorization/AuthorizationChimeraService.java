package com.google.android.gms.auth.api.credentials.authorization;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arwm;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejck;
import defpackage.zdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthorizationChimeraService extends bxgd {
    public AuthorizationChimeraService() {
        super(219, "com.google.android.gms.auth.api.identity.service.authorization.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        bmgq a = bmgp.a(this, null);
        String str = getServiceRequest.f;
        String string = getServiceRequest.i.getString("session_id");
        if (string != null) {
            arwm.q(string);
        }
        bxgjVar.c(new zdv(l, a, str, getServiceRequest.p));
    }
}
