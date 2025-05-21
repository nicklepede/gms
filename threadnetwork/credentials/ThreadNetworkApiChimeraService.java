package com.google.android.gms.threadnetwork.credentials;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dfhb;
import defpackage.dfhw;
import defpackage.dfka;
import defpackage.dfle;
import defpackage.dfou;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ThreadNetworkApiChimeraService extends bxgd {
    public ThreadNetworkApiChimeraService() {
        super(305, "com.google.android.gms.threadnetwork.service.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dfou(this, l(), new dfka(this, getServiceRequest.f, dfhw.c(), BorderAgentRoomDatabase.w(this), dfle.b(this), dfhb.a()), getServiceRequest.f, getServiceRequest.p));
    }
}
