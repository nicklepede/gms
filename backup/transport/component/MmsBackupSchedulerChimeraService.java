package com.google.android.gms.backup.transport.component;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.JobService;
import com.google.android.gms.backup.transport.component.MmsBackupSchedulerChimeraService;
import defpackage.ahwd;
import defpackage.ahwg;
import defpackage.aiee;
import defpackage.ajgv;
import defpackage.arni;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.ensv;
import defpackage.flky;
import defpackage.flmm;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MmsBackupSchedulerChimeraService extends JobService {
    private final ensv c = new asmf(1, 10);
    private final boolean d = true;
    private aiee e;
    private static final asot b = asot.b("MmsBackupSchedulerChimeraService", asej.BACKUP);
    public static final ahwd a = new ahwd("MmsBackupScheduler");

    public static void a(Context context) {
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(2);
    }

    public static void b(Context context) {
        if (flmm.P() && flmm.O()) {
            a.j("Ineligible, not scheduling.", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.backup.component.MmsBackupSchedulerService");
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && resolveService.serviceInfo != null && JobService.PERMISSION_BIND.equals(resolveService.serviceInfo.permission)) {
                try {
                    if (((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2, new ComponentName(context, "com.google.android.gms.backup.component.MmsBackupSchedulerService")).setMinimumLatency(TimeUnit.MINUTES.toMillis(flmm.g())).setRequiresCharging(flmm.u()).setRequiresDeviceIdle(flmm.v()).setRequiredNetworkType(true != c(context) ? 3 : 2).build()) == 1) {
                        a.j("Scheduled task to run in %d minutes, while idle: %b, require charging: %b, require wifi: %b", Long.valueOf(flmm.g()), Boolean.valueOf(flmm.v()), Boolean.valueOf(flmm.u()), Boolean.valueOf(c(context)));
                        return;
                    }
                } catch (Exception e) {
                    a.g("", e, new Object[0]);
                    ahwg.a(b, e, flky.c());
                }
                a.j("Error scheduling job.", new Object[0]);
                return;
            }
        }
        a.j("Ineligible, not scheduling.", new Object[0]);
    }

    private static boolean c(Context context) {
        return flmm.a.a().K() || !new arni(context, "g1_shared_prefs", true).getBoolean("use_mobile_data_for_mms", false);
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        if (flmm.P() && flmm.O()) {
            return false;
        }
        a.j("Hooray! Backup Mms time!", new Object[0]);
        if (flmm.J()) {
            ajgv ajgvVar = ajgv.a;
            long j = Settings.Secure.getLong(getContentResolver(), "scheduled_mms_backup_last_requested", 0L);
            r1 = j > 0 ? System.currentTimeMillis() - j : 0L;
            Settings.Secure.putLong(getContentResolver(), "scheduled_mms_backup_last_requested", System.currentTimeMillis());
        }
        if (this.e == null) {
            this.e = new aiee(this);
        }
        this.e.m(2, r1 / 1000);
        this.c.execute(new Runnable() { // from class: akdy
            @Override // java.lang.Runnable
            public final void run() {
                MmsBackupSchedulerChimeraService mmsBackupSchedulerChimeraService = MmsBackupSchedulerChimeraService.this;
                MmsBackupSchedulerChimeraService.b(mmsBackupSchedulerChimeraService);
                MmsBackupSchedulerChimeraService.a.j("Requesting backup of mms.", new Object[0]);
                Intent intent = new Intent();
                intent.setClassName(mmsBackupSchedulerChimeraService, "com.google.android.gms.backup.mms.MmsBackupService");
                mmsBackupSchedulerChimeraService.startService(intent);
                mmsBackupSchedulerChimeraService.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return this.d;
    }
}
