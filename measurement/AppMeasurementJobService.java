package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import defpackage.arwm;
import defpackage.cdge;
import defpackage.cdgq;
import defpackage.cdnn;
import defpackage.cdoq;
import defpackage.cduk;
import defpackage.cdul;
import defpackage.cdvv;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class AppMeasurementJobService extends JobService implements cduk {
    private cdul a;

    private final cdul d() {
        if (this.a == null) {
            this.a = new cdul(this);
        }
        return this.a;
    }

    @Override // defpackage.cduk
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cduk
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
        cdul.e(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final cdul d = d();
        String string = jobParameters.getExtras().getString("action");
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            arwm.s(string);
            cdvv z = cdvv.z(d.a);
            final cdoq aJ = z.aJ();
            if (z.n().a) {
                aJ.k.b("Device PackageMeasurementJobService called. action", string);
            } else {
                aJ.k.b("Local AppMeasurementJobService called. action", string);
            }
            cdul.h(z, new Runnable() { // from class: cdui
                @Override // java.lang.Runnable
                public final void run() {
                    aJ.k.a("AppMeasurementJobService processed last upload request.");
                    ((cduk) cdul.this.a).c(jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        arwm.s(string);
        Context context = d.a;
        if (cdgq.a == null) {
            synchronized (cdgq.class) {
                if (cdgq.a == null) {
                    cdgq.a = new cdgq(context);
                }
            }
        }
        cdgq cdgqVar = cdgq.a;
        if (!((Boolean) cdnn.aG.a()).booleanValue()) {
            return true;
        }
        cdgqVar.b(new cdge(cdgqVar, new Runnable() { // from class: cdug
            @Override // java.lang.Runnable
            public final void run() {
                ((cduk) cdul.this.a).c(jobParameters);
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
        cdul.g(intent);
        return true;
    }

    @Override // defpackage.cduk
    public final void il(Intent intent) {
    }
}
