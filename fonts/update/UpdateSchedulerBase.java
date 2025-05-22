package com.google.android.gms.fonts.update;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bjfw;
import defpackage.bjgn;
import defpackage.bjgr;
import defpackage.bjhc;
import defpackage.bjht;
import defpackage.bjhx;
import defpackage.bjif;
import defpackage.bjin;
import defpackage.casd;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.cauf;
import defpackage.ekvk;
import defpackage.fpuj;
import defpackage.fqxl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class UpdateSchedulerBase extends GmsTaskChimeraService {
    private static final Object a = new Object();

    public static void e(bjif bjifVar, Context context) {
        try {
            if (fpuj.a.lK().e()) {
                catg catgVar = new catg();
                catgVar.j = "com.google.android.gms.fonts.update.UpdateSchedulerService";
                catgVar.t("FontsUpdateCheck");
                catgVar.a = catn.j;
                catgVar.l(true);
                catgVar.v(2);
                catgVar.k();
                catgVar.e();
                casd.a(context).f(catgVar.b());
            } else {
                cate cateVar = new cate();
                if (bjifVar.m <= 0) {
                    bjifVar.h();
                }
                cateVar.a = bjifVar.m;
                cateVar.b = TimeUnit.HOURS.toSeconds(6L);
                cateVar.p = true;
                cateVar.j = "com.google.android.gms.fonts.update.UpdateSchedulerService";
                cateVar.x(1, 1);
                cateVar.y(1, 1);
                cateVar.v(1);
                cateVar.t("FontsUpdateCheck");
                casd.a(context).f(cateVar.b());
            }
            bjhc.c("FontsUpdateScheduler", "Update scheduled", new Object[0]);
        } catch (Exception e) {
            bjhc.g("FontsUpdateScheduler", e, "Unable to schedule update check", new Object[0]);
            bjifVar.c(context).c(9, 23503, "com.google.android.gms.fonts.asyncupdate");
        }
    }

    private final void f(int i) {
        bjif.a.c(getApplicationContext()).c(9, i, "com.google.android.gms.fonts.asyncupdate");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        bjin bjinVar;
        boolean z;
        synchronized (bjin.a) {
            bjinVar = bjin.b;
        }
        int i = 2;
        if (bjinVar != null) {
            bjhc.f("FontsUpdateScheduler", "Update Runner is already running", new Object[0]);
            return 2;
        }
        if (!fqxl.e()) {
            bjhc.f("FontsUpdateScheduler", "Update Runner fired but directory updates are not enabled", new Object[0]);
            return 2;
        }
        d();
        synchronized (a) {
            try {
                try {
                    int b = (int) fqxl.b();
                    bjif bjifVar = bjif.a;
                    int i2 = bjifVar.l(getApplicationContext()).b;
                    if (b <= i2) {
                        bjhc.f("FontsUpdateScheduler", "New version from GServices %d is less than or equal to current version %d", Integer.valueOf(b), Integer.valueOf(i2));
                    } else {
                        String d = fqxl.d();
                        if (!ekvk.c(d) && d.length() == 64) {
                            bjhc.e("FontsUpdateScheduler", "Starting Update process", new Object[0]);
                            bjgr j = bjifVar.j();
                            if (j == null) {
                                bjhc.f("FontsUpdateScheduler", "No downloader, SharedState not initialized. Bailing out.", new Object[0]);
                                f(23502);
                            } else {
                                Context applicationContext = getApplicationContext();
                                bjfw a2 = bjhx.a();
                                if (bjifVar.b(applicationContext).j(a2.d)) {
                                    bjgn b2 = bjifVar.b(applicationContext);
                                    bjht l = bjifVar.l(applicationContext);
                                    ExecutorService e = bjifVar.e();
                                    synchronized (bjin.a) {
                                        if (bjin.b == null) {
                                            bjin.b = new bjin(b2, j, a2, l, applicationContext, e);
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        bjin.b.c();
                                    }
                                    bjhc.e("FontsUpdateScheduler", "Update scheduler ".concat(true != z ? "failed" : "succeeded"), new Object[0]);
                                    if (z) {
                                        i = 0;
                                    }
                                } else {
                                    bjhc.f("FontsUpdateScheduler", "Not enough disk space to process update.", new Object[0]);
                                }
                            }
                            return i;
                        }
                        bjhc.f("FontsUpdateScheduler", "gServices value for directory hash is invalid: %s", d);
                    }
                    bjhc.e("FontsUpdateScheduler", "Did not start update", new Object[0]);
                    return 0;
                } catch (Exception e2) {
                    bjhc.g("FontsUpdateScheduler", e2, "Update process failed due to an exception", new Object[0]);
                    f(23501);
                    return 2;
                }
            } finally {
            }
        }
    }

    protected abstract void d();
}
