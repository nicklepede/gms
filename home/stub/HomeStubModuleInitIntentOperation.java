package com.google.android.gms.home.stub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.home.stub.HomeStubModuleInitIntentOperation;
import defpackage.anya;
import defpackage.asot;
import defpackage.asqg;
import defpackage.blap;
import defpackage.blar;
import defpackage.blav;
import defpackage.blbe;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.ejhf;
import defpackage.foxt;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class HomeStubModuleInitIntentOperation extends anya {
    private final fuuw a = new fuvg(new fvaf() { // from class: blau
        @Override // defpackage.fvaf
        public final Object a() {
            blbe blbeVar = new blbe(HomeStubModuleInitIntentOperation.this);
            blbeVar.d();
            return blbeVar;
        }
    });

    private final void e() {
        ((blbe) this.a.a()).b();
        if (foxt.a.a().d()) {
            asot asotVar = blar.a;
            Context baseContext = getBaseContext();
            fvbo.e(baseContext, "getBaseContext(...)");
            if (blap.a(baseContext)) {
                return;
            }
            ((ejhf) blav.a.h()).x("Monitoring for device provisioning.");
            int i = HomeStubProvisionMonitorService.c;
            Context baseContext2 = getBaseContext();
            fvbo.e(baseContext2, "getBaseContext(...)");
            fvbo.f(baseContext2, "context");
            Intent intent = new Intent();
            intent.setClassName(baseContext2, "com.google.android.gms.home.stub.ProvisionMonitoringService");
            ((ejhf) blav.a.h()).B("got serviceIntent: %s", intent.toString());
            getBaseContext().startService(intent);
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        fvbo.f(intent, "intent");
        ((ejhf) blav.a.h()).x("Updating Home module request state at home stub update");
        e();
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        fvbo.f(intent, "intent");
        ((ejhf) blav.a.h()).x("Updating Home module request state at home stub init");
        e();
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !asqg.f("com.google.android.gms.home").equals(intent.getAction())) {
            super.onHandleIntent(intent);
        } else if ("com.google.android.gms.home".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ((ejhf) blav.a.h()).x("HomeStub re-evaluating module downloads on phenotype flags update");
            dvlw.f(dvmh.a("com.google.android.gms.home"));
            e();
        }
    }
}
