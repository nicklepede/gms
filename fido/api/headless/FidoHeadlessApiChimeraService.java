package com.google.android.gms.fido.api.headless;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.becz;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoHeadlessApiChimeraService extends bzot {
    private static final elhz a = elhz.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");

    public FidoHeadlessApiChimeraService() {
        super(180, "com.google.android.gms.fido.fido2.zeroparty.START", a, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new becz(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
