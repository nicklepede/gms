package com.google.android.gms.scheduler;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.cxzz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SchedulerModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        cxzz.e(this);
        if (cxzz.h()) {
            asng.H(this, "com.google.android.gms.gcm.nts.SchedulerService", true);
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
