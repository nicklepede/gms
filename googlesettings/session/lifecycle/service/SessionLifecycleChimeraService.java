package com.google.android.gms.googlesettings.session.lifecycle.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleChimeraService;
import defpackage.bmcc;
import defpackage.bmcg;
import defpackage.bmcu;
import defpackage.bzoz;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxsw;
import defpackage.fxwd;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SessionLifecycleChimeraService extends bmcc {
    public final fxqu a;
    public bmcu b;

    public SessionLifecycleChimeraService() {
        super(349, "com.google.android.gms.googlesettings.session.lifecycle.service.START", fxsw.a, 0, 9);
        this.a = new fxre(new fxwd() { // from class: bmcd
            @Override // defpackage.fxwd
            public final Object a() {
                SessionLifecycleChimeraService sessionLifecycleChimeraService = SessionLifecycleChimeraService.this;
                if (sessionLifecycleChimeraService.b == null) {
                    fxxm.j("coroutineDispatcherProvider");
                }
                return new bmct(sessionLifecycleChimeraService);
            }
        });
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        bzozVar.c(new bmcg(this));
    }
}
