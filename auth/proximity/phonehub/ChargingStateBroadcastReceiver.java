package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.acqc;
import defpackage.acwb;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.flcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChargingStateBroadcastReceiver extends TracingBroadcastReceiver {
    private static final asot a = acqc.a("ChargingStateBroadcastReceiver");

    public ChargingStateBroadcastReceiver() {
        super("auth_proximity");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (flcw.n()) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                acwb.b().f();
            } else {
                ((ejhf) a.j()).x("Unexpected intent action.");
            }
        }
    }
}
