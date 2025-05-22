package com.google.android.gms.nearby.messages;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cmgx;
import defpackage.cmky;
import defpackage.ezqc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class CopresenceBroadcastReceiver extends TracingBroadcastReceiver {
    public final cmky a;
    private final ezqc b;

    public CopresenceBroadcastReceiver(cmky cmkyVar, ezqc ezqcVar) {
        super("nearby");
        this.a = cmkyVar;
        this.b = ezqcVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        this.b.f(new cmgx(this, action));
    }
}
