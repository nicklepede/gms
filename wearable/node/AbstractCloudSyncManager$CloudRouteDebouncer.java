package com.google.android.gms.wearable.node;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.dncd;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AbstractCloudSyncManager$CloudRouteDebouncer extends TracingBroadcastReceiver {
    public final PendingIntent a;
    public boolean b;
    public final /* synthetic */ dncd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractCloudSyncManager$CloudRouteDebouncer(dncd dncdVar, Context context) {
        super("wearable");
        this.c = dncdVar;
        this.a = PendingIntent.getBroadcast(context, 134217728, new Intent("com.google.android.gms.wearable.node.CLOUD_SYNC_DISABLE_DEBOUNCE").setPackage(context.getPackageName()), 67108864);
        ind.b(context, this, new IntentFilter("com.google.android.gms.wearable.node.CLOUD_SYNC_DISABLE_DEBOUNCE"), 4);
    }

    public final void b() {
        if (this.b) {
            Log.d("CloudSync", "Cancelling cloud route disable");
            dncd dncdVar = this.c;
            dncdVar.m.a(this.a);
            this.b = false;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.wearable.node.CLOUD_SYNC_DISABLE_DEBOUNCE")) {
            dncd dncdVar = this.c;
            synchronized (dncdVar.f) {
                if (!this.b) {
                    Log.d("CloudSync", "Cloud route disable debounce triggered but no disable scheduled");
                    return;
                }
                this.b = false;
                Log.d("CloudSync", "Disabling cloud route after debounce delay");
                dncdVar.d();
            }
        }
    }
}
