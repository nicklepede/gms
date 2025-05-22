package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmDiagnosticsReceiver extends TracingBroadcastReceiver {
    public GcmDiagnosticsReceiver() {
        super("gcm");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        intent.setClassName(context, "com.google.android.gms.gcm.GcmDiagnostics");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
