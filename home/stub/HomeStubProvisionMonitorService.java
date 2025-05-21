package com.google.android.gms.home.stub;

import android.content.Context;
import defpackage.asej;
import defpackage.asot;
import defpackage.blar;
import defpackage.blas;
import defpackage.blbe;
import defpackage.blbg;
import defpackage.ejhf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class HomeStubProvisionMonitorService extends blas {
    public static final /* synthetic */ int c = 0;
    private static final asot d = asot.b("HomeStubProvisionMonitor", asej.HOME);
    private blbg e;

    public HomeStubProvisionMonitorService() {
    }

    @Override // defpackage.blas
    public final void b() {
        ((ejhf) d.h()).x("Device is provisioned");
        blbg blbgVar = this.e;
        if (blbgVar == null) {
            fvbo.j("homeStubModuleLoader");
            blbgVar = null;
        }
        blbgVar.b();
    }

    @Override // defpackage.blas, com.google.android.chimera.Service
    public final void onCreate() {
        ((ejhf) blas.a.h()).x("Device provision monitoring service created");
        Context baseContext = getBaseContext();
        fvbo.e(baseContext, "getBaseContext(...)");
        fvbo.f(baseContext, "context");
        this.b = new blar(baseContext);
        Context baseContext2 = getBaseContext();
        fvbo.e(baseContext2, "getBaseContext(...)");
        blbe blbeVar = new blbe(baseContext2);
        blbeVar.d();
        this.e = blbeVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeStubProvisionMonitorService(blbg blbgVar) {
        this();
        fvbo.f(blbgVar, "homeStubModuleLoader");
        this.e = blbgVar;
    }
}
