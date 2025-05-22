package com.google.android.gms.libs.punchclock.tracing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.caqo;
import defpackage.caqr;
import defpackage.carc;
import defpackage.eixs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class TracingBroadcastReceiver extends BroadcastReceiver implements carc {
    private final caqo a;

    public TracingBroadcastReceiver(Context context) {
        this.a = caqr.c.c(getClass(), 4, context);
    }

    public abstract void jP(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        caqo caqoVar = this.a;
        if (caqoVar == caqr.a) {
            jP(context, intent);
            return;
        }
        eixs m = caqoVar.m("onReceive", intent);
        try {
            jP(context, intent);
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
        this.a = caqr.c.e(getClass(), str);
    }

    protected TracingBroadcastReceiver(String str, String str2) {
        this.a = caqr.c.d(getClass(), 4, str, str2);
    }
}
