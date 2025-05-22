package com.google.android.gms.matchstick.intent;

import android.content.Context;
import android.content.Intent;
import defpackage.apzs;
import defpackage.ceox;
import defpackage.drcx;
import defpackage.fsux;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$OnModuleInitOperation extends apzs {
    static final String[] a = {"com.google.android.gms.matchstick.net.MessagingService", "com.google.android.gms.matchstick.task.ScheduledTaskService", "com.google.android.gms.matchstick.GcmBroadcastReceiver", "com.google.android.gms.matchstick.call.CallEntryActivity", "com.google.android.gms.matchstick.contacts.reachability.ReachabilityService"};

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Context baseContext = getBaseContext();
        String[] strArr = a;
        for (int i2 = 0; i2 < 5; i2++) {
            ceox.g(getBaseContext(), strArr[i2], true);
        }
        ceox.b(baseContext);
        ceox.d(getBaseContext());
        if (fsux.i()) {
            ceox.c(getBaseContext());
        }
        if (fsux.g()) {
            ceox.g(getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", true);
        }
        ceox.a(baseContext);
        int i3 = i & 2;
        boolean z = (i & 4) != 0;
        boolean z2 = (i & 8) != 0;
        if (i3 != 0 || z2) {
            ceox.e(baseContext);
        }
        if (z || z2) {
            drcx.b(baseContext).h(true != z ? 481 : 482);
        }
    }
}
