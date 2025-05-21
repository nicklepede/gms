package com.google.android.gms.scheduler;

import android.app.job.JobParameters;
import android.os.Trace;
import android.util.Log;
import com.google.android.chimera.JobService;
import defpackage.cybn;
import defpackage.cydv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TaskExecutionChimeraService extends JobService {
    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final cydv cydvVar = cybn.b().e;
        if (cydvVar == null) {
            Log.w("NetworkScheduler", String.format("Dropping incoming job (jid=%d) because JobServiceRegistry is null", Integer.valueOf(jobParameters.getJobId())));
            return false;
        }
        cydvVar.f.execute(new Runnable() { // from class: cydq
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cydq.run():void");
            }
        });
        return true;
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStopJob(final JobParameters jobParameters) {
        final cydv cydvVar = cybn.b().e;
        if (cydvVar == null) {
            return false;
        }
        cydvVar.f.execute(new Runnable() { // from class: cydr
            @Override // java.lang.Runnable
            public final void run() {
                JobParameters jobParameters2 = jobParameters;
                new byls("nts:jobscheduler:onStopJob:" + jobParameters2.getJobId());
                cydv cydvVar2 = cydv.this;
                try {
                    cydo cydoVar = cydvVar2.a;
                    synchronized (cydoVar) {
                        bymo b = cydv.b(jobParameters2);
                        if (b == null) {
                            cydvVar2.b.c(jobParameters2.getJobId());
                        } else {
                            cyby m = cydoVar.m(b);
                            if (m == null) {
                                Log.w("NetworkScheduler", "Received onStopJob for unknown task (jid=" + jobParameters2.getJobId() + "), ignoring");
                                cydvVar2.b.c(jobParameters2.getJobId());
                            } else {
                                bul bulVar = cydvVar2.h;
                                cydu cyduVar = (cydu) bulVar.get(m);
                                if (cyduVar == null) {
                                    Log.w("NetworkScheduler", "Received onStopJob for untracked task (jid=" + jobParameters2.getJobId() + "), ignoring");
                                    cydvVar2.b.c(jobParameters2.getJobId());
                                } else if (!m.q) {
                                    cydvVar2.e.l(m, 3);
                                    if (cydvVar2.c.d(cyduVar.c, 4)) {
                                        bulVar.remove(m);
                                    } else {
                                        cyduVar.a = false;
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
