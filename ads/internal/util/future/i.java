package com.google.android.gms.ads.internal.util.future;

import defpackage.eqgl;
import defpackage.eqhc;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class i implements eqgl {
    private final eqhc a = new eqhc();

    private static final void d(boolean z) {
        if (z) {
            return;
        }
        com.google.android.gms.ads.internal.c.d().c(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
    }

    public final void a(Object obj) {
        d(this.a.q(obj));
    }

    public final void c(Throwable th) {
        d(this.a.r(th));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a.u();
    }

    @Override // defpackage.eqgl
    public final void hD(Runnable runnable, Executor executor) {
        this.a.hD(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.v(j, timeUnit);
    }
}
