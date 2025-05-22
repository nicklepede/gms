package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ajwt;
import defpackage.amly;
import defpackage.auua;
import defpackage.fobp;
import defpackage.fofb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsBackupSchedulerIntentOperation extends IntentOperation {
    private static final ajwt a = new ajwt("GmsBackupSchedulerIO");
    private static final String b = auua.f("com.google.android.gms.backup");

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
            int i = amly.a;
            amly.a(this);
            return;
        }
        if (!action.equals(b)) {
            a.m("Intent not supported: ".concat(action), new Object[0]);
            return;
        }
        if (fofb.a.lK().e()) {
            a.j("Phenotype updated, attempting to schedule custom backup logging", new Object[0]);
            CustomBackupNewScheduleLoggingTask.d(this);
        }
        if (fobp.a.lK().t()) {
            a.j("Phenotype updated, attempting to schedule backup tasks", new Object[0]);
            int i2 = amly.a;
            amly.a(this);
        }
    }
}
