package com.google.android.gms.ads.internal.util.future;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.m;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class c implements Executor {
    private final Handler a = new com.google.android.gms.ads.internal.util.d(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.a.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.c.e();
            m.k(com.google.android.gms.ads.internal.c.d().d, th);
            throw th;
        }
    }
}
