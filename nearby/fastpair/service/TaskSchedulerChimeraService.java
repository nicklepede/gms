package com.google.android.gms.nearby.fastpair.service;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.a;
import defpackage.asmb;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.bykn;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bykw;
import defpackage.byky;
import defpackage.cexu;
import defpackage.cibd;
import defpackage.cigw;
import defpackage.ciqg;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fqkx;
import defpackage.fqld;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class TaskSchedulerChimeraService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final ensv b = new asmb(1, 10);

    public static bykn d(String str, byki bykiVar) {
        bykm bykmVar = new bykm();
        bykmVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        bykmVar.t(str);
        bykmVar.j(bykiVar);
        bykmVar.v(1);
        bykmVar.t = byky.a;
        bykmVar.y(0, 1);
        bykmVar.x(0, 1);
        return bykmVar.b();
    }

    public static bykw e(String str, bykv bykvVar) {
        byko bykoVar = new byko();
        bykoVar.q(str);
        bykoVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        bykoVar.a = bykvVar;
        bykoVar.v(1);
        bykoVar.l(true);
        return bykoVar.b();
    }

    public static void f(Context context) {
        ciqg.b(context, "TAG_FOOTPRINTS_PERIODIC_SCHEDULE");
    }

    public static void g(Context context, boolean z) {
        if (!fqld.L()) {
            ((ejhf) cigw.a.d().ah(7413)).x("TSS scheduleFootprintsOneOffSync: not enable");
            return;
        }
        bykj bykjVar = new bykj();
        bykjVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        bykjVar.t("TAG_FOOTPRINTS_ONE_OFF_SCHEDULE");
        bykjVar.v(0);
        bykjVar.e(z ? 0L : fqkx.B(), z ? 1L : fqkx.B() + 60);
        bykjVar.t = byky.a;
        bykjVar.y(0, 0);
        bykjVar.x(0, 0);
        ciqg.d(context, bykjVar.b());
    }

    public static void h(Context context, cibd cibdVar) {
        if (!fqld.af()) {
            ((ejhf) cigw.a.g().ah(7416)).x("TSS startTriangleMonitor: not enable");
            return;
        }
        j(context, cibdVar, true);
        ejhf ejhfVar = (ejhf) cigw.a.d().ah(7415);
        long j = cibdVar.a;
        ejhfVar.A("TSS startTriangleMonitor: id %s", j);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        fqkx fqkxVar = fqkx.a;
        long millis = timeUnit.toMillis(fqkxVar.a().bE());
        if (cibdVar.k(millis)) {
            Bundle bundle = new Bundle();
            bundle.putInt("KEY_TRIANGLE_MONITOR_TYPE", cibdVar.b - 1);
            byjl a2 = byjl.a(context);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
            bykj bykjVar = new bykj();
            bykjVar.w("com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
            bykjVar.t(a.D(j, "TAG_TRIANGLE_STOP_TRIANGLE_MONITOR_"));
            bykjVar.v(1);
            bykjVar.r(false);
            bykjVar.i(false);
            bykjVar.g(2);
            bykjVar.e(seconds, TimeUnit.MINUTES.toSeconds(fqkxVar.a().dQ()) + seconds);
            bykjVar.u = bundle;
            a2.f(bykjVar.b());
        }
    }

    public static void j(Context context, cibd cibdVar, boolean z) {
        if (!fqld.af()) {
            ((ejhf) cigw.a.d().ah(7421)).x("TSS stopTriangleMonitor: not enable");
            return;
        }
        ejhf ejhfVar = (ejhf) cigw.a.d().ah(7420);
        long j = cibdVar.a;
        ejhfVar.A("TSS stopTriangleMonitor: id %s", j);
        byjl.a(context).d(a.D(j, "TAG_TRIANGLE_STOP_TRIANGLE_MONITOR_"), "com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService");
        cibdVar.j(new cexu(context), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r2.equals("TAG_FOOTPRINTS_PERIODIC_SCHEDULE") != false) goto L21;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService.im(byln):enss");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        ((ejhf) cigw.a.d().ah(7407)).x("TSS destroyed");
        this.b.shutdown();
        super.onDestroy();
    }
}
