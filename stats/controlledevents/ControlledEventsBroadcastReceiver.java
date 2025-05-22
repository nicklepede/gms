package com.google.android.gms.stats.controlledevents;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.dhce;
import defpackage.dhcf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
class ControlledEventsBroadcastReceiver extends TracingBroadcastReceiver {
    final ControlledEventsOperation a;

    public ControlledEventsBroadcastReceiver(ControlledEventsOperation controlledEventsOperation) {
        super("stats_controlled_events");
        this.a = controlledEventsOperation;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            dhcf.a("ControlledEventsReceiverFailureScreenOn");
            dhce.a();
            this.a.a();
        }
    }
}
