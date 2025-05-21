package com.google.android.gms.vision.clearcut;

import android.content.Context;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.diby;
import defpackage.dibz;
import defpackage.evah;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService executor = byhj.b.e(2, byhp.LOW_POWER);
    private dibz logLimiter = new dibz();
    private VisionClearcutLogger logger;

    public DynamiteClearcutLogger(Context context) {
        this.logger = new VisionClearcutLogger(context);
    }

    public void logEvent(int i, evah evahVar) {
        if (i == 3) {
            dibz dibzVar = this.logLimiter;
            synchronized (dibzVar.b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (dibzVar.c + dibzVar.a > currentTimeMillis) {
                    return;
                }
                dibzVar.c = currentTimeMillis;
                i = 3;
            }
        }
        executor.execute(new diby(this, i, evahVar));
    }

    DynamiteClearcutLogger(VisionClearcutLogger visionClearcutLogger) {
        this.logger = visionClearcutLogger;
    }
}
