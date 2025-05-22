package com.google.android.gms.chimera.container.moduleinstall;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aqgk;
import defpackage.aubw;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elgx;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ModuleInstallService extends bzot {
    public ModuleInstallService() {
        super(new int[]{308}, new String[]{"com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START"}, elpp.a, 3, 9, 10, (elgx) null);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new aubw(l(), new aqgk(this), getServiceRequest.f));
    }
}
