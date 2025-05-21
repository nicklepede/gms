package com.google.android.gms.ads.cache.csi;

import android.os.Looper;
import defpackage.byhr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    private static final byhr b = new byhr(Looper.getMainLooper());
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
        byhr byhrVar = b;
        byhrVar.removeCallbacks(this);
        byhrVar.postDelayed(this, this.c);
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
