package com.google.android.gms.ads.internal.util.future;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.m;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
            m.l(com.google.android.gms.ads.internal.c.d().d, th);
            throw th;
        }
    }
}
