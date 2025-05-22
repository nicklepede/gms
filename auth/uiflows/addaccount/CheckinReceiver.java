package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.afen;
import defpackage.aura;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CheckinReceiver extends TracingBroadcastReceiver {
    public final Context a;
    public final Object b;
    public boolean c;
    public afen d;

    public CheckinReceiver(Context context) {
        super("auth_account");
        this.b = new Object();
        this.a = context;
    }

    public final void b() {
        synchronized (this.b) {
            if (this.c) {
                this.a.unregisterReceiver(this);
                this.d = null;
                this.c = false;
            }
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if ("com.google.android.checkin.CHECKIN_COMPLETE".equals(intent.getAction())) {
            if (aura.e(context) != 0) {
                this.d.a(true);
            } else {
                this.d.a(false);
            }
        }
    }
}
