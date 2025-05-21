package com.google.android.gms.chimera.container;

import android.app.job.JobParameters;
import com.google.android.chimera.JobService;
import com.google.android.gms.chimera.container.AutomotiveJobChimeraService;
import defpackage.anyr;
import defpackage.asej;
import defpackage.asot;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.egjy;
import defpackage.egmm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutomotiveJobChimeraService extends JobService {
    static {
        asot.b("AutomotiveJobChimera", asej.CONTAINER);
    }

    @Override // com.google.android.chimera.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        egjy e = egmm.e("com/google/android/gms/chimera/container/AutomotiveJobChimeraService", "onStartJob", 39, "startAutomotiveJobService");
        try {
            final anyr anyrVar = new anyr(this, jobParameters);
            byhj.b.b(byhp.HIGH_SPEED).execute(new Runnable() { // from class: anyq
                @Override // java.lang.Runnable
                public final void run() {
                    anza.a(AutomotiveJobChimeraService.this.getApplicationContext()).g(7, anyrVar, null, new ArrayList());
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
        egmm.e("com/google/android/gms/chimera/container/AutomotiveJobChimeraService", "onStopJob", 74, "stopAutomotiveJobService").close();
        return false;
    }
}
