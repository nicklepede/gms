package com.google.android.gms.location.fused.wearable;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class WearableFusedLocationManager$WearableReadyReceiver extends TracingBroadcastReceiver {
    public final Context a;
    public Runnable b;
    private final Executor c;

    public WearableFusedLocationManager$WearableReadyReceiver(Context context, Executor executor) {
        super(context);
        this.b = new Runnable() { // from class: bztw
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        this.a = context;
        this.c = executor;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if ("com.google.android.gms.wearable.READY_STATE".equals(intent.getAction()) && intent.hasExtra("isReady")) {
            this.c.execute(this.b);
        }
    }
}
