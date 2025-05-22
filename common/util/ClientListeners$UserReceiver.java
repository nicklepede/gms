package com.google.android.gms.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.ClientListeners$UserReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auro;
import defpackage.ekvl;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ClientListeners$UserReceiver extends TracingBroadcastReceiver {
    final Executor a;
    public final /* synthetic */ auro b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientListeners$UserReceiver(auro auroVar, Executor executor) {
        super("common-base");
        this.b = auroVar;
        this.a = executor;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        Executor executor = this.a;
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        ekvl.y(executor);
        executor.execute(new Runnable() { // from class: aurn
            @Override // java.lang.Runnable
            public final void run() {
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_SWITCHED")) {
                    auro auroVar = ClientListeners$UserReceiver.this.b;
                    synchronized (auroVar) {
                        auroVar.k(false);
                    }
                }
                goAsync.finish();
            }
        });
    }
}
