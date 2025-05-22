package com.google.android.gms.ads.consent;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elqn;
import defpackage.uzg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ConsentChimeraService extends bzot {
    public ConsentChimeraService() {
        super(195, "com.google.android.gms.ads.service.CONSENT_LOOKUP", new elqn("android.permission.INTERNET"), 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.d(uzg.a(this).e(), null);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
    }
}
