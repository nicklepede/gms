package com.google.android.gms.ads.identifier.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class EventAttestationChimeraBoundService extends bzot {
    public EventAttestationChimeraBoundService() {
        super(216, "com.google.android.gms.ads.identifier.service.EVENT_ATTESTATION", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new com.google.android.gms.ads.eventattestation.internal.m(l()));
    }
}
