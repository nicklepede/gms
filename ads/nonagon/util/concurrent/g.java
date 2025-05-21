package com.google.android.gms.ads.nonagon.util.concurrent;

import defpackage.enss;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g implements enss {
    public final Object a;
    public final String b;
    private final enss c;

    public g(Object obj, String str, enss enssVar) {
        this.a = obj;
        this.b = str;
        this.c = enssVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c.get();
    }

    @Override // defpackage.enss
    public final void hn(Runnable runnable, Executor executor) {
        this.c.hn(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    public final String toString() {
        return this.b + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
