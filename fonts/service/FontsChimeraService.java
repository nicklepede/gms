package com.google.android.gms.fonts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bhcj;
import defpackage.bhcm;
import defpackage.bhdp;
import defpackage.bxgd;
import defpackage.bxgj;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FontsChimeraService extends bxgd {
    public FontsChimeraService() {
        super(132, "com.google.android.gms.fonts.service.START", Collections.EMPTY_SET, 3, 10);
        bhcm.c("FontsChimeraService", "ctor", new Object[0]);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        bhcm.c("FontsChimeraService", "onGetService (from %s)", str);
        bxgjVar.c(new bhcj(l(), str));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        bhcm.c("FontsChimeraService", "onCreate::begin", new Object[0]);
        bhdp.a.g(getApplicationContext());
        bhcm.e("FontsChimeraService", "onCreate::success", new Object[0]);
    }
}
