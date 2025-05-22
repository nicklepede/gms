package com.google.android.gms.wearable.backup.wear;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
class RestoreController$ChargingObserver extends TracingBroadcastReceiver {
    public final Context a;
    private final Runnable b;

    public RestoreController$ChargingObserver(Context context, Runnable runnable) {
        super(context);
        this.a = context.getApplicationContext();
        this.b = runnable;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if (intent.getIntExtra("plugged", 0) != 0) {
            context.unregisterReceiver(this);
            this.b.run();
        }
    }
}
