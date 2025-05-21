package com.google.android.gms.semanticlocation.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.semanticlocation.gmm.SemanticLocationAvailabilityBroadcastJob;
import com.google.android.gms.semanticlocation.mdd.MddDownloadScheduleService;
import defpackage.anya;
import defpackage.asot;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.czir;
import defpackage.cziy;
import defpackage.eiig;
import defpackage.fnck;
import defpackage.frwb;
import defpackage.frxn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        asot asotVar = czir.a;
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Intent startIntent = IntentOperation.getStartIntent(this, SemanticLocationIntentOperation.class, "com.google.android.gms.semanticlocation.ACTION_INIT_RUNTIME_STATE");
        eiig.x(startIntent);
        startService(startIntent);
        int i2 = MddDownloadScheduleService.a;
        if (frxn.P() && frwb.c()) {
            if (fnck.l()) {
                Context applicationContext = getApplicationContext();
                byko bykoVar = new byko();
                bykoVar.w(MddDownloadScheduleService.class.getName());
                bykoVar.t("schedule_mdd_task");
                bykoVar.a = bykv.n;
                bykoVar.v(2);
                bykoVar.l(true);
                cziy.c(applicationContext, bykoVar.b());
            } else {
                Context applicationContext2 = getApplicationContext();
                bykm bykmVar = new bykm();
                bykmVar.w(MddDownloadScheduleService.class.getName());
                bykmVar.t("schedule_mdd_task");
                bykmVar.j(byki.EVERY_DAY);
                bykmVar.p = true;
                bykmVar.x(0, 1);
                bykmVar.v(2);
                bykmVar.y(0, 1);
                cziy.b(applicationContext2, bykmVar.b());
            }
        }
        String str = SemanticLocationCleanupJob.a;
        if (frxn.P()) {
            if (fnck.l()) {
                Context applicationContext3 = getApplicationContext();
                byko bykoVar2 = new byko();
                bykoVar2.w(SemanticLocationCleanupJob.a);
                bykoVar2.t("SemanticLocationRemovedAccountsCleanup");
                bykoVar2.a = bykv.j;
                bykoVar2.v(2);
                bykoVar2.l(false);
                cziy.c(applicationContext3, bykoVar2.b());
            } else {
                Context applicationContext4 = getApplicationContext();
                bykm bykmVar2 = new bykm();
                bykmVar2.w(SemanticLocationCleanupJob.a);
                bykmVar2.t("SemanticLocationRemovedAccountsCleanup");
                bykmVar2.j(byki.EVERY_DAY);
                bykmVar2.v(1);
                bykmVar2.x(0, 1);
                cziy.b(applicationContext4, bykmVar2.b());
            }
        }
        if (SemanticLocationAvailabilityBroadcastJob.d()) {
            if (!fnck.l()) {
                Context applicationContext5 = getApplicationContext();
                bykm bykmVar3 = new bykm();
                bykmVar3.w(SemanticLocationAvailabilityBroadcastJob.a);
                bykmVar3.t("SemanticLocationAvailability");
                bykmVar3.j(byki.EVERY_DAY);
                bykmVar3.v(2);
                bykmVar3.r(true);
                cziy.b(applicationContext5, bykmVar3.b());
                return;
            }
            Context applicationContext6 = getApplicationContext();
            byko bykoVar3 = new byko();
            bykoVar3.w(SemanticLocationAvailabilityBroadcastJob.a);
            bykoVar3.t("SemanticLocationAvailability");
            bykoVar3.a = bykv.j;
            bykoVar3.l(false);
            bykoVar3.v(2);
            bykoVar3.e();
            cziy.c(applicationContext6, bykoVar3.b());
        }
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        asot asotVar = czir.a;
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        asot asotVar = czir.a;
    }

    @Override // defpackage.anya
    protected final void j(Intent intent) {
        asot asotVar = czir.a;
    }
}
