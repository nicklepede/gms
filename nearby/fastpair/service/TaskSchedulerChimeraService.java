package com.google.android.gms.nearby.fastpair.service;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.aupv;
import defpackage.casd;
import defpackage.cata;
import defpackage.catb;
import defpackage.cate;
import defpackage.catf;
import defpackage.catg;
import defpackage.catn;
import defpackage.cato;
import defpackage.catq;
import defpackage.chff;
import defpackage.ckji;
import defpackage.ckpb;
import defpackage.ckyl;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.ftes;
import defpackage.ftey;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TaskSchedulerChimeraService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final eqgo b = new aupv(1, 10);

    public static catf d(String str, cata cataVar) {
        cate cateVar = new cate();
        cateVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        cateVar.t(str);
        cateVar.j(cataVar);
        cateVar.v(1);
        cateVar.t = catq.a;
        cateVar.y(0, 1);
        cateVar.x(0, 1);
        return cateVar.b();
    }

    public static cato e(String str, catn catnVar) {
        catg catgVar = new catg();
        catgVar.q(str);
        catgVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        catgVar.a = catnVar;
        catgVar.v(1);
        catgVar.l(true);
        return catgVar.b();
    }

    public static void f(Context context) {
        ckyl.b(context, "TAG_FOOTPRINTS_PERIODIC_SCHEDULE");
    }

    public static void g(Context context, boolean z) {
        if (!ftey.M()) {
            ((eluo) ckpb.a.d().ai(7362)).x("TSS scheduleFootprintsOneOffSync: not enable");
            return;
        }
        catb catbVar = new catb();
        catbVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        catbVar.t("TAG_FOOTPRINTS_ONE_OFF_SCHEDULE");
        catbVar.v(0);
        catbVar.e(z ? 0L : ftes.B(), z ? 1L : ftes.B() + 60);
        catbVar.t = catq.a;
        catbVar.y(0, 0);
        catbVar.x(0, 0);
        ckyl.d(context, catbVar.b());
    }

    public static void h(Context context, ckji ckjiVar) {
        if (!ftey.ag()) {
            ((eluo) ckpb.a.g().ai(7365)).x("TSS startTriangleMonitor: not enable");
            return;
        }
        j(context, ckjiVar, true);
        eluo eluoVar = (eluo) ckpb.a.d().ai(7364);
        long j = ckjiVar.a;
        eluoVar.A("TSS startTriangleMonitor: id %s", j);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        ftes ftesVar = ftes.a;
        long millis = timeUnit.toMillis(ftesVar.lK().bE());
        if (ckjiVar.k(millis)) {
            Bundle bundle = new Bundle();
            bundle.putInt("KEY_TRIANGLE_MONITOR_TYPE", ckjiVar.b - 1);
            casd a2 = casd.a(context);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
            catb catbVar = new catb();
            catbVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
            catbVar.t(a.C(j, "TAG_TRIANGLE_STOP_TRIANGLE_MONITOR_"));
            catbVar.v(1);
            catbVar.r(false);
            catbVar.i(false);
            catbVar.g(2);
            catbVar.e(seconds, TimeUnit.MINUTES.toSeconds(ftesVar.lK().dQ()) + seconds);
            catbVar.u = bundle;
            a2.f(catbVar.b());
        }
    }

    public static void j(Context context, ckji ckjiVar, boolean z) {
        if (!ftey.ag()) {
            ((eluo) ckpb.a.d().ai(7370)).x("TSS stopTriangleMonitor: not enable");
            return;
        }
        eluo eluoVar = (eluo) ckpb.a.d().ai(7369);
        long j = ckjiVar.a;
        eluoVar.A("TSS stopTriangleMonitor: id %s", j);
        casd.a(context).d(a.C(j, "TAG_TRIANGLE_STOP_TRIANGLE_MONITOR_"), "com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        ckjiVar.j(new chff(context), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r2.equals("TAG_FOOTPRINTS_PERIODIC_SCHEDULE") != false) goto L21;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService.iB(cauf):eqgl");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        ((eluo) ckpb.a.d().ai(7356)).x("TSS destroyed");
        this.b.shutdown();
        super.onDestroy();
    }
}
