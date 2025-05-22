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
import defpackage.ajql;
import defpackage.ajwt;
import defpackage.ajwv;
import defpackage.ajww;
import defpackage.ajwz;
import defpackage.ameo;
import defpackage.amep;
import defpackage.ameu;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emzg;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.foci;
import defpackage.foda;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsBackupSchedulerChimeraService extends JobService {
    private final eqgo c = new aupz(1, 10);
    private boolean d = true;
    private static final ausn b = ausn.b("GmsBackupSchedulerChimeraService", auid.BACKUP);
    public static final ajwt a = new ajwt("GmsBackupScheduler");

    public static int a(Context context, JobInfo jobInfo) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        try {
            return foda.a.lK().B() ? jobScheduler.scheduleAsPackage(jobInfo, "com.google.android.gms", UserHandle.myUserId(), "GmsBackupSchedulerChimeraService") : jobScheduler.scheduleAsPackage(jobInfo, "com.google.android.gms.backup", UserHandle.myUserId(), "GmsBackupSchedulerChimeraService");
        } catch (Exception e) {
            a.g("", e, new Object[0]);
            ajww.a(b, e, foci.c());
            return 0;
        }
    }

    public static JobInfo.Builder b(Context context, ameo ameoVar) {
        return new JobInfo.Builder(1, new ComponentName(context, "com.google.android.gms.backup.component.GmsBackupSchedulerService")).setRequiresCharging(ameoVar.c).setRequiresDeviceIdle(ameoVar.b).setRequiredNetworkType(true != ameoVar.a ? 3 : 2);
    }

    public static void c(Context context) {
        long d = foda.a.lK().d();
        if (!foda.j()) {
            a.j("Disabled, not scheduling.", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.backup.component.GmsBackupSchedulerService");
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && resolveService.serviceInfo != null && JobService.PERMISSION_BIND.equals(resolveService.serviceInfo.permission)) {
                ameo b2 = amep.b(context);
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
        ajwt ajwtVar = a;
        ajwtVar.h("Hooray! Backup time!", new Object[0]);
        new ameu();
        if (!foda.j()) {
            ajwtVar.m("Disabled, not running and cancelling future jobs.", new Object[0]);
            fgrc c = ajwz.c();
            fgrc v = emzg.a.v();
            if (!v.b.L()) {
                v.U();
            }
            emzg emzgVar = (emzg) v.b;
            emzgVar.b |= 1;
            emzgVar.c = false;
            if (!c.b.L()) {
                c.U();
            }
            emux emuxVar = (emux) c.b;
            emzg emzgVar2 = (emzg) v.Q();
            emux emuxVar2 = emux.a;
            emzgVar2.getClass();
            emuxVar.I = emzgVar2;
            emuxVar.c |= 4;
            ajwv.a((emux) c.Q(), emuw.GMS_BACKUP_RUN);
            this.d = false;
            ((JobScheduler) getSystemService("jobscheduler")).cancel(1);
            return false;
        }
        if (new ajql(this).j()) {
            if (foda.b() <= 0 || Build.VERSION.SDK_INT >= 26 || jobParameters.getExtras().getBoolean("delayed_job", false)) {
                this.c.execute(new Runnable() { // from class: amet
                    @Override // java.lang.Runnable
                    public final void run() {
                        GmsBackupSchedulerChimeraService gmsBackupSchedulerChimeraService = GmsBackupSchedulerChimeraService.this;
                        ameo b2 = amep.b(gmsBackupSchedulerChimeraService);
                        boolean z = b2.a;
                        boolean z2 = b2.b;
                        boolean z3 = b2.c;
                        boolean z4 = b2.d;
                        ajhz ajhzVar = new ajhz();
                        ajhzVar.a = z;
                        ajhzVar.b = z3;
                        ajhzVar.c = z2;
                        ajhzVar.d = foda.h();
                        ajhzVar.e = z4;
                        ajhzVar.i = false;
                        ajwt ajwtVar2 = GmsBackupSchedulerChimeraService.a;
                        ajwtVar2.h("Requesting backup of all packages.", new Object[0]);
                        if (fodd.q()) {
                            ajwtVar2.h("Also running custom backups agents as part of scheduled backups", new Object[0]);
                            ajhzVar.g = true;
                        }
                        new ajla(gmsBackupSchedulerChimeraService).b(new BackUpNowConfig(ajhzVar));
                        fgrc c2 = ajwz.c();
                        fgrc v2 = emzg.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fgri fgriVar = v2.b;
                        emzg emzgVar3 = (emzg) fgriVar;
                        emzgVar3.b |= 1;
                        emzgVar3.c = true;
                        if (!fgriVar.L()) {
                            v2.U();
                        }
                        fgri fgriVar2 = v2.b;
                        emzg emzgVar4 = (emzg) fgriVar2;
                        emzgVar4.b |= 2;
                        emzgVar4.d = true;
                        if (!fgriVar2.L()) {
                            v2.U();
                        }
                        fgri fgriVar3 = v2.b;
                        emzg emzgVar5 = (emzg) fgriVar3;
                        emzgVar5.b |= 4;
                        emzgVar5.e = true;
                        if (!fgriVar3.L()) {
                            v2.U();
                        }
                        fgri fgriVar4 = v2.b;
                        emzg emzgVar6 = (emzg) fgriVar4;
                        emzgVar6.b |= 8;
                        emzgVar6.f = z;
                        if (!fgriVar4.L()) {
                            v2.U();
                        }
                        fgri fgriVar5 = v2.b;
                        emzg emzgVar7 = (emzg) fgriVar5;
                        emzgVar7.b |= 16;
                        emzgVar7.g = z2;
                        if (!fgriVar5.L()) {
                            v2.U();
                        }
                        fgri fgriVar6 = v2.b;
                        emzg emzgVar8 = (emzg) fgriVar6;
                        emzgVar8.b |= 32;
                        emzgVar8.h = z3;
                        if (!fgriVar6.L()) {
                            v2.U();
                        }
                        emzg emzgVar9 = (emzg) v2.b;
                        emzgVar9.b |= 256;
                        emzgVar9.k = z4;
                        if (!c2.b.L()) {
                            c2.U();
                        }
                        JobParameters jobParameters2 = jobParameters;
                        emux emuxVar3 = (emux) c2.b;
                        emzg emzgVar10 = (emzg) v2.Q();
                        emux emuxVar4 = emux.a;
                        emzgVar10.getClass();
                        emuxVar3.I = emzgVar10;
                        emuxVar3.c |= 4;
                        ajwv.a((emux) c2.Q(), emuw.GMS_BACKUP_RUN);
                        GmsBackupSchedulerChimeraService.c(gmsBackupSchedulerChimeraService);
                        gmsBackupSchedulerChimeraService.jobFinished(jobParameters2, false);
                    }
                });
                return true;
            }
            ajwtVar.j("Delaying job for %d seconds", Long.valueOf(foda.b()));
            this.c.execute(new Runnable() { // from class: ames
                @Override // java.lang.Runnable
                public final void run() {
                    PersistableBundle persistableBundle = new PersistableBundle();
                    GmsBackupSchedulerChimeraService gmsBackupSchedulerChimeraService = GmsBackupSchedulerChimeraService.this;
                    ameo b2 = amep.b(gmsBackupSchedulerChimeraService);
                    persistableBundle.putBoolean("delayed_job", true);
                    int a2 = GmsBackupSchedulerChimeraService.a(gmsBackupSchedulerChimeraService, GmsBackupSchedulerChimeraService.b(gmsBackupSchedulerChimeraService, b2).setMinimumLatency(TimeUnit.SECONDS.toMillis(foda.b())).setExtras(persistableBundle).build());
                    boolean z = b2.a;
                    boolean z2 = b2.b;
                    boolean z3 = b2.c;
                    long b3 = foda.b();
                    fgrc c2 = ajwz.c();
                    fgrc v2 = emzg.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fgri fgriVar = v2.b;
                    emzg emzgVar3 = (emzg) fgriVar;
                    emzgVar3.b |= 1;
                    emzgVar3.c = true;
                    if (!fgriVar.L()) {
                        v2.U();
                    }
                    fgri fgriVar2 = v2.b;
                    emzg emzgVar4 = (emzg) fgriVar2;
                    emzgVar4.b |= 2;
                    emzgVar4.d = true;
                    if (!fgriVar2.L()) {
                        v2.U();
                    }
                    fgri fgriVar3 = v2.b;
                    emzg emzgVar5 = (emzg) fgriVar3;
                    emzgVar5.b |= 4;
                    emzgVar5.e = false;
                    if (!fgriVar3.L()) {
                        v2.U();
                    }
                    fgri fgriVar4 = v2.b;
                    emzg emzgVar6 = (emzg) fgriVar4;
                    emzgVar6.b |= 8;
                    emzgVar6.f = z;
                    if (!fgriVar4.L()) {
                        v2.U();
                    }
                    fgri fgriVar5 = v2.b;
                    emzg emzgVar7 = (emzg) fgriVar5;
                    emzgVar7.b |= 16;
                    emzgVar7.g = z2;
                    if (!fgriVar5.L()) {
                        v2.U();
                    }
                    fgri fgriVar6 = v2.b;
                    emzg emzgVar8 = (emzg) fgriVar6;
                    emzgVar8.b |= 32;
                    emzgVar8.h = z3;
                    if (!fgriVar6.L()) {
                        v2.U();
                    }
                    fgri fgriVar7 = v2.b;
                    emzg emzgVar9 = (emzg) fgriVar7;
                    emzgVar9.b |= 64;
                    emzgVar9.i = b3;
                    if (!fgriVar7.L()) {
                        v2.U();
                    }
                    boolean z4 = a2 == 1;
                    emzg emzgVar10 = (emzg) v2.b;
                    emzgVar10.b |= 128;
                    emzgVar10.j = z4;
                    if (!c2.b.L()) {
                        c2.U();
                    }
                    emux emuxVar3 = (emux) c2.b;
                    emzg emzgVar11 = (emzg) v2.Q();
                    emux emuxVar4 = emux.a;
                    emzgVar11.getClass();
                    emuxVar3.I = emzgVar11;
                    emuxVar3.c |= 4;
                    ajwv.a((emux) c2.Q(), emuw.GMS_BACKUP_RUN);
                }
            });
            return true;
        }
        ajwtVar.m("Backup is disabled, not running.", new Object[0]);
        fgrc c2 = ajwz.c();
        fgrc v2 = emzg.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        emzg emzgVar3 = (emzg) fgriVar;
        emzgVar3.b |= 1;
        emzgVar3.c = true;
        if (!fgriVar.L()) {
            v2.U();
        }
        emzg emzgVar4 = (emzg) v2.b;
        emzgVar4.b |= 2;
        emzgVar4.d = false;
        if (!c2.b.L()) {
            c2.U();
        }
        emux emuxVar3 = (emux) c2.b;
        emzg emzgVar5 = (emzg) v2.Q();
        emux emuxVar4 = emux.a;
        emzgVar5.getClass();
        emuxVar3.I = emzgVar5;
        emuxVar3.c |= 4;
        ajwv.a((emux) c2.Q(), emuw.GMS_BACKUP_RUN);
        return false;
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return this.d;
    }
}
