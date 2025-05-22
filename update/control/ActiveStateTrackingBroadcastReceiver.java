package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.djqp;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class ActiveStateTrackingBroadcastReceiver extends TracingBroadcastReceiver {
    public final Object a;
    public boolean b;

    public ActiveStateTrackingBroadcastReceiver() {
        super("ota");
        this.a = new Object();
        this.b = false;
    }

    public abstract void b(Context context, Intent intent);

    public final void c(Context context, IntentFilter intentFilter) {
        synchronized (this.a) {
            if (!this.b) {
                this.b = true;
                ind.b(context, this, intentFilter, 2);
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.a) {
            if (this.b) {
                context.unregisterReceiver(this);
                this.b = false;
            }
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        new djqp(this, context, intent).start();
    }
}
