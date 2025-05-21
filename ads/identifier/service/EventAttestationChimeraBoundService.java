package com.google.android.gms.ads.identifier.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EventAttestationChimeraBoundService extends bxgd {
    public EventAttestationChimeraBoundService() {
        super(216, "com.google.android.gms.ads.identifier.service.EVENT_ATTESTATION", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new com.google.android.gms.ads.eventattestation.internal.m(l()));
    }
}
