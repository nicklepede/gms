package com.google.android.gms.matchstick.intent;

import android.content.Context;
import android.content.Intent;
import defpackage.anya;
import defpackage.ccgd;
import defpackage.doso;
import defpackage.fqaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$OnModuleInitOperation extends anya {
    static final String[] a = {"com.google.android.gms.matchstick.net.MessagingService", "com.google.android.gms.matchstick.task.ScheduledTaskService", "com.google.android.gms.matchstick.GcmBroadcastReceiver", "com.google.android.gms.matchstick.call.CallEntryActivity", "com.google.android.gms.matchstick.contacts.reachability.ReachabilityService"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Context baseContext = getBaseContext();
        String[] strArr = a;
        for (int i2 = 0; i2 < 5; i2++) {
            ccgd.g(getBaseContext(), strArr[i2], true);
        }
        ccgd.b(baseContext);
        ccgd.d(getBaseContext());
        if (fqaz.i()) {
            ccgd.c(getBaseContext());
        }
        if (fqaz.g()) {
            ccgd.g(getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", true);
        }
        ccgd.a(baseContext);
        int i3 = i & 2;
        boolean z = (i & 4) != 0;
        boolean z2 = (i & 8) != 0;
        if (i3 != 0 || z2) {
            ccgd.e(baseContext);
        }
        if (z || z2) {
            doso.b(baseContext).h(true != z ? 481 : 482);
        }
    }
}
