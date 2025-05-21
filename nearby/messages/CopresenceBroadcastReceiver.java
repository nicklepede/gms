package com.google.android.gms.nearby.messages;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cjys;
import defpackage.ckct;
import defpackage.exbt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class CopresenceBroadcastReceiver extends TracingBroadcastReceiver {
    public final ckct a;
    private final exbt b;

    public CopresenceBroadcastReceiver(ckct ckctVar, exbt exbtVar) {
        super("nearby");
        this.a = ckctVar;
        this.b = exbtVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        this.b.f(new cjys(this, action));
    }
}
