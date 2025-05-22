package com.google.android.gms.scheduler;

import android.app.job.JobParameters;
import android.os.Trace;
import android.util.Log;
import com.google.android.chimera.JobService;
import defpackage.dall;
import defpackage.dant;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TaskExecutionChimeraService extends JobService {
    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final dant dantVar = dall.b().e;
        if (dantVar == null) {
            Log.w("NetworkScheduler", String.format("Dropping incoming job (jid=%d) because JobServiceRegistry is null", Integer.valueOf(jobParameters.getJobId())));
            return false;
        }
        dantVar.f.execute(new Runnable() { // from class: dano
            /* JADX WARN: Code restructure failed: missing block: B:54:0x006f, code lost:
            
                r2 = r6.getTriggeredContentUris();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 255
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dano.run():void");
            }
        });
        return true;
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStopJob(final JobParameters jobParameters) {
        final dant dantVar = dall.b().e;
        if (dantVar == null) {
            return false;
        }
        dantVar.f.execute(new Runnable() { // from class: danp
            @Override // java.lang.Runnable
            public final void run() {
                JobParameters jobParameters2 = jobParameters;
                new cauk("nts:jobscheduler:onStopJob:" + jobParameters2.getJobId());
                dant dantVar2 = dant.this;
                try {
                    danm danmVar = dantVar2.a;
                    synchronized (danmVar) {
                        cavg b = dant.b(jobParameters2);
                        if (b == null) {
                            dantVar2.b.c(jobParameters2.getJobId());
                        } else {
                            dalw m = danmVar.m(b);
                            if (m == null) {
                                Log.w("NetworkScheduler", "Received onStopJob for unknown task (jid=" + jobParameters2.getJobId() + "), ignoring");
                                dantVar2.b.c(jobParameters2.getJobId());
                            } else {
                                buy buyVar = dantVar2.h;
                                dans dansVar = (dans) buyVar.get(m);
                                if (dansVar == null) {
                                    Log.w("NetworkScheduler", "Received onStopJob for untracked task (jid=" + jobParameters2.getJobId() + "), ignoring");
                                    dantVar2.b.c(jobParameters2.getJobId());
                                } else if (!m.q) {
                                    dantVar2.e.l(m, 3);
                                    if (dantVar2.c.d(dansVar.c, 4)) {
                                        buyVar.remove(m);
                                    } else {
                                        dansVar.a = false;
                                    }
                                }
                            }
                        }
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        return true;
    }
}
