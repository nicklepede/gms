package com.google.android.gms.core.settings;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.avxc;
import defpackage.avxe;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SettingsChimeraService extends bzot {
    public SettingsChimeraService() {
        super(329, "com.google.android.gms.core.settings.service.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new avxe(l(), new avxc(this), getServiceRequest.f, getServiceRequest.p));
    }
}
