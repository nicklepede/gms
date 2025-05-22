package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.cauf;
import defpackage.cfxn;
import defpackage.cfyy;
import defpackage.cgdi;
import defpackage.cgdj;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ChimeraPackageMeasurementTaskService extends GmsTaskChimeraService implements cgdi {
    private cgdj a;

    private final cgdj d() {
        if (this.a == null) {
            this.a = new cgdj(this);
        }
        return this.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (str.hashCode() == 1395561816 && str.equals("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG")) {
            final cfyy i = cfyy.i(this);
            final cfxn aK = i.aK();
            if (i.d.a) {
                aK.k.a("Device ChimeraPackageMeasurementTaskService called.");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                synchronized (atomicBoolean) {
                    d().d(new Runnable() { // from class: cfow
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (cfyy.this.d.a) {
                                cfxn cfxnVar = aK;
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                cfxnVar.k.a("ChimeraPackageMeasurementTaskService processed last upload request.");
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
                        aK.f.a("Interrupted in onRunTask while uploading");
                        return 0;
                    }
                }
                return 0;
            }
            aK.c.a("TaskService called on client side.");
        }
        return 2;
    }

    @Override // defpackage.cgdi
    public final boolean b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cgdi
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cgdi
    public final void iA(Intent intent) {
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
        cgdj.e(intent);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        d();
        cgdj.g(intent);
        super.onUnbind(intent);
        return false;
    }
}
