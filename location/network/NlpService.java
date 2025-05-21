package com.google.android.gms.location.network;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.aseu;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bzzs;
import defpackage.eijr;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NlpService extends bxgd {
    public NlpService() {
        super(385, "com.google.android.gms.location.network.service.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.LOCATION_NLP_SERVICE_API);
        ClientIdentity e = ClientIdentity.e(bxgjVar.b, getServiceRequest, Binder.getCallingUid(), Binder.getCallingPid());
        if (bxgjVar.g()) {
            bxgjVar.c(new bzzs(this, l(), e));
        } else {
            bxgjVar.a(10, null);
        }
    }
}
