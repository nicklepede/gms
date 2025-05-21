package com.google.android.gms.common.stats;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.stats.permissions.PermissionStateLoggingTask;
import defpackage.asje;
import defpackage.asjf;
import defpackage.asng;
import defpackage.asot;
import defpackage.bxiq;
import defpackage.bxis;
import defpackage.byjl;
import defpackage.byjw;
import defpackage.bykd;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.fiwo;
import defpackage.fmsy;
import defpackage.fmuo;
import defpackage.fmys;
import defpackage.fmzm;
import defpackage.fnaw;
import defpackage.fnbi;
import defpackage.fncn;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CoreStatsInitHandler extends asjf {
    public fiwo a;

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        asot asotVar = GmsCoreStatsChimeraService.a;
        Intent component = new Intent().setComponent(asje.a);
        component.setAction("com.google.android.gms.common.stats.START");
        startService(component);
        if (fmsy.a.a().h()) {
            if (fmsy.a.a().e()) {
                asng.M("com.google.android.gms.common.stats.net.contentprovider.NetworkUsageContentProvider", 2);
            } else {
                asng.M("com.google.android.gms.common.stats.net.contentprovider.NetworkUsageContentProvider", 0);
            }
        }
        int i2 = StatsUploadChimeraService.a;
        if (fmsy.c()) {
            StatsUploadChimeraService.e();
        }
        if (fnaw.f()) {
            int i3 = DiskStatsCollectionTaskService.a;
            bykm bykmVar = new bykm();
            bykmVar.g(2);
            bykmVar.x(1, 1);
            bykmVar.f(fnaw.a.a().K() ? 1 : 0, 1);
            bykmVar.j(byki.a(TimeUnit.HOURS.toSeconds(fnaw.a.a().h())));
            bykmVar.w(DiskStatsCollectionTaskService.class.getName());
            bykmVar.q("diskstats");
            bykmVar.p = true;
            bykmVar.v(2);
            byjl.a(this).f(bykmVar.b());
        }
        if (NotificationLoggingTask.d()) {
            byjl a = byjl.a(this);
            fmys fmysVar = fmys.a;
            if (!fmysVar.a().k()) {
                a.c(NotificationLoggingTask.a);
            } else if (fncn.j()) {
                byko bykoVar = new byko();
                bykoVar.w(NotificationLoggingTask.a);
                bykoVar.q("NOTIFICATIONS");
                bykoVar.p = true;
                bykoVar.v(2);
                bykoVar.l(false);
                bykoVar.a = bykv.j;
                a.f(bykoVar.b());
            } else {
                long a2 = fmysVar.a().a();
                if (a2 > 0) {
                    bykm bykmVar2 = new bykm();
                    bykmVar2.j(byki.a(a2));
                    bykmVar2.w(NotificationLoggingTask.a);
                    bykmVar2.t("NOTIFICATIONS");
                    bykmVar2.p = true;
                    bykmVar2.v(2);
                    bykmVar2.y(2, 2);
                    bykmVar2.x(0, !fmys.e() ? 1 : 0);
                    bykmVar2.f(0, !fmys.e() ? 1 : 0);
                    a.f(bykmVar2.b());
                }
            }
        }
        int i4 = FeatureLoggingTask.b;
        byjl a3 = byjl.a(this);
        if (fncn.j()) {
            byko bykoVar2 = new byko();
            bykoVar2.w(FeatureLoggingTask.a);
            bykoVar2.p = true;
            bykoVar2.q("FEATURE_STATUS");
            bykoVar2.v(2);
            bykoVar2.a = bykv.j;
            bykoVar2.l(false);
            a3.f(bykoVar2.b());
        } else {
            long b = fmuo.a.a().b();
            if (b > 0) {
                bykm bykmVar3 = new bykm();
                bykmVar3.j(byki.a(b));
                bykmVar3.w(FeatureLoggingTask.a);
                bykmVar3.p = true;
                bykmVar3.t("FEATURE_STATUS");
                bykmVar3.v(2);
                a3.f(bykmVar3.b());
            }
        }
        int i5 = PermissionStateLoggingTask.a;
        if (fncn.m()) {
            byko bykoVar3 = new byko();
            bykoVar3.w(PermissionStateLoggingTask.class.getName());
            bykoVar3.q("PERMISSION_STATE");
            bykoVar3.v(2);
            bykoVar3.p = true;
            bykoVar3.l(false);
            bykoVar3.a = bykv.j;
            byjl.a(this).f(bykoVar3.b());
        } else {
            bykm bykmVar4 = new bykm();
            bykmVar4.j(byki.a(fmzm.a.a().a()));
            bykmVar4.w(PermissionStateLoggingTask.class.getName());
            bykmVar4.t("PERMISSION_STATE");
            bykmVar4.p = true;
            bykmVar4.v(2);
            bykmVar4.g(2);
            byjl.a(this).f(bykmVar4.b());
        }
        int i6 = StatsForTraceEmitterTask.b;
        if (fmsy.d() && Build.VERSION.SDK_INT >= 29) {
            byjl a4 = byjl.a(this);
            byjw byjwVar = new byjw();
            byjwVar.w(StatsForTraceEmitterTask.a);
            byjwVar.p = true;
            byjwVar.q("STATS_EMITTER_TASK");
            byjwVar.v(2);
            byjwVar.a = bykd.a;
            byjwVar.e(false);
            a4.f(byjwVar.b());
        }
        if (fnbi.a.a().a()) {
            bxiq bxiqVar = (bxiq) this.a.a();
            fvbo.f(bxiqVar, "provisioner");
            fvgu.a(fuyy.a, new bxis(bxiqVar, null));
        }
    }
}
