package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ahwd;
import defpackage.flmm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MmsBackupSchedulerIntentOperation extends IntentOperation {
    private static final ahwd a = new ahwd("MmsBackupSchedulerIO");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (flmm.P() && flmm.O()) {
            MmsBackupSchedulerChimeraService.a(this);
            return;
        }
        if (intent == null) {
            return;
        }
        if ("com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED".equals(intent.getAction())) {
            MmsBackupSchedulerChimeraService.b(this);
        } else if (flmm.a.a().aB() && "com.google.android.gms.backup.ACTION_MMS_BACKUP_DISABLED".equals(intent.getAction())) {
            MmsBackupSchedulerChimeraService.a(this);
        } else {
            a.m("Intent not supported", new Object[0]);
        }
    }
}
