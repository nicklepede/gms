package com.google.android.gms.backup.transport.component;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import com.google.android.chimera.JobService;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.backup.transport.component.GmsBackupSchedulerChimeraService;
import defpackage.ahpv;
import defpackage.ahwd;
import defpackage.ahwg;
import defpackage.ahwj;
import defpackage.akdr;
import defpackage.akds;
import defpackage.akdx;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.eklu;
import defpackage.ensv;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.flky;
import defpackage.fllq;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsBackupSchedulerChimeraService extends JobService {
    private final ensv c = new asmf(1, 10);
    private boolean d = true;
    private static final asot b = asot.b("GmsBackupSchedulerChimeraService", asej.BACKUP);
    public static final ahwd a = new ahwd("GmsBackupScheduler");

    public static int a(Context context, JobInfo jobInfo) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        try {
            return fllq.a.a().C() ? jobScheduler.scheduleAsPackage(jobInfo, "com.google.android.gms", UserHandle.myUserId(), "GmsBackupSchedulerChimeraService") : jobScheduler.scheduleAsPackage(jobInfo, "com.google.android.gms.backup", UserHandle.myUserId(), "GmsBackupSchedulerChimeraService");
        } catch (Exception e) {
            a.g("", e, new Object[0]);
            ahwg.a(b, e, flky.c());
            return 0;
        }
    }

    public static JobInfo.Builder b(Context context, akdr akdrVar) {
        return new JobInfo.Builder(1, new ComponentName(context, "com.google.android.gms.backup.component.GmsBackupSchedulerService")).setRequiresCharging(akdrVar.c).setRequiresDeviceIdle(akdrVar.b).setRequiredNetworkType(true != akdrVar.a ? 3 : 2);
    }

    public static void c(Context context) {
        long d = fllq.a.a().d();
        if (!fllq.j()) {
            a.j("Disabled, not scheduling.", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.backup.component.GmsBackupSchedulerService");
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && resolveService.serviceInfo != null && JobService.PERMISSION_BIND.equals(resolveService.serviceInfo.permission)) {
                akdr b2 = akds.b(context);
                if (a(context, b(context, b2).setMinimumLatency(TimeUnit.MINUTES.toMillis(d)).build()) == 1) {
                    a.j("Scheduled task to run in %d minutes, while idle: %b, require charging: %b, require wifi: %b", Long.valueOf(d), Boolean.valueOf(b2.b), Boolean.valueOf(b2.c), Boolean.valueOf(b2.a));
                    return;
                } else {
                    a.j("Error scheduling job.", new Object[0]);
                    return;
                }
            }
        }
        a.j("Ineligible, not scheduling.", new Object[0]);
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        ahwd ahwdVar = a;
        ahwdVar.h("Hooray! Backup time!", new Object[0]);
        final akdx akdxVar = new akdx();
        if (!fllq.j()) {
            ahwdVar.m("Disabled, not running and cancelling future jobs.", new Object[0]);
            fecj c = ahwj.c();
            fecj v = eklu.a.v();
            if (!v.b.L()) {
                v.U();
            }
            eklu ekluVar = (eklu) v.b;
            ekluVar.b |= 1;
            ekluVar.c = false;
            if (!c.b.L()) {
                c.U();
            }
            ekhl ekhlVar = (ekhl) c.b;
            eklu ekluVar2 = (eklu) v.Q();
            ekhl ekhlVar2 = ekhl.a;
            ekluVar2.getClass();
            ekhlVar.I = ekluVar2;
            ekhlVar.c |= 4;
            akdxVar.a((ekhl) c.Q(), ekhk.GMS_BACKUP_RUN);
            this.d = false;
            ((JobScheduler) getSystemService("jobscheduler")).cancel(1);
            return false;
        }
        if (new ahpv(this).k()) {
            if (fllq.b() <= 0 || Build.VERSION.SDK_INT >= 26 || jobParameters.getExtras().getBoolean("delayed_job", false)) {
                this.c.execute(new Runnable() { // from class: akdw
                    @Override // java.lang.Runnable
                    public final void run() {
                        GmsBackupSchedulerChimeraService gmsBackupSchedulerChimeraService = GmsBackupSchedulerChimeraService.this;
                        akdr b2 = akds.b(gmsBackupSchedulerChimeraService);
                        boolean z = b2.a;
                        boolean z2 = b2.b;
                        boolean z3 = b2.c;
                        boolean z4 = b2.d;
                        ahhj ahhjVar = new ahhj();
                        ahhjVar.a = z;
                        ahhjVar.b = z3;
                        ahhjVar.c = z2;
                        ahhjVar.d = fllq.h();
                        ahhjVar.e = z4;
                        ahhjVar.i = false;
                        ahwd ahwdVar2 = GmsBackupSchedulerChimeraService.a;
                        ahwdVar2.h("Requesting backup of all packages.", new Object[0]);
                        if (fllt.q()) {
                            ahwdVar2.h("Also running custom backups agents as part of scheduled backups", new Object[0]);
                            ahhjVar.g = true;
                        }
                        new ahkk(gmsBackupSchedulerChimeraService).b(new BackUpNowConfig(ahhjVar));
                        fecj c2 = ahwj.c();
                        fecj v2 = eklu.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fecp fecpVar = v2.b;
                        eklu ekluVar3 = (eklu) fecpVar;
                        ekluVar3.b |= 1;
                        ekluVar3.c = true;
                        if (!fecpVar.L()) {
                            v2.U();
                        }
                        fecp fecpVar2 = v2.b;
                        eklu ekluVar4 = (eklu) fecpVar2;
                        ekluVar4.b |= 2;
                        ekluVar4.d = true;
                        if (!fecpVar2.L()) {
                            v2.U();
                        }
                        fecp fecpVar3 = v2.b;
                        eklu ekluVar5 = (eklu) fecpVar3;
                        ekluVar5.b |= 4;
                        ekluVar5.e = true;
                        if (!fecpVar3.L()) {
                            v2.U();
                        }
                        fecp fecpVar4 = v2.b;
                        eklu ekluVar6 = (eklu) fecpVar4;
                        ekluVar6.b |= 8;
                        ekluVar6.f = z;
                        if (!fecpVar4.L()) {
                            v2.U();
                        }
                        fecp fecpVar5 = v2.b;
                        eklu ekluVar7 = (eklu) fecpVar5;
                        ekluVar7.b |= 16;
                        ekluVar7.g = z2;
                        if (!fecpVar5.L()) {
                            v2.U();
                        }
                        fecp fecpVar6 = v2.b;
                        eklu ekluVar8 = (eklu) fecpVar6;
                        ekluVar8.b |= 32;
                        ekluVar8.h = z3;
                        if (!fecpVar6.L()) {
                            v2.U();
                        }
                        eklu ekluVar9 = (eklu) v2.b;
                        ekluVar9.b |= 256;
                        ekluVar9.k = z4;
                        if (!c2.b.L()) {
                            c2.U();
                        }
                        JobParameters jobParameters2 = jobParameters;
                        akdx akdxVar2 = akdxVar;
                        ekhl ekhlVar3 = (ekhl) c2.b;
                        eklu ekluVar10 = (eklu) v2.Q();
                        ekhl ekhlVar4 = ekhl.a;
                        ekluVar10.getClass();
                        ekhlVar3.I = ekluVar10;
                        ekhlVar3.c |= 4;
                        akdxVar2.a((ekhl) c2.Q(), ekhk.GMS_BACKUP_RUN);
                        GmsBackupSchedulerChimeraService.c(gmsBackupSchedulerChimeraService);
                        gmsBackupSchedulerChimeraService.jobFinished(jobParameters2, false);
                    }
                });
                return true;
            }
            ahwdVar.j("Delaying job for %d seconds", Long.valueOf(fllq.b()));
            this.c.execute(new Runnable() { // from class: akdv
                @Override // java.lang.Runnable
                public final void run() {
                    PersistableBundle persistableBundle = new PersistableBundle();
                    GmsBackupSchedulerChimeraService gmsBackupSchedulerChimeraService = GmsBackupSchedulerChimeraService.this;
                    akdr b2 = akds.b(gmsBackupSchedulerChimeraService);
                    persistableBundle.putBoolean("delayed_job", true);
                    int a2 = GmsBackupSchedulerChimeraService.a(gmsBackupSchedulerChimeraService, GmsBackupSchedulerChimeraService.b(gmsBackupSchedulerChimeraService, b2).setMinimumLatency(TimeUnit.SECONDS.toMillis(fllq.b())).setExtras(persistableBundle).build());
                    boolean z = b2.a;
                    boolean z2 = b2.b;
                    boolean z3 = b2.c;
                    long b3 = fllq.b();
                    fecj c2 = ahwj.c();
                    fecj v2 = eklu.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fecp fecpVar = v2.b;
                    eklu ekluVar3 = (eklu) fecpVar;
                    ekluVar3.b |= 1;
                    ekluVar3.c = true;
                    if (!fecpVar.L()) {
                        v2.U();
                    }
                    fecp fecpVar2 = v2.b;
                    eklu ekluVar4 = (eklu) fecpVar2;
                    ekluVar4.b |= 2;
                    ekluVar4.d = true;
                    if (!fecpVar2.L()) {
                        v2.U();
                    }
                    fecp fecpVar3 = v2.b;
                    eklu ekluVar5 = (eklu) fecpVar3;
                    ekluVar5.b |= 4;
                    ekluVar5.e = false;
                    if (!fecpVar3.L()) {
                        v2.U();
                    }
                    fecp fecpVar4 = v2.b;
                    eklu ekluVar6 = (eklu) fecpVar4;
                    ekluVar6.b |= 8;
                    ekluVar6.f = z;
                    if (!fecpVar4.L()) {
                        v2.U();
                    }
                    fecp fecpVar5 = v2.b;
                    eklu ekluVar7 = (eklu) fecpVar5;
                    ekluVar7.b |= 16;
                    ekluVar7.g = z2;
                    if (!fecpVar5.L()) {
                        v2.U();
                    }
                    fecp fecpVar6 = v2.b;
                    eklu ekluVar8 = (eklu) fecpVar6;
                    ekluVar8.b |= 32;
                    ekluVar8.h = z3;
                    if (!fecpVar6.L()) {
                        v2.U();
                    }
                    fecp fecpVar7 = v2.b;
                    eklu ekluVar9 = (eklu) fecpVar7;
                    ekluVar9.b |= 64;
                    ekluVar9.i = b3;
                    if (!fecpVar7.L()) {
                        v2.U();
                    }
                    boolean z4 = a2 == 1;
                    eklu ekluVar10 = (eklu) v2.b;
                    ekluVar10.b |= 128;
                    ekluVar10.j = z4;
                    if (!c2.b.L()) {
                        c2.U();
                    }
                    akdx akdxVar2 = akdxVar;
                    ekhl ekhlVar3 = (ekhl) c2.b;
                    eklu ekluVar11 = (eklu) v2.Q();
                    ekhl ekhlVar4 = ekhl.a;
                    ekluVar11.getClass();
                    ekhlVar3.I = ekluVar11;
                    ekhlVar3.c |= 4;
                    akdxVar2.a((ekhl) c2.Q(), ekhk.GMS_BACKUP_RUN);
                }
            });
            return true;
        }
        ahwdVar.m("Backup is disabled, not running.", new Object[0]);
        fecj c2 = ahwj.c();
        fecj v2 = eklu.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        eklu ekluVar3 = (eklu) fecpVar;
        ekluVar3.b |= 1;
        ekluVar3.c = true;
        if (!fecpVar.L()) {
            v2.U();
        }
        eklu ekluVar4 = (eklu) v2.b;
        ekluVar4.b |= 2;
        ekluVar4.d = false;
        if (!c2.b.L()) {
            c2.U();
        }
        ekhl ekhlVar3 = (ekhl) c2.b;
        eklu ekluVar5 = (eklu) v2.Q();
        ekhl ekhlVar4 = ekhl.a;
        ekluVar5.getClass();
        ekhlVar3.I = ekluVar5;
        ekhlVar3.c |= 4;
        akdxVar.a((ekhl) c2.Q(), ekhk.GMS_BACKUP_RUN);
        return false;
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return this.d;
    }
}
