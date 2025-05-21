package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ahwd;
import defpackage.akkv;
import defpackage.asqg;
import defpackage.flkf;
import defpackage.flnr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsBackupSchedulerIntentOperation extends IntentOperation {
    private static final ahwd a = new ahwd("GmsBackupSchedulerIO");
    private static final String b = asqg.f("com.google.android.gms.backup");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent == null ? null : intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED")) {
            a.j("Network settings changed, re-scheduling tasks", new Object[0]);
            GmsBackupSchedulerChimeraService.c(this);
            CustomBackupNewScheduleLoggingTask.d(this);
            int i = akkv.a;
            akkv.a(this);
            return;
        }
        if (!action.equals(b)) {
            a.m("Intent not supported: ".concat(action), new Object[0]);
            return;
        }
        if (flnr.a.a().e()) {
            a.j("Phenotype updated, attempting to schedule custom backup logging", new Object[0]);
            CustomBackupNewScheduleLoggingTask.d(this);
        }
        if (flkf.a.a().t()) {
            a.j("Phenotype updated, attempting to schedule backup tasks", new Object[0]);
            int i2 = akkv.a;
            akkv.a(this);
        }
    }
}
