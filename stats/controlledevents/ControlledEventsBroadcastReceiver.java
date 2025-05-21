package com.google.android.gms.stats.controlledevents;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.derb;
import defpackage.derc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
class ControlledEventsBroadcastReceiver extends TracingBroadcastReceiver {
    final ControlledEventsOperation a;

    public ControlledEventsBroadcastReceiver(ControlledEventsOperation controlledEventsOperation) {
        super("stats_controlled_events");
        this.a = controlledEventsOperation;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            derc.a("ControlledEventsReceiverFailureScreenOn");
            derb.a();
            this.a.a();
        }
    }
}
