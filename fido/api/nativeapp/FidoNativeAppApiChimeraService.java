package com.google.android.gms.fido.api.nativeapp;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bbyz;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoNativeAppApiChimeraService extends bxgd {
    private static final eiuu a = eiuu.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");

    public FidoNativeAppApiChimeraService() {
        super(148, "com.google.android.gms.fido.fido2.regular.START", a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bbyz(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
