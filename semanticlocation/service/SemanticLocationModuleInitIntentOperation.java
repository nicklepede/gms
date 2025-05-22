package com.google.android.gms.semanticlocation.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.semanticlocation.gmm.SemanticLocationAvailabilityBroadcastJob;
import com.google.android.gms.semanticlocation.mdd.MddDownloadScheduleService;
import defpackage.apzs;
import defpackage.ausn;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.dbsp;
import defpackage.dbsw;
import defpackage.ekvl;
import defpackage.fpuj;
import defpackage.fuqv;
import defpackage.fush;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        ausn ausnVar = dbsp.a;
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Intent startIntent = IntentOperation.getStartIntent(this, SemanticLocationIntentOperation.class, "com.google.android.gms.semanticlocation.ACTION_INIT_RUNTIME_STATE");
        ekvl.y(startIntent);
        startService(startIntent);
        int i2 = MddDownloadScheduleService.a;
        if (fush.P() && fuqv.c()) {
            if (fpuj.l()) {
                Context applicationContext = getApplicationContext();
                catg catgVar = new catg();
                catgVar.w(MddDownloadScheduleService.class.getName());
                catgVar.t("schedule_mdd_task");
                catgVar.a = catn.n;
                catgVar.v(2);
                catgVar.l(true);
                dbsw.c(applicationContext, catgVar.b());
            } else {
                Context applicationContext2 = getApplicationContext();
                cate cateVar = new cate();
                cateVar.w(MddDownloadScheduleService.class.getName());
                cateVar.t("schedule_mdd_task");
                cateVar.j(cata.EVERY_DAY);
                cateVar.p = true;
                cateVar.x(0, 1);
                cateVar.v(2);
                cateVar.y(0, 1);
                dbsw.b(applicationContext2, cateVar.b());
            }
        }
        String str = SemanticLocationCleanupJob.a;
        if (fush.P()) {
            if (fpuj.l()) {
                Context applicationContext3 = getApplicationContext();
                catg catgVar2 = new catg();
                catgVar2.w(SemanticLocationCleanupJob.a);
                catgVar2.t("SemanticLocationRemovedAccountsCleanup");
                catgVar2.a = catn.j;
                catgVar2.v(2);
                catgVar2.l(false);
                dbsw.c(applicationContext3, catgVar2.b());
            } else {
                Context applicationContext4 = getApplicationContext();
                cate cateVar2 = new cate();
                cateVar2.w(SemanticLocationCleanupJob.a);
                cateVar2.t("SemanticLocationRemovedAccountsCleanup");
                cateVar2.j(cata.EVERY_DAY);
                cateVar2.v(1);
                cateVar2.x(0, 1);
                dbsw.b(applicationContext4, cateVar2.b());
            }
        }
        if (SemanticLocationAvailabilityBroadcastJob.d()) {
            if (!fpuj.l()) {
                Context applicationContext5 = getApplicationContext();
                cate cateVar3 = new cate();
                cateVar3.w(SemanticLocationAvailabilityBroadcastJob.a);
                cateVar3.t("SemanticLocationAvailability");
                cateVar3.j(cata.EVERY_DAY);
                cateVar3.v(2);
                cateVar3.r(true);
                dbsw.b(applicationContext5, cateVar3.b());
                return;
            }
            Context applicationContext6 = getApplicationContext();
            catg catgVar3 = new catg();
            catgVar3.w(SemanticLocationAvailabilityBroadcastJob.a);
            catgVar3.t("SemanticLocationAvailability");
            catgVar3.a = catn.j;
            catgVar3.l(false);
            catgVar3.v(2);
            catgVar3.e();
            dbsw.c(applicationContext6, catgVar3.b());
        }
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        ausn ausnVar = dbsp.a;
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        ausn ausnVar = dbsp.a;
    }

    @Override // defpackage.apzs
    protected final void j(Intent intent) {
        ausn ausnVar = dbsp.a;
    }
}
