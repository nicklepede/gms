package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aeqc;
import defpackage.aewb;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fnuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class InterruptionFilterBroadcastReceiver extends TracingBroadcastReceiver {
    private static final ausn a = aeqc.a("InterruptionFilterBroadcastReceiver");

    public InterruptionFilterBroadcastReceiver() {
        super("auth_proximity");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if (fnuf.t()) {
            if ("android.app.action.INTERRUPTION_FILTER_CHANGED".equals(intent.getAction())) {
                aewb.b().f();
            } else {
                ((eluo) a.j()).x("Unexpected intent action.");
            }
        }
    }
}
