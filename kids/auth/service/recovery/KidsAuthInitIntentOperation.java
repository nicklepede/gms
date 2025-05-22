package com.google.android.gms.kids.auth.service.recovery;

import android.content.Intent;
import com.google.android.gms.kids.auth.tasks.PeriodicHealthMetricsBoundService;
import defpackage.apzs;
import defpackage.ausn;
import defpackage.braq;
import defpackage.brey;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.eluo;
import defpackage.fsbd;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class KidsAuthInitIntentOperation extends apzs {
    private static final ausn a = braq.a("KidsAuthInitIntentOperation");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        fxxm.f(intent, "intent");
        fsbd fsbdVar = fsbd.a;
        if (fsbdVar.lK().d()) {
            ((eluo) a.h()).B("Received intent to recover supervision setup: %s", intent.getAction());
            new brey(this).a();
        }
        if (fsbdVar.lK().f()) {
            String str = PeriodicHealthMetricsBoundService.a;
            catg catgVar = new catg();
            catgVar.w(PeriodicHealthMetricsBoundService.a);
            catgVar.a = catn.m;
            catgVar.q("PERIODIC_HEALTH_METRICS_TASK");
            catgVar.l(false);
            casd.a(this).f(catgVar.b());
        }
    }
}
