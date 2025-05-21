package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.wearable.node.AbstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver;
import defpackage.dkod;
import defpackage.dkqk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AbstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver extends TracingBroadcastReceiver {
    public final IntentFilter a;
    public final /* synthetic */ dkqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver(dkqk dkqkVar) {
        super("wearable");
        this.b = dkqkVar;
        this.a = new IntentFilter("com.google.android.gms.wearable.node.CLOUD_SYNC_SCHEDULER_HEARTBEAT_NOTIFICATION");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.wearable.node.CLOUD_SYNC_SCHEDULER_HEARTBEAT_NOTIFICATION")) {
            dkqk dkqkVar = this.b;
            dkqk.I(dkod.CLOUD_SYNC_HEARTBEAT_TASK_SCHEDULER, intent.getLongExtra("heartbeat_scheduled_time", 0L));
            if (dkqkVar.l && dkqkVar.a) {
                final int intExtra = intent.getIntExtra("initial_heartbeat_num", 0);
                Object[] objArr = {Integer.valueOf(intExtra)};
                if (Log.isLoggable("CloudSync", 3)) {
                    Log.d("CloudSync", String.format("Received new broadcast for heartbeat from job scheduler with initialHeartbeatNum: %s", objArr));
                }
                dkqkVar.b.execute(new Runnable() { // from class: dkqj
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver.this.b.y(intExtra);
                    }
                });
            }
        }
    }
}
