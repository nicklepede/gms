package com.google.android.gms.vision.clearcut;

import android.content.Context;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.dknj;
import defpackage.dknk;
import defpackage.exqa;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService executor = caqb.b.e(2, caqh.LOW_POWER);
    private dknk logLimiter = new dknk();
    private VisionClearcutLogger logger;

    public DynamiteClearcutLogger(Context context) {
        this.logger = new VisionClearcutLogger(context);
    }

    public void logEvent(int i, exqa exqaVar) {
        if (i == 3) {
            dknk dknkVar = this.logLimiter;
            synchronized (dknkVar.b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (dknkVar.c + dknkVar.a > currentTimeMillis) {
                    return;
                }
                dknkVar.c = currentTimeMillis;
                i = 3;
            }
        }
        executor.execute(new dknj(this, i, exqaVar));
    }

    DynamiteClearcutLogger(VisionClearcutLogger visionClearcutLogger) {
        this.logger = visionClearcutLogger;
    }
}
