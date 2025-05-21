package com.google.android.gms.googlesettings.session.lifecycle.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleChimeraService;
import defpackage.bjvm;
import defpackage.bjvq;
import defpackage.bjwe;
import defpackage.bxgj;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fuwy;
import defpackage.fvaf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SessionLifecycleChimeraService extends bjvm {
    public final fuuw a;
    public bjwe b;

    public SessionLifecycleChimeraService() {
        super(349, "com.google.android.gms.googlesettings.session.lifecycle.service.START", fuwy.a, 0, 9);
        this.a = new fuvg(new fvaf() { // from class: bjvn
            @Override // defpackage.fvaf
            public final Object a() {
                SessionLifecycleChimeraService sessionLifecycleChimeraService = SessionLifecycleChimeraService.this;
                if (sessionLifecycleChimeraService.b == null) {
                    fvbo.j("coroutineDispatcherProvider");
                }
                return new bjwd(sessionLifecycleChimeraService);
            }
        });
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        bxgjVar.c(new bjvq(this));
    }
}
