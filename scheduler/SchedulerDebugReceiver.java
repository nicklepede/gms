package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.eqgo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SchedulerDebugReceiver extends TracingBroadcastReceiver {
    private final eqgo a;

    public SchedulerDebugReceiver(eqgo eqgoVar) {
        super("scheduler");
        this.a = eqgoVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(final Context context, final Intent intent) {
        this.a.execute(new Runnable() { // from class: daky
            @Override // java.lang.Runnable
            public final void run() {
                dakp dakpVar;
                if (asxd.e(context) && Objects.equals(intent.getStringExtra("debug_sub_action"), "INVOKE_ALL") && (dakpVar = dall.b().d) != null) {
                    dakpVar.b.i(bkox.INVOKE_ALL);
                }
            }
        });
    }
}
