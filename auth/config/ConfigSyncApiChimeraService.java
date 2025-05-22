package com.google.android.gms.auth.config;

import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.acoa;
import defpackage.acoc;
import defpackage.acof;
import defpackage.aflt;
import defpackage.aszs;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.elpp;
import defpackage.elqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ConfigSyncApiChimeraService extends bzot {
    public ConfigSyncApiChimeraService() {
        super(221, "com.google.android.gms.auth.config.service.START", elpp.a, 0, 9, new elqn("com.google.android.setupwizard"));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzpe l = l();
        aszs aszsVar = cyjh.a;
        bzozVar.c(new acoa(l, new acof(new cyki(this), new aflt(), new acoc(ModuleManager.get(this))), getServiceRequest.f));
    }
}
