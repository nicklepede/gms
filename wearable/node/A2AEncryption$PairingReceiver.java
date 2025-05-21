package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j$.util.Objects;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class A2AEncryption$PairingReceiver extends TracingBroadcastReceiver {
    public Boolean a;
    private final String b;
    private final Semaphore c;

    public A2AEncryption$PairingReceiver(Semaphore semaphore, String str) {
        super("wearable");
        this.c = semaphore;
        this.b = str;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (this.a == null && this.b.equals(intent.getStringExtra("code"))) {
            this.a = Boolean.valueOf(Objects.equals(intent.getAction(), "com.google.android.clockwork.A2AAccept"));
            this.c.release();
        }
    }
}
