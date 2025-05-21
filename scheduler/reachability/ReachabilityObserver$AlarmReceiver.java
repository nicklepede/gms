package com.google.android.gms.scheduler.reachability;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.scheduler.reachability.ReachabilityObserver$AlarmReceiver;
import defpackage.cyfb;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReachabilityObserver$AlarmReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ cyfb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReachabilityObserver$AlarmReceiver(cyfb cyfbVar) {
        super("scheduler");
        this.a = cyfbVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        int i = cyfb.d;
        this.a.a.execute(new Runnable() { // from class: cyfa
            @Override // java.lang.Runnable
            public final void run() {
                cyfb cyfbVar = ReachabilityObserver$AlarmReceiver.this.a;
                synchronized (cyfbVar) {
                    cyfbVar.c = null;
                    if (fokb.c()) {
                        Iterator it = cyfbVar.b.values().iterator();
                        while (it.hasNext()) {
                            ((cyff) it.next()).b();
                        }
                    }
                }
            }
        });
    }
}
