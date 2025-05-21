package com.google.android.gms.ads.consent;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejdg;
import defpackage.tdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ConsentChimeraService extends bxgd {
    public ConsentChimeraService() {
        super(195, "com.google.android.gms.ads.service.CONSENT_LOOKUP", new ejdg("android.permission.INTERNET"), 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.d(tdg.a(this).e(), null);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
    }
}
