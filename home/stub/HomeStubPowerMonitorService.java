package com.google.android.gms.home.stub;

import android.content.Context;
import defpackage.asej;
import defpackage.asot;
import defpackage.blbe;
import defpackage.blbg;
import defpackage.blbk;
import defpackage.blbl;
import defpackage.blbm;
import defpackage.ejhf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class HomeStubPowerMonitorService extends blbk {
    public static final /* synthetic */ int a = 0;
    private static final asot d = asot.b("HomeStubPowerMonitor", asej.HOME);
    private blbg e;

    public HomeStubPowerMonitorService() {
    }

    @Override // defpackage.blbk
    public final void a(String str) {
        asot asotVar = d;
        ((ejhf) asotVar.h()).B("Energy mode changed to: %s", str);
        asot asotVar2 = blbm.a;
        Context baseContext = getBaseContext();
        fvbo.e(baseContext, "getBaseContext(...)");
        if (!blbl.c(baseContext)) {
            ((ejhf) asotVar.h()).x("System is not in high energy mode - monitoring will continue");
            return;
        }
        ((ejhf) asotVar.h()).x("Switched to high energy mode: requesting Home module");
        blbg blbgVar = this.e;
        if (blbgVar == null) {
            fvbo.j("homeStubModuleLoader");
            blbgVar = null;
        }
        blbgVar.e(true);
        stopSelf();
    }

    @Override // defpackage.blbk, com.google.android.chimera.Service
    public final void onCreate() {
        ((ejhf) blbk.b.h()).x("Power monitoring service created");
        this.c = new PowerMonitoringChimeraServiceBase$onCreate$1(this, getBaseContext());
        Context baseContext = getBaseContext();
        fvbo.e(baseContext, "getBaseContext(...)");
        blbe blbeVar = new blbe(baseContext);
        blbeVar.d();
        this.e = blbeVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeStubPowerMonitorService(blbg blbgVar) {
        this();
        fvbo.f(blbgVar, "homeStubModuleLoader");
        this.e = blbgVar;
    }
}
