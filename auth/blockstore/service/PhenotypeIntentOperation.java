package com.google.android.gms.auth.blockstore.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import com.google.android.gms.auth.blockstore.service.metrics.LocalStorageUsageLoggingTaskService;
import defpackage.accc;
import defpackage.ausj;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fnmw;
import defpackage.fnne;
import defpackage.fnnh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhenotypeIntentOperation extends IntentOperation {
    private static final ausn a = accc.b("PhenotypeIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!ausj.c(fnmw.d())) {
            ((eluo) a.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        if (!"com.google.android.gms.phenotype.com.google.android.gms.auth.blockstore.COMMITTED".equals(intent.getAction())) {
            ((eluo) a.h()).x("Not a Phenotype event that Blockstore needs to handle. Skipping.");
            return;
        }
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).x("Blockstore feature flags are updated.");
        if (fnne.e()) {
            ((eluo) ausnVar.h()).x("Scheduling periodic backup task to reflect the config changes from feature flags.");
            CloudSyncBackupTaskService.d(this);
        }
        if (fnnh.i()) {
            LocalStorageUsageLoggingTaskService.d(this);
        }
    }
}
