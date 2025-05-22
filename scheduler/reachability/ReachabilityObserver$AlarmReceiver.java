package com.google.android.gms.scheduler.reachability;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.scheduler.reachability.ReachabilityObserver$AlarmReceiver;
import defpackage.daoz;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ReachabilityObserver$AlarmReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ daoz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReachabilityObserver$AlarmReceiver(daoz daozVar) {
        super("scheduler");
        this.a = daozVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        int i = daoz.d;
        this.a.a.execute(new Runnable() { // from class: daoy
            @Override // java.lang.Runnable
            public final void run() {
                daoz daozVar = ReachabilityObserver$AlarmReceiver.this.a;
                synchronized (daozVar) {
                    daozVar.c = null;
                    if (frcp.c()) {
                        Iterator it = daozVar.b.values().iterator();
                        while (it.hasNext()) {
                            ((dapd) it.next()).b();
                        }
                    }
                }
            }
        });
    }
}
