package com.google.android.gms.gmscompliance.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.gmscompliance.sync.BackgroundSyncGmsTaskService;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.frde;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ModuleInitializer extends apzs {
    static {
        ausn.b("GmsComplianceModuleInit", auid.GMS_COMPLIANCE);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (frde.c()) {
            Context applicationContext = getApplicationContext();
            int i2 = BackgroundSyncGmsTaskService.c;
            casd a = casd.a(applicationContext);
            if (!frde.d()) {
                BackgroundSyncGmsTaskService.e(a);
                return;
            }
            frde frdeVar = frde.a;
            a.f(BackgroundSyncGmsTaskService.d("compliant_sync", TimeUnit.DAYS.toSeconds(Math.max(3L, frdeVar.lK().b())), frdeVar.lK().h()));
            a.f(BackgroundSyncGmsTaskService.d("noncompliant_sync", TimeUnit.HOURS.toSeconds(Math.max(1L, frdeVar.lK().c())), false));
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
    }
}
