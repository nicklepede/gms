package com.google.android.gms.scheduler;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aupz;
import defpackage.dajv;
import defpackage.dall;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SchedulerSystemIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Runnable runnable;
        if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction())) {
            dall.b().g.a(8);
            return;
        }
        if ("android.intent.action.TIME_SET".equals(intent.getAction())) {
            dall b = dall.b();
            dajv dajvVar = b.a;
            synchronized (dajvVar) {
                if (!dajvVar.c() || (runnable = b.b) == null) {
                    return;
                }
                new aupz(Integer.MAX_VALUE, 9).submit(runnable);
            }
        }
    }
}
