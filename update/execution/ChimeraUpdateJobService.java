package com.google.android.gms.update.execution;

import android.app.job.JobParameters;
import android.os.SystemClock;
import com.google.android.chimera.JobService;
import defpackage.arxo;
import defpackage.bhib;
import defpackage.dhfx;
import defpackage.dhgo;
import defpackage.dhjt;
import defpackage.egkp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChimeraUpdateJobService extends JobService {
    public static final arxo a = dhjt.e("UpdateJobService");
    public static final Object b = new Object();
    private bhib c;
    private long d;

    private final bhib a() {
        if (this.c == null) {
            this.c = new bhib(this, getClass(), 29);
        }
        return this.c;
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a.d("onStartJob", new Object[0]);
        this.d = SystemClock.elapsedRealtime();
        egkp k = a().k("onStartJob");
        try {
            synchronized (b) {
            }
            startService(dhgo.d(this));
            if (k == null) {
                return true;
            }
            k.close();
            return true;
        } catch (Throwable th) {
            if (k != null) {
                try {
                    k.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        a.d("onStopJob: runtime=%d", Long.valueOf(SystemClock.elapsedRealtime() - this.d));
        egkp k = a().k("onStopJob");
        try {
            synchronized (b) {
            }
            ((dhfx) dhfx.b.b()).a(115);
            if (k != null) {
                k.close();
            }
            return false;
        } catch (Throwable th) {
            if (k != null) {
                try {
                    k.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
