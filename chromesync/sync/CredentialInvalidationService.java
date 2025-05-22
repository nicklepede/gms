package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arhe;
import defpackage.arsp;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CredentialInvalidationService extends GmsTaskBoundService {
    private static final ausn a = ausn.b("CredentialInvalidationService", auid.CHROME_SYNC);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Bundle bundle = caufVar.b;
        if (bundle == null) {
            ((eluo) a.i()).x("WearInvalidationSyncSchedule: no extra received when running the task.");
            return 2;
        }
        Intent putExtras = new Intent().putExtras(bundle);
        fxxm.e(putExtras, "putExtras(...)");
        try {
            ausn ausnVar = SyncIntentOperation.a;
            startService(arsp.a(getApplicationContext(), putExtras));
            return 0;
        } catch (arhe e) {
            ((eluo) ((eluo) a.i()).s(e)).x("WearInvalidationSyncSchedule: Error in creating sync intent.");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        fxxm.f(context, "base");
        super.attachBaseContext(context);
    }
}
