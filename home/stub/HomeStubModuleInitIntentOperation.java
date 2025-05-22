package com.google.android.gms.home.stub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.home.stub.HomeStubModuleInitIntentOperation;
import defpackage.apzs;
import defpackage.ausn;
import defpackage.auua;
import defpackage.bnhg;
import defpackage.bnhi;
import defpackage.bnhm;
import defpackage.bnhw;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.eluo;
import defpackage.frqx;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class HomeStubModuleInitIntentOperation extends apzs {
    private final fxqu a = new fxre(new fxwd() { // from class: bnhl
        @Override // defpackage.fxwd
        public final Object a() {
            bnhw bnhwVar = new bnhw(HomeStubModuleInitIntentOperation.this);
            bnhwVar.e();
            return bnhwVar;
        }
    });

    private final void e() {
        ((bnhw) this.a.a()).b();
        if (frqx.a.lK().f()) {
            ausn ausnVar = bnhi.a;
            Context baseContext = getBaseContext();
            fxxm.e(baseContext, "getBaseContext(...)");
            if (bnhg.a(baseContext)) {
                return;
            }
            ausn ausnVar2 = bnhm.a;
            ((eluo) ausnVar2.h()).x("Monitoring for device provisioning.");
            int i = HomeStubProvisionMonitorService.c;
            Context baseContext2 = getBaseContext();
            fxxm.e(baseContext2, "getBaseContext(...)");
            fxxm.f(baseContext2, "context");
            Intent intent = new Intent();
            intent.setClassName(baseContext2, "com.google.android.gms.home.stub.ProvisionMonitoringService");
            ((eluo) ausnVar2.h()).B("got serviceIntent: %s", intent.toString());
            getBaseContext().startService(intent);
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
        ((eluo) bnhm.a.h()).x("Updating Home module request state at home stub update");
        e();
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fxxm.f(intent, "intent");
        ((eluo) bnhm.a.h()).x("Updating Home module request state at home stub init");
        e();
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !auua.f("com.google.android.gms.home").equals(intent.getAction())) {
            super.onHandleIntent(intent);
        } else if ("com.google.android.gms.home".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ((eluo) bnhm.a.h()).x("HomeStub re-evaluating module downloads on phenotype flags update");
            dxwx.f(dxxi.a("com.google.android.gms.home"));
            e();
        }
    }
}
