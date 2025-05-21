package com.google.android.gms.cobalt.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.ejhf;
import defpackage.fmjp;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CobaltModuleInitIntentOperation extends anya {
    private static final asot a = asot.b("CobaltLoggerImpl", asej.COBALT);

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        ((ejhf) ((ejhf) a.h()).ah((char) 3116)).z("CobaltModuleInitIntentOperation: %s", i);
        if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        byjl a2 = byjl.a(this);
        if (!fmjp.a.a().j()) {
            ((ejhf) ((ejhf) ObservationGenerationTask.a.h()).ah((char) 3117)).x("Cancelling Cobalt Observation Generation task");
            a2.d("ObservationGenerationTask.Periodic", ".cobalt.service.ObservationGenerationTask");
            return;
        }
        ((ejhf) ((ejhf) ObservationGenerationTask.a.h()).ah(3118)).A("Scheduling Cobalt Observation Generation task to run every %s hours", fmjp.b());
        bykm bykmVar = new bykm();
        bykmVar.w(".cobalt.service.ObservationGenerationTask");
        bykmVar.t("ObservationGenerationTask.Periodic");
        bykmVar.v(2);
        bykmVar.j(byki.a(TimeUnit.HOURS.toSeconds(fmjp.b())));
        bykmVar.y(2, 2);
        bykmVar.x(0, 1);
        bykmVar.f(0, 1);
        a2.f(bykmVar.b());
    }
}
