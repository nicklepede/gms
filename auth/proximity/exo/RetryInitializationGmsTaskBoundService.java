package com.google.android.gms.auth.proximity.exo;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arxo;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
class RetryInitializationGmsTaskBoundService extends GmsTaskBoundService {
    RetryInitializationGmsTaskBoundService() {
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        arxo arxoVar = ExoChimeraService.a;
        startService(new Intent().setClassName(this, "com.google.android.gms.auth.proximity.exo.ExoService").putExtra("com.google.android.gms.auth.proximity.exo.extra.ORIGIN", "Retry device fetch failure"));
        return 0;
    }
}
