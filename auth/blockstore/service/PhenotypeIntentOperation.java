package com.google.android.gms.auth.blockstore.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import com.google.android.gms.auth.blockstore.service.metrics.LocalStorageUsageLoggingTaskService;
import defpackage.aacc;
import defpackage.asop;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fkvs;
import defpackage.fkwa;
import defpackage.fkwd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhenotypeIntentOperation extends IntentOperation {
    private static final asot a = aacc.b("PhenotypeIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!asop.c(fkvs.d())) {
            ((ejhf) a.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        if (!"com.google.android.gms.phenotype.com.google.android.gms.auth.blockstore.COMMITTED".equals(intent.getAction())) {
            ((ejhf) a.h()).x("Not a Phenotype event that Blockstore needs to handle. Skipping.");
            return;
        }
        asot asotVar = a;
        ((ejhf) asotVar.h()).x("Blockstore feature flags are updated.");
        if (fkwa.e()) {
            ((ejhf) asotVar.h()).x("Scheduling periodic backup task to reflect the config changes from feature flags.");
            CloudSyncBackupTaskService.d(this);
        }
        if (fkwd.i()) {
            LocalStorageUsageLoggingTaskService.d(this);
        }
    }
}
