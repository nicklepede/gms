package com.google.android.gms.cobalt.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.eluo;
import defpackage.fpbe;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CobaltModuleInitIntentOperation extends apzs {
    private static final ausn a = ausn.b("CobaltLoggerImpl", auid.COBALT);

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ((eluo) ((eluo) a.h()).ai((char) 3120)).z("CobaltModuleInitIntentOperation: %s", i);
        if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        casd a2 = casd.a(this);
        if (!fpbe.a.lK().j()) {
            ((eluo) ((eluo) ObservationGenerationTask.a.h()).ai((char) 3121)).x("Cancelling Cobalt Observation Generation task");
            a2.d("ObservationGenerationTask.Periodic", ".cobalt.service.ObservationGenerationTask");
            return;
        }
        ((eluo) ((eluo) ObservationGenerationTask.a.h()).ai(3122)).A("Scheduling Cobalt Observation Generation task to run every %s hours", fpbe.b());
        cate cateVar = new cate();
        cateVar.w(".cobalt.service.ObservationGenerationTask");
        cateVar.t("ObservationGenerationTask.Periodic");
        cateVar.v(2);
        cateVar.j(cata.a(TimeUnit.HOURS.toSeconds(fpbe.b())));
        cateVar.y(2, 2);
        cateVar.x(0, 1);
        cateVar.f(0, 1);
        a2.f(cateVar.b());
    }
}
