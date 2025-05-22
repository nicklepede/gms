package com.google.android.gms.auth.proximity.exo;

import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auad;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
class RetryInitializationGmsTaskBoundService extends GmsTaskBoundService {
    RetryInitializationGmsTaskBoundService() {
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        auad auadVar = ExoChimeraService.a;
        startService(new Intent().setClassName(this, "com.google.android.gms.auth.proximity.exo.ExoService").putExtra("com.google.android.gms.auth.proximity.exo.extra.ORIGIN", "Retry device fetch failure"));
        return 0;
    }
}
