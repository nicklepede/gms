package com.google.android.gms.home.stub;

import android.content.Context;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bnhw;
import defpackage.bnhy;
import defpackage.bnic;
import defpackage.bnid;
import defpackage.bnie;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class HomeStubPowerMonitorService extends bnic {
    public static final /* synthetic */ int a = 0;
    private static final ausn d = ausn.b("HomeStubPowerMonitor", auid.HOME);
    private bnhy e;

    public HomeStubPowerMonitorService() {
    }

    @Override // defpackage.bnic
    public final void a(String str) {
        ausn ausnVar = d;
        ((eluo) ausnVar.h()).B("Energy mode changed to: %s", str);
        ausn ausnVar2 = bnie.a;
        Context baseContext = getBaseContext();
        fxxm.e(baseContext, "getBaseContext(...)");
        if (!bnid.c(baseContext)) {
            ((eluo) ausnVar.h()).x("System is not in high energy mode - monitoring will continue");
            return;
        }
        ((eluo) ausnVar.h()).x("Switched to high energy mode: requesting Home module");
        bnhy bnhyVar = this.e;
        if (bnhyVar == null) {
            fxxm.j("homeStubModuleLoader");
            bnhyVar = null;
        }
        bnhyVar.f(true);
        stopSelf();
    }

    @Override // defpackage.bnic, com.google.android.chimera.Service
    public final void onCreate() {
        ((eluo) bnic.b.h()).x("Power monitoring service created");
        this.c = new PowerMonitoringChimeraServiceBase$onCreate$1(this, getBaseContext());
        Context baseContext = getBaseContext();
        fxxm.e(baseContext, "getBaseContext(...)");
        bnhw bnhwVar = new bnhw(baseContext);
        bnhwVar.e();
        this.e = bnhwVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeStubPowerMonitorService(bnhy bnhyVar) {
        this();
        fxxm.f(bnhyVar, "homeStubModuleLoader");
        this.e = bnhyVar;
    }
}
