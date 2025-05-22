package com.google.android.gms.common.stats;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.stats.permissions.PermissionStateLoggingTask;
import defpackage.aumy;
import defpackage.aumz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bzrg;
import defpackage.bzri;
import defpackage.casd;
import defpackage.caso;
import defpackage.casv;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.flml;
import defpackage.fpkw;
import defpackage.fpmm;
import defpackage.fpqr;
import defpackage.fprl;
import defpackage.fpsv;
import defpackage.fpth;
import defpackage.fpum;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CoreStatsInitHandler extends aumz {
    public flml a;

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        ausn ausnVar = GmsCoreStatsChimeraService.a;
        Intent component = new Intent().setComponent(aumy.a);
        component.setAction("com.google.android.gms.common.stats.START");
        startService(component);
        if (fpkw.a.lK().g()) {
            aura.M("com.google.android.gms.common.stats.net.contentprovider.NetworkUsageContentProvider", 2);
        }
        int i2 = StatsUploadChimeraService.a;
        if (fpkw.c()) {
            StatsUploadChimeraService.e();
        }
        if (fpsv.A()) {
            int i3 = DiskStatsCollectionTaskService.a;
            cate cateVar = new cate();
            cateVar.g(2);
            cateVar.x(1, 1);
            fpsv fpsvVar = fpsv.a;
            cateVar.f(fpsvVar.lK().K() ? 1 : 0, 1);
            cateVar.j(cata.a(TimeUnit.HOURS.toSeconds(fpsvVar.lK().h())));
            cateVar.w(DiskStatsCollectionTaskService.class.getName());
            cateVar.q("diskstats");
            cateVar.p = true;
            cateVar.v(2);
            casd.a(this).f(cateVar.b());
        }
        if (NotificationLoggingTask.d()) {
            casd a = casd.a(this);
            fpqr fpqrVar = fpqr.a;
            if (!fpqrVar.lK().k()) {
                a.c(NotificationLoggingTask.a);
            } else if (fpum.j()) {
                catg catgVar = new catg();
                catgVar.w(NotificationLoggingTask.a);
                catgVar.q("NOTIFICATIONS");
                catgVar.p = true;
                catgVar.v(2);
                catgVar.l(false);
                catgVar.a = catn.j;
                a.f(catgVar.b());
            } else {
                long a2 = fpqrVar.lK().a();
                if (a2 > 0) {
                    cate cateVar2 = new cate();
                    cateVar2.j(cata.a(a2));
                    cateVar2.w(NotificationLoggingTask.a);
                    cateVar2.t("NOTIFICATIONS");
                    cateVar2.p = true;
                    cateVar2.v(2);
                    cateVar2.y(2, 2);
                    cateVar2.x(0, !fpqr.e() ? 1 : 0);
                    cateVar2.f(0, !fpqr.e() ? 1 : 0);
                    a.f(cateVar2.b());
                }
            }
        }
        int i4 = FeatureLoggingTask.b;
        casd a3 = casd.a(this);
        if (fpum.j()) {
            catg catgVar2 = new catg();
            catgVar2.w(FeatureLoggingTask.a);
            catgVar2.p = true;
            catgVar2.q("FEATURE_STATUS");
            catgVar2.v(2);
            catgVar2.a = catn.j;
            catgVar2.l(false);
            a3.f(catgVar2.b());
        } else {
            long b = fpmm.a.lK().b();
            if (b > 0) {
                cate cateVar3 = new cate();
                cateVar3.j(cata.a(b));
                cateVar3.w(FeatureLoggingTask.a);
                cateVar3.p = true;
                cateVar3.t("FEATURE_STATUS");
                cateVar3.v(2);
                a3.f(cateVar3.b());
            }
        }
        int i5 = PermissionStateLoggingTask.a;
        if (fpum.m()) {
            catg catgVar3 = new catg();
            catgVar3.w(PermissionStateLoggingTask.class.getName());
            catgVar3.q("PERMISSION_STATE");
            catgVar3.v(2);
            catgVar3.p = true;
            catgVar3.l(false);
            catgVar3.a = catn.j;
            casd.a(this).f(catgVar3.b());
        } else {
            cate cateVar4 = new cate();
            cateVar4.j(cata.a(fprl.a.lK().a()));
            cateVar4.w(PermissionStateLoggingTask.class.getName());
            cateVar4.t("PERMISSION_STATE");
            cateVar4.p = true;
            cateVar4.v(2);
            cateVar4.g(2);
            casd.a(this).f(cateVar4.b());
        }
        int i6 = StatsForTraceEmitterTask.b;
        if (fpkw.d() && Build.VERSION.SDK_INT >= 29) {
            casd a4 = casd.a(this);
            caso casoVar = new caso();
            casoVar.w(StatsForTraceEmitterTask.a);
            casoVar.p = true;
            casoVar.q("STATS_EMITTER_TASK");
            casoVar.v(2);
            casoVar.a = casv.a;
            casoVar.e(false);
            a4.f(casoVar.b());
        }
        if (fpth.a.lK().a()) {
            bzrg bzrgVar = (bzrg) this.a.a();
            fxxm.f(bzrgVar, "provisioner");
            fycs.a(fxuw.a, new bzri(bzrgVar, null));
        }
    }
}
