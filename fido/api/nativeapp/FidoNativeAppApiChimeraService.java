package com.google.android.gms.fido.api.nativeapp;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.becr;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoNativeAppApiChimeraService extends bzot {
    private static final elhz a = elhz.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");

    public FidoNativeAppApiChimeraService() {
        super(148, "com.google.android.gms.fido.fido2.regular.START", a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new becr(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
