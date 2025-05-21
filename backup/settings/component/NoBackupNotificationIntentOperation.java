package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import defpackage.ahre;
import defpackage.ahwd;
import defpackage.arxo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class NoBackupNotificationIntentOperation extends ahre {
    private static final arxo a = ahwd.a("NoBackupNotificationIO");

    @Override // defpackage.ahre
    public final void a(Intent intent) {
        arxo arxoVar = a;
        arxoVar.j("Intent: %s", intent);
        if (intent == null) {
            return;
        }
        if ("com.google.android.gms.backup.ACTION_TRANSPORT_FULL_BACKUP".equals(intent.getAction()) || "com.google.android.gms.backup.ACTION_TRANSPORT_INITIALIZE_DEVICE".equals(intent.getAction()) || "com.google.android.gms.backup.BackupAccountChanged".equals(intent.getAction())) {
            NoBackupNotificationChimeraService.e(this);
        } else {
            arxoVar.m("Intent not supported", new Object[0]);
        }
    }
}
