package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import defpackage.atzb;
import defpackage.cfpd;
import defpackage.cfpp;
import defpackage.cfwk;
import defpackage.cfxn;
import defpackage.cgdi;
import defpackage.cgdj;
import defpackage.cgev;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class AppMeasurementJobService extends JobService implements cgdi {
    private cgdj a;

    private final cgdj d() {
        if (this.a == null) {
            this.a = new cgdj(this);
        }
        return this.a;
    }

    @Override // defpackage.cgdi
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cgdi
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().c();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        cgdj.e(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final cgdj d = d();
        String string = jobParameters.getExtras().getString("action");
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            atzb.s(string);
            cgev z = cgev.z(d.a);
            final cfxn aK = z.aK();
            if (z.n().a) {
                aK.k.b("Device PackageMeasurementJobService called. action", string);
            } else {
                aK.k.b("Local AppMeasurementJobService called. action", string);
            }
            cgdj.h(z, new Runnable() { // from class: cgdg
                @Override // java.lang.Runnable
                public final void run() {
                    aK.k.a("AppMeasurementJobService processed last upload request.");
                    ((cgdi) cgdj.this.a).c(jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        atzb.s(string);
        Context context = d.a;
        if (cfpp.a == null) {
            synchronized (cfpp.class) {
                if (cfpp.a == null) {
                    cfpp.a = new cfpp(context);
                }
            }
        }
        cfpp cfppVar = cfpp.a;
        if (!((Boolean) cfwk.aF.a()).booleanValue()) {
            return true;
        }
        cfppVar.b(new cfpd(cfppVar, new Runnable() { // from class: cgde
            @Override // java.lang.Runnable
            public final void run() {
                ((cgdi) cgdj.this.a).c(jobParameters);
            }
        }));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        cgdj.g(intent);
        return true;
    }

    @Override // defpackage.cgdi
    public final void iA(Intent intent) {
    }
}
