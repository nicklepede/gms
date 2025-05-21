package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.byln;
import defpackage.cdoq;
import defpackage.cdqa;
import defpackage.cduk;
import defpackage.cdul;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ChimeraPackageMeasurementTaskService extends GmsTaskChimeraService implements cduk {
    private cdul a;

    private final cdul d() {
        if (this.a == null) {
            this.a = new cdul(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if (str.hashCode() == 1395561816 && str.equals("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG")) {
            final cdqa i = cdqa.i(this);
            final cdoq aJ = i.aJ();
            if (i.e.a) {
                aJ.k.a("Device ChimeraPackageMeasurementTaskService called.");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                synchronized (atomicBoolean) {
                    d().d(new Runnable() { // from class: cdfx
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (cdqa.this.e.a) {
                                cdoq cdoqVar = aJ;
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                cdoqVar.k.a("ChimeraPackageMeasurementTaskService processed last upload request.");
                                synchronized (atomicBoolean2) {
                                    atomicBoolean2.set(true);
                                    atomicBoolean2.notify();
                                }
                            }
                        }
                    });
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = 30000 + currentTimeMillis;
                        while (!atomicBoolean.get() && currentTimeMillis < j) {
                            atomicBoolean.wait(j - currentTimeMillis);
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    } catch (InterruptedException unused) {
                        aJ.f.a("Interrupted in onRunTask while uploading");
                        return 0;
                    }
                }
                return 0;
            }
            aJ.c.a("TaskService called on client side.");
        }
        return 2;
    }

    @Override // defpackage.cduk
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cduk
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cduk
    public final void il(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        d().b();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        d().c();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        d();
        cdul.e(intent);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        d();
        cdul.g(intent);
        super.onUnbind(intent);
        return false;
    }
}
