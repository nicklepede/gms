package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.apen;
import defpackage.appy;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialInvalidationService extends GmsTaskBoundService {
    private static final asot a = asot.b("CredentialInvalidationService", asej.CHROME_SYNC);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            ((ejhf) a.i()).x("WearInvalidationSyncSchedule: no extra received when running the task.");
            return 2;
        }
        Intent putExtras = new Intent().putExtras(bundle);
        fvbo.e(putExtras, "putExtras(...)");
        try {
            asot asotVar = SyncIntentOperation.a;
            startService(appy.a(getApplicationContext(), putExtras));
            return 0;
        } catch (apen e) {
            ((ejhf) ((ejhf) a.i()).s(e)).x("WearInvalidationSyncSchedule: Error in creating sync intent.");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        fvbo.f(context, "base");
        super.attachBaseContext(context);
    }
}
