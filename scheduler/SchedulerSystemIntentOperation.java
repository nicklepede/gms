package com.google.android.gms.scheduler;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asmf;
import defpackage.cxzy;
import defpackage.cybn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SchedulerSystemIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Runnable runnable;
        if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction())) {
            cybn.b().g.a(8);
            return;
        }
        if ("android.intent.action.TIME_SET".equals(intent.getAction())) {
            cybn b = cybn.b();
            cxzy cxzyVar = b.a;
            synchronized (cxzyVar) {
                if (!cxzyVar.c() || (runnable = b.b) == null) {
                    return;
                }
                new asmf(Integer.MAX_VALUE, 9).submit(runnable);
            }
        }
    }
}
