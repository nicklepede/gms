package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmDiagnosticsReceiver extends TracingBroadcastReceiver {
    public GcmDiagnosticsReceiver() {
        super("gcm");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        intent.setClassName(context, "com.google.android.gms.gcm.GcmDiagnostics");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
