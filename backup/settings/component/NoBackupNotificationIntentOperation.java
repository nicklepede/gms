package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import defpackage.ajru;
import defpackage.ajwt;
import defpackage.auad;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class NoBackupNotificationIntentOperation extends ajru {
    private static final auad a = ajwt.a("NoBackupNotificationIO");

    @Override // defpackage.ajru
    public final void a(Intent intent) {
        auad auadVar = a;
        auadVar.j("Intent: %s", intent);
        if (intent == null) {
            return;
        }
        if ("com.google.android.gms.backup.ACTION_TRANSPORT_FULL_BACKUP".equals(intent.getAction()) || "com.google.android.gms.backup.ACTION_TRANSPORT_INITIALIZE_DEVICE".equals(intent.getAction()) || "com.google.android.gms.backup.BackupAccountChanged".equals(intent.getAction())) {
            NoBackupNotificationChimeraService.e(this);
        } else {
            auadVar.m("Intent not supported", new Object[0]);
        }
    }
}
