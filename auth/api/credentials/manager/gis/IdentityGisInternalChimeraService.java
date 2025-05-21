package com.google.android.gms.auth.api.credentials.manager.gis;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arwm;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejck;
import defpackage.xul;
import defpackage.zcy;
import defpackage.zfs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class IdentityGisInternalChimeraService extends bxgd {
    public static final asot a = xul.a("IdentityGisInternalServiceImpl");

    public IdentityGisInternalChimeraService() {
        super(213, "com.google.android.gms.auth.api.identity.service.gis_internal.START", ejck.a, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        Bundle bundle = getServiceRequest.i;
        arwm.s(bundle);
        bxgjVar.c(new zfs(this, l, new zcy(bundle.getString("session_id")), getServiceRequest.f, getServiceRequest.p));
    }
}
