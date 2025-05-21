package com.google.android.gms.ocr.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.csju;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fqpu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class WalletOcrChimeraService extends bxgd {
    public WalletOcrChimeraService() {
        super(279, "com.google.android.gms.ocr.service.START", ejck.a, 0, 9, eiuu.G(fqpu.a.a().a().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new csju(l(), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
    }
}
