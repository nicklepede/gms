package com.google.android.gms.scheduler;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.dajw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SchedulerModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        dajw.e(this);
        if (dajw.h()) {
            aura.H(this, "com.google.android.gms.gcm.nts.SchedulerService", true);
            Intent intent2 = new Intent(intent);
            String action = intent.getAction();
            if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                intent2.setAction("com.google.android.gms.scheduler.intent.USER_UNLOCKED");
            } else if ("android.intent.action.LOCKED_BOOT_COMPLETED".equals(action)) {
                intent2.setAction(null);
            }
            intent2.setClassName(this, "com.google.android.gms.gcm.nts.SchedulerService");
            startService(intent2);
        }
    }
}
