package com.google.android.gms.ads.cache.csi;

import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.nonagon.csi.i;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements Runnable, Closeable {
    private final String a;
    private final String b;
    private final ScheduledFuture c;
    private final i d;

    public b(String str, String str2, i iVar, long j) {
        this.a = str;
        this.b = str2;
        this.d = iVar;
        this.c = e.b.schedule(this, j, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.d;
        ConcurrentHashMap a = iVar.a();
        a.put("cache_service_timeout_function_name", this.a + "_" + this.b);
        a.put("event_timestamp", String.valueOf(System.currentTimeMillis()));
        iVar.b(a);
    }
}
