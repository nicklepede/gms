package com.google.android.gms.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.ClientListeners$UserReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asnu;
import defpackage.eiig;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ClientListeners$UserReceiver extends TracingBroadcastReceiver {
    final Executor a;
    public final /* synthetic */ asnu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientListeners$UserReceiver(asnu asnuVar, Executor executor) {
        super("common-base");
        this.b = asnuVar;
        this.a = executor;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        Executor executor = this.a;
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        eiig.x(executor);
        executor.execute(new Runnable() { // from class: asnt
            @Override // java.lang.Runnable
            public final void run() {
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_SWITCHED")) {
                    asnu asnuVar = ClientListeners$UserReceiver.this.b;
                    synchronized (asnuVar) {
                        asnuVar.k(false);
                    }
                }
                goAsync.finish();
            }
        });
    }
}
