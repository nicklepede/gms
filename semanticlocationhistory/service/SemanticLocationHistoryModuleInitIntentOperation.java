package com.google.android.gms.semanticlocationhistory.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.semanticlocationhistory.db.OdlhDatabaseCleanupJob;
import com.google.android.gms.semanticlocationhistory.db.OdlhPppCleanupJob;
import com.google.android.gms.semanticlocationhistory.db.OdlhRemovedAccountsCleanupJob;
import com.google.android.gms.semanticlocationhistory.db.OdlhUserEditSyncJob;
import com.google.android.gms.semanticlocationhistory.edit.EditMergeJob;
import com.google.android.gms.semanticlocationhistory.geller.GellerCleanupService;
import com.google.android.gms.semanticlocationhistory.monitoring.MonitoringService;
import com.google.android.gms.semanticlocationhistory.reinference.ReinferenceService;
import com.google.android.gms.semanticlocationhistory.settings.LocationHistoryActiveProcessingService;
import com.google.android.gms.semanticlocationhistory.settings.OdlhTombstonesCleanupJob;
import com.google.android.gms.semanticlocationhistory.settings.SettingsSyncOneOffService;
import com.google.android.gms.semanticlocationhistory.settings.SettingsSyncService;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bzbx;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.catp;
import defpackage.dbsw;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.dcry;
import defpackage.ddpf;
import defpackage.ddph;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fpuj;
import defpackage.furq;
import defpackage.fusd;
import defpackage.fush;
import defpackage.fusk;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryModuleInitIntentOperation extends apzs {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "ModuleInit");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Account a2;
        if (!fush.Q()) {
            ((eluo) ((eluo) b.h()).ai((char) 10621)).x("Flag disabled. Module will not be initialized.");
            return;
        }
        Context applicationContext = getApplicationContext();
        if (fush.Q() && (a2 = dbvl.a(applicationContext, new dbvg(new dbtc()))) != null) {
            String str = a2.name;
            eqgc.t(new dcry().f(str), new ddpf(applicationContext, str), eqex.a);
        }
        String str2 = GellerCleanupService.a;
        if (fpuj.f()) {
            catg catgVar = new catg();
            catgVar.w(GellerCleanupService.a);
            catgVar.t("GellerCleanup");
            catgVar.a = catn.j;
            catgVar.l(false);
            catgVar.v(2);
            catgVar.e();
            catgVar.j();
            dbsw.c(applicationContext, catgVar.b());
        } else {
            cate cateVar = new cate();
            cateVar.w(GellerCleanupService.a);
            cateVar.t("GellerCleanup");
            cateVar.j(cata.EVERY_DAY);
            cateVar.v(0);
            cateVar.r(true);
            cateVar.g(2);
            cateVar.f(1, 1);
            dbsw.b(applicationContext, cateVar.b());
        }
        if (LocationHistoryActiveProcessingService.d()) {
            if (fpuj.f()) {
                catg catgVar2 = new catg();
                catgVar2.w(LocationHistoryActiveProcessingService.a);
                catgVar2.t("LocationHistoryActiveProcessing");
                catgVar2.a = catn.j;
                catgVar2.l(true);
                catgVar2.v(2);
                dbsw.c(applicationContext, catgVar2.b());
            } else {
                cate cateVar2 = new cate();
                cateVar2.w(LocationHistoryActiveProcessingService.a);
                cateVar2.t("LocationHistoryActiveProcessing");
                cateVar2.j(cata.EVERY_DAY);
                cateVar2.v(2);
                cateVar2.y(0, 1);
                cateVar2.x(0, 1);
                cateVar2.f(0, 1);
                fusk fuskVar = fusk.a;
                cateVar2.t = catp.a(0, (int) fuskVar.lK().e(), (int) fuskVar.lK().f());
                dbsw.b(applicationContext, cateVar2.b());
            }
        }
        if (fpuj.f()) {
            ausn ausnVar = SettingsSyncService.a;
            catg catgVar3 = new catg();
            catgVar3.w(SettingsSyncService.b);
            catgVar3.t("OdlhSettingsSyncTask");
            catgVar3.m((int) fusk.a.lK().i());
            catgVar3.l(true);
            catgVar3.v(2);
            dbsw.c(applicationContext, catgVar3.b());
        } else {
            ausn ausnVar2 = SettingsSyncService.a;
            cate cateVar3 = new cate();
            cateVar3.w(SettingsSyncService.b);
            cateVar3.t("OdlhSettingsSyncTask");
            fusk fuskVar2 = fusk.a;
            cateVar3.j(cata.a(fuskVar2.lK().k() * 3600));
            cateVar3.v(true != fusk.n() ? 1 : 2);
            cateVar3.y(0, 1);
            cateVar3.x(0, 1);
            cateVar3.f(0, 1);
            cateVar3.t = catp.a(0, (int) fuskVar2.lK().o(), (int) fuskVar2.lK().p());
            dbsw.b(applicationContext, cateVar3.b());
        }
        if (fpuj.f()) {
            ausn ausnVar3 = OdlhTombstonesCleanupJob.a;
            catg catgVar4 = new catg();
            catgVar4.w(OdlhTombstonesCleanupJob.b);
            catgVar4.t("OdlhTombstonesCleanupJob");
            catgVar4.a = catn.j;
            catgVar4.l(false);
            catgVar4.v(2);
            dbsw.c(applicationContext, catgVar4.b());
        } else {
            ausn ausnVar4 = OdlhTombstonesCleanupJob.a;
            cate cateVar4 = new cate();
            cateVar4.w(OdlhTombstonesCleanupJob.b);
            cateVar4.t("OdlhTombstonesCleanupJob");
            cateVar4.j(cata.EVERY_DAY);
            cateVar4.v(true != fush.Y() ? 1 : 2);
            cateVar4.y(0, 1);
            cateVar4.x(0, 1);
            cateVar4.f(0, 1);
            dbsw.b(applicationContext, cateVar4.b());
        }
        if (fpuj.f()) {
            ausn ausnVar5 = OdlhDatabaseCleanupJob.a;
            catg catgVar5 = new catg();
            catgVar5.w(OdlhDatabaseCleanupJob.b);
            catgVar5.t("OdlhDatabaseCleanup");
            catgVar5.a = catn.j;
            catgVar5.l(false);
            catgVar5.v(2);
            dbsw.c(applicationContext, catgVar5.b());
        } else {
            ausn ausnVar6 = OdlhDatabaseCleanupJob.a;
            cate cateVar5 = new cate();
            cateVar5.w(OdlhDatabaseCleanupJob.b);
            cateVar5.t("OdlhDatabaseCleanup");
            cateVar5.j(cata.EVERY_DAY);
            cateVar5.v(true != fush.Y() ? 1 : 2);
            cateVar5.x(0, 1);
            dbsw.b(applicationContext, cateVar5.b());
        }
        String str3 = EditMergeJob.a;
        if (fpuj.f()) {
            catg catgVar6 = new catg();
            catgVar6.w(EditMergeJob.a);
            catgVar6.t("EditMergeJob");
            catgVar6.a = catn.j;
            catgVar6.l(false);
            catgVar6.v(2);
            dbsw.c(applicationContext, catgVar6.b());
        } else {
            cate cateVar6 = new cate();
            cateVar6.w(EditMergeJob.a);
            cateVar6.t("EditMergeJob");
            cateVar6.j(cata.EVERY_DAY);
            cateVar6.v(true != fush.Y() ? 1 : 2);
            cateVar6.g(2);
            cateVar6.f(0, 1);
            dbsw.b(applicationContext, cateVar6.b());
        }
        ausn ausnVar7 = OdlhRemovedAccountsCleanupJob.a;
        if (fush.M()) {
            cate cateVar7 = new cate();
            cateVar7.w(OdlhRemovedAccountsCleanupJob.b);
            cateVar7.t("OdlhRemovedAccountsCleanup");
            cateVar7.j(cata.EVERY_14_DAYS);
            cateVar7.v(true != fush.Y() ? 1 : 2);
            cateVar7.r(true);
            dbsw.b(applicationContext, cateVar7.b());
        }
        if (OdlhUserEditSyncJob.d()) {
            if (fpuj.f()) {
                catg catgVar7 = new catg();
                catgVar7.w(OdlhUserEditSyncJob.a);
                catgVar7.t("OdlhUserEditSync");
                catgVar7.a = catn.j;
                catgVar7.l(true);
                catgVar7.v(2);
                dbsw.c(applicationContext, catgVar7.b());
            } else {
                cate cateVar8 = new cate();
                cateVar8.w(OdlhUserEditSyncJob.a);
                cateVar8.t("OdlhUserEditSync");
                cateVar8.j(cata.EVERY_DAY);
                cateVar8.v(true != fush.Y() ? 1 : 2);
                cateVar8.x(0, 1);
                cateVar8.y(0, 1);
                dbsw.b(applicationContext, cateVar8.b());
            }
        }
        String str4 = MonitoringService.a;
        if (fpuj.f()) {
            catg catgVar8 = new catg();
            catgVar8.t("MonitoringService");
            catgVar8.w(MonitoringService.a);
            catgVar8.a = catn.j;
            catgVar8.l(true);
            catgVar8.v(2);
            catgVar8.e();
            catgVar8.k();
            dbsw.c(applicationContext, catgVar8.b());
        } else {
            cate cateVar9 = new cate();
            cateVar9.t("MonitoringService");
            cateVar9.w(MonitoringService.a);
            cateVar9.j(cata.EVERY_DAY);
            cateVar9.v(0);
            cateVar9.r(true);
            cateVar9.g(1);
            cateVar9.f(0, 1);
            dbsw.b(applicationContext, cateVar9.b());
        }
        String str5 = ReinferenceService.a;
        if (fusd.c()) {
            catg catgVar9 = new catg();
            catgVar9.w(ReinferenceService.a);
            catgVar9.t("ReinferenceService");
            catgVar9.a = catn.j;
            catgVar9.l(true);
            catgVar9.v(2);
            dbsw.c(applicationContext, catgVar9.b());
        }
        String str6 = OdlhPppCleanupJob.a;
        if (furq.d()) {
            catg catgVar10 = new catg();
            catgVar10.w(OdlhPppCleanupJob.a);
            catgVar10.t("OdlhPppCleanup");
            catgVar10.a = catn.j;
            catgVar10.l(true);
            catgVar10.v(2);
            dbsw.c(applicationContext, catgVar10.b());
        }
        if (bzbx.q(applicationContext)) {
            ddph.a(applicationContext);
        }
        try {
            int i2 = true == dbvl.g(applicationContext, new dbvg(new dbtc())) ? 1 : 2;
            try {
                aura.M("com.google.android.gms.semanticlocationhistory.settings.OnDeviceSettingsActivity", i2);
            } catch (IllegalArgumentException unused) {
            }
            aura.M("com.google.android.gms.semanticlocationhistory.service.OnDeviceSettingsInjectorService", i2);
        } catch (IOException | IllegalArgumentException unused2) {
        }
        ((eluo) ((eluo) b.h()).ai((char) 10620)).x("Triggering settings sync one off task");
        SettingsSyncOneOffService.g(applicationContext);
    }
}
