package com.google.android.gms.home.stub;

import android.content.Context;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bnhi;
import defpackage.bnhj;
import defpackage.bnhw;
import defpackage.bnhy;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class HomeStubProvisionMonitorService extends bnhj {
    public static final /* synthetic */ int c = 0;
    private static final ausn d = ausn.b("HomeStubProvisionMonitor", auid.HOME);
    private bnhy e;

    public HomeStubProvisionMonitorService() {
    }

    @Override // defpackage.bnhj
    public final void b() {
        ((eluo) d.h()).x("Device is provisioned");
        bnhy bnhyVar = this.e;
        if (bnhyVar == null) {
            fxxm.j("homeStubModuleLoader");
            bnhyVar = null;
        }
        bnhyVar.b();
    }

    @Override // defpackage.bnhj, com.google.android.chimera.Service
    public final void onCreate() {
        ((eluo) bnhj.a.h()).x("Device provision monitoring service created");
        Context baseContext = getBaseContext();
        fxxm.e(baseContext, "getBaseContext(...)");
        fxxm.f(baseContext, "context");
        this.b = new bnhi(baseContext);
        Context baseContext2 = getBaseContext();
        fxxm.e(baseContext2, "getBaseContext(...)");
        bnhw bnhwVar = new bnhw(baseContext2);
        bnhwVar.e();
        this.e = bnhwVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeStubProvisionMonitorService(bnhy bnhyVar) {
        this();
        fxxm.f(bnhyVar, "homeStubModuleLoader");
        this.e = bnhyVar;
    }
}
