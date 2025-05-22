package com.google.android.gms.chimera.container;

import android.app.job.JobParameters;
import com.google.android.chimera.JobService;
import com.google.android.gms.chimera.container.AutomotiveJobChimeraService;
import defpackage.aqaj;
import defpackage.auid;
import defpackage.ausn;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.eixb;
import defpackage.eizp;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutomotiveJobChimeraService extends JobService {
    static {
        ausn.b("AutomotiveJobChimera", auid.CONTAINER);
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        eixb e = eizp.e("com/google/android/gms/chimera/container/AutomotiveJobChimeraService", "onStartJob", 39, "startAutomotiveJobService");
        try {
            final aqaj aqajVar = new aqaj(this, jobParameters);
            caqb.b.b(caqh.HIGH_SPEED).execute(new Runnable() { // from class: aqai
                @Override // java.lang.Runnable
                public final void run() {
                    aqas.a(AutomotiveJobChimeraService.this.getApplicationContext()).g(7, aqajVar, null, new ArrayList());
                }
            });
            e.close();
            return true;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        eizp.e("com/google/android/gms/chimera/container/AutomotiveJobChimeraService", "onStopJob", 74, "stopAutomotiveJobService").close();
        return false;
    }
}
