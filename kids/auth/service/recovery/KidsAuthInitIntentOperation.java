package com.google.android.gms.kids.auth.service.recovery;

import android.content.Intent;
import com.google.android.gms.kids.auth.tasks.PeriodicHealthMetricsBoundService;
import defpackage.anya;
import defpackage.asot;
import defpackage.bota;
import defpackage.boxi;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.ejhf;
import defpackage.fphp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class KidsAuthInitIntentOperation extends anya {
    private static final asot a = bota.a("KidsAuthInitIntentOperation");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        fvbo.f(intent, "intent");
        if (fphp.a.a().d()) {
            ((ejhf) a.h()).B("Received intent to recover supervision setup: %s", intent.getAction());
            new boxi(this).a();
        }
        if (fphp.a.a().f()) {
            String str = PeriodicHealthMetricsBoundService.a;
            byko bykoVar = new byko();
            bykoVar.w(PeriodicHealthMetricsBoundService.a);
            bykoVar.a = bykv.m;
            bykoVar.q("PERIODIC_HEALTH_METRICS_TASK");
            bykoVar.l(false);
            byjl.a(this).f(bykoVar.b());
        }
    }
}
