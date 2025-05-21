package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ensv;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SchedulerDebugReceiver extends TracingBroadcastReceiver {
    private final ensv a;

    public SchedulerDebugReceiver(ensv ensvVar) {
        super("scheduler");
        this.a = ensvVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(final Context context, final Intent intent) {
        this.a.execute(new Runnable() { // from class: cybb
            @Override // java.lang.Runnable
            public final void run() {
                cyas cyasVar;
                if (aquo.e(context) && Objects.equals(intent.getStringExtra("debug_sub_action"), "INVOKE_ALL") && (cyasVar = cybn.b().d) != null) {
                    cyasVar.b.i(biki.INVOKE_ALL);
                }
            }
        });
    }
}
