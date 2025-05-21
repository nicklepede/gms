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
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.bwth;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bykx;
import defpackage.cziy;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.dahq;
import defpackage.dbex;
import defpackage.dbez;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fnck;
import defpackage.frww;
import defpackage.frxj;
import defpackage.frxn;
import defpackage.frxq;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryModuleInitIntentOperation extends anya {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "ModuleInit");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Account a2;
        if (!frxn.Q()) {
            ((ejhf) ((ejhf) b.h()).ah((char) 10615)).x("Flag disabled. Module will not be initialized.");
            return;
        }
        Context applicationContext = getApplicationContext();
        if (frxn.Q() && (a2 = czlp.a(applicationContext, new czlk(new czje()))) != null) {
            String str = a2.name;
            ensj.t(new dahq().f(str), new dbex(applicationContext, str), enre.a);
        }
        String str2 = GellerCleanupService.a;
        if (fnck.f()) {
            byko bykoVar = new byko();
            bykoVar.w(GellerCleanupService.a);
            bykoVar.t("GellerCleanup");
            bykoVar.a = bykv.j;
            bykoVar.l(false);
            bykoVar.v(2);
            bykoVar.e();
            bykoVar.j();
            cziy.c(applicationContext, bykoVar.b());
        } else {
            bykm bykmVar = new bykm();
            bykmVar.w(GellerCleanupService.a);
            bykmVar.t("GellerCleanup");
            bykmVar.j(byki.EVERY_DAY);
            bykmVar.v(0);
            bykmVar.r(true);
            bykmVar.g(2);
            bykmVar.f(1, 1);
            cziy.b(applicationContext, bykmVar.b());
        }
        if (LocationHistoryActiveProcessingService.d()) {
            if (fnck.f()) {
                byko bykoVar2 = new byko();
                bykoVar2.w(LocationHistoryActiveProcessingService.a);
                bykoVar2.t("LocationHistoryActiveProcessing");
                bykoVar2.a = bykv.j;
                bykoVar2.l(true);
                bykoVar2.v(2);
                cziy.c(applicationContext, bykoVar2.b());
            } else {
                bykm bykmVar2 = new bykm();
                bykmVar2.w(LocationHistoryActiveProcessingService.a);
                bykmVar2.t("LocationHistoryActiveProcessing");
                bykmVar2.j(byki.EVERY_DAY);
                bykmVar2.v(2);
                bykmVar2.y(0, 1);
                bykmVar2.x(0, 1);
                bykmVar2.f(0, 1);
                bykmVar2.t = bykx.a(0, (int) frxq.a.a().f(), (int) frxq.a.a().g());
                cziy.b(applicationContext, bykmVar2.b());
            }
        }
        if (fnck.f()) {
            asot asotVar = SettingsSyncService.a;
            byko bykoVar3 = new byko();
            bykoVar3.w(SettingsSyncService.b);
            bykoVar3.t("OdlhSettingsSyncTask");
            bykoVar3.m((int) frxq.a.a().j());
            bykoVar3.l(true);
            bykoVar3.v(2);
            cziy.c(applicationContext, bykoVar3.b());
        } else {
            asot asotVar2 = SettingsSyncService.a;
            bykm bykmVar3 = new bykm();
            bykmVar3.w(SettingsSyncService.b);
            bykmVar3.t("OdlhSettingsSyncTask");
            bykmVar3.j(byki.a(frxq.a.a().l() * 3600));
            bykmVar3.v(true != frxq.p() ? 1 : 2);
            bykmVar3.y(0, 1);
            bykmVar3.x(0, 1);
            bykmVar3.f(0, 1);
            frxq frxqVar = frxq.a;
            bykmVar3.t = bykx.a(0, (int) frxqVar.a().p(), (int) frxqVar.a().q());
            cziy.b(applicationContext, bykmVar3.b());
        }
        if (fnck.f()) {
            asot asotVar3 = OdlhTombstonesCleanupJob.a;
            byko bykoVar4 = new byko();
            bykoVar4.w(OdlhTombstonesCleanupJob.b);
            bykoVar4.t("OdlhTombstonesCleanupJob");
            bykoVar4.a = bykv.j;
            bykoVar4.l(false);
            bykoVar4.v(2);
            cziy.c(applicationContext, bykoVar4.b());
        } else {
            asot asotVar4 = OdlhTombstonesCleanupJob.a;
            bykm bykmVar4 = new bykm();
            bykmVar4.w(OdlhTombstonesCleanupJob.b);
            bykmVar4.t("OdlhTombstonesCleanupJob");
            bykmVar4.j(byki.EVERY_DAY);
            bykmVar4.v(true != frxn.X() ? 1 : 2);
            bykmVar4.y(0, 1);
            bykmVar4.x(0, 1);
            bykmVar4.f(0, 1);
            cziy.b(applicationContext, bykmVar4.b());
        }
        if (fnck.f()) {
            asot asotVar5 = OdlhDatabaseCleanupJob.a;
            byko bykoVar5 = new byko();
            bykoVar5.w(OdlhDatabaseCleanupJob.b);
            bykoVar5.t("OdlhDatabaseCleanup");
            bykoVar5.a = bykv.j;
            bykoVar5.l(false);
            bykoVar5.v(2);
            cziy.c(applicationContext, bykoVar5.b());
        } else {
            asot asotVar6 = OdlhDatabaseCleanupJob.a;
            bykm bykmVar5 = new bykm();
            bykmVar5.w(OdlhDatabaseCleanupJob.b);
            bykmVar5.t("OdlhDatabaseCleanup");
            bykmVar5.j(byki.EVERY_DAY);
            bykmVar5.v(true != frxn.X() ? 1 : 2);
            bykmVar5.x(0, 1);
            cziy.b(applicationContext, bykmVar5.b());
        }
        String str3 = EditMergeJob.a;
        if (fnck.f()) {
            byko bykoVar6 = new byko();
            bykoVar6.w(EditMergeJob.a);
            bykoVar6.t("EditMergeJob");
            bykoVar6.a = bykv.j;
            bykoVar6.l(false);
            bykoVar6.v(2);
            cziy.c(applicationContext, bykoVar6.b());
        } else {
            bykm bykmVar6 = new bykm();
            bykmVar6.w(EditMergeJob.a);
            bykmVar6.t("EditMergeJob");
            bykmVar6.j(byki.EVERY_DAY);
            bykmVar6.v(true != frxn.X() ? 1 : 2);
            bykmVar6.g(2);
            bykmVar6.f(0, 1);
            cziy.b(applicationContext, bykmVar6.b());
        }
        asot asotVar7 = OdlhRemovedAccountsCleanupJob.a;
        if (frxn.M()) {
            bykm bykmVar7 = new bykm();
            bykmVar7.w(OdlhRemovedAccountsCleanupJob.b);
            bykmVar7.t("OdlhRemovedAccountsCleanup");
            bykmVar7.j(byki.EVERY_14_DAYS);
            bykmVar7.v(true != frxn.X() ? 1 : 2);
            bykmVar7.r(true);
            cziy.b(applicationContext, bykmVar7.b());
        }
        if (OdlhUserEditSyncJob.d()) {
            if (fnck.f()) {
                byko bykoVar7 = new byko();
                bykoVar7.w(OdlhUserEditSyncJob.a);
                bykoVar7.t("OdlhUserEditSync");
                bykoVar7.a = bykv.j;
                bykoVar7.l(true);
                bykoVar7.v(2);
                cziy.c(applicationContext, bykoVar7.b());
            } else {
                bykm bykmVar8 = new bykm();
                bykmVar8.w(OdlhUserEditSyncJob.a);
                bykmVar8.t("OdlhUserEditSync");
                bykmVar8.j(byki.EVERY_DAY);
                bykmVar8.v(true != frxn.X() ? 1 : 2);
                bykmVar8.x(0, 1);
                bykmVar8.y(0, 1);
                cziy.b(applicationContext, bykmVar8.b());
            }
        }
        String str4 = MonitoringService.a;
        if (fnck.f()) {
            byko bykoVar8 = new byko();
            bykoVar8.t("MonitoringService");
            bykoVar8.w(MonitoringService.a);
            bykoVar8.a = bykv.j;
            bykoVar8.l(true);
            bykoVar8.v(2);
            bykoVar8.e();
            bykoVar8.k();
            cziy.c(applicationContext, bykoVar8.b());
        } else {
            bykm bykmVar9 = new bykm();
            bykmVar9.t("MonitoringService");
            bykmVar9.w(MonitoringService.a);
            bykmVar9.j(byki.EVERY_DAY);
            bykmVar9.v(0);
            bykmVar9.r(true);
            bykmVar9.g(1);
            bykmVar9.f(0, 1);
            cziy.b(applicationContext, bykmVar9.b());
        }
        String str5 = ReinferenceService.a;
        if (frxj.c()) {
            byko bykoVar9 = new byko();
            bykoVar9.w(ReinferenceService.a);
            bykoVar9.t("ReinferenceService");
            bykoVar9.a = bykv.j;
            bykoVar9.l(true);
            bykoVar9.v(2);
            cziy.c(applicationContext, bykoVar9.b());
        }
        String str6 = OdlhPppCleanupJob.a;
        if (frww.d()) {
            byko bykoVar10 = new byko();
            bykoVar10.w(OdlhPppCleanupJob.a);
            bykoVar10.t("OdlhPppCleanup");
            bykoVar10.a = bykv.j;
            bykoVar10.l(true);
            bykoVar10.v(2);
            cziy.c(applicationContext, bykoVar10.b());
        }
        if (bwth.q(applicationContext)) {
            dbez.a(applicationContext);
        }
        try {
            int i2 = true == czlp.g(applicationContext, new czlk(new czje())) ? 1 : 2;
            try {
                asng.M("com.google.android.gms.semanticlocationhistory.settings.OnDeviceSettingsActivity", i2);
            } catch (IllegalArgumentException unused) {
            }
            asng.M("com.google.android.gms.semanticlocationhistory.service.OnDeviceSettingsInjectorService", i2);
        } catch (IOException | IllegalArgumentException unused2) {
        }
        ((ejhf) ((ejhf) b.h()).ah((char) 10614)).x("Triggering settings sync one off task");
        SettingsSyncOneOffService.g(applicationContext);
    }
}
