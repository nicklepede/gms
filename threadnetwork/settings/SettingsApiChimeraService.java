package com.google.android.gms.threadnetwork.settings;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.diev;
import defpackage.elpp;
import defpackage.fvhs;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SettingsApiChimeraService extends bzot {
    public SettingsApiChimeraService() {
        super(431, "com.google.android.gms.threadnetwork.settings.service.START", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        if (!fvhs.a.lK().e()) {
            bzozVar.a(16, null);
            return;
        }
        bzpe l = l();
        String str = getServiceRequest.f;
        fxxm.e(str, "getCallingPackage(...)");
        bzozVar.c(new diev(l, str, getServiceRequest.p));
    }
}
