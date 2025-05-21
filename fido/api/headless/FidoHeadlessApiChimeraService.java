package com.google.android.gms.fido.api.headless;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bbzh;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoHeadlessApiChimeraService extends bxgd {
    private static final eiuu a = eiuu.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");

    public FidoHeadlessApiChimeraService() {
        super(180, "com.google.android.gms.fido.fido2.zeroparty.START", a, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bbzh(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
