package com.google.android.gms.ads.cache.csi;

import android.os.Looper;
import defpackage.caqj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    private static final caqj b = new caqj(Looper.getMainLooper());
    public volatile boolean a = false;
    private final int c;
    private final Runnable d;

    public a(int i, Runnable runnable) {
        this.c = i;
        this.d = runnable;
    }

    public final void a() {
        this.a = true;
    }

    public final void b() {
        caqj caqjVar = b;
        caqjVar.removeCallbacks(this);
        caqjVar.postDelayed(this, this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.d.run();
        b();
    }
}
