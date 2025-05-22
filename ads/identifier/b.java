package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class b extends Thread {
    final CountDownLatch a;
    private final WeakReference b;
    private final long c;

    public b(d dVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.b = new WeakReference(dVar);
        this.c = j;
        this.a = new CountDownLatch(1);
        start();
    }

    private final void a() {
        d dVar = (d) this.b.get();
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.a.await(this.c, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
