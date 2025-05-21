package com.google.android.gms.gmscompliance.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.gmscompliance.sync.BackgroundSyncGmsTaskService;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.foko;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ModuleInitializer extends anya {
    static {
        asot.b("GmsComplianceModuleInit", asej.GMS_COMPLIANCE);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (foko.c()) {
            Context applicationContext = getApplicationContext();
            int i2 = BackgroundSyncGmsTaskService.c;
            byjl a = byjl.a(applicationContext);
            if (!foko.d()) {
                BackgroundSyncGmsTaskService.e(a);
                return;
            }
            foko fokoVar = foko.a;
            a.f(BackgroundSyncGmsTaskService.d("compliant_sync", TimeUnit.DAYS.toSeconds(Math.max(3L, fokoVar.a().b())), foko.a.a().h()));
            a.f(BackgroundSyncGmsTaskService.d("noncompliant_sync", TimeUnit.HOURS.toSeconds(Math.max(1L, fokoVar.a().c())), false));
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
    }
}
