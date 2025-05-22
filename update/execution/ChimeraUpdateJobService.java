package com.google.android.gms.update.execution;

import android.app.job.JobParameters;
import android.os.SystemClock;
import com.google.android.chimera.JobService;
import defpackage.auad;
import defpackage.bjmq;
import defpackage.djrd;
import defpackage.djru;
import defpackage.djuz;
import defpackage.eixs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ChimeraUpdateJobService extends JobService {
    public static final auad a = djuz.e("UpdateJobService");
    public static final Object b = new Object();
    private bjmq c;
    private long d;

    private final bjmq a() {
        if (this.c == null) {
            this.c = new bjmq(this, getClass(), 29);
        }
        return this.c;
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a.d("onStartJob", new Object[0]);
        this.d = SystemClock.elapsedRealtime();
        eixs k = a().k("onStartJob");
        try {
            synchronized (b) {
            }
            startService(djru.d(this));
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
        eixs k = a().k("onStopJob");
        try {
            synchronized (b) {
            }
            ((djrd) djrd.b.b()).a(115);
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
