package com.google.android.gms.stats.controlledevents;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.stats.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.dera;
import defpackage.derb;
import defpackage.derc;
import defpackage.derd;
import defpackage.eiig;
import defpackage.fsif;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ControlledEventsOperation extends IntentOperation {
    private TracingBroadcastReceiver a = null;

    final void a() {
        try {
            Context a = AppContextProvider.a();
            TracingBroadcastReceiver tracingBroadcastReceiver = this.a;
            eiig.x(tracingBroadcastReceiver);
            a.unregisterReceiver(tracingBroadcastReceiver);
        } catch (IllegalArgumentException | NullPointerException unused) {
            derc.a("ControlledEventsReceiverFailureIllegalUnregister");
        }
        this.a = null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        if (fsif.d() && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode == -579664806) {
                if (action.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_PROCESS_CRASH")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != -402052697) {
                if (hashCode == 2085626924 && action.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_WAKELOCK")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (action.equals("com.google.android.gms.stats.controlledevents.action.CONTROLLED_EVENTS_REPEATED_WAKEUP")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                long longExtra = intent.getLongExtra("wakelock_duration", 0L);
                boolean booleanExtra = intent.getBooleanExtra("wakelock_busy", false);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.a = new ControlledEventsBroadcastReceiver(this);
                iln.b(AppContextProvider.a(), this.a, intentFilter, 2);
                boolean b = booleanExtra ? derb.b(new dera(), longExtra) : derb.c(longExtra);
                if (this.a != null) {
                    a();
                }
                derc.a(true != b ? "ControlledEventsWakelockFailure" : "ControlledEventsWakelockSuccess");
                derd.a(intent.getIntExtra("alarm_id_extra", -1));
                return;
            }
            if (c != 1) {
                if (c != 2) {
                    derc.a("ControlledEventsOperationUnknownAction");
                    return;
                } else {
                    derc.a("ControlledEventsProcessCrashSuccess");
                    derd.a(intent.getIntExtra("alarm_id_extra", -1));
                    return;
                }
            }
            long longExtra2 = intent.getLongExtra("wakeup_duration", -1L);
            int intExtra = intent.getIntExtra("wakeup_remaining_alarms", -1);
            int intExtra2 = intent.getIntExtra("wakeup_number_of_attempts", 0);
            long j = intExtra2;
            if (intExtra < 0 || j > fsif.b()) {
                derd.a(intent.getIntExtra("alarm_id_extra", -1));
                if (intExtra < 0) {
                    derc.a("ControlledEventsWakeupFailureOverscheduled");
                }
                if (j <= fsif.b() || intExtra <= 0) {
                    return;
                }
                derc.b("ControlledEventsWakeupFailureTotal", intExtra);
                return;
            }
            boolean c2 = derb.c(longExtra2);
            derd.a(intent.getIntExtra("alarm_id_extra", -1));
            if (c2) {
                derc.a("ControlledEventsWakeupSuccess");
                if (intExtra > 0) {
                    derd.b(intExtra - 1, intExtra2);
                    return;
                }
                return;
            }
            if (j < fsif.b()) {
                derc.a("ControlledEventsWakeupTotalNumRetries");
                derd.b(intExtra, intExtra2 + 1);
            } else {
                derc.a("ControlledEventsWakeupFailureRetries");
                derc.b("ControlledEventsWakeupFailureTotal", intExtra);
            }
        }
    }
}
