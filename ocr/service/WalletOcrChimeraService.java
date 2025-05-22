package com.google.android.gms.ocr.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cusz;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.ftjr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class WalletOcrChimeraService extends bzot {
    public WalletOcrChimeraService() {
        super(279, "com.google.android.gms.ocr.service.START", elpp.a, 0, 9, elhz.G(ftjr.a.lK().a().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new cusz(l(), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
    }
}
