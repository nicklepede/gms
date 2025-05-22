package com.google.android.gms.threadnetwork.credentials;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dhsj;
import defpackage.dhte;
import defpackage.dhvi;
import defpackage.dhwj;
import defpackage.dhzz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ThreadNetworkApiChimeraService extends bzot {
    public ThreadNetworkApiChimeraService() {
        super(305, "com.google.android.gms.threadnetwork.service.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dhzz(this, l(), new dhvi(this, getServiceRequest.f, dhte.c(), BorderAgentRoomDatabase.w(this), dhwj.a(this), dhsj.a()), getServiceRequest.f, getServiceRequest.p));
    }
}
