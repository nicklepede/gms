package com.google.android.gms.fonts.update;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bhbg;
import defpackage.bhbx;
import defpackage.bhcb;
import defpackage.bhcm;
import defpackage.bhdd;
import defpackage.bhdh;
import defpackage.bhdp;
import defpackage.bhdx;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.byln;
import defpackage.eiif;
import defpackage.fnck;
import defpackage.fofb;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class UpdateSchedulerBase extends GmsTaskChimeraService {
    private static final Object a = new Object();

    public static void e(bhdp bhdpVar, Context context) {
        try {
            if (fnck.a.a().e()) {
                byko bykoVar = new byko();
                bykoVar.j = "com.google.android.gms.fonts.update.UpdateSchedulerService";
                bykoVar.t("FontsUpdateCheck");
                bykoVar.a = bykv.j;
                bykoVar.l(true);
                bykoVar.v(2);
                bykoVar.k();
                bykoVar.e();
                byjl.a(context).f(bykoVar.b());
            } else {
                bykm bykmVar = new bykm();
                if (bhdpVar.m <= 0) {
                    bhdpVar.h();
                }
                bykmVar.a = bhdpVar.m;
                bykmVar.b = TimeUnit.HOURS.toSeconds(6L);
                bykmVar.p = true;
                bykmVar.j = "com.google.android.gms.fonts.update.UpdateSchedulerService";
                bykmVar.x(1, 1);
                bykmVar.y(1, 1);
                bykmVar.v(1);
                bykmVar.t("FontsUpdateCheck");
                byjl.a(context).f(bykmVar.b());
            }
            bhcm.c("FontsUpdateScheduler", "Update scheduled", new Object[0]);
        } catch (Exception e) {
            bhcm.g("FontsUpdateScheduler", e, "Unable to schedule update check", new Object[0]);
            bhdpVar.c(context).c(9, 23503, "com.google.android.gms.fonts.asyncupdate");
        }
    }

    private final void f(int i) {
        bhdp.a.c(getApplicationContext()).c(9, i, "com.google.android.gms.fonts.asyncupdate");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        bhdx bhdxVar;
        boolean z;
        synchronized (bhdx.a) {
            bhdxVar = bhdx.b;
        }
        int i = 2;
        if (bhdxVar != null) {
            bhcm.f("FontsUpdateScheduler", "Update Runner is already running", new Object[0]);
            return 2;
        }
        if (!fofb.e()) {
            bhcm.f("FontsUpdateScheduler", "Update Runner fired but directory updates are not enabled", new Object[0]);
            return 2;
        }
        d();
        synchronized (a) {
            try {
                try {
                    int b = (int) fofb.b();
                    bhdp bhdpVar = bhdp.a;
                    int i2 = bhdpVar.l(getApplicationContext()).b;
                    if (b <= i2) {
                        bhcm.f("FontsUpdateScheduler", "New version from GServices %d is less than or equal to current version %d", Integer.valueOf(b), Integer.valueOf(i2));
                    } else {
                        String d = fofb.d();
                        if (!eiif.c(d) && d.length() == 64) {
                            bhcm.e("FontsUpdateScheduler", "Starting Update process", new Object[0]);
                            bhcb j = bhdpVar.j();
                            if (j == null) {
                                bhcm.f("FontsUpdateScheduler", "No downloader, SharedState not initialized. Bailing out.", new Object[0]);
                                f(23502);
                            } else {
                                Context applicationContext = getApplicationContext();
                                bhbg a2 = bhdh.a();
                                if (bhdp.a.b(applicationContext).j(a2.d)) {
                                    bhbx b2 = bhdpVar.b(applicationContext);
                                    bhdd l = bhdpVar.l(applicationContext);
                                    ExecutorService e = bhdpVar.e();
                                    synchronized (bhdx.a) {
                                        if (bhdx.b == null) {
                                            bhdx.b = new bhdx(b2, j, a2, l, applicationContext, e);
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        bhdx.b.c();
                                    }
                                    bhcm.e("FontsUpdateScheduler", "Update scheduler ".concat(true != z ? "failed" : "succeeded"), new Object[0]);
                                    if (z) {
                                        i = 0;
                                    }
                                } else {
                                    bhcm.f("FontsUpdateScheduler", "Not enough disk space to process update.", new Object[0]);
                                }
                            }
                            return i;
                        }
                        bhcm.f("FontsUpdateScheduler", "gServices value for directory hash is invalid: %s", d);
                    }
                    bhcm.e("FontsUpdateScheduler", "Did not start update", new Object[0]);
                    return 0;
                } catch (Exception e2) {
                    bhcm.g("FontsUpdateScheduler", e2, "Update process failed due to an exception", new Object[0]);
                    f(23501);
                    return 2;
                }
            } finally {
            }
        }
    }

    protected abstract void d();
}
