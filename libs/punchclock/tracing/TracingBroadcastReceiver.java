package com.google.android.gms.libs.punchclock.tracing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.byhw;
import defpackage.byhz;
import defpackage.byik;
import defpackage.egkp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class TracingBroadcastReceiver extends BroadcastReceiver implements byik {
    private final byhw a;

    public TracingBroadcastReceiver(Context context) {
        this.a = byhz.c.c(getClass(), 4, context);
    }

    public abstract void jz(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byhw byhwVar = this.a;
        if (byhwVar == byhz.a) {
            jz(context, intent);
            return;
        }
        egkp m = byhwVar.m("onReceive", intent);
        try {
            jz(context, intent);
            if (m != null) {
                m.close();
            }
        } catch (Throwable th) {
            if (m != null) {
                try {
                    m.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public TracingBroadcastReceiver(String str) {
        this.a = byhz.c.e(getClass(), str);
    }

    protected TracingBroadcastReceiver(String str, String str2) {
        this.a = byhz.c.d(getClass(), 4, str, str2);
    }
}
