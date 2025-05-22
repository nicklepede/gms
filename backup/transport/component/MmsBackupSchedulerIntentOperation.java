package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ajwt;
import defpackage.fodw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class MmsBackupSchedulerIntentOperation extends IntentOperation {
    private static final ajwt a = new ajwt("MmsBackupSchedulerIO");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fodw.P() && fodw.O()) {
            MmsBackupSchedulerChimeraService.a(this);
            return;
        }
        if (intent == null) {
            return;
        }
        if ("com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED".equals(intent.getAction())) {
            MmsBackupSchedulerChimeraService.b(this);
        } else if (fodw.a.lK().aC() && "com.google.android.gms.backup.ACTION_MMS_BACKUP_DISABLED".equals(intent.getAction())) {
            MmsBackupSchedulerChimeraService.a(this);
        } else {
            a.m("Intent not supported", new Object[0]);
        }
    }
}
