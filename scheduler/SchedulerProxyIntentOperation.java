package com.google.android.gms.scheduler;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.atzb;
import defpackage.dajw;
import defpackage.dall;
import defpackage.damb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SchedulerProxyIntentOperation extends IntentOperation {
    public static void a(Intent intent, int i) {
        atzb.l(dajw.b() == 0);
        if (i < 0) {
            Log.w("NetworkScheduler", "Dispatching intent with invalid user serial");
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
            damb a = SchedulerPackageIntentOperation.a(intent, i);
            if (a == null) {
                return;
            }
            dall.b().g.b(a);
            return;
        }
        if (!"android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
            Log.w("NetworkScheduler", "Unexpected forwarded intent: ".concat(String.valueOf(String.valueOf(intent))));
            return;
        }
        damb a2 = SchedulerPackageIntentOperation.a(intent, i);
        if (a2 != null) {
            dall.b().g.c(a2);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.gcm.nts.USER_FORWARD".equals(intent.getAction())) {
            Log.w("NetworkScheduler", "Unexpected intent: ".concat(String.valueOf(String.valueOf(intent))));
            return;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        int intExtra = intent.getIntExtra("userSerial", -1);
        if (intent2 != null) {
            a(intent2, intExtra);
        }
    }
}
